import java.util.Scanner;
public class Lab2{
    public static int n;
    public void Nhap_So(){
        Scanner in =new Scanner(System.in);
        do{
            System.out.print("Nhap so duong n=");
            n= in.nextInt();
            in.close();
        }while(n<0);
    }
    public void Tao_Mang(int[] a){
        Scanner in =new Scanner(System.in);
        for(int i=0;i<=n;i++){
        a[i]=in.nextInt();
        }

    }
    
    public static void main(String[] args) {
        
        Lab2 lab2= new Lab2();
        lab2.Nhap_So();
        System.out.println(n);
        int[] a=new int[n];
        lab2.Tao_Mang(a);

    }
        
    }
