package View;

import Model.Despesa;
import Model.Lancamento;
import Model.GastosDomesticos;
import Model.Receita;
import Model.TipoDespesa;

public class ListarDespesas extends javax.swing.JFrame {

    private GastosDomesticos gastosDomesticos;
    private Despesa despesa;

    public ListarDespesas(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListarDespesas = new javax.swing.JTextArea();
        btFechar = new javax.swing.JButton();
        rbAlimentacao = new javax.swing.JRadioButton();
        rbTransporte = new javax.swing.JRadioButton();
        rbResidencia = new javax.swing.JRadioButton();
        rbSaude = new javax.swing.JRadioButton();
        rbEducacao = new javax.swing.JRadioButton();
        rbEntreterimento = new javax.swing.JRadioButton();
        rbOutras = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taListarDespesas.setColumns(20);
        taListarDespesas.setRows(5);
        jScrollPane1.setViewportView(taListarDespesas);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAlimentacao);
        rbAlimentacao.setText("Alimentação");
        rbAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlimentacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTransporte);
        rbTransporte.setText("Transporte");
        rbTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTransporteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbResidencia);
        rbResidencia.setText("Residência");
        rbResidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbResidenciaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSaude);
        rbSaude.setText("Saúde");
        rbSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSaudeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEducacao);
        rbEducacao.setText("Educação");
        rbEducacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEducacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEntreterimento);
        rbEntreterimento.setText("Entreterimento");
        rbEntreterimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEntreterimentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbOutras);
        rbOutras.setText("Outras");
        rbOutras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOutrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOutras)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btFechar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbAlimentacao)
                                    .addComponent(rbSaude))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbEducacao)
                                    .addComponent(rbTransporte))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbResidencia)
                                    .addComponent(rbEntreterimento))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAlimentacao)
                    .addComponent(rbTransporte)
                    .addComponent(rbResidencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSaude)
                    .addComponent(rbEducacao)
                    .addComponent(rbEntreterimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOutras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btFecharActionPerformed

    private void rbEducacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEducacaoActionPerformed
        taListarDespesas.setText("");
        taListarDespesas.append("\n" + gastosDomesticos.listarDespesas(TipoDespesa.EDUCACAO));
    }//GEN-LAST:event_rbEducacaoActionPerformed

    private void rbAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlimentacaoActionPerformed
        taListarDespesas.setText("");
        taListarDespesas.append("\n" + gastosDomesticos.listarDespesas(TipoDespesa.ALIMENTACAO));
    }//GEN-LAST:event_rbAlimentacaoActionPerformed

    private void rbTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTransporteActionPerformed
        taListarDespesas.setText("");
        taListarDespesas.append("\n" + gastosDomesticos.listarDespesas(TipoDespesa.TRANSPORTE));
    }//GEN-LAST:event_rbTransporteActionPerformed

    private void rbResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbResidenciaActionPerformed
        taListarDespesas.setText("");
        taListarDespesas.append("\n" + gastosDomesticos.listarDespesas(TipoDespesa.RESIDENCIA));
    }//GEN-LAST:event_rbResidenciaActionPerformed

    private void rbSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSaudeActionPerformed
        taListarDespesas.setText("");
        taListarDespesas.append("\n" + gastosDomesticos.listarDespesas(TipoDespesa.SAUDE));
    }//GEN-LAST:event_rbSaudeActionPerformed

    private void rbEntreterimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEntreterimentoActionPerformed
        taListarDespesas.setText("");
        taListarDespesas.append("\n" + gastosDomesticos.listarDespesas(TipoDespesa.ENTRETERIMENTO));
    }//GEN-LAST:event_rbEntreterimentoActionPerformed

    private void rbOutrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOutrasActionPerformed
        taListarDespesas.setText("");
        taListarDespesas.append("\n" + gastosDomesticos.listarDespesas(TipoDespesa.OUTRAS));
    }//GEN-LAST:event_rbOutrasActionPerformed

    public void setGastosDomesticos(GastosDomesticos gastos) {
        this.gastosDomesticos = gastos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAlimentacao;
    private javax.swing.JRadioButton rbEducacao;
    private javax.swing.JRadioButton rbEntreterimento;
    private javax.swing.JRadioButton rbOutras;
    private javax.swing.JRadioButton rbResidencia;
    private javax.swing.JRadioButton rbSaude;
    private javax.swing.JRadioButton rbTransporte;
    private javax.swing.JTextArea taListarDespesas;
    // End of variables declaration//GEN-END:variables
}
