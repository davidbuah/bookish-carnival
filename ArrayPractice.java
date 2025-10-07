import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[] args){
        int[] scores;
        scores=new int[5];
        //int[] scores=new int[5];

        int[] studentsScores={2,3,4,5,6,7};
       System.out.println(scores[0]);
       System.out.println(studentsScores.length);

       scores[0]=45;
       scores[1]=72;
       scores[2]=36;
       scores[3]=77;
       scores[4]=52;
       System.out.println(scores);  // This produces where it is stored in the memory; and not the content.
       int num=scores.length;
       System.out.println(num);


       for(int i=0;i<5;i++){
           System.out.println(scores[i]);
        }

       for(int i=0;i<num;i++){
            System.out.println(scores[i]);
        }


       //Alternative procedure
        // This is for the for-each loop which is used in arrays. When revising check your notes
        for (int f:scores){
            System.out.println(f);
        }

        Scanner input=new Scanner(System.in);
        System.out.println("How many inputs do you want to produce");
        int answer=input.nextInt();
        double[] price=new double[answer];

        for (int x=0;x<answer;x++){
            Scanner amount=new Scanner(System.in);
            System.out.println("Enter your prices");
            double amountpaid=amount.nextDouble();
            price[x]=amountpaid;
        }
        System.out.println("The following are your input");
        for (double y:price){
            System.out.println(y);
        }
    }
}
