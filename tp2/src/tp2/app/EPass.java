package tp2.app;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class EPass implements Serializable,TituloTransporte{

    private final long codigo;
    private double saldo;
    private double precoViagem;
    private final LocalDateTime dataEmisao;
    private LocalDate carregamento;
    private LocalDate validade;
    private static long ultCodigo;


    static {
        if (long.valueOf(ultCodigo) == null)
            ultCodigo = 0;
    }

    public EPass(double saldo, double precoViagem) {
        this.codigo = ultCodigo + 1;
        ultCodigo++;
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.dataEmisao = LocalDateTime.now();

    }

    public EPass(long codigo, double precoViagem, LocalDateTime dataEmisao){
        this.codigo = codigo;
        this.precoViagem = precoViagem;
        this.dataEmisao = dataEmisao;
    }



    public EPass(long codigo, double saldo, double precoViagem, LocalDateTime dataEmisao, LocalDate carregamento, LocalDate validade){
        this.codigo = codigo;

        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.dataEmisao = dataEmisao;
        this.carregamento = carregamento;
        this.validade = validade;
    }

    public EPass(long codigo, double saldo, LocalDateTime dataEmisao, LocalDate carregamento){
        this.codigo = codigo;
        this.saldo = saldo;
        this.dataEmisao = dataEmisao;
        this.carregamento = carregamento;
    }




    public final long getCodigo(){
        return codigo;
    }

    public LocalDate getCarregamento(){
        return carregamento;
    }

    public LocalDate getValidade(){
        return validade;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCarregamento(LocalDate carregamento) {
        this.carregamento = carregamento;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "EPass{" +
                "codigo=" + codigo +
                ", saldo=" + saldo +
                ", precoViagem=" + precoViagem +
                ", dataEmisao=" + dataEmisao +
                ", carregamento=" + carregamento +
                ", validade=" + validade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EPass ePass = (EPass) o;
        return codigo == ePass.codigo && Double.compare(ePass.saldo, saldo) == 0 && Double.compare(ePass.precoViagem, precoViagem) == 0 && Objects.equals(dataEmisao, ePass.dataEmisao) && Objects.equals(carregamento, ePass.carregamento) && Objects.equals(validade, ePass.validade);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigo, saldo, precoViagem, dataEmisao, carregamento, validade);
    }

    boolean carregar(int valor) {
        if(valor>0) {

            this.saldo +=valor;
            return true;
        }
        else {
            return false;
        }
    }


    boolean viagens() {
        int valor=40;
        if(this.saldo>valor){
            this.saldo-=valor;
            return true;
        }

        else {
            return false;
        }
    }


}
