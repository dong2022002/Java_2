   import java.util.Scanner;
   public class Cau5{
      public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
         System.out.print("(int)a=");
         int a=in.nextInt();
         System.out.print("(double)b=");
         double b=in.nextDouble();
         System.out.println("a+b="+(a+b)+"\na-b"+(a-b)+"\na*b="+(a*b)+"\na/b="+(a/b));
         
      }
   }