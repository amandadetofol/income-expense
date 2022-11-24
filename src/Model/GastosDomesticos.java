package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Esta classe gerencia os lancamentos (Receitas e Despesas) e saldos
 */
public class GastosDomesticos {

    private double saldo;
    private ArrayList<Lancamento> lancamentos = new ArrayList<>();
    private ArrayList<Receita> receitas = new ArrayList<>();
    private ArrayList<Despesa> despesas = new ArrayList<>();

    /**
     * Este metodo vai incluir no ArrayList de Lancamento as receitas e
     * despesas. Alem disso, ira incluir as receitas e despesas em seus
     * respectivos ArrayList
     *
     * @param lancamento
     */
    public void incluirLancamento(Lancamento lancamento) {
        
        if (lancamento.getValor() > 0) {
            lancamentos.add(lancamento);
            if (lancamento instanceof Despesa) {
                despesas.add((Despesa) lancamento);
            } else {
                receitas.add((Receita) lancamento);
            } 
        }
        
    }
    

    /**
     * Retorna os lancamentos ordenados da menor para maior data
     *
     * @return ArrayList Lancamento
     */
    public ArrayList<Lancamento> listarDespesasReceitasOrdemData() {
        this.getLancamentos().sort(Comparator.comparing(Lancamento::getData));
        return lancamentos;
    }

    /**
     * Eh o getter do atributo dos lancamentos
     *
     * @return ArrayList Lancamento
     */
    public ArrayList<Lancamento> getLancamentos() {
        return lancamentos;
    }

    /**
     * Retorna o saldo que o usuário possui nao contabilizando Receitas ou
     * Despesas em datas futuras a atual
     *
     * @return double saldo (saldo do dia atual)
     */
    public double consultarSaldoDiaAtual() {
        this.saldo = 0;
        LocalDate dataAtual = LocalDate.now();
        for (Lancamento p : lancamentos) {
            if (p.getData().isBefore(dataAtual) || p.getData().isEqual(dataAtual)) {
                if (p instanceof Despesa) {
                    this.saldo -= p.getValor();
                } else {
                    this.saldo += p.getValor();
                }
            }

        }
        return saldo;
    }

    /**
     * Retorna o saldo que o usuário possui contabilizando Receitas ou Despesas
     * em datas futuras a atual
     *
     * @return double saldo (saldo total)
     */
    public double consultarSaldoTotal() {
        this.saldo = 0;
        for (Lancamento p : lancamentos) {
            if (p instanceof Despesa) {
                this.saldo -= p.getValor();
            } else {
                this.saldo += p.getValor();
            }
        }
        return this.saldo;
    }

    /**
     * Lista as Despesas filtrando pelo tipo que o usuário seleciona
     *
     * @param tipo
     * @return despesasTipo
     */
    public ArrayList<Despesa> listarDespesas(TipoDespesa tipo) {
        ArrayList<Despesa> despesasTipo = new ArrayList<>();
        for (Despesa d : despesas) {
            if (d.getTipoDespesa() == tipo) {
                despesasTipo.add(d);
            }
        }
        return despesasTipo;
    }

    /**
     * Lista as Receitas filtrando pelo tipo que o usuário seleciona
     *
     * @param tipo
     * @return ReceitasTipo
     */
    public ArrayList<Receita> listarReceitas(TipoReceita tipo) {
        ArrayList<Receita> receitasTipo = new ArrayList<>();
        for (Receita r : receitas) {
            if (r.getTipoReceita() == tipo) {
                receitasTipo.add(r);
            }
        }
        return receitasTipo;
    }
}
