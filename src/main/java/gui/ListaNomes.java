package gui;

import dao.UsuarioDAO;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class ListaNomes extends javax.swing.JFrame {
    
    DefaultListModel model=new DefaultListModel();
    public ListaNomes(String nome) {
        initComponents();
        UsuarioDAO consulta = new UsuarioDAO();
        int verificador=0;
        try{
            List<Usuario> userNome=consulta.lista();
            for(int i=0; i<userNome.size(); i++){
                if(userNome.get(i).getNome().contains(nome.toUpperCase())){
                    model.addElement(userNome.get(i).getNome());
                    jList1.setModel(model);
                    verificador++;
                }
            }
            setVisible(true);
            if(verificador==0){
                System.out.println("Nome inválido");
                Pesquisa janela=new Pesquisa();
                janela.setVisible(true);
                dispose();
                JOptionPane.showMessageDialog(null, "Nome não cadastrado.", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        }catch(IOException e){}
    }
    
    public ListaNomes(String turma, int num) {
        initComponents();
        UsuarioDAO consulta = new UsuarioDAO();
        int verificador=0;
        try{
            List<Usuario> userNome=consulta.lista();
            for(int i=0; i<userNome.size(); i++){
                if(userNome.get(i).getTurma().contains(turma)){
                    model.addElement(userNome.get(i).getNome());
                    jList1.setModel(model);
                    verificador++;
                }
            }
            setVisible(true);
            if(verificador==0){
                System.out.println("Turma inválido");
                Pesquisa janela=new Pesquisa();
                janela.setVisible(true);
                dispose();
                JOptionPane.showMessageDialog(null, "Turma Inválida", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        }catch(IOException e){}
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButtonVoltar.setText("←");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            Resultado janela=new Resultado(jList1.getSelectedValue());
            janela.setVisible(true);
            this.dispose();
        }
    }

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        Pesquisa janela=new Pesquisa();
        janela.setVisible(true);
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
            java.util.logging.Logger.getLogger(ListaNomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaNomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaNomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaNomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaNomes("").setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
}
