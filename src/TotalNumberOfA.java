import java.util.Scanner;

public class TotalNumberOfA
{
  //  to enter any String and count total number of 'a' in that String. 

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string = ");
        String word = scanner.nextLine();
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);


    }
}
