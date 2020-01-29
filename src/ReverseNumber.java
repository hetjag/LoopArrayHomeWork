import java.util.Scanner;

public class ReverseNumber
{
  // 	 input any five digit number and then reverse the number
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five digit numbers = ");
        int number = scanner.nextInt();
        int reversed=0;
        while(number != 0) {
            //separating last digit of number
            int digit =number % 10;

            //creating reverse number one by one
            reversed = reversed * 10 + digit;

            //removing last digit of number
            number =number/ 10;
        }

        System.out.println("After reversing of "+number +" is :" + reversed);



    }
}
