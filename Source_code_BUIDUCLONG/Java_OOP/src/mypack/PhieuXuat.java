package mypack;

import java.util.List;

public class PhieuXuat {
	public String maPX; // Mã phiếu xuất
    public String maNV; // Mã nhân viên
    public String maKhachHang; // Mã khách hàng
    public String ngayXuat; // Ngày xuất

    public PhieuXuat(String maPX, String ngayXuat, String maNV, NhanVien nv, String maKhachHang, KhachHang kh, List<ThietBi> dsThietBi)
    {
        this.maPX = maPX;
        this.maNV = maNV;
        this.maKhachHang = maKhachHang;
        this.ngayXuat = ngayXuat;
        this.kh = kh;
        this.nv = nv;
        this.dsThietBi = dsThietBi;
    }
    public PhieuXuat(PhieuXuat px)
    {
        maPX = px.maPX;
        maNV = px.maNV;
        maKhachHang = px.maKhachHang;
        ngayXuat = px.ngayXuat;
        kh = px.kh;
        nv = px.nv;
        dsThietBi = px.dsThietBi;
    }
    public KhachHang kh;
    public NhanVien nv;
    public List<ThietBi> dsThietBi;
    
    public String getMaPX()
    {
    	return maPX;
    }
    public void setMaPX (String maPX)
    {
    	this.maPX = maPX;
    }
    public String getMaNV()
    {
    	return maNV;
    }
    public void setMaNV (String maNV)
    {
    	this.maNV = maNV;
    }
    public String getMaKhachHang()
    {
    	return maKhachHang;
    }
    public void setMaKhachHang(String maKhachHang)
    {
    	this.maKhachHang = maKhachHang;
    }
    public String getNgayXuat()
    {
    	return ngayXuat;
    }
    public void setNgayXuat(String ngayXuat)
    {
    	this.ngayXuat = ngayXuat;
    }
    public List<ThietBi> getDsThietBi()
    {
    	return dsThietBi;
    }
    public void setDsThietBi(List<ThietBi> dsThietBi)
    {
    	this.dsThietBi = dsThietBi;
    }
    public KhachHang getKhachHang()
    {
    	return kh;
    }
    public void setKhachHang(KhachHang kh)
    {
    	this.kh = kh;
    }
    public NhanVien getNhanVien()
    {
    	return nv;
    }
    public void setNhanVien(NhanVien nv)
    {
    	this.nv = nv;
    }
}
