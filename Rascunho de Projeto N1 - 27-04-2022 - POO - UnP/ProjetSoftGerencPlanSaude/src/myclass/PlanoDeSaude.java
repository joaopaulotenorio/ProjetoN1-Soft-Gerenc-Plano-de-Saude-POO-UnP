package myclass;

/**
 * @author alu202114728
 */
public class PlanoDeSaude implements Servico, Consulta {
    String Tipo;
    float Valor;

    @Override
    public void Consultar() {
        System.out.println("Consultando...");
    }
    
}
