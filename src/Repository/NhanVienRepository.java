package Repository;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author Hello
 */
public class NhanVienRepository {
    private final static List<NhanVien> lstNhanVien = new ArrayList<>();
    
    static{
        lstNhanVien.add(new NhanVien("ad01", "Lê Văn Khánh", 35, "Administrators", "Vip", 17));
        lstNhanVien.add(new NhanVien("nv01", "Phạm Thị Hồng", 19, "Moderators", "Regular", 11));
        lstNhanVien.add(new NhanVien("nv02", "Phạm Quang Thiện", 23, "Operational", "Vip", 7));
        lstNhanVien.add(new NhanVien("nv03", "Lê Thu Hương", 22, "Part-time", "Classic", 1));
        lstNhanVien.add(new NhanVien("nv04", "Nguyễn Văn Tuấn", 26, "Regular", "Regular", 5));
        lstNhanVien.add(new NhanVien("nv05", "Phạm Văn Đại", 30, "Part-time", "Vip", 2));
    }
    
    public List<NhanVien> layDanhSachNhanVien(){
        return lstNhanVien;
    }
}
