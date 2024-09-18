import java.util.Scanner;
public class exercicio15
{
    public static void main(String[] args)
    {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        num = scan.nextInt();

        if (num < 0){
            System.out.println("seu numero é negativo!");
        }
        else if (num == 0){
        System.out.println("Seu numero é 0");
        }
        else{
            System.out.println("Seu numero é positivo");
        }

    }
}
