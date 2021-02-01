public class Tinh {
 
 

     public  void ToanTu(double a,double b){
       
        System.out.println("Tong a+b=" + (a+b)+ "\nHieu a-b="+(a-b)+"\nTich  a*b="+(a*b)
        +"\nThuong a/b="+(a/b));
    }

  
        
    
    public static void main(String[] args) {
        int a=2,b=3;
        double c=1234,d=567.2;
        float e=2,f=10.5f;
    Tinh tinh= new Tinh();
    System.out.println("Kieu int");
    tinh.ToanTu(a,b);
    System.out.println("Kieu double");
    tinh.ToanTu(c, d);
    System.out.println("Kieu float");
    tinh.ToanTu(e, f);



    
       


    }

}

