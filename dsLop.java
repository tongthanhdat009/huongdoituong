import java.util.ArrayList;
import java.util.Scanner;
public class dsLop {
    Scanner sc = new Scanner(System.in);
    private ArrayList<lop> ds;
    public dsLop (ArrayList<lop> ds)
    {
        this.ds=ds;
    }
    public dsLop ()
    {
        this.ds = new ArrayList<lop>();
    }
    public ArrayList<lop> getds() {
        return this.ds;
    }
    public void setds(ArrayList<lop> ds) {
        this.ds = ds;
    }
    public void them()
    {   
        lop a = new lop();
        a.nhap();
        this.ds.add(a);
    }
    public void in()
    {
        for(lop lop: ds)
        System.out.println(lop.toString());
    }
    public void xoa()
    {
        String xoa = new String();
        System.out.println("Nhap ma lop can xoa: ");
        xoa =sc.nextLine();
        for(lop lop: ds)
        if(lop.getMaLop().equals(xoa)) ds.remove(lop);
    }
    public boolean kiemTraTonTai(String kt)
    {
        for(lop lop : ds)
        if(lop.getMaLop().equals(kt)) return true;
        return false;
    }
    public void sua()
    {
        System.out.println("Nhap ma lop can sua: ");
        String sua = new String();
        sua = sc.nextLine();
        boolean flag = false;
        for(lop lop :ds)
        {
            if(lop.getMaLop().equals(sua))
            {
                ds.remove(lop);
                lop a = new lop();
                a.nhap();
                ds.add(a);
                flag = true;
            }
        }
        if(flag == false) System.out.println("Lop khong ton tai");
    }
}
