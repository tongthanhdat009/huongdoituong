import java.util.*;
import java.io.*;
public class dsdaydu {
    public ArrayList<giaovien> dsGV;
    public ArrayList <lop> dsLop;
    public ArrayList <danhsachhocsinh> dsHS;
    public ArrayList <diem> dsDiem;
    public dsdaydu(ArrayList<giaovien> dsGV, ArrayList <lop> dsLop, ArrayList <danhsachhocsinh> dsHS,ArrayList <diem> dsDiem)
    {
        this.dsGV = dsGV;
        this.dsLop = dsLop;
        this.dsHS = dsHS;
        this.dsDiem = dsDiem;
    }
    public dsdaydu()
    {
        this.dsGV = new ArrayList<>();
        this.dsLop = new ArrayList<>();
        this.dsHS = new ArrayList<>();
         this.dsDiem = new ArrayList<>();
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
            for(lop lop: dsLop)
            {   
                fw.write("-------------------------------------------------------------------------------------------------------\n");
                fw.write(lop.toString2()+"\n");
                boolean flag = false;
                for(giaovien giaovien:dsGV)
                {
                    if(giaovien.getMagv() == lop.getMaGVCN()) 
                    {
                        fw.write("Thong tin giao vien chu nhiem\n");
                        fw.write(giaovien.toString2()+"\n");
                        flag = true;
                        break;
                    }
                }
                if(flag == false) fw.write("Khong co thong tin giao vien chu nhiem\n");
                fw.write("Thong tin hoc sinh trong lop\n");
                for(danhsachhocsinh hocsinh: dsHS)
                {  
                    if(lop.maLop.equals(hocsinh.khoahoc)) 
                    {
                        fw.write(hocsinh.toString2()+"\t");
                        for(diem diem: dsDiem)
                        {
                            if(hocsinh.getMa() == diem.getMaHS()) 
                            {
                                fw.write(diem.toString()+"\n");
                                break;
                            }
                        }
                    }
                }
            }
            fw.close();
            System.out.println("Ghi file thanh cong");
        }catch(Exception e){
            System.out.println("Khong ghi duoc file");
        }
    }
}
