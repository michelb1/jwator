package com.github.michelb1.jwator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
    WatorService service;
    int maxXFields = (Config.WIDTH/Config.SCALE);
    int maxYFields = (Config.HEIGHT/Config.SCALE);
    int scale = Config.SCALE;
    int fieldCount = Config.HEIGHT*Config.WIDTH/(scale*scale);

    @Before
    public void init(){
        service = new WatorService();
    }

    @Test
    public void testRightBorder()
    {   
        var pos = service.calculatePosition(2, maxXFields-1);
        assertEquals(Integer.valueOf(0), Integer.valueOf(pos));
    }

    @Test
    public void testRightMiddle()
    {   
        var pos = service.calculatePosition(2, maxXFields/2);
        assertEquals(Integer.valueOf((maxXFields/2)+1), Integer.valueOf(pos));
    }

    @Test
    public void testRightLastField()
    {   
        var pos = service.calculatePosition(2, fieldCount-1);
        assertEquals(Integer.valueOf(fieldCount-maxXFields), Integer.valueOf(pos));
    }

    @Test
    public void testLeftBorder()
    {   
        var pos = service.calculatePosition(1, 0);
        assertEquals(Integer.valueOf(maxXFields-1), Integer.valueOf(pos));
    }

    @Test
    public void testLeftMiddle()
    {   
        var pos = service.calculatePosition(1, maxXFields/2);
        assertEquals(Integer.valueOf((maxXFields/2)-1), Integer.valueOf(pos));
    }

    @Test
    public void testLeftLastField()
    {   
        var pos = service.calculatePosition(1, fieldCount-maxXFields);
        assertEquals(Integer.valueOf(fieldCount-1), Integer.valueOf(pos));
    }

    @Test
    public void testUPBorder()
    {   
        var pos = service.calculatePosition(3, 0);
        assertEquals(Integer.valueOf(fieldCount-maxXFields), Integer.valueOf(pos));
    }

    @Test
    public void testUPBorder2()
    {   
        var pos = service.calculatePosition(3, maxXFields-1);
        assertEquals(Integer.valueOf(fieldCount-1), Integer.valueOf(pos));
    }

    @Test
    public void testUPMiddle()
    {   
        var pos = service.calculatePosition(3, maxXFields+(maxXFields/2));
        assertEquals(Integer.valueOf(maxXFields/2), Integer.valueOf(pos));
    }

    @Test
    public void testDownBorder()
    {   
        var pos = service.calculatePosition(4, fieldCount-maxXFields);
        assertEquals(Integer.valueOf(0), Integer.valueOf(pos));
    }

    @Test
    public void testDownBorder2()
    {   
        var pos = service.calculatePosition(4, fieldCount-1);
        assertEquals(Integer.valueOf(maxXFields-1), Integer.valueOf(pos));
    }

    @Test
    public void testDownMiddle()
    {   
        var pos = service.calculatePosition(4, 0);
        assertEquals(Integer.valueOf(maxXFields), Integer.valueOf(pos));
    }
}
