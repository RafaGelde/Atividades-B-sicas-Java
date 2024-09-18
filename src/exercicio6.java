import java.util.Scanner;
import javax.swing.*;

public class exercicio6
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        num1 = scan.nextInt();

        System.out.println("Digite outro numero");
        num2 = scan.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}
