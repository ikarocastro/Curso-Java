package variaveis2;

public class TestaWhile {
    public static void main(String[] args) {

            int contador = 0;       //Variaveis locais não tem valor padrão tem que iniciar um valor

            while (contador <= 10){
                System.out.println(contador);
                contador += 1;
                //Contador = Contador + 1;
                //contador ++;
            }
        System.out.println(contador);
    }

}


//while em portugues "enquanto tal condição acontecer execute tal tarefa!"