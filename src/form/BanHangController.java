/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class BanHangController {

    ArrayList<SanPhamModel> listSanPham = new ArrayList<>();
    ArrayList<SanPhamModel> spGioHang = new ArrayList<>();
    ArrayList<HoaDon> listHD = new ArrayList<>();
    ArrayList<HoaDon> choThanhToan = new ArrayList<>();
    double total = 0;

    public BanHangController() {
    }

    public ArrayList<SanPhamModel> getList() {
        listSanPham.add(new SanPhamModel(1, "SP1", "ghe", "2023", 10.0, "cong kenh", 12, 100000.0, 150000.0));
        listSanPham.add(new SanPhamModel(2, "SP2", "ban", "2022", 15.0, "nho ngon", 102, 50000.0, 100000.0));
        listSanPham.add(new SanPhamModel(3, "SP3", "tu", "2023", 10.0, "to", 12, 100000.0, 150000.0));
        listSanPham.add(new SanPhamModel(4, "SP4", "thung rac", "2023", 5.0, "tien loi", 20, 30000.0, 50000.0));
        listSanPham.add(new SanPhamModel(5, "SP5", "may hut bui", "2020", 2.0, "nho gon", 15, 150000.0, 200000.0));

        return listSanPham;
    }

    public ArrayList<HoaDon> getHoaDon(int index) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        listHD.add(new HoaDon(index, "HD1", sdf.format(now), "Kien", "Chờ thanh toán", total));
        choThanhToan.add(new HoaDon(index, "HD1", sdf.format(now), "Kien", "Chờ thanh toán", total));
        total = 0;
        return listHD;
    }

    public Object[] fillCart(JTable tblProduct, int quantity) {
        // khai báo mảng obj
        Object[] obj = {};

        // lấy dữ liệu của dòng được chọn trong bảng sản phẩm     
        SanPhamModel sp = listSanPham.get(tblProduct.getSelectedRow());

        // tạo ArrayList của bảng giỏ hàng
        spGioHang.add(new SanPhamModel(sp.getIndex(), sp.getMaSp(), sp.getTenSp(), sp.getSoLuong(), sp.getGiaBan(), sp.getThanhTien()));

        // đặt lại biến tổng mỗi khi tính toán xong 
        total = 0;

        // thêm dữ liệu vào obj để fill vào bảng
        for (SanPhamModel sanPhamModel : spGioHang) {
            obj = new Object[]{sanPhamModel.getIndex(), sanPhamModel.getMaSp(), sanPhamModel.getTenSp(), quantity, sanPhamModel.getGiaBan(), sanPhamModel.getGiaBan() * quantity};

            // tính tổng tiền           
            total += sanPhamModel.getGiaBan() * quantity;
        }
        return obj;
    }

}
