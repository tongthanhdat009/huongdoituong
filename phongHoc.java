import java.util.Scanner;
public class phongHoc {
    Scanner sc=new Scanner(System.in);
    public String maPhong;
	public int soGhe;
    public int soBan;
    public static int soluongphong;
    public phongHoc(String maPhong,int soGhe,int soBan)
    {
        this.maPhong=maPhong;
        this.soGhe=soGhe;
        this.soBan=soBan;
    }
    public phongHoc()
    {
        maPhong = "";
	    soGhe=0;
        soBan=0;
    }
    public String getmaPhong()
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
    public void setmaPhong(String maPhong)
    {
        this.maPhong=maPhong;
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
        System.out.print("Nhap ma phong: ");
        this.maPhong=sc.nextLine();
        System.out.print("Nhap so ghe: ");
        this.soGhe=sc.nextInt();
        System.out.print("Nhap so ban: ");
        this.soBan=sc.nextInt();
    }
    public String toString()
    {
        return "Ma phong: "+maPhong+", so ghe: "+soGhe+", so ban: "+soBan;
    }
    public static int getSoLuongPhong()
    {
        return soluongphong;
    } 
}
