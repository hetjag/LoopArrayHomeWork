import java.util.Scanner;

public class MultiplicationTable
{
    //	Printing multiplication table till n using

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // User can enter number of time table
        System.out.println("Input number for which you need time table");
        int n = scanner.nextInt();
        // User can enter length of table
        System.out.println("Input length of table bye entering  number ");
        int count = scanner.nextInt();
        int num=1;
        do {
         // If condition true or false still it will print once
            System.out.println(n+ " X "+ num +" = "+ (count * num));
            num++;

        }
        while(num<=count);


    }


}
