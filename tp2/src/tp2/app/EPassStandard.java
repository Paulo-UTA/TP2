package tp2.app;

import java.time.LocalDate;

public abstract class EPassStandard extends EPass {
    private final Titular titular;
    private int pontos;
    private int numeroViagem;
    private final Chave<EPassStandard> chave;

    public EPassStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email ){
        super();
        this.titular = new Titular(new DocumetoID(codigoDoc, tipoDoc), nome, ddn, email);

    }

    public EPassStandard(DocumetoID docID, LocalDate ddn, String nome, String email){
        super();
        this.titular = new Titular(docID, nome, ddn, email);

    }


    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getNumeroViagem() {
        return numeroViagem;
    }

    public void setNumeroViagem(int numeroViagem) {
        this.numeroViagem = numeroViagem;
    }



    @Override
    boolean viagens(){
        if(pontos>=100) {
            pontos-=40;
            return true;
        }
        else if (super.viagens()) {
            numeroViagem+=1;
            if(numeroViagem>=10) {
                numeroViagem=0;
                pontos+=1;
            }
            return true;

        }
        else {}
        return false;

    }



}
