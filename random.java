import java.util.Random;
import java.util.Scanner;

class random {
    public static void main(String args[]){
        Random ran=new Random();
        
        //random r=new random();
        Scanner sc=new Scanner(System.in);
        int inp=0;
        int count=0;
        int number=ran.nextInt(100);
        do{
            System.out.println("Entered the number for guessing 0 to 100:");
            inp=sc.nextInt();
            count++;
            if(inp==number){
                System.out.println("Congrats you guess the correct number, Correct number:"+number);
                break;
            }
            else if(inp<number){
                System.out.println("Your number is too small");
            }else{
                System.out.println("Your number is too large");
            }
            
        }while(inp>=0);
        System.out.println("Guessing number is :"+number);
        System.out.println("You guess the number in :"+count+" number of trials.");

    }   
}