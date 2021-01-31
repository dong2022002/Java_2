import java.util.Scanner;
public class Cau8 {
    public static int a;
    public void Thay_Doi_Gia_tri()
    {
        a=a+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println(a);
        Cau8 thaydoi=new Cau8();
        thaydoi.Thay_Doi_Gia_tri();
        System.out.println(a);
    }
}
