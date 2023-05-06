package Service;

import Repository.NhanVienRepository;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author Hello
 */
public class NhanVienService {
    private NhanVienRepository nhanVienRepo = new NhanVienRepository();
    
    public List<NhanVien> layDanhSachNV(){
        try {
            return nhanVienRepo.layDanhSachNhanVien();
        } catch (Exception e) {
            return null;
        }
    }
}
