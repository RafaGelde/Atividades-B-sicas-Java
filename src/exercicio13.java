import java.lang.reflect.Array;

public class exercicio13
{
    public static void main(String[] args)
    {
        String nome = "Rafael";

        int[] idades = new int[3];
        idades[0] = 18;
        idades[1] = 25;
        idades[2] = 38;

        System.out.println("Seja bem vindo! "+nome);
        System.out.println("Sua idade é "+idades[0]+" certo?");
    }
}
