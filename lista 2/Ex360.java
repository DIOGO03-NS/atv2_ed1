import java.util.Scanner;

public class Ex360 {
    public static void main(String[] args) {
        int ultdia[] = new int[12];
        String signo[] = new String[12];
        int data, dia, mes;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < signo.length; i++){
            System.out.println("DIGITE O SIGNO: ");
            signo[i] = input.next();

            System.out.println("DIGITE O ULTIMO DIA: ");
            ultdia[i] = input.nextInt();
        }
        System.out.println("DIGITE A DATA NO FORMATO DDMM, OU 9999 PARA TERMINAR");
        data = input.nextInt();

        while(data != 9999){
            dia = data / 100;
            mes = data % 100;
            mes--;

            if(dia > ultdia[mes]){
                mes = (mes + 1) % 12;
            }

            System.out.println("O SIGNO É: " + signo[mes]);
            System.out.println("DIGITE A DATA NO FORMATO DDMM, OU 9999 PARA TERMINAR");
            data = input.nextInt();
        }
    }
}
