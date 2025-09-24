package variaveis2;

public class TestandoCondicionais2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais!");

        int idade = 18;
        int quantidadePessoa = 2;
        boolean acompanhado = quantidadePessoa >= 2; //expressão booleana!

        System.out.println("valor de acompanhado:" + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("voce pode comprar uma bebida!");
        }       //Nesse codigo usamos a tecnica de refatoração, significa pegammos um codigo defeituoso ou mal feito

        else {
            System.out.println("voce não pode comprar  a bebida!");
        }
    }
}
//Vamos agora adicionar o "boolean" cujo armazena apenas "true" e "false"