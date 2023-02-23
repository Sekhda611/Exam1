/**
 * @class: CapitalQuiz
 * write a program about capital answer
 */
import java.util.Scanner;
  public class CapitalQuiz {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          System.out.println("what is the name of the Capital of France :");
          System.out.println("A) Paris");
          System.out.println("B) Berlin");
          System.out.println("C) London");
          System.out.println("Enter your answer a b or c:");
          String  answer  = input.nextLine();


          switch (answer){
              case "A":
              case "a":
              System.out.println("Correct! the capital of france is Paris"); break;
              case "B":
              case "b":
                  System.out.println("incorrect! tha capital of France is not a Berlin");
                  break;
              case "c":
              case "C":
                  System.out.println("incorrect! The capital of France is not a  London ");break;
              default : System.out.println("invalid entry, please enter the a ,b or c ");

          }
      }
}
