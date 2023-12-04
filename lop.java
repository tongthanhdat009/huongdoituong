import java.util.*;
public class lop{
    Scanner sc=new Scanner(System.in);
    public String maLop;
	public int siSo;
    public phongHoc phong;
    public int maGVCN;
    public lop(String maLop, int siSo, int soGhe, int soBan, int maGVCN)
    {
        this.maLop=maLop;
        this.siSo=siSo;
        this.maGVCN = maGVCN;
        this.phong=new phongHoc(soGhe, soBan);
    }
    public lop()
    {
        maLop="";
        siSo=0;
        maGVCN = 0;
        phong=new phongHoc();
    }
    public String getMaLop() {
        return maLop;
    }
    public phongHoc getPhong() {
        return phong;
    }
    public int getSiSo() {
        return siSo;
    }
    public int getMaGVCN()
    {
        return maGVCN;
    }
    public void setMaGVCN(int maGVCN)
    {
        this.maGVCN = maGVCN;
    }
    public void setMaLop(String ma) {
        String regex = "^[10-12]{2}[A-D]{1}$";
        if(!ma.matches(regex)) System.out.print("Sai dinh dang ma lop");
        else this.maLop = ma;
    }
    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }
    public void setPhong(phongHoc phong) {
        this.phong = phong;
    }
    public void nhap()
    {
        String ma;
        System.out.print("Nhap ma lop: ");
        ma = sc.nextLine(); 
        setMaLop(ma);
        if(maLop != "")
        {
            System.out.print("Nhap si so: ");
            siSo = sc.nextInt();
            System.out.print("Nhap ma GVCN: ");
            maGVCN = sc.nextInt();
            phong.nhap();
        }
    }
    public void xuat()
    {
        System.out.print("Ma lop: "+maLop+" ");
        System.out.print("Si so: "+siSo+" ");
        System.out.print("Ma GVCN: "+maGVCN+" ");
        phong.xuat();
        System.out.print("\n");
    }
    public String toString()
    {
        return maLop+"\t\t"+siSo+"\t\t"+maGVCN+"\t\t"+phong.toString();
    }
    public String toString2()
    {
        return "Ma lop: "+maLop+"\t Ma GVCN: "+maGVCN+"\t"+phong.toString2();
    }
}
