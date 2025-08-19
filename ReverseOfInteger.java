import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();

        int last = number % 10;      
        int middle = (number / 10) % 10;  
        int first = number / 100;    

        String reversed = "" + last + middle + first;

        System.out.println("The reverse of " + number + " is " + reversed);        


    }

}
