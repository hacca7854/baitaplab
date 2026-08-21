
public class HTR {
    private double bankinh ;
    private double x ;
    private double y ;
    private double pi = 3.14 ; 
    public HTR(){
        
    }
    public HTR(double bankinh,double x,double y){
        this.bankinh = bankinh;
        this.x = x;
        this.y = y;
    }
    public void setbankinh(double bankinh){
        this.bankinh = bankinh;
    }
    public void setx(double x){
        this.x = x;
    }
    public void sety(double y){
        this.y = y;
    }
    public double getbankinh(){
        return this.bankinh;
    }
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    public double tinhChuVi() {
        return 2 * pi * bankinh;
    }
    public double tinhDienTich() {
        return pi * bankinh * bankinh;
    }
}
