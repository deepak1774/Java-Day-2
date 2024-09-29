import java.util.Scanner;
class oddOreven{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
try{
int n=scan.nextInt();
if(n%2==0)
{
System.out.println("Even");
}
else
{
System.out.println("Odd");
}
}
finally{
    scan.close();
}
}
}