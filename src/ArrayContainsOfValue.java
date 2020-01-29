public class ArrayContainsOfValue
{
   // 	Write a Java program to test if an array contains a specific value.

    public static void main(String[] args)
    {

        int[] num = {100, 200, 300, 400, 500};
        int toFind = 700;
        boolean found = false;
        for (int n : num)
        {
            if (n == toFind)
            {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }









    }


