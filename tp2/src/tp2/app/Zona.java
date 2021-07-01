package tp2.app;

public class Zona {
   private final String zonas[]; 
    
    Zona(String z1,String z2,String z3, String z4){
        zona = new String[4];
        zonas[0] = z1;
        zonas[1] = z2;
        zonas[2] = z3;
        zonas[3] = z4;
        
    }

    public String getZona1() {
        return zonas[0];
    }
    public String getZona2() {
        return zonas[1];
    }
    public String getZona3() {
        return zonas[2];
    }
     public String getZona4() {
        return zonas[3];
    }

    public void setZona1(String zonas) {
        this.zonas[0] = zonas;
    }
    public void setZona2(String zonas) {
        this.zonas[1] = zonas;
    }
    public void setZona3(String zonas) {
        this.zonas[2] = zonas;
    }
    public void setZona4(String zonas) {
        this.zonas[3] = zonas;
    }
     
}

}
