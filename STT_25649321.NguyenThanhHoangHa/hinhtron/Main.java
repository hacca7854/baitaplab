import java.util.Scanner ; 
public class Main  {
    public static void main(String[] args){
        HTR h1 = new HTR();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap toa do X cua tam: ");
        double x = sc.nextDouble();
        h1.setx(x);
        System.out.print("Nhap toa do Y cua tam: ");
        double y = sc.nextDouble();
        h1.sety(y);
        System.out.print("Nhap ban kinh R: ");
        double r = sc.nextDouble();
        h1.setbankinh(r);
        System.out.println("Hinh tron co tam O(" + h1.getx() + ", " + h1.gety() + ")");
        System.out.println("Chu vi: " + h1.tinhChuVi());
        System.out.println("Dien tich: " + h1.tinhDienTich());
    }
}
