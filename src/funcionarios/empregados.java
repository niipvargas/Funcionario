package funcionarios;

public class empregados {
    
    String nome;
    String dep;
    double salario;
    String dt_entrada;
    String RG;
     
    public void recebeAumento(double aumento) {
        this.salario = this.salario + aumento;
        System.out.println("R$" + this.salario);
    }
    
    
    public void ganhoAnual(){
     double salarioAnual = this.salario * 12;
     System.out.println("R$" + salarioAnual);
    }
    
}
