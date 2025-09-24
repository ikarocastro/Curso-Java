package variaveis2;

public class TestandoCondicionais {
    public static void main(String[] args) {
        System.out.println("testando condicionais!");

        int idade = 18;
        int quantidadePessoa = 1;

        if (idade >= 18 && quantidadePessoa >= 2){
            System.out.println("voce pode comprar uma bebida!");
        }       //Nesse codigo usamos a tecnica de refatoração, significa pegammos um codigo defeituoso ou mal feito

        else {
            System.out.println("voce não pode comprar  a bebida!");
            }
        }
    }


//Detalhe fizemos o IF com "||" primeiro
//agora vamos trocar por "&&"   (Nessa troca mesmo tendo 18 oumais de 18 anos, a pessoa ainda não pode comprar a bebida
//pois a regra do nosso codigo não permite!