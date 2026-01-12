import java.util.Scanner;

public class LuyenTap1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhập tên khách hàng: ");
            String tenKhachHang = sc.nextLine();

            System.out.println("Nhập tên sản phẩm: ");
            String tenSanPham = sc.nextLine();

            System.out.println("Nhập giá sản phẩm: ");
            double giaSanPham = Double.parseDouble(sc.nextLine());

            System.out.println("Nhập số lượng mua: ");
            int soLuong = Integer.parseInt(sc.nextLine());

            System.out.println("Khách có thẻ thành viên (true/false): ");
            boolean coTheThanhVien = Boolean.parseBoolean(sc.nextLine());

            double thanhTien = giaSanPham * soLuong;
            double giamGia = 0;
            if (coTheThanhVien == true) {
                giamGia = thanhTien * 0.1;
            } else {
                giamGia = 0;
            }
            double vat = thanhTien * 0.08;
            double tongtienthanhtoan = thanhTien - giamGia + vat;
            System.out.println("===== HÓA ĐƠN THANH TOÁN =====");
            System.out.println("Khách hàng: " + tenKhachHang);
            System.out.println("Sản phẩm: " + tenSanPham);
            System.out.println("Đơn giá: " + giaSanPham);
            System.out.println("Số lượng: " + soLuong);
            System.out.println("Thành tiền: " + thanhTien);
            System.out.println("Giảm giá: " + giamGia);
            System.out.println("Tiền VAT (8%): " + vat);
            System.out.println("Tổng tiền thanh toán: " + tongtienthanhtoan);
        }
    }

