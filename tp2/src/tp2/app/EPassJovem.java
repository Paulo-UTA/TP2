package tp2.app;

import java.time.LocalDate;

public class EPassJovem extends EPassStandard {

    public EPassJovem(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
    }

    public EPassJovem(DocumetoID docID, LocalDate ddn, String nome, String email) {
        super(docID, ddn, nome, email);
    }


}

