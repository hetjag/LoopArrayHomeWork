import java.util.Scanner;

public class ArmstrongNumber
{
  //  	input any 3 digit number and check if it is Armstrong number or not
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Three digit numbers = ");
        int fiveDigit = scanner.nextInt();
        int c=0, a, temp;

        temp=fiveDigit;
        while(fiveDigit>0)
        {
            //separating last single digit
            a=fiveDigit%10;
            fiveDigit=fiveDigit/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println(temp +" is armstrong number");
        else
            System.out.println(temp +" is NOT armstrong number");






    }






}
