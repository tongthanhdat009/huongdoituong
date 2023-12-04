import java.util.Scanner;
public class phongHoc {
    Scanner sc=new Scanner(System.in);
    public int maPhong;
	public int soGhe;
    public int soBan;
    public static int soluongphong = 0;
    public phongHoc(int soGhe,int soBan)
    {
        this.maPhong= ++soluongphong;
        this.soGhe=soGhe;
        this.soBan=soBan;
    }
    public phongHoc()
    {
        maPhong=++soluongphong;
	    soGhe=0;
        soBan=0;
    }
    public int getmaPhong()
    {
        return maPhong;
    }
    public int getsoGhe()
    {
        return soGhe;
    }
    public int getsoBan()
    {
        return soBan;
    }
    public void setsoGhe(int soGhe)
    {
        this.soGhe=soGhe;
    }
    public void setsoBan(int soBan)
    {
        this.soBan=soBan;
    }
    public void nhap()
    {
        this.maPhong=++soluongphong;
        System.out.print("Nhap so ghe: ");
        this.soGhe=sc.nextInt();
        System.out.print("Nhap so ban: ");
        this.soBan=sc.nextInt();
    }
    public void xuat()
    {
        System.out.print("Ma phong: " + maPhong+" ");
        System.out.print("So ghe: " + soGhe+" ");
        System.out.print("So ban: " + soBan);
    }
    public String toString()
    {
        return maPhong+"\t\t"+soGhe+"\t\t"+soBan;
    }
    public static int getSoLuongPhong()
    {
        return soluongphong;
    } 
}
