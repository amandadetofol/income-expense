package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class GastosDomesticosTest {

    public GastosDomesticosTest() {
    }

    @Test
    public void VerificarSeAsDespesasSaoListadasNaOrdemCorreta() {
        Despesa d1 = new Despesa();
        Receita r1 = new Receita();
        Receita r2 = new Receita();

        d1.setData(LocalDate.of(2020, 11, 11));
        r1.setData(LocalDate.of(2020, 11, 13));
        r2.setData(LocalDate.of(2020, 11, 12));

        GastosDomesticos gd = new GastosDomesticos();

        gd.incluirLancamento(d1);
        gd.incluirLancamento(r1);
        gd.incluirLancamento(r2);

        int posicao = gd.listarDespesasReceitasOrdemData().size();

        assertEquals(r1.getData(), gd.listarDespesasReceitasOrdemData().get(posicao - 1).getData());
    }

    @Test
    public void VerificarSeOMetodoConsultarSaldoDiaAtualRetornaOSaldoCorreto() {
        GastosDomesticos gd = new GastosDomesticos();

        //RECEITA – 200,00 REAIS – 11/NOV
        Lancamento r1 = new Receita();
        r1.setValor(200.00);
        r1.setData(LocalDate.of(2020, 11, 11));

        //*DESPESA – 100,00 REAIS – 12/NOV
        Lancamento d1 = new Despesa();
        d1.setValor(100.00);
        d1.setData(LocalDate.of(2020, 11, 12));

        //*RECEITA – 2.000,00 REAIS – 13/NOV/2020
        Lancamento r2 = new Receita();
        r2.setValor(2000);
        r2.setData(LocalDate.of(2020, 11, 13));

        //*DESPESAS -  300,00 REAIS – 30/N0V/2020
        Lancamento d2 = new Despesa();
        d2.setValor(300.00);
        d2.setData(LocalDate.of(2020, 11, 30));

        gd.incluirLancamento(r1);
        gd.incluirLancamento(d1);
        gd.incluirLancamento(r2);
        gd.incluirLancamento(d2);

        double total = gd.consultarSaldoDiaAtual();

        assertEquals(total, 2100, 0.1);
    }

    @Test
    public void VerificarSeOMetodoConsultarSaldoTotalRetornaOSaldoCorreto() {
        GastosDomesticos gd = new GastosDomesticos();

        //RECEITA – 200,00 REAIS – 11/NOV
        Lancamento r1 = new Receita();
        r1.setValor(200.00);
        r1.setData(LocalDate.of(2020, 11, 11));

        //*DESPESA – 100,00 REAIS – 12/NOV
        Lancamento d1 = new Despesa();
        d1.setValor(100.00);
        d1.setData(LocalDate.of(2020, 11, 12));

        //*RECEITA – 2.000,00 REAIS – 13/NOV/2020
        Lancamento r2 = new Receita();
        r2.setValor(2000);
        r2.setData(LocalDate.of(2020, 11, 13));

        //*DESPESAS -  300,00 REAIS – 30/N0V/2020
        Lancamento d2 = new Despesa();
        d2.setValor(300.00);
        d2.setData(LocalDate.of(2020, 11, 30));

        gd.incluirLancamento(r1);
        gd.incluirLancamento(d1);
        gd.incluirLancamento(r2);
        gd.incluirLancamento(d2);

        double total = gd.consultarSaldoTotal();

        assertEquals(total, 1800, 0.1);
    }

    @Test
    public void VerificarSeOMetodoListarDespesasListaTodasAsDespesasInseridas() {
        GastosDomesticos gd = new GastosDomesticos();
        Lancamento d1 = new Despesa();
        d1.setValor(100.00);
        d1.setData(LocalDate.of(2020, 11, 12));
        ((Despesa) d1).setTipoDespesa(TipoDespesa.OUTRAS);

        Lancamento d2 = new Despesa();
        d2.setValor(300.00);
        d2.setData(LocalDate.of(2020, 11, 30));
        ((Despesa) d2).setTipoDespesa(TipoDespesa.OUTRAS);

        gd.incluirLancamento(d1);
        gd.incluirLancamento(d2);

        assertEquals(2, gd.listarDespesas(TipoDespesa.OUTRAS).size());
    }

    @Test
    public void VerificarSeOMetodoListarReceitasListaTodasAsDespesasInseridas() {
        GastosDomesticos gd = new GastosDomesticos();
        Lancamento r1 = new Receita();
        r1.setValor(100.00);
        r1.setData(LocalDate.of(2020, 11, 12));
        ((Receita)r1).setTipoReceita(TipoReceita.SALARIO);

        Lancamento r2 = new Receita();
        r2.setValor(300.00);
        r2.setData(LocalDate.of(2020, 11, 30));
        ((Receita)r2).setTipoReceita(TipoReceita.SALARIO);
        
        gd.incluirLancamento(r1);
        gd.incluirLancamento(r2);

        assertEquals(2, gd.listarReceitas(TipoReceita.SALARIO).size());
    }


}
