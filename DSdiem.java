import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DSdiem implements file{

    private ArrayList<diem> dsdiem;
    Scanner sc = new Scanner(System.in);

    public DSdiem() {
        dsdiem = new ArrayList<diem>();
    }
    public ArrayList<diem> getDs()
    {
        return dsdiem;
    }
    public void nhapDS() {
        System.out.println("Nhap so luong hoc sinh: ");
        int soluong = sc.nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap thong tin cua hoc sinh thu " + (i + 1) + ": ");
            System.out.println("Nhap ma hoc sinh: ");
            int maHS = sc.nextInt();
            while (trungMaHS(maHS)) {
                System.out.println("Ma hoc sinh da ton tai. Vui long nhap lai: ");
                maHS = sc.nextInt();
            }
            System.out.println("Nhap nam hoc: ");
            int namhoc = sc.nextInt();
            System.out.println("Nhap hoc ky: ");
            int hocky = sc.nextInt();
            while (hocky != 1 && hocky != 2) {
                System.out.println("Hoc ky khong hop le. Vui long nhap lai: ");
                hocky = sc.nextInt();
            }
            monhoc[] monhoc = new monhoc[5];
            // Gọi phương thức nhập điểm cho mỗi môn học
            monhoc[0] = nhapDiem("Toan", 1);
            monhoc[1] = nhapDiem("Anh", 2);
            monhoc[2] = nhapDiem("Văn", 3);
            monhoc[3] = nhapDiem("Hoa", 4);
            monhoc[4] = nhapDiem("Ly", 5);
            diem diem = new diem(maHS, namhoc, hocky, monhoc);
            dsdiem.add(diem);
        }
    }

    public void xuatDS() {
        System.out.println("\nDanh sach diem: ");
        for (int i = 0; i < dsdiem.size(); i++) {
            System.out.println("\nThong tin hoc sinh thu " + (i + 1) + ": ");
            System.out.println("Ma hoc sinh: " + dsdiem.get(i).getMaHS());
            System.out.println("Nam hoc: " + dsdiem.get(i).getNamhoc());
            System.out.println("Hoc ky: " + dsdiem.get(i).getHocky());
            System.out.println("Diem trung binh: " + dsdiem.get(i).getAvgDiem());
            System.out.println("Xep loai: " + dsdiem.get(i).getXeploai());
            System.out.println("Diem cac mon hoc: ");
            for (int j = 0; j < 5; j++) {
                System.out.println("Mon " + dsdiem.get(i).getMonhoc()[j].getTenmon() + ": "
                        + dsdiem.get(i).getMonhoc()[j].getDiem());
            }
        }
    }

    public void themDiem() {
        System.out.println("\nNhap thong tin hoc sinh duoc them: ");
        System.out.println("Nhap ma hoc sinh: ");
        int maHS = sc.nextInt();
        while (trungMaHS(maHS)) {
            System.out.println("Ma hoc sinh da ton tai. Vui long nhap lai: ");
            maHS = sc.nextInt();
        }
        System.out.println("Nhap nam hoc: ");
        int namhoc = sc.nextInt();
        System.out.println("Nhap hoc ky: ");
        int hocky = sc.nextInt();
        while (hocky != 1 && hocky != 2) {
            System.out.println("Hoc ky khong hop le. Vui long nhap lai: ");
            hocky = sc.nextInt();
        }
        monhoc[] monhoc = new monhoc[5];
            // Gọi phương thức nhập điểm cho mỗi môn học
            monhoc[0] = nhapDiem("Toan", 1);
            monhoc[1] = nhapDiem("Anh", 2);
            monhoc[2] = nhapDiem("Văn", 3);
            monhoc[3] = nhapDiem("Hoa", 4);
            monhoc[4] = nhapDiem("Ly", 5);
            diem diem = new diem(maHS, namhoc, hocky, monhoc);
            dsdiem.add(diem);
            System.out.println("Da them thong tin cho hoc sin co ma " + maHS);
    }

    public void suaDiem() {
        System.out.println("\nNhap ma hoc sinh can sua diem: ");
        int maHS = sc.nextInt();
        boolean timthay = false;
        for (int i = 0; i < dsdiem.size(); i++) {
            if (dsdiem.get(i).getMaHS() == maHS) {
                timthay = true;
                System.out.println("Nhap thong tin moi cho hoc sinh co ma " + maHS + ": ");
                System.out.println("Nhap nam hoc: ");
                int namhoc = sc.nextInt();
                dsdiem.get(i).setNamhoc(namhoc);
                System.out.println("Nhap hoc ky: ");
                int hocky = sc.nextInt();
                dsdiem.get(i).setHocky(hocky);
                dsdiem.get(i).getMonhoc()[0] = nhapDiem("Toan", 1);
                dsdiem.get(i).getMonhoc()[1] = nhapDiem("Anh", 2);
                dsdiem.get(i).getMonhoc()[2] = nhapDiem("Văn", 3);
                dsdiem.get(i).getMonhoc()[3] = nhapDiem("Hoa", 4);
                dsdiem.get(i).getMonhoc()[4] = nhapDiem("Ly", 5);
                dsdiem.get(i).setAvgDiem(dsdiem.get(i).tinhDiemTB());
                dsdiem.get(i).setXeploai(dsdiem.get(i).setXeploai());
                System.out.println("Da sua thong tin cho hoc sinh co ma " + maHS);
                break;
            }
        }
        if (!timthay) {
            System.out.println("Khong co hoc sinh nao co ma " + maHS);
        }
    }

    public void xoaDiem() {
        System.out.println("\nNhap ma hoc sinh can xoa diem: ");
        int maHS = sc.nextInt();
        boolean timthay = false;
        for (int i = 0; i < dsdiem.size(); i++) {
            if (dsdiem.get(i).getMaHS() == maHS) {
                timthay = true;
                dsdiem.remove(i);
                System.out.println("Da xoa diem cua hoc sinh co ma " + maHS);
                break;
            }
        }
        if (!timthay) {
            System.out.println("Khong co hoc sinh nao co ma " + maHS);
        }
    }

    public void timKiemDiem() {
        System.out.println("\nNhap ma hoc sinh can tim kiem: ");
        int maHS = sc.nextInt();
        boolean timthay = false;
        for (int i = 0; i < dsdiem.size(); i++) {
            if (dsdiem.get(i).getMaHS() == maHS) {
                timthay = true;
                System.out.println("Thong tin cua hoc sinh co ma " + maHS + ": ");
                System.out.println("Nam hoc: " + dsdiem.get(i).getNamhoc());
                System.out.println("Hoc ky: " + dsdiem.get(i).getHocky());
                System.out.println("Diem trung binh: " + dsdiem.get(i).getAvgDiem());
                System.out.println("Xep loai: " + dsdiem.get(i).getXeploai());
                System.out.println("Diem cac mon hoc: ");
                for (int j = 0; j < 5; j++) {
                    System.out.println("Mon " + dsdiem.get(i).getMonhoc()[j].getTenmon() + ": "
                            + dsdiem.get(i).getMonhoc()[j].getDiem());
                }
                break;
            }
        }
        if (!timthay) {
            System.out.println("Khong co hoc sinh nao co ma " + maHS);
        }
    }

    public void ghiFile() {
        try {
            // Lấy đường dẫn hiện tại
            String currentDirectory = System.getProperty("user.dir");
            // Tạo đường dẫn tương đối của file
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dsDiem-out.txt";
            FileWriter fw = new FileWriter(filePath); 
            BufferedWriter bw = new BufferedWriter(fw); 
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            bw.write("Danh sách điểm của các học sinh: \n"); 
            for (int i = 0; i < dsdiem.size(); i++) { 
                bw.write("\nThông tin học sinh thứ " + (i + 1) + ": \n"); 
                bw.write("Mã học sinh: " + dsdiem.get(i).getMaHS() + "\t");
                bw.write("Năm học: " + dsdiem.get(i).getNamhoc() + "\t");
                bw.write("Học kỳ: " + dsdiem.get(i).getHocky() + "\n");
                bw.write("Điểm trung bình: " + dsdiem.get(i).getAvgDiem() + "\t");
                bw.write("Xếp loại: " + dsdiem.get(i).getXeploai() + "\n");
                bw.write("Điểm các môn học: \n");
                for (int j = 0; j < 5; j++) { 
                    bw.write("Môn " + dsdiem.get(i).getMonhoc()[j].getTenmon() + ": " + dsdiem.get(i).getMonhoc()[j].getDiem() + "\n"); 
                }
            }
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            bw.close(); 
            fw.close(); 
            System.out.println("Da ghi file thanh cong.");
        } catch (IOException e) { 
            System.out.println("Co loi xay ra khi ghi file: ");
        }
    }
    public void docFile() {
        try {
            //lây đường dẫn
            String currentDirectory = System.getProperty("user.dir");
            //tạo đường dẫn
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dsDiem-in.txt";
            FileReader fr = new FileReader(filePath); 
            BufferedReader br = new BufferedReader(fr); 
            String line = br.readLine(); 
            while (line != null) { 
                String[] data = line.split(", "); 
                int maHS = Integer.parseInt(data[0]); 
                int namhoc = Integer.parseInt(data[1]); 
                int hocky = Integer.parseInt(data[2]); 
                monhoc[] monhoc = new monhoc[5]; 
                float diemtoan = Float.parseFloat(data[3]); 
                monhoc[0] = new monhoc("Toan", diemtoan, 1); 
                float diemanh = Float.parseFloat(data[4]); 
                monhoc[1] = new monhoc("Anh", diemanh, 2); 
                float diemvan = Float.parseFloat(data[5]); 
                monhoc[2] = new monhoc("Van", diemvan, 3); 
                float diemhoa = Float.parseFloat(data[6]); 
                monhoc[3] = new monhoc("Hoa", diemhoa, 4); 
                float diemly = Float.parseFloat(data[7]); 
                monhoc[4] = new monhoc("Ly", diemly, 5); 
                diem diem = new diem(maHS, namhoc, hocky, monhoc); 
                dsdiem.add(diem); 
                line = br.readLine(); 
            }
            br.close(); 
            fr.close(); 
            System.out.println("Da doc file thanh cong.");
        } catch (IOException e) { 
            System.out.println("Co loi xay ra khi doc file: ");
        }
    }

    public boolean trungMaHS(int maHS) {
        for (diem d : dsdiem) {
            if (d.getMaHS() == maHS) {
                return true;
            }
        }
        return false;
    }

    public monhoc nhapDiem(String tenmon, int mamh) {
        System.out.println("Nhap diem mon " + tenmon + ": ");
        float diem = sc.nextFloat();
        // Kiểm tra điểm có hợp lệ không
        while (diem < 1 || diem > 10) {
            System.out.println("Diem mon " + tenmon + " khong nam trong khoang tu 0 den 10. Vui long nhap lai: ");
            diem = sc.nextFloat();
        }
        return new monhoc(tenmon, diem, mamh);
    }

    public static void main(String[] args){
        DSdiem a = new DSdiem();
        a.nhapDS();
        a.themDiem();
        a.suaDiem();
        a.xuatDS();
    }
}
