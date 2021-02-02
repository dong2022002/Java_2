import java.util.Scanner;
public class Bai1 {
    public static int g;
    
    public  void toanTu(double a,double b){
       
        System.out.println("Tong :" + (a+b)+ "\nHieu :"+(a-b)+"\nTich :"+(a*b)
        +"\nThuong :"+(a/b));
    }
    public int tinh_Bieu_Thuc(int a, int b){
        int c=(a*a+b);
    return c;
    }

    public int tinh_Phep_Toan_Kieu_Nguyen(int a,int b){
        return a/b;
    }

    public void thay_Doi_Gia_tri(int a)
    {
        g=g+a;
    }

    public double thay_Doi_Kieu_Du_Lieu_int_double(int a){
    double b=a;
    return b;
  }  public int thay_Doi_Kieu_Du_Lieu_double_int(double b){
    int a=(int)b;
    return a;
  }

    public static void main(String[] args) {
        System.out.println("HI ALL, WELCOME TO CODE P SOFT GROUP");
        Scanner in= new Scanner(System.in);
        System.out.println("Nhap a,b (int) :");
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println("Nhap c,d (double) :");
        double c= in.nextDouble();
        double d= in.nextDouble();
        System.out.println("Nhap e,f (float) :");
        float e=in.nextFloat();
        float f=in.nextFloat();
        
    Bai1 tinh= new Bai1();
    System.out.println("\nKieu int a va b");
    tinh.toanTu(a,b);
    System.out.println("Kieu double c va d");
    tinh.toanTu(c, d);
    System.out.println("Kieu float e va f");
    tinh.toanTu(e, f);
    System.out.println("\nGia tri bieu thuc a*a+b="+tinh.tinh_Bieu_Thuc(a, b));
    
    System.out.println("\na/b="+tinh.tinh_Phep_Toan_Kieu_Nguyen(a, b));

    System.out.println("\nCong Tru Nhan Chia hai toan tu khac kieu du lieu:(a-int,c-double)");
    tinh.toanTu(a,c);

    System.out.println("\nGia tri ban dau g="+g);
    tinh.thay_Doi_Gia_tri(a);
    System.out.println("Gia tri thay doi g="+g);
    
    System.out.println("\na(int)="+a);
    System.out.println("Doi gia tri tu int sang double\n"+tinh.thay_Doi_Kieu_Du_Lieu_int_double(a));
    System.out.println("c(double)="+c);
    System.out.println("Doi gia tri tu double sang int\n"+tinh.thay_Doi_Kieu_Du_Lieu_double_int(c));




    

      
    }
}
