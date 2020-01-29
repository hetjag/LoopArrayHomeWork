public class ArrayContainsOfValue
{
   // 	Write a Java program to test if an array contains a specific value.

    public static void main(String[] args)
    {
      // Get the array
        int[] num = {100, 200, 300, 400, 500};
        // You can change value from here
        int toFind = 700;
        boolean found = false;
        for (int n : num)
        {
         // Check value in this condition
            if (n == toFind)
            {
          // If condition true it will break here
                found = true;
                break;
            }
        }
        if(found)
          // It will print found value
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }









    }


