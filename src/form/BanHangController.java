/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author Acer
 */
public class BanHangController {

    ArrayList<SanPhamModel> listSanPham = new ArrayList<>();
    ArrayList<SanPhamModel> spGioHang = new ArrayList<>();

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

    public Object[] fillCart(JTable tblProduct, int quantity) {
        // khai báo mảng obj
        Object[] obj = {};
        double total = 0;
        // lấy dữ liệu của dòng được chọn trong bảng sản phẩm
        int index = tblProduct.getSelectedRow();
        SanPhamModel sp = listSanPham.get(index);

        // tạo ArrayList của bảng giỏ hàng
        spGioHang.add(new SanPhamModel(sp.getIndex(), sp.getMaSp(), sp.getTenSp(), sp.getSoLuong(), sp.getGiaBan(), sp.getThanhTien()));
        

        // thêm dữ liệu vào obj để fill vào bảng
        for (SanPhamModel sanPhamModel : spGioHang) {
            obj = new Object[]{sanPhamModel.getIndex(), sanPhamModel.getMaSp(), sanPhamModel.getTenSp(), quantity, sanPhamModel.getGiaBan(), sanPhamModel.getGiaBan() * quantity};
            // tính tổng tiền phải trả 
            total += sanPhamModel.getGiaBan() * quantity;
            sanPhamModel.setThanhTien(total);
        }
        
        return obj;
    }

}
