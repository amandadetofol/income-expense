package View;

import Model.Despesa;
import Model.GastosDomesticos;
import Model.Lancamento;
import Model.Receita;
import Model.TipoDespesa;
import Model.TipoReceita;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class TelaPrincipal extends javax.swing.JFrame {

    private Lancamento lancamento = new Lancamento();
    private Despesa despesa = new Despesa();
    private Receita receita = new Receita();
    private GastosDomesticos gastosDomesticos = new GastosDomesticos();

    public TelaPrincipal() {
        initComponents();
        formatarDataReceita();
        formatarDataDespesa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btSaldoDtAtual = new javax.swing.JButton();
        btSaldoIndepPeriodo = new javax.swing.JButton();
        jSaldoTotal = new javax.swing.JLabel();
        jSaldoDtAtual1 = new javax.swing.JLabel();
        lbSaldoTotal = new javax.swing.JLabel();
        lbSaldoDataAtual = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btListarRecDesp = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jDataDespesas = new javax.swing.JLabel();
        jValorDespesas = new javax.swing.JLabel();
        tfValorDespesas = new javax.swing.JTextField();
        rbAlimentacao = new javax.swing.JRadioButton();
        rbTransporte = new javax.swing.JRadioButton();
        rbResidencia = new javax.swing.JRadioButton();
        rbSaude = new javax.swing.JRadioButton();
        rbEducacao = new javax.swing.JRadioButton();
        rbOutrasDespesas = new javax.swing.JRadioButton();
        rbEntreterimento = new javax.swing.JRadioButton();
        tfDataDespesas = new javax.swing.JFormattedTextField();
        btListarDespesas = new javax.swing.JButton();
        btConfirmarDespesas = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jDataReceita = new javax.swing.JLabel();
        jValorReceita = new javax.swing.JLabel();
        tfValorReceita = new javax.swing.JTextField();
        rbSalario = new javax.swing.JRadioButton();
        rbDecimoTerceiro = new javax.swing.JRadioButton();
        rbFerias = new javax.swing.JRadioButton();
        rbOutrasReceitas = new javax.swing.JRadioButton();
        tfDataReceita = new javax.swing.JFormattedTextField();
        btConfirmarReceita = new javax.swing.JButton();
        btListarReceita = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar"));

        btSaldoDtAtual.setText("Saldo Data Atual");
        btSaldoDtAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoDtAtualActionPerformed(evt);
            }
        });

        btSaldoIndepPeriodo.setText("Saldo Independente do Período");
        btSaldoIndepPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoIndepPeriodoActionPerformed(evt);
            }
        });

        lbSaldoTotal.setText("R$:");

        lbSaldoDataAtual.setText("R$:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSaldoIndepPeriodo)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btSaldoDtAtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSaldoDataAtual)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbSaldoTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSaldoDtAtual1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSaldoDtAtual1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSaldoDtAtual)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbSaldoDataAtual)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaldoIndepPeriodo)
                    .addComponent(jSaldoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSaldoTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Despesas e Receitas"));

        btListarRecDesp.setText("Listar");
        btListarRecDesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarRecDespActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btListarRecDesp)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btListarRecDesp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Despesas"));

        jDataDespesas.setText("Data:");

        jValorDespesas.setText("Valor:   R$");

        buttonGroup2.add(rbAlimentacao);
        rbAlimentacao.setText("Alimentação");

        buttonGroup2.add(rbTransporte);
        rbTransporte.setText("Transporte");

        buttonGroup2.add(rbResidencia);
        rbResidencia.setText("Residência");

        buttonGroup2.add(rbSaude);
        rbSaude.setText("Saúde");

        buttonGroup2.add(rbEducacao);
        rbEducacao.setText("Educação");

        buttonGroup2.add(rbOutrasDespesas);
        rbOutrasDespesas.setText("Outros");

        buttonGroup2.add(rbEntreterimento);
        rbEntreterimento.setText("Entreterimento");

        btListarDespesas.setText("Listar");
        btListarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarDespesasActionPerformed(evt);
            }
        });

        btConfirmarDespesas.setText("Confirmar");
        btConfirmarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarDespesasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAlimentacao)
                            .addComponent(rbResidencia)
                            .addComponent(rbEducacao))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbEntreterimento)
                            .addComponent(rbSaude)
                            .addComponent(rbTransporte)))
                    .addComponent(rbOutrasDespesas)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btConfirmarDespesas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btListarDespesas))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jValorDespesas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfValorDespesas))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jDataDespesas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfDataDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDataDespesas)
                    .addComponent(tfDataDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jValorDespesas)
                    .addComponent(tfValorDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAlimentacao)
                    .addComponent(rbTransporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbResidencia)
                    .addComponent(rbSaude))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEntreterimento)
                    .addComponent(rbEducacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOutrasDespesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarDespesas)
                    .addComponent(btConfirmarDespesas))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Receita"));

        jDataReceita.setText("Data:");

        jValorReceita.setText("Valor:  R$");

        buttonGroup1.add(rbSalario);
        rbSalario.setText("Salário");

        buttonGroup1.add(rbDecimoTerceiro);
        rbDecimoTerceiro.setText("Décimo Terceiro");

        buttonGroup1.add(rbFerias);
        rbFerias.setText("Férias");

        buttonGroup1.add(rbOutrasReceitas);
        rbOutrasReceitas.setText("Outros");

        tfDataReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataReceitaActionPerformed(evt);
            }
        });

        btConfirmarReceita.setText("Confirmar");
        btConfirmarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarReceitaActionPerformed(evt);
            }
        });

        btListarReceita.setText("Listar");
        btListarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarReceitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbSalario)
                            .addComponent(rbFerias)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btConfirmarReceita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btListarReceita))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(jValorReceita)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfValorReceita))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(jDataReceita)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfDataReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbDecimoTerceiro)
                            .addComponent(rbOutrasReceitas))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDataReceita)
                    .addComponent(tfDataReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jValorReceita)
                    .addComponent(tfValorReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFerias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbDecimoTerceiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOutrasReceitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmarReceita)
                    .addComponent(btListarReceita))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarReceitaActionPerformed
        ListarReceita listarReceita = new ListarReceita(null, true);
        listarReceita.setGastosDomesticos(gastosDomesticos);
        listarReceita.setVisible(true);
    }//GEN-LAST:event_btListarReceitaActionPerformed

    private void btListarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarDespesasActionPerformed
        ListarDespesas listarDespesas = new ListarDespesas(null, true);
        listarDespesas.setGastosDomesticos(gastosDomesticos);
        listarDespesas.setVisible(true);
    }//GEN-LAST:event_btListarDespesasActionPerformed

    private void btSaldoDtAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoDtAtualActionPerformed
        double saldoAtual = gastosDomesticos.consultarSaldoDiaAtual();
        jSaldoDtAtual1.setText("" + saldoAtual);
    }//GEN-LAST:event_btSaldoDtAtualActionPerformed

    private void btSaldoIndepPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoIndepPeriodoActionPerformed
        double saldoTotal = gastosDomesticos.consultarSaldoTotal();
        jSaldoTotal.setText("" + saldoTotal);
    }//GEN-LAST:event_btSaldoIndepPeriodoActionPerformed

    private void btListarRecDespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarRecDespActionPerformed
        ListarRecDesp listarRecDesp = new ListarRecDesp(null, false);
        listarRecDesp.setGastosDomesticos(gastosDomesticos);
        listarRecDesp.setVisible(true);
    }//GEN-LAST:event_btListarRecDespActionPerformed

    private void btConfirmarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarDespesasActionPerformed
        // Classe que formata data em dd/mm/aa
        try {
            String data = tfDataDespesas.getText();
            DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEmLocalDate = LocalDate.parse(data, formatar);

            double valorDespesas = Double.parseDouble(tfValorDespesas.getText());

            if (rbAlimentacao.isSelected()) {
                despesa.setTipoDespesa(TipoDespesa.ALIMENTACAO);
            } else if (rbTransporte.isSelected()) {
                despesa.setTipoDespesa(TipoDespesa.TRANSPORTE);
            } else if (rbResidencia.isSelected()) {
                despesa.setTipoDespesa(TipoDespesa.RESIDENCIA);
            } else if (rbSaude.isSelected()) {
                despesa.setTipoDespesa(TipoDespesa.SAUDE);
            } else if (rbEducacao.isSelected()) {
                despesa.setTipoDespesa(TipoDespesa.EDUCACAO);
            } else if (rbEntreterimento.isSelected()) {
                despesa.setTipoDespesa(TipoDespesa.ENTRETERIMENTO);
            } else if (rbOutrasDespesas.isSelected()) {
                despesa.setTipoDespesa(TipoDespesa.OUTRAS);
            } else {
                JOptionPane.showMessageDialog(null, "O tipo de despesa não foi informado, favor preencher!");
            }
            Despesa despesaAux = new Despesa(dataEmLocalDate, valorDespesas, despesa.getTipoDespesa());
            gastosDomesticos.incluirLancamento(despesaAux);
            tfValorDespesas.setText("");
            tfDataDespesas.setText("");
            buttonGroup2.clearSelection();

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "O campo data está incorreto, favor preencher novamente");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O campo valor está incorreto, favor preencher novamente");
        } catch (RuntimeException rune){
            JOptionPane.showMessageDialog(null, "O valor não pode ser negativo, favor preencher novamente");
        }
    }//GEN-LAST:event_btConfirmarDespesasActionPerformed

    private void btConfirmarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarReceitaActionPerformed
        try {
            String data = tfDataReceita.getText();
            DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEmLocalDate = LocalDate.parse(data, formatar);

            double valorReceita = Double.parseDouble(tfValorReceita.getText());

            if (rbSalario.isSelected()) {
                receita.setTipoReceita(TipoReceita.SALARIO);
            } else if (rbFerias.isSelected()) {
                receita.setTipoReceita(TipoReceita.FERIAS);
            } else if (rbDecimoTerceiro.isSelected()) {
                receita.setTipoReceita(TipoReceita.DEC_TERCEIRO);
            } else if (rbOutrasReceitas.isSelected()) {
                receita.setTipoReceita(TipoReceita.OUTRAS);
            } else {
                JOptionPane.showMessageDialog(null, "O tipo de receita não foi informado, favor preencher!");
            }
            Receita receitaAux = new Receita(dataEmLocalDate, valorReceita, receita.getTipoReceita());
            gastosDomesticos.incluirLancamento(receitaAux);

            tfDataReceita.setText("");
            tfValorReceita.setText("");
            buttonGroup1.clearSelection();
            
            
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "O campo data está incorreto, favor preencher novamente");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O campo valor está incorreto, favor preencher novamente");
        } catch (RuntimeException rune){
            JOptionPane.showMessageDialog(null, "O valor não pode ser negativo, favor preencher novamente");
        }
    }//GEN-LAST:event_btConfirmarReceitaActionPerformed

    public final void formatarDataDespesa() {
        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.install(tfDataDespesas);
        } catch (ParseException e) {

        }
    }

    public final void formatarDataReceita() {
        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.install(tfDataReceita);
        } catch (ParseException e) {

        }
    }

    private void tfDataReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataReceitaActionPerformed

        MaskFormatter data;
        try {
            data = new MaskFormatter("#### / ## / ##");
            data.install(tfDataReceita);
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tfDataReceitaActionPerformed
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmarDespesas;
    private javax.swing.JButton btConfirmarReceita;
    private javax.swing.JButton btListarDespesas;
    private javax.swing.JButton btListarRecDesp;
    private javax.swing.JButton btListarReceita;
    private javax.swing.JButton btSaldoDtAtual;
    private javax.swing.JButton btSaldoIndepPeriodo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jDataDespesas;
    private javax.swing.JLabel jDataReceita;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jSaldoDtAtual1;
    private javax.swing.JLabel jSaldoTotal;
    private javax.swing.JLabel jValorDespesas;
    private javax.swing.JLabel jValorReceita;
    private javax.swing.JLabel lbSaldoDataAtual;
    private javax.swing.JLabel lbSaldoTotal;
    private javax.swing.JRadioButton rbAlimentacao;
    private javax.swing.JRadioButton rbDecimoTerceiro;
    private javax.swing.JRadioButton rbEducacao;
    private javax.swing.JRadioButton rbEntreterimento;
    private javax.swing.JRadioButton rbFerias;
    private javax.swing.JRadioButton rbOutrasDespesas;
    private javax.swing.JRadioButton rbOutrasReceitas;
    private javax.swing.JRadioButton rbResidencia;
    private javax.swing.JRadioButton rbSalario;
    private javax.swing.JRadioButton rbSaude;
    private javax.swing.JRadioButton rbTransporte;
    private javax.swing.JFormattedTextField tfDataDespesas;
    private javax.swing.JFormattedTextField tfDataReceita;
    private javax.swing.JTextField tfValorDespesas;
    private javax.swing.JTextField tfValorReceita;
    // End of variables declaration//GEN-END:variables
}
