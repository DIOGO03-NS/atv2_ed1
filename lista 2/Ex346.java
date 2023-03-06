import java.util.Scanner;

public class Ex346 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("DIGITE A FRASE: ");
        String frase = input.next();

        while(true){
            int operacao;
            System.out.print("\nMENU\n(1)- COMPRIMENTO DA FRASE.\n(2)- DOIS PRIMEIROS E ULTIMOS CARACTERES DA FRASE.\n(3)- FRASE ESPELHADA.\n(4)- FINALIZAR.\n");
            operacao = input.nextInt();

            if(operacao == 1){
                System.out.println("O COMPRIMENTO DA FRASE EH: " + frase.length());
            }else{
                if(operacao == 2){
                    System.out.println("OS DOIS PRIMEIROS CARACTERES SÃO: "+ frase.subSequence(0, 3) +"\nE OS DOIS ULTIMOS SAO: "+ frase.substring(frase.length() - 3));
                }else{
                    if(operacao == 3){
                        for(int i = frase.length() - 1; i >= 0; i--){
                            System.out.print(frase.charAt(i));
                        }
                    }else{
                        if(operacao == 4){
                            break;
                        }else{
                            System.out.println("COMANDO INVALIDO, POR FAVOR TENTE NOVAMENTE.");
                        }
                    }
                }
            }
        }
    }
}
