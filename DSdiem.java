import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class DSdiem implements file{

    private ArrayList<diem> dsdiem;
    Scanner sc = new Scanner(System.in);

    public DSdiem() {
        dsdiem = new ArrayList<diem>();
    }

    public void nhapDS() {
        System.out.println("Nhap so luong hoc sinh: ");
        int soluong = sc.nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap thong tin cua hoc sinh thu " + (i + 1) + ": ");
            System.out.println("Nhap ma hoc sinh: ");
            int maHS = sc.nextInt();
            System.out.println("Nhap nam hoc: ");
            int namhoc = sc.nextInt();
            System.out.println("Nhap hoc ky: ");
            int hocky = sc.nextInt();
            monhoc[] monhoc = new monhoc[5];
            System.out.println("Nhap diem mon toan: ");
            float diemtoan = sc.nextFloat();
            monhoc[0] = new monhoc("Toan", diemtoan, 1);
            System.out.println("Nhap diem mon anh: ");
            float diemanh = sc.nextFloat();
            monhoc[1] = new monhoc("Anh", diemanh, 2);
            System.out.println("Nhap diem mon van: ");
            float diemvan = sc.nextFloat();
            monhoc[2] = new monhoc("Văn", diemvan, 3);
            System.out.println("Nhap diem mon hoa: ");
            float diemhoa = sc.nextFloat();
            monhoc[3] = new monhoc("Hoa", diemhoa, 4);
            System.out.println("Nhap diem mon ly: ");
            float diemly = sc.nextFloat();
            monhoc[4] = new monhoc("Ly", diemly, 5);
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
        System.out.println("Nhap nam hoc: ");
        int namhoc = sc.nextInt();
        System.out.println("Nhap hoc ky: ");
        int hocky = sc.nextInt();
        monhoc[] monhoc = new monhoc[5];
        System.out.println("Nhap diem mon toan: ");
        float diemtoan = sc.nextFloat();
        monhoc[0] = new monhoc("Toan", diemtoan, 1);
        System.out.println("Nhap diem mon anh: ");
        float diemanh = sc.nextFloat();
        monhoc[1] = new monhoc("Anh", diemanh, 2);
        System.out.println("Nhap diem mon van: ");
        float diemvan = sc.nextFloat();
        monhoc[2] = new monhoc("Van", diemvan, 3);
        System.out.println("Nhap diem mon hoa: ");
        float diemhoa = sc.nextFloat();
        monhoc[3] = new monhoc("Hoa", diemhoa, 4);
        System.out.println("Nhap diem mon ly: ");
        float diemly = sc.nextFloat();
        monhoc[4] = new monhoc("Ly", diemly, 5);
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
                System.out.println("Nhap diem mon toan: ");
                float diemtoan = sc.nextFloat();
                dsdiem.get(i).getMonhoc()[0].setDiem(diemtoan);
                System.out.println("Nhap diem mon anh: ");
                float diemanh = sc.nextFloat();
                dsdiem.get(i).getMonhoc()[1].setDiem(diemanh);
                System.out.println("Nhap diem mon van: ");
                float diemvan = sc.nextFloat();
                dsdiem.get(i).getMonhoc()[2].setDiem(diemvan);
                System.out.println("Nhap diem mon hoa: ");
                float diemhoa = sc.nextFloat();
                dsdiem.get(i).getMonhoc()[3].setDiem(diemhoa);
                System.out.println("Nhap diem mon ly: ");
                float diemly = sc.nextFloat();
                dsdiem.get(i).getMonhoc()[4].setDiem(diemly);
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

    public void nhapXuatDS() {
        nhapDS();
        xuatDS();
    }
    public void ghiFile(){
        try {
            // Lấy đường dẫn hiện tại
            String currentDirectory = System.getProperty("user.dir");
            // Tạo đường dẫn tương đối của file
            String filePath = currentDirectory + File.separator + "input-output" + File.separator + "dsCLB-out.txt";
            FileWriter fw = new FileWriter(filePath);
            fw.write("DANH SACH CAU LAC BO: \n");
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            fw.write("Dinh dang: STT\t\tMa CLB, Ten CLB, Cong viec\n");
            for (int i = 0; i < this.dsdiem.size(); i++) {
                diem a = this.dsdiem.get(i);
                fw.write(String.format("%d, %s\n", (i + 1), a.toString()));
            }
            fw.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            fw.close();
            System.out.println("Ghi file thanh cong");
        }catch(Exception e){
            System.out.println("Khong ghi duoc file");
        }
    }
    public void docFile(){}


    public void menu() {
        int option;
        do {
            System.out.println("\nXin moi chon: ");
            System.out.println("1. Them");
            System.out.println("2. Sua");
            System.out.println("3. Xoa");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            System.out.println("6. Xuat danh sach");
            System.out.println("Nhap lua chon cua ban: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    themDiem();
                    break;
                case 2:
                    suaDiem();
                    break;
                case 3:
                    xoaDiem();
                    break;
                case 4:
                    timKiemDiem();
                    break;
                case 5:
                    xuatDS();
                    break;
                case 6:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Khong hop le. Vui long nhap lai.");
                    break;
            }
        } while (option != 6);
    }

}
