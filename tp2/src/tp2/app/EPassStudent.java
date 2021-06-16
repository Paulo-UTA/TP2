package tp2.app;


import java.time.LocalDate;
import java.util.Date;

public class EPassStudent extends EPassStandard {
    private String escola;
    private int anoFrequenta;
    private int viagemFree;
    private ArrayList <Zona> zonas;


    public EPassStudent(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email, String escola, int anoFrequenta, int viagemFree, ArrayList<Zona> zonas) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
        this.escola = escola;
        this.anoFrequenta = anoFrequenta;
        this.viagemFree = viagemFree;
        this.zonas = zonas;
    }


    public int getAnoFrequenta() {
        return anoFrequenta;
    }

    public void setAnoFrequenta(int anoFrequenta) {
        this.anoFrequenta = anoFrequenta;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getViagemFree() {
        return viagemFree;
    }

    public void setViagemFree(int viagemFree) {
        this.viagemFree = viagemFree;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }



    @Override
    boolean carregar(int valor) {
        if(super.carregar(valor)) {
            this.viagemFree=4;
            this.ultimaRecarga=new Date();
            return true;
        }
        else {
            return false;
        }
    }



}
