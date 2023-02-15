/**
 *
 */
import java.util.Scanner;
public class StateGeorgiaEqualIgnoreCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the state of city Lawrenceville: ");
        String answer = scan.next();
        String correctAnswer = "Georgia";
        boolean iscorrect = answer.equalsIgnoreCase(correctAnswer);
        if(iscorrect){
            System.out.println("That your answer " + answer + " is right");
        }
        else{
            System.out.println("Your answer " + answer + " is  not right");
        }
    }


}
