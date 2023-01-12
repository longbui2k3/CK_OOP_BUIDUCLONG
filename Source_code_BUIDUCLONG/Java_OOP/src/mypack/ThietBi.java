package mypack;

import java.util.List;

public class ThietBi {
	public String maThietBi; // Mã thiết bị
    public String tenThietBi; // Tên thiết bị
    public String maNSX; // Mã nhà sản xuất
    public int giaThanh; // Giá thành
    public String thongSoKT; // Thông số kĩ thuật
    public String maLoai;  // Mã loại
   
    public String maNhaCungCap; // Mã nhà cung cấp

    public ThietBi(String maThietBi, String tenThietBi, String thongSoKT, int giaThanh, String maNhaCungCap, NhaCungCap ncc, String maLoai, LoaiThietBi ltb, 
        String maNSX, NhaSanXuat nsx, List<PhieuNhap> dsPhieuNhap, List<PhieuXuat> dsPhieuXuat)
    {
        this.maThietBi = maThietBi;
        this.tenThietBi = tenThietBi;
        this.maNSX = maNSX;
        this.thongSoKT = thongSoKT;
        this.maLoai = maLoai;
        this.giaThanh = giaThanh;
        this.maNhaCungCap = maNhaCungCap;
        this.ncc = ncc;
        this.ltb = ltb;
        this.nsx = nsx;
        this.dsPhieuNhap = dsPhieuNhap;
        this.dsPhieuXuat = dsPhieuXuat;
    }

    public ThietBi(ThietBi tb)
    {
        maThietBi = tb.maThietBi;
        tenThietBi = tb.tenThietBi;
        maNSX = tb.maNSX;
        thongSoKT = tb.thongSoKT;
        maLoai = tb.maLoai;
        giaThanh = tb.giaThanh;
        maNhaCungCap = tb.maNhaCungCap;
        ncc = tb.ncc;
        ltb = tb.ltb;
        nsx = tb.nsx;
        dsPhieuNhap = tb.dsPhieuNhap;
        dsPhieuXuat = tb.dsPhieuXuat;
    }
    public NhaCungCap ncc;
    public LoaiThietBi ltb;
    public NhaSanXuat nsx;
    public List<PhieuNhap> dsPhieuNhap;
    public List<PhieuXuat> dsPhieuXuat;
    
    public String getMaThietBi()
    {
    	return maThietBi;
    }
    public void setMaThietBi (String maThietBi)
    {
    	this.maThietBi = maThietBi;
    }
    public String getTenThietBi()
    {
    	return tenThietBi;
    }
    public void setTenThietBi (String tenThietBi)
    {
    	this.tenThietBi = tenThietBi;
    }
    public String getMaNSX()
    {
    	return maNSX;
    }
    public void setMaNSX(String maNSX)
    {
    	this.maNSX = maNSX;
    }
    public String getThongSoKT()
    {
    	return thongSoKT;
    }
    public void setThongSoKT(String thongSoKT)
    {
    	this.thongSoKT = thongSoKT;
    }
    public String getMaLoai()
    {
    	return maLoai;
    }
    public void setMaLoai(String maLoai)
    {
    	this.maLoai = maLoai;
    }
    public int getGiaThanh()
    {
    	return giaThanh;
    }
    public void setGiaThanh(int giaThanh)
    {
    	this.giaThanh = giaThanh;
    }
    public String getMaNhaCungCap()
    {
    	return maNhaCungCap;
    }
    public void setMaNhaCungCap(String maNhaCungCap)
    {
    	this.maNhaCungCap = maNhaCungCap;
    }
    public NhaCungCap getNhaCungCap()
    {
    	return ncc;
    }
    public void setNhaCungCap(NhaCungCap ncc)
    {
    	this.ncc = ncc;
    }
    public LoaiThietBi getLoaiThietBi()
    {
    	return ltb;
    }
    public void setLoaiThietBi(LoaiThietBi ltb)
    {
    	this.ltb = ltb;
    }
    public NhaSanXuat getNhaSanXuat()
    {
    	return nsx;
    }
    public void setNhaSanXuat(NhaSanXuat nsx)
    {
    	this.nsx = nsx;
    }
    public List<PhieuNhap> getDsPhieuNhap()
    {
    	return dsPhieuNhap;
    }
    public void setDsPhieuNhap(List<PhieuNhap> dsPhieuNhap)
    {
    	this.dsPhieuNhap = dsPhieuNhap;
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
