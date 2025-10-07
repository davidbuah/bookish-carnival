import java.util.Scanner;
public class Random {
    public static void main(String[] args){
        int count=0;
        int num=1+ (int) (Math.random()*10);
        while(count<5){
            System.out.println("Guess the right number from 1 to 10");
            Scanner input=new Scanner(System.in);
            int answer=input.nextInt();
            if (answer==num){
                System.out.println("Right answer");
            }
            else{
                System.out.println("Wrong answer, try again");
            }
            count++;
        }
        System.out.println("This is the right answer="+num);
    }
}
