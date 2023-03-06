import java.util.Scanner;

public class ex348 {
    public static void main(String[] args) {
        float nota1[] = new float[3];
        float nota2[] = new float[3];
        String nome[] = new String[3];
        Scanner input = new Scanner(System.in);

        for(int i= 0; i < nome.length; i++){
            System.out.print("DIGITE O NOME DX ALUNX: ");
            nome[i] = input.nextLine();

            System.out.print("DIGITE A NOTA DA PRIMEIRA NOTA: ");
            nota1[i] = input.nextFloat();

            System.out.print("DIGITE A NOTA DA SEGUNDA NOTA: ");
            nota2[i] = input.nextFloat();
        }
        for(int i= 0; i < nome.length; i++){
            System.out.printf("ALUNX: %S\nNOTA 1: %f\nNOTA 2: %f\nMEDIA: %f\n\n", nome[i], nota1[i], nota2[i], (nota1[i] + nota2[i])/2);
        }
    }
}
