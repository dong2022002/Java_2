import java.util.Random;
import java.util.Scanner;
public class Lab2{
    public static int n,sum=0;
    public void menu(){
        System.out.println("============================================================");
        System.out.print("0. Thoat chuong trinh"
        +"\n1.Nhap vao n"+"\n2.Tao Mang tu ban phim"
        +"\n3.Tim gia tri lon nhat nho nhat trong mang"
        +"\n4.Tim cac gia tri lon nhat nho nhat trong mang"
        +"\n5.Tao mang ngau nhien va tim so le so chan"
        +"\n6.Tim cac so chia het cho 5 va 2 va tinh tong"
        +"\n7.Tinh n gia thua"
        +"\n8.Tim phan tu cuoi cung la so chan"
        +"\n9.Tim phan tu cuoi cung la so le"
        +"\n10.Nhap mang chuoi ky tu");
        System.out.println("\n============================================================");
    }
    public int chonMenu(int soMenu){
        int stt;
        Scanner in=new Scanner(System.in);
        for(;;){
            this.menu();
            System.out.print("Chon mot menu [0.."+soMenu+"]=");
            stt=in.nextInt();
            if(stt>=0&&stt<=soMenu)
            break;
        }return stt;
    }
    public void quit(){
        int i;
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("\nNhap phim 0 de tiep tuc");
        i=in.nextInt();
        if(i==0)break;
        }while(i!=0);
    }
    
    public void XulyMenu(int[] a,String[] b,int menu){
        Scanner in=new Scanner(System.in);
        int i;
        switch(menu){
            
            case 0:
           
           break;
            case 1:nhapSo();
            System.out.println("n="+n);
            quit();break;
            case 2:System.out.println("n="+n);
            this.taoMang(a);
            this.xuatMang(a);
           quit();
            break;
            case 3:
           
            System.out.println("\nGia tri lon nhat :"+maxArray(a));
            System.out.println("Gia tri nho nhat :"+minArray(a));
            
                quit();break;
            case 4:
            System.out.println("Vi tri cac gia tri lon nhat la:");
        cacGiaTriLonNhat(a);
        System.out.println("\nVi tri cac gia tri nho nhat la:");
        cacGiaTriNhoNhat(a);
           quit();break;
            case 5: array_Random(a);
            xuatMang(a);
            if(sumSoChan(a)==0)System.out.println("\nKhong co so chan trong mang");
            else{
            System.out.println("\nTong cac so chan la :"+sumSoChan(a));
            
            System.out.print("Cac so chan trong mang:");
            timSoChan(a);}
            if(sumSoLe(a)==0)System.out.println("\nKhong co so le trong mang");
            else{
            System.out.println("\nTong cac so le la :"+sumSoLe(a));
            System.out.print("\nCac so le trong mang:");
            timSoLe(a);}
                        
          
            quit();break;
            case 6:
            System.out.print("\nCac so chia het cho 5 va 2 la : ");
            timSoChia5Chia2TinhTong(a);
            System.out.println("\nTong cac so chia het cho 5 va 2 la :"+sum);
           
           quit();break;
            case 7:
            System.out.print("Gia thua cua "+n+" la :"+tinhGiaiThua());
            quit();break;
            case 8:
            if(timSoChanCuoi(a)==-1)
        System.out.println("Khong co so chan nao trong mang");
        else System.out.println("So chan cuoi trong mang la :"+timSoChanCuoi(a));
            quit();break;
            case 9:
            if(timSoLeCuoi(a)==-1)
        System.out.println("Khong co so le nao trong mang");
        else System.out.println("So le cuoi trong mang la :"+timSoLeCuoi(a));
           quit();break;
            case 10:
            taoMangChuoi(b);
            System.out.println("\nMang chuoi vua nhap :\n");
            xuatMangChuoi(b);

            quit();break;
            default:break;
        
        }
    }
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
        }  
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
    public void timSoChia5Chia2TinhTong(int[] a){
        int j=0;
        for(int i=0;i<n;i++)
            if(a[i]%10==0){
                sum+=a[i];
                j++;
                System.out.print(a[i]+" ");      
            }
            if(j==0)System.out.println("Khong co so nao chia het cho 5 va 2 trong mang");
    }
    public int tinhGiaiThua(){
        int kq=1;
        for(int i=1;i<=n;i++){
            kq*=i;
        }return kq;

    }
    public int timSoChanCuoi(int[] a){
        int kq=-1;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
            kq=a[i];
        }return kq;
    }
    public int timSoLeCuoi(int[] a){
        int kq=-1;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0)
            kq=a[i];
        }return kq;
    }
    public void taoMangChuoi(String[] b){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<n;i++){
            b[i]=in.nextLine();

        }
    }
    public void xuatMangChuoi(String[] b){
        for(int i=0;i<n;i++){
            System.out.println(b[i]+"(do dai chuoi: "+b[i].length()+")");
        }
    }

    
    
    public static void main(String[] args) {
        
        Lab2 lab2= new Lab2();
        
        int[] a=new int[100];
        String[] b=new String[100];
        int menu=10,cMenu;
        do{
            cMenu=lab2.chonMenu(menu);
            lab2.XulyMenu(a, b, cMenu);
          

        }while(cMenu>0);
             
    }
        
    }
