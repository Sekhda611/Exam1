import java.time.chrono.IsoChronology;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        if(score >= 90 ){
            System.out.println("your grade is A  with :" + score);
        } else if (score >=80) {
                   System.out.println("your score is B  with : " + score);
        } else if (score >= 70) {
            System.out.println("your scire is  c with :" + score);
        } else if (score >= 60) {
            System.out.println("score is D");
        } else {
            System.out.println("you are fail");
        }

    }
}
