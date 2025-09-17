package variaveis;

public class pontoflutuante {
    public static void main(String[] args) {

        double hora = 3;

        System.out.println("agora são exatas: " + hora + " horas");

        double conta = 3.4 / 2;
        System.out.println("Resultado da conta: " + conta);

        int conta2 = 3/2;
        System.out.println(conta2);
            //O java força uma saida de numero inteiro msm não dando esse resultado!

        double conta3 = 3.0 / 2;
        System.out.println(conta3);
        //observe que ao colocar so (3) ele vai esquecer o numero esquerdo e vai entender interio+inteiro e vai tentar encaixar no formato no double!
        //Por isso se coloca (3.0) pois o Java e extremamente tipado ou seja certinho!
        // add 0 3.0 pra deixar a conta em double!
    }
}
