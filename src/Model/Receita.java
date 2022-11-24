package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * As receitas sao todos os recebimentos que a pessoa obtem
 */
public class Receita extends Lancamento {

    private TipoReceita tipoReceita;

    /**
     * Este eh o construtor padrao
     */
    public Receita() {
        super();
    }

    /**
     * Este construtor recebe como parametro data, valor e tipoReceita
     */
    public Receita(LocalDate data, double valor, TipoReceita tipoReceita) {
        setData(data);
        setValor(valor);
        this.tipoReceita = tipoReceita;
    }

    /**
     * Este eh o getter do atributo tipoReceita
     *
     * @return variavel do tipo TipoReceita
     */
    public TipoReceita getTipoReceita() {
        return tipoReceita;
    }

    /**
     * Este eh o setter do atributo tipoReceita
     */
    public void setTipoReceita(TipoReceita tipoReceita) {
        this.tipoReceita = tipoReceita;
    }

    /**
     * Retorna uma String com informacoes que representam uma instancia da
     * classe Receita
     *
     * @return String
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LocalDate dataReceita = getData();//For reference
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataReceitaFormatada = dataReceita.format(formatar);
        builder.append("\n" + "Data Receita: " + dataReceitaFormatada + "\n" + " Valor Receita: " + getValor() + "\n" + " Tipo Receita: " + getTipoReceita() + "\n");
        return builder.toString();
    }
}
