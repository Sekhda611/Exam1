/**
 * Write a program that disaplays only first and last words of rhe string.
 */
import java.util.Scanner;
public class FirsttLastWord{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String sent = input.nextLine();
        //int length = sent.length();
        int firstIndex = sent.indexOf(" ");
        String firstWord = sent.substring(0,firstIndex);
        System.out.println("the first word is  " + firstWord);
        int lastIndex = sent.lastIndexOf(" ") + 1;
        String lastWord = sent.substring(lastIndex);
        System.out.println("the last word is : " + lastWord );
        System.out.println(firstWord + " " + lastWord);


    }

}