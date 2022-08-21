
/**
 * Fernando Duffoo
 * CSCI231
 * 7/3/2022
 * Project 06
 */

import java.util.Scanner;
public class FernandoDuffooProject06
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
         char answer; 
        do
        {
        System.out.println("Enter a string: ");
        String s = scan.nextLine();
        
        System.out.println("Enter a char: ");
        char c = scan.nextLine().charAt(0);
        
        System.out.println("The result of calling function int countLetters(String s) is: " + countLetters(s));
        
        System.out.println("The result of calling function int countLetters(String s, char c) is: " + countLetters(s, c));
        
        System.out.print("Do you want to do another test? Y/N: ");
        answer = scan.next().charAt(0);
    }
    while(answer == 'Y' | answer == 'y');
    }
    public static int countLetters(String s) 
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    public static int countLetters(String s, char c)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if((Character.toLowerCase(c) == Character.toLowerCase(s.charAt(i))) && Character.isLetter(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
}
    
