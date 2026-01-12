import java.util.Scanner;

public class LuyenTap2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tongSoHocVien = 0;
            double tongDiem = 0;
            double diemMax = Double.MIN_VALUE;
            double diemMin = Double.MAX_VALUE;
            while (true) {
                System.out.println("====== MENU NHẬP ĐIỂM ======");
                System.out.println("1. Nhập điểm học viên");
                System.out.println("2. Hiển thị thống kê");
                System.out.println("3. Thoát");
                System.out.println("Lựa chọn của bạn: ");
                int luaChon = Integer.parseInt(sc.nextLine());
                switch (luaChon) {
                    case 1: {
                        System.out.println("--- Nhập điểm học viên (nhập -1 để dừng) ---");
                        while (true) {
                            System.out.println("Nhập điểm: ");
                            double diem = Double.parseDouble(sc.nextLine());
                            if (diem == -1) {
                                break;
                            } else if (diem < 0 || diem > 10) {
                                System.out.println("Điểm không hợp lệ. Nhập lại.");
                                continue;
                            }
                            tongSoHocVien++;
                            tongDiem += diem;
                            if (diem > diemMax) diemMax = diem;
                            if (diem < diemMin) diemMin = diem;
                            if (diem < 5) {
                                System.out.println("Học lực: Yếu");
                            } else if (diem < 7) {
                                System.out.println("Học lực: Trung bình");
                            } else if (diem < 8) {
                                System.out.println("Học lực: Khá");
                            } else if (diem < 9) {
                                System.out.println("Học lực: Giỏi");
                            } else {
                                System.out.println("Học lực: Xuất sắc");
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("--- KẾT QUẢ ---");
                        if (tongSoHocVien == 0) {
                            System.out.println("Chưa có dữ liệu");
                        } else {
                            double diemTB = tongDiem / tongSoHocVien;
                            System.out.printf("Số học viên đã nhập: %d\n", tongSoHocVien);
                            System.out.printf("Điểm trung bình: %.2f\n", diemTB);
                            System.out.printf("Điểm cao nhất: %.2f\n", diemMax);
                            System.out.printf("Điểm thấp nhất: %.2f\n", diemMin);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Kết thúc chương trình.");
                        System.exit(0);
                    }
                    default: {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                }
            }
        }
    }
