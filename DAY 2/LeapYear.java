import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Year:");
        int n = scan.nextInt();
        
        if((n%4 == 0 && n%100 != 0) || (n%400 == 0))
        {
            System.out.println( n+ " is Leap Year" );
        }
        else
        {
            System.out.println(n+ " is not a Leap Year");
        }
        scan.close();
    }
  
}
