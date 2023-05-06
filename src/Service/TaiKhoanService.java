package Service;

import Repository.TaiKhoanRepository;
import model.TaiKhoan;

/**
 *
 * @author Hello
 */
public class TaiKhoanService {
    private TaiKhoanRepository taiKhoanRepo = new TaiKhoanRepository();
    
    public Integer xacThuctaiKhoan(TaiKhoan taiKhoan){
        TaiKhoan taiKhoanCanTim = taiKhoanRepo.xacThucTaiKhoan(taiKhoan.getTenTaiKhoan());
        
        if(taiKhoanCanTim != null){
            String matKhau = taiKhoan.getMatKhau();
            if(taiKhoanCanTim.getMatKhau().equals(matKhau)){
                return 1; //Tìm thấy
            }else{
                return -1;  //Sai mật khẩu
            }
        }
        return 0;  //Ko tìm thấy tên tài khoản
    }
    
    
}
