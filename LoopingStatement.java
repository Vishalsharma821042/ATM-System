import java.util.Scanner;

public class LoopingStatement {
    public static void main(String[] args)
    {
        int no = 50;
        System.out.println(" loop start ");
        for (int i =0; i < no; i++)
        {
            System.out.println("value of i = " +i);
            if (i == 20)
            {
                break;
                // continue;
            }
        }
        System.out.println(" loop end ");

        System.out.println("while loop start");
        int i = 0;
        while (i< no){
            System.out.println("inside while loop starting, i "+i);
            i++;
            System.out.println("inside while loop ending, i "+i);
        }
        
        while (true) {
            System.out.println("Please enter your pin: ");
            Scanner sc = new Scanner(System.in);  // Corrected this line
            int pin = sc.nextInt();
            
            if (pin == 1122) {
                System.out.println("Pin is Correct");
                break;
            } else {
                System.out.println("Pin is incorrect, Please try again.");
            }
        }

        // for(int j = 0; j < 5; j++){

        // }

        int j = 0;
        for ( ; j < 5;){
            j++;
        }
    }
    
}