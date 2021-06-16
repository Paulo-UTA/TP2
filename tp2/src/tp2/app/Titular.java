package tp2.app;

import java.io.Serializable;
import java.time.LocalDate;

public class Titular implements Serializable {
    private final DocumetoID docID;
    private String nome;
    private LocalDate ddn;
    private String morada;
    private String email;
    private int telefone;



    public Titular(String codigoDoc, TipoDocumento tipoDoc, String nome, LocalDate ddn, String email){
        this.email = email;
        this.docID = new DocumetoID(codigoDoc, tipoDoc);
        this.nome = nome;
        this.ddn = ddn;
    }

    public Titular(DocumetoID docID, String nome, LocalDate ddn, String morada, String email, int telefone){
        this.docID = docID;
        this.nome = nome;
        this.ddn = ddn;
        this.morada = morada;
        this.email = email;
        this.telefone = telefone;
    }

    public Titular(DocumetoID docID, String nome, LocalDate ddn, String email){
        this.docID = docID;
        this.nome = nome;
        this.ddn = ddn;
        this.email = email;

    }

    public String getNome() {
        return nome;

    }

    public LocalDate getDdn() {
        return ddn;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public DocumetoID getDocID() {
        return docID;
    }
}
