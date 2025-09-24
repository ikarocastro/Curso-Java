package variaveis2;

public class TestandoVariaveis {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 15;
        int quantidadePessoa = 2;

        if (idade >= 18){
            System.out.println("Vai conseguir comprar pois ja tem 18 anos!");
            System.out.println("voce pode comprar uma bebida!");
        }
        else {
            if (quantidadePessoa >= 2){
                System.out.println("voce e menor de idade mas pode" +
                        " comprar pois esta acompanhdo");
            } else {


                System.out.println("Voce nao tem mais que 18 entao:");
                System.out.println("Voce nao pode comprar e nao esta acompanhado!");
            }
            }
    }

}
