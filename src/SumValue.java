public class SumValue
{

  //  2.	Write a Java program to sum values of an array

      public static void main(String[] args) {
          int numbers[] = {65, 72, 93, 24, 25, 60, 70, 80, 20, 10};
          int sum = 0;

          for (int i = 0; i < numbers.length; i++)
          {
              sum =sum + numbers[i];

          }

          System.out.println("The sum is " + sum);
      }
  }











