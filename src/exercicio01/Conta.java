package exercicio01;

import java.util.Scanner;

public class Conta {
    //atributos ou propriedades ou variaveis de instancia
    String correntista;
    int numero;
    double saldo;

    public void deposito(double valor){
        saldo+= valor;
    };

    //metodo para sacarum valor da conta
    public void sacar(double valor){
        saldo-=valor;
    }
}
