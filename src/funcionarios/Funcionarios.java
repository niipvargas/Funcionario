package funcionarios;


public class Funcionarios {

   
    public static void main(String[] args) {
       empregados e1 = new empregados();
       
       e1.nome = "Carlos Souza";
       e1.dep = "Administração";
       e1.salario = 3507.00;
       e1.dt_entrada = "25/08/2000";
       e1.RG = "122.356.1";
       
       
       System.out.println(e1.nome);
       System.out.println(e1.dep);
       System.out.println("R$" + e1.salario);
       System.out.println(e1.dt_entrada);
       System.out.println(e1.RG);
       e1.recebeAumento(1500.0);
       e1.ganhoAnual();

    }
    
}
