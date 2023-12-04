import java.util.*;
import java.io.*;
public class dsdaydu {
    public ArrayList<giaovien> dsGV;
    public ArrayList <lop> dsLop;
    public ArrayList <danhsachhocsinh> dsHS;
    public dsdaydu(ArrayList<giaovien> dsGV, ArrayList <lop> dsLop, ArrayList <danhsachhocsinh> dsHS)
    {
        this.dsGV = dsGV;
        this.dsLop = dsLop;
        this.dsHS = dsHS;
    }
    public dsdaydu()
    {
        this.dsGV = new ArrayList<>();
        this.dsLop = new ArrayList<>();
        this.dsHS = new ArrayList<>();
    }
    public void setDsLop(ArrayList <lop> dsLop)
    {
        this.dsLop = dsLop;
    }
    public void setDsHS(ArrayList <danhsachhocsinh> dsHS)
    {
        this.dsHS = dsHS;
    }
    public void setDsGV(ArrayList<giaovien> dsGV)
    {
        this.dsGV = dsGV;
    }
    public void ghiFile()
    {
         try {
            // Lấy đường dẫn hiện tại
            String currentDirectory = System.getProperty("user.dir");
            // Tạo đường dẫn tương đối của file
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dsdaydu-out.txt";
            FileWriter fw = new FileWriter(filePath);
            fw.write("DANH SACH HOC SINH, GIAO VIEN THEO LOP: \n");
            fw.write("MaGV\tSDT\t\t\tHoTen\t\t\tGioiTinh\tNgayThangNamSinh\tDiaChi\tCCCD\n");
            for(lop lop: dsLop)
            {   
                fw.write(lop.toString()+"\n");
                for(giaovien giaovien:dsGV)
                {
                    boolean flag = false;
                    if(giaovien.getMagv() == lop.getMaGVCN()) 
                    {
                        fw.write(giaovien.toString());
                        flag = true;
                    }
                    if(flag == false) fw.write("Khong co thong tin giao vien chu nhiem\n");
                }
                for(danhsachhocsinh hocsinh: dsHS)
                if(lop.maLop.equals(hocsinh.khoahoc)) fw.write(hocsinh.getFileline());
                fw.write("-------------------------------------------------------------------------------------------------------");
            }
            fw.close();
            System.out.println("Ghi file thanh cong");
        }catch(Exception e){
            System.out.println("Khong ghi duoc file");
        }
    }
}