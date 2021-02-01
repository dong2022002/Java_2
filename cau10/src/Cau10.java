
import java.util.Scanner;
public class Cau10{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.print("int -- double :");
        int a=in.nextInt();
        System.out.print("double -- int  :");
        double c=in.nextDouble();
        
        double b=a;
        System.out.println("int -- double");
    System.out.println(a);
    System.out.println(b);
    System.out.println("double -- int");
    System.out.println(c);
    int d=(int)c; 
    System.out.println(d);




    }
}
