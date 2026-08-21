import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        HCN h1 = new HCN();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");     
        double cd = sc.nextDouble() ;
        h1.setChieudai(cd);
        System.out.println("nhap chieu rong: "); 
        double cr = sc.nextDouble() ; 
        h1.setChieurong(cr);
        double area = h1.getChieudai()*h1.getChieurong();
        double chuvi = (h1.getChieudai()+h1.getChieurong())*2;
        System.out.println("chu vi hinh chu nhat: "+chuvi);
        System.out.println("Dien tich hinh chu nhat: "+area);
    }
}