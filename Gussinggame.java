import java.util.*;
public class Gussinggame {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Random r=new Random();
        int num= r.nextInt(100)+1;
        int attemps =0;
        System.out.println("......Welcome the Number Gussing Game!.....");
        System.out.println("I have selected one number from 0 to 100");
        while(true){
            try{
                System.out.print("Enter your guess: ");
                int guess= in.nextInt();
                attemps++;
                if(guess==num){
                    System.out.print("Congratulation! you found the number " + num + " correct in " + attemps + " attemps!");
                    break;
                } else if (guess<=num) {
                    System.out.println("Too low!,Try Again");
                }
                else{
                    System.out.println("Too high, Try Again");
                }
            }catch(Exception e){
                System.out.print("Please enter the valid number!");
                in.nextLine();
            }
        }
    }
}
