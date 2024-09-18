import java.util.Scanner;
public class exercicio9
{
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro  numero");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo sumero");
        num2 = scan.nextInt();

        if (num1 > num2)
        {
            System.out.println("O primeiro numero é maior que o segundo");
        }
        else if(num1 == num2)
        {
            System.out.println("Os numeros são iguais");
        }
        else
        {
            System.out.println("o segundo numero é maior que o primeiro");
        }
    }
}
