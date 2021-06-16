package tp2.app;

import java.io.Serializable;

public class DocumetoID implements Serializable {
    private final String codigo;
    private final TipoDocumento tipo;

    public DocumetoID(String codigo, TipoDocumento tipo){
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public DocumetoID(DocumetoID doc){
        this.codigo = doc.codigo;
        this.tipo = doc.tipo;
    }

    public String getCodigo(){
        return codigo;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }
}
