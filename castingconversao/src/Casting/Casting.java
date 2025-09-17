package Casting;

public class Casting {
    public static void main(String[] args) {

        double salario = 2700.50;
        int valor = (int)salario; // O (int) vai estar falando pra IDE transforme esse valor em numero interio!
        //casting e voce forçar a troca de variaveis no caso acima (double = int)

        System.out.println(valor);

        int numero = 2000000;
        long numerogrande = 35985998438L;   //o (long) consegue armazenar mais bits que o int mais necessita ser colocado no final do numero um (L)
        short numeropequeno = 2103; //uma variavel que armazenar so 16 bits
        byte B = 127;
    }
}
