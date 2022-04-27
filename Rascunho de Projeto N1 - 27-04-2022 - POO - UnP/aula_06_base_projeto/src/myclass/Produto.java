package myclass;

/**
 *
 * @author nu4_lab201
 */
public class Produto {
    private String nome;
    private float valor;

    public Produto() {
    }

    public Produto(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
