package myclass;

/**
 *
 * @author nu4_lab201
 */
public class Vendedor extends Pessoa implements Venda{

    private float comissao;

    public Vendedor() {
    }

    public Vendedor(float comissao, String nome, int idade, String email) {
        super(nome, idade, email);
        this.comissao = comissao;
    }
    
    @Override
    public void falar() {
        System.out.println("Deseja comprar algo?");
    }

    @Override
    public void vender() {
        System.out.println("Venda garantida");
    }

    /**
     * @return the comissao
     */
    public float getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
}
