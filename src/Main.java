import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para conferir se o mesmo esta presenta na sequencia de Fibonacci: ");

        int input = sc.nextInt();

        int number1 = 0;
        int number2 = 1;
        int result = 0;
        boolean containNumber = true;



        while (result <= input) {
            if (result == input) {
                containNumber = true;
                break;
            }

            result = number1 + number2;
            number1 = number2;
            number2 = result;
        }

        if (containNumber){
            System.out.println("O número informado '"+ input +"' esta presente na sequência de Fibonacci");

        } else {
            System.out.println("O número informado '"+ input +"' não esta presente na sequência de Fibonacci");
        }

        sc.close();
    }

}

