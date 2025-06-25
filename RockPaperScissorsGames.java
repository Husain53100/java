import java.util.Random;
import java.util.Scanner;  

public class RockPaperScissorsGames {
    public static void main(String[] args) {
       System.out.println("welcome to the game stone paper scissor");
       System.out.println("choose 0 for stone, 1 for paper, 2 for scissor");
       
       int i = 0;
       while (i>=0) { 
         
        Scanner sc = new Scanner(System.in);
        int human = sc.nextInt();
 
        Random random = new Random();
        int computer = random.nextInt(3);
       
        if (human<=2) {
         System.out.println("GAME START");
        }
         if(human>2)  {
         System.out.println("invalid input");
          
        }
        if (human==computer) {
         System.out.println("it's a tie");
         System.out.println("BEACUSE COMPUTER HAS CHOSEN " + computer);
        }
        else if  (human==0 && computer==1 || human==1 && computer==2 || human==2 && computer==0) {
         System.out.println("computer wins!!!!!");
         System.out.println("BEACUSE COMPUTER HAS CHOSEN " + computer);

        } else if (human==1 && computer==0 || human==2 && computer==1 || human==0 && computer==2) {
         System.out.println("you wins!!!!!!");
         System.out.println("BEACUSE COMPUTER HAS CHOSEN " + computer);
        }
        
       
         
        i++;
           
       }
      




    }
    


}
