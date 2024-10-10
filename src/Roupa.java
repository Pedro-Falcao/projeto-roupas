public class Roupa {

    private String cor;
    private float valor;
    private String tipo;
    private String marca;
    private String tamanho;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }



    public Roupa(String cor, float valor, String tipo, String marca, String tamanho) {
        this.cor = cor;
        this.valor = valor;
        this.tipo = tipo;
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public void Vestimenta(){

    }

    @Override
    public String toString() {
        return "Roupa{" +
                "cor='" + cor + '\'' +
                ", valor=" + valor +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
