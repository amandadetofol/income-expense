package View;

import Model.Despesa;
import Model.GastosDomesticos;
import Model.Receita;
import Model.TipoDespesa;
import Model.TipoReceita;

public class ListarReceita extends javax.swing.JFrame {

    private GastosDomesticos gastosDomesticos;
    private Receita receita;

    public ListarReceita(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListarReceita = new javax.swing.JTextArea();
        btFechar = new javax.swing.JButton();
        rbSalario = new javax.swing.JRadioButton();
        rbDecimoTerceiro = new javax.swing.JRadioButton();
        rbFerias = new javax.swing.JRadioButton();
        rbOutrasReceitas = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taListarReceita.setColumns(20);
        taListarReceita.setRows(5);
        jScrollPane1.setViewportView(taListarReceita);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSalario);
        rbSalario.setText("Salário");
        rbSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSalarioActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDecimoTerceiro);
        rbDecimoTerceiro.setText("Décimo terceiro");
        rbDecimoTerceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDecimoTerceiroActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFerias);
        rbFerias.setText("Férias");
        rbFerias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFeriasActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbOutrasReceitas);
        rbOutrasReceitas.setText("Outras");
        rbOutrasReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOutrasReceitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbSalario)
                                    .addComponent(rbDecimoTerceiro))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbOutrasReceitas)
                                    .addComponent(rbFerias))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSalario)
                    .addComponent(rbFerias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDecimoTerceiro)
                    .addComponent(rbOutrasReceitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btFecharActionPerformed

    private void rbOutrasReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOutrasReceitasActionPerformed
        taListarReceita.setText("");
        taListarReceita.append("\n" + gastosDomesticos.listarReceitas(TipoReceita.OUTRAS));
    }//GEN-LAST:event_rbOutrasReceitasActionPerformed

    private void rbFeriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFeriasActionPerformed
        taListarReceita.setText("");
        taListarReceita.append("\n" + gastosDomesticos.listarReceitas(TipoReceita.FERIAS));
    }//GEN-LAST:event_rbFeriasActionPerformed

    private void rbSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSalarioActionPerformed
        taListarReceita.setText("");
        taListarReceita.append("\n" + gastosDomesticos.listarReceitas(TipoReceita.SALARIO));
    }//GEN-LAST:event_rbSalarioActionPerformed

    private void rbDecimoTerceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDecimoTerceiroActionPerformed
        taListarReceita.setText("");
        taListarReceita.append("\n" + gastosDomesticos.listarReceitas(TipoReceita.DEC_TERCEIRO));
    }//GEN-LAST:event_rbDecimoTerceiroActionPerformed

    public void setGastosDomesticos(GastosDomesticos gastos) {
        this.gastosDomesticos = gastos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbDecimoTerceiro;
    private javax.swing.JRadioButton rbFerias;
    private javax.swing.JRadioButton rbOutrasReceitas;
    private javax.swing.JRadioButton rbSalario;
    private javax.swing.JTextArea taListarReceita;
    // End of variables declaration//GEN-END:variables
}
