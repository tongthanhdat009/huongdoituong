import java.util.Scanner;
import java.util.ArrayList;

// Lớp danh sách điểm (DSdiem)
public class DSdiem {
    // Các thuộc tính của lớp danh sách điểm
    private ArrayList<diem> dsdiem; // Danh sách điểm từ lớp điểm

    // Phương thức khởi tạo lớp danh sách điểm
    public DSdiem() {
        dsdiem = new ArrayList<diem>(); // Khởi tạo danh sách điểm rỗng
    }

    // Phương thức nhập danh sách điểm
    public void nhapDS() {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        System.out.println("Nhap so luong hoc sinh: ");
        int soluong = sc.nextInt(); // Nhập số lượng học sinh
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap thong tin cua hoc sinh thu " + (i + 1) + ": ");
            System.out.println("Nhap ma hoc sinh: ");
            int maHS = sc.nextInt(); // Nhập mã học sinh
            System.out.println("Nhap nam hoc: ");
            int namhoc = sc.nextInt(); // Nhập năm học
            System.out.println("Nhap hoc ky: ");
            int hocky = sc.nextInt(); // Nhập học kỳ
            monhoc[] monhoc = new monhoc[5]; // Tạo mảng các môn học có 5 phần tử
            System.out.println("Nhap diem mon toan: ");
            float diemtoan = sc.nextFloat(); // Nhập điểm môn toán
            monhoc[0] = new monhoc("Toan", diemtoan, 1); // Tạo đối tượng môn toán với tên môn, điểm môn và mã môn
            System.out.println("Nhap diem mon anh: ");
            float diemanh = sc.nextFloat(); // Nhập điểm môn anh
            monhoc[1] = new monhoc("Anh", diemanh, 2); // Tạo đối tượng môn anh với tên môn, điểm môn và mã môn
            System.out.println("Nhap diem mon van: ");
            float diemvan = sc.nextFloat(); // Nhập điểm môn văn
            monhoc[2] = new monhoc("Văn", diemvan, 3); // Tạo đối tượng môn văn với tên môn, điểm môn và mã môn
            System.out.println("Nhap diem mon hoa: ");
            float diemhoa = sc.nextFloat(); // Nhập điểm môn hoá
            monhoc[3] = new monhoc("Hoa", diemhoa, 4); // Tạo đối tượng môn hoá với tên môn, điểm môn và mã môn
            System.out.println("Nhap diem mon ly: ");
            float diemly = sc.nextFloat(); // Nhập điểm môn lý
            monhoc[4] = new monhoc("Ly", diemly, 5); // Tạo đối tượng môn lý với tên môn, điểm môn và mã môn
            diem diem = new diem(maHS, namhoc, hocky, monhoc); // Tạo đối tượng điểm với mã học sinh, năm học, học kỳ và mảng các môn học
            dsdiem.add(diem); // Thêm đối tượng điểm vào danh sách điểm
        }
    }

    // Phương thức xuất danh sách điểm
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
                System.out.println("Mon " + dsdiem.get(i).getMonhoc()[j].getTenmon() + ": " + dsdiem.get(i).getMonhoc()[j].getDiem());
            }
        }
    }

    // Phương thức thêm điểm cho một học sinh
    public void themDiem() {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        System.out.println("\nNhap thong tin hoc sinh duoc them: ");
        System.out.println("Nhap ma hoc sinh: ");
        int maHS = sc.nextInt(); // Nhập mã học sinh
        System.out.println("Nhap nam hoc: ");
        int namhoc = sc.nextInt(); // Nhập năm học
        System.out.println("Nhap hoc ky: ");
        int hocky = sc.nextInt(); // Nhập học kỳ
        monhoc[] monhoc = new monhoc[5]; // Tạo mảng các môn học có 5 phần tử
        System.out.println("Nhap diem mon toan: ");
        float diemtoan = sc.nextFloat(); // Nhập điểm môn toán
        monhoc[0] = new monhoc("Toan", diemtoan, 1); // Tạo đối tượng môn toán với tên môn, điểm môn và mã môn
        System.out.println("Nhap diem mon anh: ");
        float diemanh = sc.nextFloat(); // Nhập điểm môn anh
        monhoc[1] = new monhoc("Anh", diemanh, 2); // Tạo đối tượng môn anh với tên môn, điểm môn và mã môn
        System.out.println("Nhap diem mon van: ");
        float diemvan = sc.nextFloat(); // Nhập điểm môn văn
        monhoc[2] = new monhoc("Van", diemvan, 3); // Tạo đối tượng môn văn với tên môn, điểm môn và mã môn
        System.out.println("Nhap diem mon hoa: ");
        float diemhoa = sc.nextFloat(); // Nhập điểm môn hoá
        monhoc[3] = new monhoc("Hoa", diemhoa, 4); // Tạo đối tượng môn hoá với tên môn, điểm môn và mã môn
        System.out.println("Nhap diem mon ly: ");
        float diemly = sc.nextFloat(); // Nhập điểm môn lý
        monhoc[4] = new monhoc("Ly", diemly, 5); // Tạo đối tượng môn lý với tên môn, điểm môn và mã môn
        diem diem = new diem(maHS, namhoc, hocky, monhoc); // Tạo đối tượng điểm với mã học sinh, năm học, học kỳ và mảng các môn học
        dsdiem.add(diem); // Thêm đối tượng điểm vào danh sách điểm
        System.out.println("Da them thong tin cho hoc sin co ma " + maHS);
    }

    // Phương thức sửa điểm cho một học sinh
    public void suaDiem() {
    Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
    System.out.println("\nNhap ma hoc sinh can sua diem: ");
    int maHS = sc.nextInt(); // Nhập mã học sinh
    boolean timthay = false; // Biến kiểm tra có tìm thấy học sinh hay không
    for (int i = 0; i < dsdiem.size(); i++) {
        if (dsdiem.get(i).getMaHS() == maHS) { // Nếu tìm thấy học sinh có mã trùng với mã nhập vào
            timthay = true; // Đặt biến timthay là true
            System.out.println("Nhap thong tin moi cho hoc sinh co ma " + maHS + ": ");
            System.out.println("Nhap nam hoc: ");
            int namhoc = sc.nextInt(); // Nhập năm học mới
            dsdiem.get(i).setNamhoc(namhoc); // Cập nhật năm học mới cho học sinh
            System.out.println("Nhap hoc ky: ");
            int hocky = sc.nextInt(); // Nhập học kỳ mới
            dsdiem.get(i).setHocky(hocky); // Cập nhật học kỳ mới cho học sinh
            System.out.println("Nhap diem mon toan: ");
            float diemtoan = sc.nextFloat(); // Nhập điểm môn toán mới
            dsdiem.get(i).getMonhoc()[0].setDiem(diemtoan); // Cập nhật điểm môn toán mới cho học sinh
            System.out.println("Nhap diem mon anh: ");
            float diemanh = sc.nextFloat(); // Nhập điểm môn anh mới
            dsdiem.get(i).getMonhoc()[1].setDiem(diemanh); // Cập nhật điểm môn anh mới cho học sinh
            System.out.println("Nhap diem mon van: ");
            float diemvan = sc.nextFloat(); // Nhập điểm môn văn mới
            dsdiem.get(i).getMonhoc()[2].setDiem(diemvan); // Cập nhật điểm môn văn mới cho học sinh
            System.out.println("Nhap diem mon hoa: ");
            float diemhoa = sc.nextFloat(); // Nhập điểm môn hoá mới
            dsdiem.get(i).getMonhoc()[3].setDiem(diemhoa); // Cập nhật điểm môn hoá mới cho học sinh
            System.out.println("Nhap diem mon ly: ");
            float diemly = sc.nextFloat(); // Nhập điểm môn lý mới
            dsdiem.get(i).getMonhoc()[4].setDiem(diemly); // Cập nhật điểm môn lý mới cho học sinh
            dsdiem.get(i).setAvgDiem(dsdiem.get(i).tinhDiemTB()); // Cập nhật điểm trung bình mới cho học sinh
            dsdiem.get(i).setXeploai(dsdiem.get(i).setXeploai()); // Cập nhật xếp loại mới cho học sinh
            System.out.println("Da sua thong tin cho hoc sinh co ma " + maHS);
            break; // Thoát khỏi vòng lặp
            }
        }
        if (!timthay) { // Nếu không tìm thấy học sinh có mã trùng với mã nhập vào
        System.out.println("Khong co hoc sinh nao co ma " + maHS);
        }
    }

    // Phương thức xoá điểm của một học sinh
    public void xoaDiem() {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        System.out.println("\nNhap ma hoc sinh can xoa diem: ");
        int maHS = sc.nextInt(); // Nhập mã học sinh
        boolean timthay = false; // Biến kiểm tra có tìm thấy học sinh hay không
        for (int i = 0; i < dsdiem.size(); i++) {
            if (dsdiem.get(i).getMaHS() == maHS) { // Nếu tìm thấy học sinh có mã trùng với mã nhập vào
                timthay = true; // Đặt biến timthay là true
                dsdiem.remove(i); // Xoá đối tượng điểm khỏi danh sách điểm
                System.out.println("Da xoa diem cua hoc sinh co ma " + maHS);
                break; // Thoát khỏi vòng lặpF
            }
        }
        if (!timthay) { // Nếu không tìm thấy học sinh có mã trùng với mã nhập vào
            System.out.println("Khong co hoc sinh nao co ma " + maHS);
        }
    }

    // Phương thức tìm kiếm điểm của một học sinh
    public void timKiemDiem() {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        System.out.println("\nNhap ma hoc sinh can tim kiem: ");
        int maHS = sc.nextInt(); // Nhập mã học sinh
        boolean timthay = false; // Biến kiểm tra có tìm thấy học sinh hay không
        for (int i = 0; i < dsdiem.size(); i++) {
            if (dsdiem.get(i).getMaHS() == maHS) { // Nếu tìm thấy học sinh có mã trùng với mã nhập vào
                timthay = true; // Đặt biến timthay là true
                System.out.println("Thong tin cua hoc sinh co ma " + maHS + ": ");
                System.out.println("Nam hoc: " + dsdiem.get(i).getNamhoc());
                System.out.println("Hoc ky: " + dsdiem.get(i).getHocky());
                System.out.println("Diem trung binh: " + dsdiem.get(i).getAvgDiem());
                System.out.println("Xep loai: " + dsdiem.get(i).getXeploai());
                System.out.println("Diem cac mon hoc: ");
                for (int j = 0; j < 5; j++) {
                    System.out.println("Mon " + dsdiem.get(i).getMonhoc()[j].getTenmon() + ": " + dsdiem.get(i).getMonhoc()[j].getDiem());
                }
                break; // Thoát khỏi vòng lặp
            }
        }
        if (!timthay) { // Nếu không tìm thấy học sinh có mã trùng với mã nhập vào
            System.out.println("Khong co hoc sinh nao co ma " + maHS);
        }
    }

    public void nhapXuatDS() {
        nhapDS(); // Gọi phương thức nhập danh sách điểm
        xuatDS(); // Gọi phương thức xuất danh sách điểm
    }

    public void menu() {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        int option; // Biến lưu option người dùng chọn
        do {
            System.out.println("\nXin moi chon: ");
            System.out.println("1. Them");
            System.out.println("2. Sua");
            System.out.println("3. Xoa");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            System.out.println("6. Xuat danh sach");
            System.out.println("Nhap lua chon cua ban: ");
            option = sc.nextInt(); // Nhập option từ bàn phím
            switch (option) { // Xử lý option
                case 1:
                    themDiem(); // Gọi phương thức thêm điểm cho một học sinh
                    break;
                case 2:
                    suaDiem(); // Gọi phương thức sửa điểm cho một học sinh
                    break;
                case 3:
                    xoaDiem(); // Gọi phương thức xoá điểm của một học sinh
                    break;
                case 4:
                    timKiemDiem(); // Gọi phương thức tìm kiếm điểm của một học sinh
                    break;
                case 5:
                    System.out.println("Tam biet!");
                    break;
                case 6:
                    xuatDS();
                default:
                    System.out.println("Khong hop le. Vui long nhap lai.");
                    break;
            }
        } while (option != 5); // Lặp lại menu cho đến khi người dùng chọn option 5 là thoát
    }

}
