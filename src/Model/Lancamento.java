package Model;

import java.time.LocalDate;

/**
 * As receitas e despesas sao tipos de lancamentos e esta classe eh a classe pai
 * das classes receitas e despesas
 */
public class Lancamento {

    private double valor;
    private LocalDate data;

    /**
     * Eh o getter do atributo data
     *
     * @return data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Eh o setter do atributo data
     *
     * @param data
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Eh o getter do atributo valor
     *
     * @return double valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Eh o setter do atributo valor
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
