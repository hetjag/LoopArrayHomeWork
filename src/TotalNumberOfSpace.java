import java.util.Scanner;

public class TotalNumberOfSpace
{
    // enter any String and count how many total number of words and total number of spaces in that sentence
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any sentence = " );
        String sentence = scanner.nextLine();

        int word = 1;
        for (int i = 0;i<sentence.length();++i)
        {
         // Count each word of sentence
            if(sentence.charAt(i)==' ')
                word++;
        }
        System.out.println("Number of words = "+word);

        System.out.println("Number of spaces = "+(word-1));

    }
}
