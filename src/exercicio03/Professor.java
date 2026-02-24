package exercicio03;

public class Professor {
    String nome;
    int totalDeAulas;
    double valorAula;

    public double calcularSalario(){
        double salarioBase;
        double horaAtividade;
        double descansoSemanal;

        salarioBase = totalDeAulas * valorAula * 4.5;
        horaAtividade = salarioBase * 5 / 100;
        descansoSemanal = (salarioBase + horaAtividade) / 6;

        return salarioBase + horaAtividade + descansoSemanal;
    }
}
