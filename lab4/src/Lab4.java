import java.util.Scanner;



public class Lab4 {
    static int n,sd1,sd2,sd3;
    static double m;
   
    public void nhapMotSoDuong(){
        
        Scanner in =new Scanner(System.in);
        do{
        n=in.nextInt();
        }while(n<=0);
    }
    public void nhapVao3SoDuong(){
        
        Scanner in =new Scanner(System.in);
        do{
        sd1=in.nextInt();
        sd2=in.nextInt();
        sd3=in.nextInt();
        }while(sd1<=0&&sd2<=0&&sd3<=0);
    }
    public void nhapMotSoKhongAm(){
        
        Scanner in =new Scanner(System.in);
        do{
        m=in.nextDouble();
        }while(m<0);
    }
   
   public double tinhToanCau1(int n){
        if(n==1)return 1;
        return (1/(Math.pow(n,3))+tinhToanCau1(n-1));
    }
    public double tinhToanCau2(double x){
        if(x==0)return 2/3d;
        return ((2*(x+1)/(2*x+3)))* (tinhToanCau2(x-1));
    }

    public int phanLoaiTamGiac(){
        int a=sd1,b=sd2,c=sd3;
        
        if(a+b>c||a+c>b||c+b>a)
        {
        if(a==b||b==c||c==a)
        {
            if(a==b&&b==c&&c==a)return 2;
            else if(a*a+b*b==c*c||a*a+c*c==b*b||a*a==b*b+c*c)return 3;
        
            else return 1;
        }
        else if(a*a+b*b==c*c||a*a+c*c==b*b||a*a==b*b+c*c)return 4;
        }

        else
        return -1;return 5;
    }
    public double tinhDienTichTamGiac(){
        int p=(sd1+sd2+sd3)/2;
        return Math.sqrt(p*(p-sd1)*(p-sd2)*(p-sd3));
    }
    public static void main(String[] args) {
        Lab4 lab4 =new Lab4();
        // System.out.print("Nhap vao so n (n>0) : ");
        // lab4.nhapMotSo();
        // System.out.printf("Ket qua cua phep toan (1+ 1/2*3 + 1/3*3 +...+ 1/2*n )la:  %.3f ",lab4.tinhToanCau1(n));
        // System.out.print("NHap vao so n (n>=0)");
        // lab4.nhapMotSo();
        
        //  lab4.nhapMotSoKhongAm();
       
        //  System.out.printf("\nKet qua cua phep toan (2/3 * 4/5 * 6/7 * ... * (2(n+1)/(2n+3)) la  %.3f ",lab4.tinhToanCau2(m));
        lab4.nhapVao3SoDuong();
        System.out.println(sd1+"\t"+sd2+"\t"+sd3+"\t");
        switch(lab4.phanLoaiTamGiac()){
            case -1:System.out.println("khong phai la ba canh cua tam giac");
            break;
            case 1:System.out.println("la tam giac can");
            break;
            case 2:System.out.println("la tam giac deu");
            break;
            case 3:System.out.println("la tam giac vuonn can");
            break;
            case 4:System.out.println("la tam giac vuong");
            break;
            case 5:System.out.println("la tam giac thuong");
            break;
        }
        System.out.println("Dien tich tam giac la: "+ lab4.tinhDienTichTamGiac());
        
      
    }
    
}
