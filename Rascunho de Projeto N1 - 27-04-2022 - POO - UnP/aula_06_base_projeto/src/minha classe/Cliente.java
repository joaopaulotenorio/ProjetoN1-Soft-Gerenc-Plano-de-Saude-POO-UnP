package myclass;
// clientes
/**
 *
 * @author nu4_lab201
 */
public class Cliente extends Pessoa{

    private String tipo;

    public Cliente() {
    }

    public Cliente(String nome, int idade, String email, String tipo) {
        /*
        setNome(nome);
        setIdade(idade);
        setEmail(email);
        */
        super(nome, idade, email);
        this.tipo = tipo;
    }
    
    
    
    @Override
    public void falar() {
        System.out.println("Preciso de ajuda");
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
