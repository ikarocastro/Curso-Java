package variaveis;

public class char_caracteres {
    public static void main(String[] args) {
            char letra = 'A';  //o "char" so armazena 1 caractere!

        System.out.println("Essa e minha letra:" + letra);


        char valor = 66;   //Valor que iprime a letra B na tabela Unicode!
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);
                        // aqui fizemos um casting usando o outro valor da tabela mais 1 e imprime C
                        //Ou seja o 66 + 1 = 67 que imprime = C

        String mensagem = "Exibindo a mensagem aleatória usando String!";
        //Observe que string pode ser vazia que não da error.
        System.out.println(mensagem);

        //Se fizermos
        mensagem = mensagem + 2025;
        System.out.println(mensagem);
        //Vai sair a string com gatenado que é : Ele vai está somando a string mais o numero que a gente colocou!
    }
}
