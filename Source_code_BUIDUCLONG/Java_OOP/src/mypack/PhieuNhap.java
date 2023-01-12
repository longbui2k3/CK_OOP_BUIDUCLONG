package mypack;

import java.util.List;

public class PhieuNhap {
	public String maPN; // Mã phiếu nhập
    public String maNV; // Mã nhân viên
    public String maNhaCungCap; // Mã nhà cung cấp 
    public String ngayNhap; // Ngày nhập

    public PhieuNhap(String maPN, String ngayNhap, String maNV, NhanVien nv, String maNhaCungCap, NhaCungCap ncc, List<ThietBi> dsThietBi)
    {
        this.maPN = maPN;
        this.maNV = maNV;
        this.maNhaCungCap = maNhaCungCap;
        this.ngayNhap = ngayNhap;
        this.dsThietBi = dsThietBi;
        this.ncc = ncc;
        this.nv = nv;
    }
    public PhieuNhap(PhieuNhap pn)
    {
        maPN = pn.maPN;
        maNV = pn.maNV;
        maNhaCungCap = pn.maNhaCungCap;
        ngayNhap = pn.ngayNhap;
        dsThietBi = pn.dsThietBi;
        ncc = pn.ncc;
        nv = pn.nv;
        
    }
    public List<ThietBi> dsThietBi;
    public NhaCungCap ncc;
    public NhanVien nv;
    
    public String getMaPN()
    {
    	return maPN;
    }
    public void setMaPN (String maPN)
    {
    	this.maPN = maPN;
    }
    public String getMaNV()
    {
    	return maNV;
    }
    public void setMaNV (String maNV)
    {
    	this.maNV = maNV;
    }
    public String getMaNhaCungCap()
    {
    	return maNhaCungCap;
    }
    public void setMaNhaCungCap(String maNhaCungCap)
    {
    	this.maNhaCungCap = maNhaCungCap;
    }
    public String getNgayNhap()
    {
    	return ngayNhap;
    }
    public void setNgayNhap(String ngayNhap)
    {
    	this.ngayNhap = ngayNhap;
    }
    public List<ThietBi> getDsThietBi()
    {
    	return dsThietBi;
    }
    public void setDsThietBi(List<ThietBi> dsThietBi)
    {
    	this.dsThietBi = dsThietBi;
    }
    public NhaCungCap getNhaCungCap()
    {
    	return ncc;
    }
    public void setNhaCungCap(NhaCungCap ncc)
    {
    	this.ncc = ncc;
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
