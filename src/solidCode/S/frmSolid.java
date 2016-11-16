package solidCode.S;

import javax.swing.JButton;


public class frmSolid extends javax.swing.JFrame {
    
    public frmSolid(clSolidEventController solidController) {
        initComponents();
        btnDown.addActionListener(solidController);
        btnUp.addActionListener(solidController);
        btnDown.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUp.setText("jButton1");
        btnUp.setActionCommand("btnUp");

        btnDown.setText("jButton2");
        btnDown.setActionCommand("btnDown");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUp)
                    .addComponent(btnDown))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnDown)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public JButton getBtnDown() {
        return btnDown;
    }

    public void setBtnDown(JButton btnDown) {
        this.btnDown = btnDown;
    }

    public JButton getBtnUp() {
        return btnUp;
    }

    public void setBtnUp(JButton btnUp) {
        this.btnUp = btnUp;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnUp;
    // End of variables declaration//GEN-END:variables
}
