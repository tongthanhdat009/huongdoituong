import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class dsGVCN implements file
{
    Scanner in = new Scanner(System.in);
    private ArrayList<giaovien> dsGV;
    public dsGVCN()
    {
        dsGV = new ArrayList<>();
    }
    public dsGVCN(ArrayList<giaovien> a)
    {
        this.dsGV = a;
    }
    public ArrayList<giaovien> getDsGV()
    {
        return dsGV;
    }
    public void them()
    {
        giaovien a = new giaovien();
        a.nhap();
        dsGV.add(a);
    }
    public void xoa()
    {   
        int xoa;
        System.out.println("Nhap ma GVCN can xoa");
        xoa = in.nextInt();
        boolean flag = false;
        for(giaovien a:dsGV)
        if(xoa==a.getMagv())
        {
            flag = true;
            dsGV.remove(a);
        }
        if(flag == false) System.out.println("Loi, ma giao vien khong ton tai");
    }
    public void sua()
    {
        int sua;
        System.out.println("Nhap ma GVCN can sua");
        sua = in.nextInt();
        boolean flag = false;
        for(giaovien a:dsGV)
        {
            if(a.getMagv() == sua)
            {
                giaovien b = new giaovien();
                b.nhap();
                a.setHoten(b.hoten);
                a.setGioitinh(b.gioitinh);
                a.setNgaythangnamsinh(b.ngaysinh, b.thangsinh, b.namsinh);
                a.setCCCD(b.socccd);
                a.setDiachi(b.diachi);
                a.setSdt(b.sdt);
            }
        }
        if(flag == false) System.out.println("LOI, ma giao vien khong ton tai");
    }
    public void in()
    {
        for(giaovien giaovien:dsGV)
        giaovien.xuat();
    }
    @Override
    public void docFile(){
        try {
            // Lấy đường dẫn hiện tại
            String currentDirectory = System.getProperty("user.dir");
            // Tạo đường dẫn tương đối của file
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dsgiaovien-in.txt";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while(line != null){
                String[] arr = line.split(",");
                giaovien filegiaovien  = new giaovien();
                filegiaovien.setHoten(arr[0]);
                filegiaovien.setGioitinh(arr[1]);
                filegiaovien.setSdt(arr[2]);
                filegiaovien.setCCCD(arr[3]);
                filegiaovien.setNgaythangnamsinh(Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),Integer.parseInt(arr[6]));
                filegiaovien.setDiachi(arr[7]);
                this.dsGV.add(filegiaovien);
                line = reader.readLine();
            }
            reader.close();
            System.out.println("Doc file thanh cong");
        }catch(Exception e){
            System.out.println("Khong doc duoc file");
        }
    }
    @Override
    public void ghiFile()
    {
         try {
            // Lấy đường dẫn hiện tại
            String currentDirectory = System.getProperty("user.dir");
            // Tạo đường dẫn tương đối của file
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dsgiaovien-out.txt";
            FileWriter fw = new FileWriter(filePath);
            fw.write("DANH SACH GIAO VIEN CHU NHIEM: \n");
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            fw.write("MaGV\tSDT\t\t\tHoTen\t\t\tGioiTinh\tNgayThangNamSinh\tDiaChi\tCCCD\n");
            for (giaovien giaovien:dsGV) {
                fw.write(giaovien.toString() + "\n");
            }
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            fw.close();
            System.out.println("Ghi file thanh cong");
        }catch(Exception e){
            System.out.println("Khong ghi duoc file");
        }
    }
    public static void main(String args[])
    {   
        dsGVCN dsGV = new dsGVCN();
        Scanner in = new Scanner(System.in);
        int i;
        do
        {   
            i = in.nextInt();
            if(i==1) dsGV.docFile();
            if(i==2) dsGV.ghiFile();
            if(i==3) dsGV.them();
            if(i==4) dsGV.xoa();
            if(i==5) dsGV.sua();
            if(i==6) dsGV.in();
        }while(i!=0);
    }
}