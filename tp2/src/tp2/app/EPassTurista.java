package tp2.app;

import java.util.Date;

public class EPassTurista extends PasseSazonal {

    private double saldo;
    private Date validade;
    private void adicionarDia(Date validade2, int i) {
      

    }

    public  Turista(int valor) {

        if (valor == 500) {
            saldo = valor;
            this.validade = new Date();
            adicionarDia(validade, 1);
        } else if (valor == 700) {
            saldo = valor;
            this.validade = new Date();
            adicionarDia(validade, 3);

        } else if (valor == 1500) {
            saldo = valor;
            this.validade = new Date();
            adicionarDia(validade, 7);
        }

    }
    @Override
    public

    boolean viagens() {
        int preco = 50;
        Date dataAtual = new Date();
        if (this.saldo > preco && dataAtual.before(validade)) {
            this.saldo -= preco;
            return true;
        }

        else {
            return false;
        }
    }

    @Override
    public
    boolean carregar(int valor) {
        return false;

    }


}
