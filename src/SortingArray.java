import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray
{

 //  	Write a Java program to sort a numeric array and a String array.

    public static void main(String[] args)
    {
        int [] numbers = {7,5,2,9,4,6,8,1};

        Arrays.sort(numbers);
      // It will sort number until length limit
        for (int i = 0; i <numbers.length; i++)
        {
      //Print number by sorting
            System.out.println(numbers[i]);

        }


        String  [] names = {"jag","het","bhav","gami","poo","vip"};

        Arrays.sort(names);
      // It will sort names until length limit
        for (int i = 0; i <names.length; i++)
        {
        // print name by sorting
            System.out.println(names[i]);

        }




    }

}
