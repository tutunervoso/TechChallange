package gui;

import dao.UsuarioDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Resultado extends javax.swing.JFrame {

    public Resultado(int ra) {
        initComponents();
        jTabbedPane1.add("Aluno", jPanel1);
        jTabbedPane1.add("Responsáveis", jPanel2);
        jTabbedPane1.add("Endereço", jPanel3);
        UsuarioDAO consulta = new UsuarioDAO();
        if(ra<1000){
            ra+=48000000;
        }
        try {
            Usuario novo = consulta.buscaRA(ra);
            int numRa = (int) novo.getRa();
            jTextRA.setText(Integer.toString(numRa));
            jTextNome.setText(novo.getNome());
            jTextTurma.setText(novo.getTurma());
            jTextData.setText(novo.getDataNasc().getDate() + "/" + ((novo.getDataNasc().getMonth()) + 1) + "/" + ((novo.getDataNasc().getYear()) + 1900));
            jTextNomePai.setText(novo.getNomePai());
            jTextEmailPai.setText(novo.getEmailPai());
            jTextNomeMae.setText(novo.getNomeMae());
            jTextEmailMae.setText(novo.getEmailMae());
            jTextEndereco.setText(novo.getEndereco());
            int num = (int) novo.getNumero();
            jTextNumero.setText(Integer.toString(num));
            jTextComplemento.setText(novo.getComplemento());
            jTextCEP.setText(novo.getCep());
            jTextBairro.setText(novo.getBairro());
            setVisible(true);
        } catch (NullPointerException e) {
            System.out.println("RA inválido");
            Pesquisa janela = new Pesquisa();
            janela.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "RA Inválido", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Resultado(String nome) {
        initComponents();
        jTabbedPane1.add("Aluno", jPanel1);
        jTabbedPane1.add("Responsáveis", jPanel2);
        jTabbedPane1.add("Endereço", jPanel3);
        UsuarioDAO consulta = new UsuarioDAO();
        Usuario novo = consulta.buscaNome(nome);

        int numRa = (int) novo.getRa();
        jTextRA.setText(Integer.toString(numRa));
        jTextNome.setText(novo.getNome());
        jTextTurma.setText(novo.getTurma());
        jTextData.setText(novo.getDataNasc().getDate() + "/" + ((novo.getDataNasc().getMonth()) + 1) + "/" + ((novo.getDataNasc().getYear()) + 1900));
        jTextNomePai.setText(novo.getNomePai());
        jTextEmailPai.setText(novo.getEmailPai());
        jTextNomeMae.setText(novo.getNomeMae());
        jTextEmailMae.setText(novo.getEmailMae());

        jTextEndereco.setText(novo.getEndereco());
        int num = (int) novo.getNumero();
        jTextNumero.setText(Integer.toString(num));
        jTextComplemento.setText(novo.getComplemento());
        jTextCEP.setText(novo.getCep());
        jTextBairro.setText(novo.getBairro());
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextRA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextTurma = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        jTextData = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelNomePai = new javax.swing.JLabel();
        jTextNomePai = new javax.swing.JTextField();
        jTextEmailPai = new javax.swing.JTextField();
        jLabelEmailPai = new javax.swing.JLabel();
        jLabelNomeMae = new javax.swing.JLabel();
        jTextNomeMae = new javax.swing.JTextField();
        jTextEmailMae = new javax.swing.JTextField();
        jLabelEmailMae = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextComplemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextCEP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonNvConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("Nome");

        jLabel5.setText("RA");

        jLabel6.setText("Turma");

        jLabelData.setText("Data Nasc.");

        jTextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabelData))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextRA, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextData)
                    .addComponent(jTextTurma, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelData)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTextNome.setEditable(false);
        jTextRA.setEditable(false);
        jTextTurma.setEditable(false);
        jTextData.setEditable(false);

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabelNomePai.setText("Nome Pai");

        jLabelEmailPai.setText("E-mail Pai");

        jLabelNomeMae.setText("Nome Mãe");

        jLabelEmailMae.setText("E-mail Mãe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNomePai)
                        .addGap(15, 15, 15)
                        .addComponent(jTextNomePai, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeMae)
                            .addComponent(jLabelEmailPai)
                            .addComponent(jLabelEmailMae))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextEmailMae)
                            .addComponent(jTextEmailPai)
                            .addComponent(jTextNomeMae))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomePai)
                    .addComponent(jTextNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmailPai)
                    .addComponent(jTextEmailPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeMae)
                    .addComponent(jTextNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmailMae)
                    .addComponent(jTextEmailMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTextNomePai.setEditable(false);
        jTextEmailPai.setEditable(false);
        jTextNomeMae.setEditable(false);
        jTextEmailMae.setEditable(false);

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel1.setText("Endereço");

        jTextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnderecoActionPerformed(evt);
            }
        });

        jLabel2.setText("Número");

        jTextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroActionPerformed(evt);
            }
        });

        jLabel7.setText("Compl.");

        jTextComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextComplementoActionPerformed(evt);
            }
        });

        jLabel8.setText("CEP");

        jTextCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCEPActionPerformed(evt);
            }
        });

        jLabel9.setText("Bairro");

        jTextBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(jTextEndereco)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(jTextBairro)
                            .addComponent(jTextCEP)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jTextEndereco.setEditable(false);
        jTextNumero.setEditable(false);
        jTextComplemento.setEditable(false);
        jTextCEP.setEditable(false);
        jTextBairro.setEditable(false);

        jTabbedPane1.addTab("tab3", jPanel3);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel3.setText("Dados Usuário");

        jButtonNvConsulta.setText("Nova Consulta");
        jButtonNvConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNvConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButtonNvConsulta)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNvConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void jTextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEnderecoActionPerformed

    private void jTextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumeroActionPerformed

    private void jTextComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextComplementoActionPerformed

    private void jTextCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCEPActionPerformed

    private void jTextBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBairroActionPerformed

    private void jTextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataActionPerformed

    private void jButtonNvConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNvConsultaActionPerformed
        Pesquisa novaConsulta = new Pesquisa();
        novaConsulta.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado(0).setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonNvConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEmailMae;
    private javax.swing.JLabel jLabelEmailPai;
    private javax.swing.JLabel jLabelNomeMae;
    private javax.swing.JLabel jLabelNomePai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCEP;
    private javax.swing.JTextField jTextComplemento;
    private javax.swing.JTextField jTextData;
    private javax.swing.JTextField jTextEmailMae;
    private javax.swing.JTextField jTextEmailPai;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNomeMae;
    private javax.swing.JTextField jTextNomePai;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextRA;
    private javax.swing.JTextField jTextTurma;
}
