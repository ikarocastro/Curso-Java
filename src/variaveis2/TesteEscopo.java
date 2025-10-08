package variaveis2;

public class TesteEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais!");

        int idade = 18;
        int quantidadePessoa = 2;           //essas são vairáveis locais!
        boolean acompanhado;
        //boolean acompanhado = quantidadePessoa >= 2; //expressão booleana!

        if (quantidadePessoa >= 2){
             acompanhado = true;
        }//chegou nessa chave a variavel morreu ksksks
        else {
             acompanhado = false;
        }

        System.out.println("valor de acompanhado:" + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("voce pode comprar uma bebida!");
        }       //Nesse codigo usamos a tecnica de refatoração, significa pegammos um codigo defeituoso ou mal feito

        else {
            System.out.println("voce não pode comprar  a bebida!");
        }
    }
}

//Vamos nessa aula pegar o codigo boolean e trasnformar em 2 usando if !
//Observe que (acompanhado) está apitando erro, isso por que a varivel não foi declarada!
// Observe tambem que acompanhado ainda esta tando erro, nos declaramos 2 booleans separados e nao =>
//apenas um por que as variaveis entre {} assim que fechadas elas se encerram ali!
//por isso declaramos as variaveis 2 vezes tano no if quanto no else!

//As vaiáveis locais só são compiladas se houver um valor, por exemplo do boolean se apagar o
//else o compilador já aponta erro pois não esta declado o valor de false da segunda vaiável
