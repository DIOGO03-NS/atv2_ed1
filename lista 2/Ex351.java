import java.util.Scanner;

public class Ex351 {
    public static void main(String[] args) {
        String nome[] = new String[5];
        int numNome;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < nome.length; i++){
            System.out.printf("DIGITE O NOME DO CORRESPONDENTE N°%d: \n", i+1);
            nome[i] = input.nextLine();
        }

        System.out.println("DIGITE O NUMERO PARA VERIFICAR O NOME: ");
        numNome = input.nextInt();

        System.out.printf("\nO NOME CORRESPONDENTE AO NUMERO %d É: %S", numNome, nome[numNome --]);
    }
}
