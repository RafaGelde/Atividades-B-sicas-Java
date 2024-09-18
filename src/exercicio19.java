import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.println("Escreva a nota do aluno");
        nota = scan.nextDouble();

        if (nota >= 7){
            System.out.println("O aluno esta Aprovado");
        }
        else if (nota > 2 && nota < 7){
            System.out.println("o Aluno esta em recuperação");
        }
        else{
            System.out.println("O aluno esta reprovado");
        }
    }
}
