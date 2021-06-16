package tp2.app;

import java.util.Date;

public class EPassFest extends PasseSazonal {
    private Date dataInicial;
    private Date dataFinal;
    private int saldoFestival;
    private boolean bilhete;

    @Override
    public
    boolean carregar(int valor) {
        return bilhete;
    }

    @Override
    public
    boolean viagens() {

        Date dataAtual = new Date();
        if (dataAtual.after(dataInicial) && dataAtual.before(dataFinal) && super.viagens()) {
            return true;

        } else {
            return false;
        }
    }

    public boolean carregarSaldoFestival(int valor) {
        if (valor > 0) {
            this.saldoFestival += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean pagarSaldoFestival(int valor) {
        if (valor > 0) {
            this.saldoFestival -= valor;
            return true;
        } else {
            return false;
        }
    }

    public EPassFest(Date dataInicial, Date dataFinal, boolean bilhete) {
        super();
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.bilhete = bilhete;
    }

    public int getSaldoFestival() {
        return saldoFestival;
    }

    public void setSaldoFestival(int saldoFestival) {
        this.saldoFestival = saldoFestival;
    }
}


