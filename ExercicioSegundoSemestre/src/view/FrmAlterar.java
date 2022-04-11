/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.VeiculoController;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Veiculo;

/**
 *
 * @author mathe
 */
public class FrmAlterar extends javax.swing.JFrame {

    private static FrmAlterar frm = null;
    public VeiculoController veiCtrl;
    
    public FrmAlterar() {
        initComponents();
        veiCtrl = new VeiculoController();
    }
    
    public static FrmAlterar getInstanceOfFrmAlterar(Veiculo vei)
    {
        if(frm == null)
           frm = new FrmAlterar();
        frm.setVeiculoEdicao(vei);
       return frm;
    }
    
    public static FrmAlterar getInstanceOfFrmAlterarToDispose()
    {
        return frm;
    }
    
     public void setVeiculoEdicao(Veiculo vei)
    {
        txtPlaca.setText(vei.getPlaca());
        txtMarca.setText(vei.getMarca());
        txtModelo.setText(vei.getModelo());
        txtCor.setText( vei.getCor());
        txtAno.setText( Integer.toString(vei.getAnoFabricacao()) );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAlteracao = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtAno = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCadastro.setText("Cadastrar Veiculo");
        lblCadastro.setFocusable(false);

        lblPlaca.setText("Placa:");
        lblPlaca.setFocusable(false);

        lblMarca.setText("Marca:");
        lblMarca.setFocusable(false);

        lblModelo.setText("Modelo:");
        lblModelo.setFocusable(false);

        lblCor.setText("Cor:");
        lblCor.setFocusable(false);

        lblAno.setText("Ano de fabricação:");
        lblAno.setFocusable(false);

        txtPlaca.setEditable(false);

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAlteracaoLayout = new javax.swing.GroupLayout(pnlAlteracao);
        pnlAlteracao.setLayout(pnlAlteracaoLayout);
        pnlAlteracaoLayout.setHorizontalGroup(
            pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlteracaoLayout.createSequentialGroup()
                .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlteracaoLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblCadastro))
                    .addGroup(pnlAlteracaoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblModelo)
                            .addComponent(lblCor)
                            .addComponent(lblPlaca)
                            .addComponent(lblMarca)
                            .addComponent(lblAno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 130, Short.MAX_VALUE))
        );
        pnlAlteracaoLayout.setVerticalGroup(
            pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlteracaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAlteracaoLayout.createSequentialGroup()
                        .addComponent(lblCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModelo)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCor)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAno))
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int ano = Integer.parseInt(this.txtAno.getText());
        if(ano > LocalDate.now().getYear())
        {
            throw new NumberFormatException();
        }
        try {
            Veiculo vei = new Veiculo(
                txtPlaca.getText(),
                txtMarca.getText(),
                txtModelo.getText(),
                txtCor.getText(),
                ano
            );
            veiCtrl.alterarVeiculo(vei);
            JOptionPane.showMessageDialog(this, "Alterado com Sucesso!", "Sucesso", HEIGHT);       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro, verifique se os dados estão inseridos corretamente!", "Erro", HEIGHT);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro, tente novamente.", "Erro", HEIGHT);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Coloque um ano válido!", "Erro", HEIGHT);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnlAlteracao;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
