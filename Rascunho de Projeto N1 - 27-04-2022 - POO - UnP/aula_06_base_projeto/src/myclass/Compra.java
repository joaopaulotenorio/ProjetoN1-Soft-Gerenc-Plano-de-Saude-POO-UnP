package myclass;

import java.util.ArrayList;

/**
 *
 * @author nu4_lab201
 */
public class Compra {
    private int numero;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Produto> produtos;

    public Compra() {
        this.produtos = new ArrayList();
    }

    public Compra(int numero, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produtos = new ArrayList();
    }
    
    public void addProduto(String nome, float valor){
        Produto novo = new Produto(nome, valor);
        this.produtos.add(novo);
    }
    
    public float totalCompra(){
        float total = 0;
        for (Produto produto : produtos) {
            total = (total + produto.getValor());
        }
        return total;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the produtos
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
