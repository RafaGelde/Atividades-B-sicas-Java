import java.util.Scanner;

public class exercicio11
{
    public static void main(String[] args)
    {
        String nome, sobrenome;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        nome = scan.nextLine();
        System.out.println("Qual seu sobrenome?");
        sobrenome = scan.nextLine();

        System.out.println("Seja bem vindo! "+nome + " "+sobrenome);

    }
}