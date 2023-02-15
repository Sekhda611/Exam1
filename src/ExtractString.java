import java.util.Scanner;
public class ExtractString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String sent = input.nextLine();
        System.out.println("enter the starting index:");
        int startingIndex = input.nextInt();
        System.out.println("enter the ending index: ");
        int endingIndex = input.nextInt();
        String extracted = sent.substring(startingIndex,endingIndex);
        System.out.println("print the extracted string: " + extracted);

    }

}
