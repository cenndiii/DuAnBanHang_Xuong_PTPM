/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Acer
 */
public class BanHangController {

    ArrayList<SanPhamModel> listSanPham = new ArrayList<>();
    ArrayList<SanPhamModel> spGioHang = new ArrayList<>();
    ArrayList<HoaDon> listHD = new ArrayList<>();

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
//        Object[] obj = new Object[]{"Chờ thanh toán", "Hủy", "Chưa xử lý"};
//        listHD.add(new HoaDon(index, "HD1", sdf.format(now), "Kien", "Chờ thanh toán"));
//        listHD.add(new HoaDon(index, "HD2", sdf.format(now), "Giang", "Hủy"));
//        listHD.add(new HoaDon(index, "HD3", sdf.format(now), "Hoan", "Chưa xử lý"));

        return listHD;
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

    public ArrayList<SanPhamModel> addCart(SanPhamModel spm) {
        SanPhamModel spCart = new SanPhamModel();
        for (SanPhamModel sp : listSanPham) {
            if (sp.getMaSp().equalsIgnoreCase(spm.getMaSp())) {
                if (sp.getSoLuong() > 0) {
                    sp.setSoLuong(sp.getSoLuong() - 1);     //sản phầm tìm được sẽ get số lượng gốc để trừ đi giá trị số lượng tìm được
                    spCart = new SanPhamModel(sp.getIndex(), sp.getMaSp(), sp.getMaSp(), 1, sp.getGiaBan(), sp.getGiaBan());
                    boolean check = true;
                    for (SanPhamModel spInCart : spGioHang) {
                        if (spInCart.getMaSp().equals(spCart.getMaSp())) {
                            spInCart.setSoLuong(spInCart.getSoLuong() + 1);
                            spInCart.setThanhTien(spInCart.getSoLuong() * spInCart.getGiaBan());
                            check = false;
                            break;
                        }
                    }

                    if (check) {
                        spGioHang.add(spCart);
                    }
                }else {
                    //NẾU SỐ LƯỢNG HÀNG < 0
                }
            }
        }

        return spGioHang;
    }
    
    
}
