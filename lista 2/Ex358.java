import java.util.Scanner;

public class Ex358 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pVenda[] = new float[5];
        float pCompra[] = new float[5];
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;

        for(int i = 0; i < pVenda.length; i++){
            System.out.printf("DIGITE O PREÇO DE VENDA DO PRODUTO %d: \n", i+1);
            pVenda[i] = input.nextFloat();

            System.out.printf("DIGITE O PREÇO DE COMPRA DO PRODUTO %d: \n", i+1);
            pCompra[i] = input.nextFloat();
            
            float lucro = pVenda[i] - pCompra[i];
            if(lucro < 0.1 * pCompra[i]){
                l1++;
            }else{
                if(lucro <= 0.2 * pCompra[i]){
                    l2++; 
                }else{
                    l3++;
                }
            }
        }

        System.out.printf("PRODUTOS COM LUCRO < 10: %d\nPRODUTOS COM LUCRO 10 <= LUCRO <= 20: %d\nPRODUTOS COM LUCRO > 20: %d", l1, l2, l3);
    }
}
