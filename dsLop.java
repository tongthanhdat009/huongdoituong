import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class dsLop implements file {
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
        boolean flag = true;
        for(lop lop :ds)
        if(a.maLop.equals(lop.maLop)) flag = false;
        if(flag == true) this.ds.add(a);
        else System.out.println("Loi, ma lop da ton tai");
    }
    public void in()
    {
        for(lop lop: ds)
        lop.xuat();
    }
    public void xoa()
    {
        String xoa = new String();
        System.out.println("Nhap ma lop can xoa: ");
        xoa =sc.nextLine();
        boolean flag = false;
        for(lop lop: ds)
        if(lop.getMaLop().equals(xoa))
        {
            flag = true;
            ds.remove(lop);
        }
        if(flag == false) System.out.println("LOI, khong ton tai ma lop");
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
                lop a = new lop();
                a.nhap();
                if(a.maLop.equals(lop.maLop))
                {
                    lop.setSiSo(a.siSo);
                    lop.setMaGVCN(a.maGVCN);
                    lop.setPhong(a.phong);   
                    flag = true;
                }
                else if(!kiemTraTonTai(a.maLop)) 
                {
                    lop.setMaLop(a.maLop);
                    lop.setSiSo(a.siSo);
                    lop.setMaGVCN(a.maGVCN);
                    lop.setPhong(a.phong); 
                    flag = true;
                }
            }
        }
        if(flag == false) System.out.println("Lop khong ton tai");
    }
    @Override
    public void docFile(){
        try {
            // Lấy đường dẫn hiện tại
            String currentDirectory = System.getProperty("user.dir");
            // Tạo đường dẫn tương đối của file
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dsLop-in.txt";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while(line != null){
                String[] arr = line.split(",");
                lop fileLop  = new lop();
                for(int i=0;i<arr.length;i++){
                    if(i==0) fileLop.setMaLop(arr[i]);
                    if(i==1) fileLop.setSiSo(Integer.parseInt(arr[i]));
                    if(i==2) fileLop.setMaGVCN(Integer.parseInt(arr[i]));
                    if(i==3) fileLop.phong.setsoBan(Integer.parseInt(arr[i]));
                    if(i==4) fileLop.phong.setsoGhe(Integer.parseInt(arr[i]));
                }
                this.ds.add(fileLop);
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
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dsLop-out.txt";
            FileWriter fw = new FileWriter(filePath);
            fw.write("DANH SACH LOP: \n");
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            fw.write("MaLop\tSiSo\tMaGVCN\tMaPhong\tSoBan\tSoGhe\n");
            for (lop lop:ds) {
                fw.write(lop.toString() + "\n");
            }
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            fw.close();
            System.out.println("Ghi file thanh cong");
        }catch(Exception e){
            System.out.println("Khong ghi duoc file");
        }
    }
}
