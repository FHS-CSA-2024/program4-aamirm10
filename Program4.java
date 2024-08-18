//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
        //make scanner
        Scanner myScanner = new Scanner(System.in);
        // declare variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sum = 0;
        double average = 0;
         
        //user input1
        System.out.println("Enter value 1");
        //get input
        num1 = myScanner.nextInt();
        //user input 2
        System.out.println("Enter value 2");
        //get input 1
        num2 = myScanner.nextInt();
        //user input 3
        System.out.println("Enter value 3");
        //get input 3
        num3 = myScanner.nextInt();
        //user input 4
        System.out.println("Enter value 4");
        //get input 4
        num4 = myScanner.nextInt();
        
        //calculate
        sum = num1 + num2 + num3 + num4;
        average = (double) (num1 + num2 + num3 + num4) / 4;
        //output
        System.out.println("The sum is " + sum);
        System.out.println("The average is " +  average);
    
        
        
        
    }
}


//Paste console output below:
/*
Enter value 1
475
Enter value 2
821
Enter value 3
369
Enter value 4
562
The sum is 2227
The average is 556.75
*/
