import java.util.Scanner;

public class TotalOfOddEven
{

  //  	WAP to input any five digit number then count total no of odd and even digit and find sum of them
  public static void main(String[] args)
  {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter fiveDigit number = ");
      int fiveDigit = scanner.nextInt();

      int even_count= 0;
      int odd_count= 0;
      int odd_sum=0;
      int even_sum=0;

      while (fiveDigit>0)
      {
          int tem = fiveDigit%10;
          if(tem % 2==0)
          {
              even_count++;
              even_sum=even_sum +tem;

          }
           else
               {
                   odd_count++;
                    odd_sum = odd_sum + tem;
                }

           fiveDigit = fiveDigit/10;
      }

      System.out.println("Even count = " +even_count);
      System.out.println("Odd count = " +odd_count);
      System.out.println("Total of even number ="+even_sum);
      System.out.println("Total of odd number ="+odd_sum);

  }

}
