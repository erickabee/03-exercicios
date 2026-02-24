package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do paciente: ");
        paciente.nome = sc.next();
        System.out.println("Informe a idade do paciente: ");
        paciente.idade = sc.nextInt();

        double [] freqAlvo = paciente.frequenciaAlvo();
        System.out.println("Frequencia maxima: "+paciente.frequenciaMaxima());
        System.out.println("Frequencia alvo inicial: "+freqAlvo[0]);
        System.out.println("Frequencia alvo final: "+freqAlvo[1]);

    }
}
