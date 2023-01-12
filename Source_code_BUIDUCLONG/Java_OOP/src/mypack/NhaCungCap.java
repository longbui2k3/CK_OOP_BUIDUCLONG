package mypack;

import java.util.List;

public class NhaCungCap {
	public String maNhaCungCap; // Mã nhà cung cấp
    public String tenNhaCungCap; // Tên nhà cung cấp
    public String diaChi; // Địa chỉ
    public String SDT; // Số điện thoại

    public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String diaChi, String SDT, List<PhieuNhap> dsPhieuNhap, List<ThietBi> dsThietBi)
    {
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.dsPhieuNhap = dsPhieuNhap;
        this.dsThietBi = dsThietBi;
    }
    public NhaCungCap(NhaCungCap ncc)
    {
        maNhaCungCap = ncc.maNhaCungCap;
        tenNhaCungCap = ncc.tenNhaCungCap;
        diaChi = ncc.diaChi;
        SDT = ncc.SDT;
        dsPhieuNhap = ncc.dsPhieuNhap;
        dsThietBi = ncc.dsThietBi;
    }
    public List<PhieuNhap> dsPhieuNhap;
    public List<ThietBi> dsThietBi;
    
    public String getMaNhaCungCap()
    {
    	return maNhaCungCap;
    }
    public void setMaNhaCungCap (String maNhaCungCap)
    {
    	this.maNhaCungCap = maNhaCungCap;
    }
    public String getTenNhaCungCap()
    {
    	return tenNhaCungCap;
    }
    public void setTenNhaCungCap (String tenNhaCungCap)
    {
    	this.tenNhaCungCap = tenNhaCungCap;
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
    public List<PhieuNhap> getDsPhieuNhap()
    {
    	return dsPhieuNhap;
    }
    public void setDsPhieuNhap(List<PhieuNhap> dsPhieuNhap)
    {
    	this.dsPhieuNhap = dsPhieuNhap;
    }
    public List<ThietBi> getDsThietBi()
    {
    	return dsThietBi;
    }
    public void setDsThietBi(List<ThietBi> dsThietBi)
    {
    	this.dsThietBi = dsThietBi;
    }
}
