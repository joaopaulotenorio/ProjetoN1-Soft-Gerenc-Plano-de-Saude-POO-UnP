package aula06;

import myclass.*;

/**
 *
 * @author nu4_lab201
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente joao = new Cliente("JOAO JOVINO", 32, "jojo@teste.com", "VIP");
        Vendedor tedy = new Vendedor(10, "TEDY O VENDEDOR", 27, "tedy@vendas.com");
        joao.falar();
        tedy.falar();
        Compra novacompra = new Compra(1, joao, tedy);
        novacompra.addProduto("Sardinha", 13);
        novacompra.addProduto("Ovos de Chocolate", 54);
        System.out.println("Total da Compra "+novacompra.totalCompra());
        
    }
    
}
