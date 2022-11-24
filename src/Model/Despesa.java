package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * As despesas sao gastos que uma pessoa possui
 */
public class Despesa extends Lancamento {

    private TipoDespesa tipoDespesa;

    /**
     * Este construtor recebe como parametro data, valor e tipoDespesa
     */
    public Despesa(LocalDate data, double valor, TipoDespesa tipoDespesa) {
        setData(data);
        setValor(valor);
        this.tipoDespesa = tipoDespesa;
    }

    /**
     * Este eh o construtor padrao
     */
    public Despesa() {
        super();
    }

    /**
     * Este eh o getter do atributo tipoDespesa
     *
     * @return variavel do tipo TipoDespesa
     */
    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Este eh o setter do atributo tipoDespesa
     */
    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    /**
     * Retorna uma String com informacoes que representam uma instancia da
     * classe Despesa
     *
     * @return String
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LocalDate dataDespesa = getData();//For reference
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDespesaFormatada = dataDespesa.format(formatar);
        builder.append("\n" + "Data Despesa: " + dataDespesaFormatada + "\n" + " Valor Despesa: " + getValor() + "\n" + " Tipo Despesa: " + getTipoDespesa() + "\n");
        return builder.toString();
    }

}
