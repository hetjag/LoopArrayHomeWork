import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray
{

 //  	Write a Java program to sort a numeric array and a String array.

    public static void main(String[] args)
    {
        int [] numbers = {7,5,2,9,4,6,8,1};

        Arrays.sort(numbers);

        for (int i = 0; i <numbers.length; i++)
        {

            System.out.println(numbers[i]);

        }


        String  [] names = {"jag","het","bhav","gami","poo","vip"};

        Arrays.sort(names);

        for (int i = 0; i <names.length; i++)
        {

            System.out.println(names[i]);

        }




    }

}
