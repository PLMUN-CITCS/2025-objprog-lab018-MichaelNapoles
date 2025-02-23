import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args){
        int num = getIntegerInput();
        System.out.println(checkEvenOrOdd(num));
    }

    public static int getIntegerInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = input.nextInt();

        input.close();

        return num;

    }

    public static String checkEvenOrOdd(int number){
        String type = "";

        int num = number % 2;

        if (num == 0){
            type = (number + " is an even number");
        }
        else if (num != 0){
            type = (number + " is an odd number");
        }

        return type;

    }
}