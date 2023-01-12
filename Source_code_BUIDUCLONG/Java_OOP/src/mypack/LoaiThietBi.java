package mypack;

import java.util.List;

public class LoaiThietBi {
	public String maLoai; // Mã loại
    public String theLoai; // Thể loại
    public String donViTinh; // Đơn vị tính
    public String ghiChu; // Ghi chú

    public LoaiThietBi(String maLoai, String theLoai, String donViTinh, String ghiChu, List<ThietBi> dsThietBi)
    {
        this.maLoai = maLoai;
        this.theLoai = theLoai;
        this.donViTinh = donViTinh;
        this.ghiChu = ghiChu;
        this.dsThietBi = dsThietBi;
    }
    public LoaiThietBi(LoaiThietBi ltb)
    {
        maLoai = ltb.maLoai;
        theLoai = ltb.theLoai;
        donViTinh = ltb.donViTinh;
        ghiChu = ltb.ghiChu;
        dsThietBi = ltb.dsThietBi;
    }
    public List<ThietBi> dsThietBi;
    
    public String getMaLoai()
    {
    	return maLoai;
    }
    public void setMaLoai (String maLoai)
    {
    	this.maLoai = maLoai;
    }
    public String getTheLoai()
    {
    	return theLoai;
    }
    public void setTheLoai (String theLoai)
    {
    	this.theLoai = theLoai;
    }
    public String getDonViTinh()
    {
    	return donViTinh;
    }
    public void setDonViTinh(String donViTinh)
    {
    	this.donViTinh = donViTinh;
    }
    public String getGhiChu()
    {
    	return ghiChu;
    }
    public void setGhiChu(String ghiChu)
    {
    	this.ghiChu = ghiChu;
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
