package tp2.app;

import java.io.Serializable;

public class DocumetoID implements Serializable {
    private final String codigo;
    private final TipoDocumento tipo;
    
    private TipoDocumento gerarTipo(String doc){
        if(doc.equalsIgnoreCase("BI"))
            tipo = TipoDocumento.BI;  

            else if(doc.equalsIgnoreCase("PASSAPORTE"))
            tipo = TipoDocumento.PASSAPORTE;

            else if(doc.equalsIgnoreCase("CUC"))
            tipo = TipoDocumento.CUC; 

            else if(doc.equalsIgnoreCase("TRE"))
            tipo = TipoDocumento.TRE;  

            else {System.out.println("Documento Invalido");
                    System.exit(0);
            }

            return tipo;
    


    public String getCodigo(){
        return codigo;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }
}
