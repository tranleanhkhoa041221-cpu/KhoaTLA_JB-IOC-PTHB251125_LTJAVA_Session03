import java.util.Scanner;

public class LuyenTap3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int soNhanVien = 0;
            long tongLuong = 0;
            long luongCaoNhat = Long.MIN_VALUE ;
            long luongThapNhat = Long.MAX_VALUE;
            long tongThuong = 0;
            while (true) {
                System.out.println("======== MENU NHẬP LƯƠNG =========");
                System.out.println("1. Nhập lương nhân viên");
                System.out.println("2. Hiển thị thống kê");
                System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
                System.out.println("4. Thoát");
                System.out.println("Lựa chọn của bạn: ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: {
                        System.out.println("--- Nhập lương nhân viên (nhập -1 để kết thúc) ---");
                        while (true) {
                            System.out.println("Nhập lương: ");
                            long luong = Long.parseLong(sc.nextLine());
                            if (luong == -1) {
                                break;
                            } else if (luong < 0 || luong > 500000000) {
                                System.out.println("Lương không hợp lệ. Nhập lại.");
                                continue;
                            } else if (luong < 5000000) {
                                System.out.println("-> Phân loại: Thấp");
                            } else if (luong <= 15000000) {
                                System.out.println("-> Phân loại: Trung bình");
                            } else if (luong <= 50000000) {
                                System.out.println("-> Phân loại: Khá");
                            } else {
                                System.out.println("-> Phân loại: Cao");
                            }
                            soNhanVien++;
                            tongLuong += luong;
                            if (luong > luongCaoNhat) luongCaoNhat = luong;
                            if (luong < luongThapNhat) luongThapNhat = luong;
                            long thuong = 0;
                            if (luong <= 5000000) {
                                thuong = (long) (luong * 0.05);
                            } else if (luong > 5000000 && luong <= 15000000) {
                                thuong = (long) (luong * 0.10);
                            } else if (luong > 15000000 && luong <= 50000000) {
                                thuong = (long) (luong * 0.15);
                            } else if (luong > 50000000 && luong <= 100000000) {
                                thuong = (long) (luong * 0.20);
                            } else {
                                thuong = (long) (luong * 0.25);
                            }

                            tongThuong += thuong;
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("--- Thống kê ---");
                        if (soNhanVien == 0) {
                            System.out.println("Chưa có dữ liệu");
                        } else {
                            long luongTB = tongLuong / soNhanVien;
                            System.out.println("Số nhân viên: " + soNhanVien);
                            System.out.println("Tổng lương: " + tongLuong + " VND");
                            System.out.println("Lương trung bình: " + luongTB + " VND");
                            System.out.println("Lương cao nhất: " + luongCaoNhat + " VND");
                            System.out.println("Lương thấp nhất: " + luongThapNhat + " VND");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("--- Tính tổng số tiền thưởng nhân viên ---");
                        if (soNhanVien == 0) {
                            System.out.println("Chưa có dữ liệu");
                        } else {
                            System.out.println("Tổng tiền thưởng nhân viên: " + tongThuong + " VND");
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Kết thúc chương trình.");
                        System.exit(0);
                }
                default : {
                    System.out.println("Lựa chọn không hợp lệ.");
                }
            }
        }
    }

}
