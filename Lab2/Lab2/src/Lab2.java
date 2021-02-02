import java.util.Random;
import java.util.Scanner;
public class Lab2{
    public static int n;
    public void nhapSo(){

        Scanner in =new Scanner(System.in);
        do{
            System.out.print("Nhap so duong n=");
            n= in.nextInt();
          
        }while(n<0);
     
    }
    public void taoMang(int[] a){
        
        Scanner in =new Scanner(System.in);
        for(int i=0;i<n;i++){
        a[i]=in.nextInt();
        }  in.close();
         }
    public void xuatMang(int[] a){
       
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    }
    public int maxArray(int[] a){
        int max=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i])max=a[i];
        }return max;
    }
    public int minArray(int[] a){
        int min=a[0];
        for(int i=1;i<n;i++){
            if(min>a[i])min=a[i];
        }return min;
    }
    public void cacGiaTriLonNhat(int[] a)
    {
        for(int i=0;i<n;i++){
            if(this.maxArray(a)==a[i])
            System.out.print(i+1+" ");
        }
    }

    public void cacGiaTriNhoNhat(int[] a)
    {
        for(int i=0;i<n;i++){
            if(this.minArray(a)==a[i])
            System.out.print(i+1+" ");
        }
    }
    public void array_Random(int[] a){
        Random rd=new Random();
        for(int i=0;i<n;i++){
            a[i]=(rd.nextInt(n*10));
        }
    }
    public int sumSoChan(int[] a){
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
            sum+=a[i];
        }return sum;

    }
    public int sumSoLe(int[] a){
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0)
            sum+=a[i];
        }return sum;

    }
    public void timSoChan(int[] a){
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
            System.out.print(a[i]+" ");
        }
    }
    public void timSoLe(int[] a){
        for(int i=0;i<n;i++){
            if(a[i]%2!=0)
            System.out.print(a[i]+" ");
        }
    }


    
    public static void main(String[] args) {
        
        Lab2 lab2= new Lab2();
        
        
        lab2.nhapSo();
        System.out.println("n="+n);
        int[] a=new int[n];
        /*
        lab2.taoMang(a);
        lab2.xuatMang(a);
        
        System.out.println("\nGia tri lon nhat :"+lab2.maxArray(a));
        System.out.println("Gia tri nho nhat :"+lab2.minArray(a));
        System.out.println("Vi tri cac gia tri lon nhat la:");
        lab2.cacGiaTriLonNhat(a);
        System.out.println("\nVi tri cac gia tri nho nhat la:");
        lab2.cacGiaTriNhoNhat(a);*/
        lab2.array_Random(a);
        lab2.xuatMang(a);
        System.out.println("\nTong cac so chan la :"+lab2.sumSoChan(a));
        System.out.println("Tong cac so le la :"+lab2.sumSoLe(a));
        System.out.print("Cac so chan trong mang:");
        lab2.timSoChan(a);
        System.out.print("\nclCac so chan trong mang:");
        lab2.timSoLe(a);

              
    }
        
    }
