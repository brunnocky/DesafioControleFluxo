import java.util.Scanner;

    public class Contador {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Insira o primeiro número");
            int numero01 = input.nextInt();
            System.out.println("Insira o segundo número");
            int numero02 = input.nextInt();

            // Testando exceção:
        /*
        int numero01 = 10;
        int numero02 = 5;
        */

            // Testando exceção:
        /*
        int numero01 = 5;
        int numero02 = 5;
        */

            try{
                contar(numero01,numero02);
            }catch (ParametrosInvalidosException e){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }

        }
        public static void contar(int numero01, int  numero02) throws ParametrosInvalidosException{
            if(numero02 < numero01 || numero01 == numero02){
                throw  new ParametrosInvalidosException();
            }

            int subtracaoDosParametros = numero02 - numero01;
            for (int i = 1; i <= subtracaoDosParametros; i++){
                System.out.println("Imprimindo o número " + i);
            }

        }
    }

