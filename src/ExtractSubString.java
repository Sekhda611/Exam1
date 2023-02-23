import java.util.Scanner;

public class ExtractSubString {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String sent = input.nextLine();
        String startingIndex = sent.substring(0,5);
        String endingIndex = sent.substring(10,20);

        String extracted = startingIndex + endingIndex;
        System.out.println("the output of the extracted string is:" + extracted);


    }
}
