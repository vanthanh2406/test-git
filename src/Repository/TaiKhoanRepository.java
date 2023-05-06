package Repository;

import java.util.ArrayList;
import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author Hello
 */
public class TaiKhoanRepository {
    private static List<TaiKhoan> lstTaiKhoan = new ArrayList<>();
    
    static {
        lstTaiKhoan.add(new TaiKhoan("admin01", "88888888", "Quản lý"));
        lstTaiKhoan.add(new TaiKhoan("admin02", "88888888", "Quản lý"));
        lstTaiKhoan.add(new TaiKhoan("nhanvien01", "88888888", "Nhân viên"));
        lstTaiKhoan.add(new TaiKhoan("nhanvien02", "88888888", "Nhân viên"));
        lstTaiKhoan.add(new TaiKhoan("thuviec01", "88888888", "Nhân viên thử việc"));
        lstTaiKhoan.add(new TaiKhoan("thuviec02", "88888888", "Nhân viên thử việc"));
    }
    
    public List<TaiKhoan> danhSachTaiKhoan(){
        return lstTaiKhoan;
    }
    
    public TaiKhoan xacThucTaiKhoan(String ten){
        TaiKhoan taiKhoanCanTim = null;
        
        for (TaiKhoan taiKhoan : lstTaiKhoan) {
            if(taiKhoan.getTenTaiKhoan().equals(ten)){
                taiKhoanCanTim = taiKhoan;
                break;
            }
        }
        return taiKhoanCanTim;
    }
}
