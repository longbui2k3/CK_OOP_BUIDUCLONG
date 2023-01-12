package mypack;
import java.util.List;

public class KhachHang {
	public String maKH; // Mã khách hàng
    public String tenKH; // Tên khách hàng
    public String diaChi; // Địa chỉ
    public String SDT; // Số điện thoại

    public KhachHang(String maKH, String tenKH, String diaChi, String SDT, List<PhieuXuat> dsPhieuXuat)
    {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.dsPhieuXuat = dsPhieuXuat;
    }
    public KhachHang(KhachHang kh)
    {
        maKH = kh.maKH;
        tenKH = kh.tenKH;
        diaChi = kh.diaChi;
        SDT = kh.SDT;
        dsPhieuXuat = kh.dsPhieuXuat;
    }
    public List<PhieuXuat> dsPhieuXuat;
    
    public String getMaKH()
    {
    	return maKH;
    }
    public void setMaKH(String maKH)
    {
    	this.maKH = maKH;
    }
    public String getTenKH()
    {
    	return tenKH;
    }
    public void setTenKH(String tenKH)
    {
    	this.tenKH = tenKH;
    }
    public String getDiaChi()
    {
    	return diaChi;
    }
    public void setDiaChi(String diaChi)
    {
    	this.diaChi = diaChi;
    }
    public String getSDT()
    {
    	return SDT;
    }
    public void setSDT(String SDT)
    {
    	this.SDT = SDT;
    }
    public List<PhieuXuat> getDsPhieuXuat()
    {
    	return dsPhieuXuat;
    }
    public void setDsPhieuXuat(List<PhieuXuat> dsPhieuXuat)
    {
    	 this.dsPhieuXuat = dsPhieuXuat;
    }
}
