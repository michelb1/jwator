package com.github.michelb1.jwator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.springframework.stereotype.Component;

@Component
public class ConfigPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConfigPanel
     */
    public ConfigPanel() {
        initComponents();
    }

    public JLabel getFishBreedTime() {
        return FishBreedTime;
    }

    public void setFishBreedTime(JLabel FishBreedTime) {
        this.FishBreedTime = FishBreedTime;
    }

    public JTextField getFishBreedTimeValue() {
        return FishBreedTimeValue;
    }

    public void setFishBreedTimeValue(JTextField FishBreedTimeValue) {
        this.FishBreedTimeValue = FishBreedTimeValue;
    }

    public JTextField getFishCountValue() {
        return FishCountValue;
    }

    public void setFishCountValue(JTextField FishCountValue) {
        this.FishCountValue = FishCountValue;
    }

    public JLabel getFishEnergy() {
        return FishEnergy;
    }

    public void setFishEnergy(JLabel FishEnergy) {
        this.FishEnergy = FishEnergy;
    }

    public JTextField getFishEnergyValue() {
        return FishEnergyValue;
    }

    public void setFishEnergyValue(JTextField FishEnergyValue) {
        this.FishEnergyValue = FishEnergyValue;
    }

    public JLabel getFishcount() {
        return Fishcount;
    }

    public void setFishcount(JLabel Fishcount) {
        this.Fishcount = Fishcount;
    }

    public JLabel getSharkBreedEnergy() {
        return SharkBreedEnergy;
    }

    public void setSharkBreedEnergy(JLabel SharkBreedEnergy) {
        this.SharkBreedEnergy = SharkBreedEnergy;
    }

    public JTextField getSharkBreedEnergyValue() {
        return SharkBreedEnergyValue;
    }

    public void setSharkBreedEnergyValue(JTextField SharkBreedEnergyValue) {
        this.SharkBreedEnergyValue = SharkBreedEnergyValue;
    }

    public JTextField getSharkCountValue() {
        return SharkCountValue;
    }

    public void setSharkCountValue(JTextField SharkCountValue) {
        this.SharkCountValue = SharkCountValue;
    }

    public JLabel getSharkEnergy() {
        return SharkEnergy;
    }

    public void setSharkEnergy(JLabel SharkEnergy) {
        this.SharkEnergy = SharkEnergy;
    }

    public JTextField getSharkEnergyValue() {
        return SharkEnergyValue;
    }

    public void setSharkEnergyValue(JTextField SharkEnergyValue) {
        this.SharkEnergyValue = SharkEnergyValue;
    }

    public JLabel getSharkcount() {
        return Sharkcount;
    }

    public void setSharkcount(JLabel Sharkcount) {
        this.Sharkcount = Sharkcount;
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Fishcount = new javax.swing.JLabel();
        Sharkcount = new javax.swing.JLabel();
        FishBreedTime = new javax.swing.JLabel();
        FishEnergy = new javax.swing.JLabel();
        SharkBreedEnergy = new javax.swing.JLabel();
        SharkEnergy = new javax.swing.JLabel();
        FishCountValue = new javax.swing.JTextField();
        SharkCountValue = new javax.swing.JTextField();
        FishBreedTimeValue = new javax.swing.JTextField();
        FishEnergyValue = new javax.swing.JTextField();
        SharkBreedEnergyValue = new javax.swing.JTextField();
        SharkEnergyValue = new javax.swing.JTextField();
        reset = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(200, 180));
        setMinimumSize(new java.awt.Dimension(50, 20));
        setPreferredSize(new java.awt.Dimension(120, 180));
        setLayout(new java.awt.GridBagLayout());

        Fishcount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fishcount.setText("FishCount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(Fishcount, gridBagConstraints);

        Sharkcount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sharkcount.setText("SharkCount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(Sharkcount, gridBagConstraints);

        FishBreedTime.setText("FishBreedTime");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(FishBreedTime, gridBagConstraints);

        FishEnergy.setText("FishEnergy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(FishEnergy, gridBagConstraints);

        SharkBreedEnergy.setText("SharkBreedEnergy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(SharkBreedEnergy, gridBagConstraints);

        SharkEnergy.setText("SharkEnergy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(SharkEnergy, gridBagConstraints);

        FishCountValue.setText("jTextField1");
        FishCountValue.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(FishCountValue, gridBagConstraints);

        SharkCountValue.setText("jTextField2");
        SharkCountValue.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(SharkCountValue, gridBagConstraints);

        FishBreedTimeValue.setText("jTextField3");
        FishBreedTimeValue.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(FishBreedTimeValue, gridBagConstraints);

        FishEnergyValue.setText("jTextField4");
        FishEnergyValue.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(FishEnergyValue, gridBagConstraints);

        SharkBreedEnergyValue.setText("jTextField5");
        SharkBreedEnergyValue.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(SharkBreedEnergyValue, gridBagConstraints);

        SharkEnergyValue.setText("jTextField6");
        SharkEnergyValue.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(SharkEnergyValue, gridBagConstraints);

        reset.setText("Reset");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(reset, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FishBreedTime;
    private javax.swing.JTextField FishBreedTimeValue;
    private javax.swing.JTextField FishCountValue;
    private javax.swing.JLabel FishEnergy;
    private javax.swing.JTextField FishEnergyValue;
    private javax.swing.JLabel Fishcount;
    private javax.swing.JLabel SharkBreedEnergy;
    private javax.swing.JTextField SharkBreedEnergyValue;
    private javax.swing.JTextField SharkCountValue;
    private javax.swing.JLabel SharkEnergy;
    private javax.swing.JTextField SharkEnergyValue;
    private javax.swing.JLabel Sharkcount;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}