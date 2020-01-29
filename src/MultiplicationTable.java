import java.util.Scanner;

public class MultiplicationTable
{
    //	Printing multiplication table till n using

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for which you need time table");
        int n = scanner.nextInt();
        System.out.println("Input length of table bye entering  number ");
        int count = scanner.nextInt();
        int num=1;
        do {
            System.out.println(n+ " X "+ num +" = "+ (count * num));
            num++;

        }
        while(num<=count);


    }


}
