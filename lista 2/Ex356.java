import java.util.Scanner;

public class Ex356 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pr1[] = new float[3];
        float pr2[] = new float[3];
        String nome[] = new String[3];
        String situacao[] = new String[3];

        for(int i = 0; i < nome.length; i++){
            System.out.print("DIGITE O NOME: ");
            nome[i] = input.next();

            System.out.printf("DIGITE A PRIMEIRA NOTA DE %S: ", nome[i]);
            pr1[i] = input.nextFloat();
            System.out.printf("DIGITE A PRIMEIRA NOTA DE %S: ", nome[i]);
            pr2[i] = input.nextFloat();

            if((pr1[i] + pr2[i])/2 >= 6){
                situacao[i] = "APROVADO";
            }else{
                situacao[i] = "REPROVADO";
            }
        }

    for(int i = 0; i < nome.length; i++){
        System.out.printf("\n---------------------------------------\nNOME: %S\nNOTA 1: %f\nNOTA 2: %f\nMEDIA: %f\nSITUAÇÃO: %S", nome[i], pr1[i], pr2[i], pr1[i] + pr2[i]/2, situacao[i]);
    }
    }
}
