package mypack;

import java.util.List;


public class NhanVien {
	public static class HoTen
	{
	    public String hoDem;
	    public String ten;
	    public HoTen (String hoDem, String ten)
	    {
	        this.hoDem = hoDem;
	        this.ten = ten;
	    }
	    public HoTen (HoTen ht)
	    {
	        hoDem = ht.hoDem;
	        ten = ht.ten;
	    }
	    public String getHoDem()
	    {
	    	return hoDem;
	    }
	    public void setHoDem(String hoDem)
	    {
	    	this.hoDem = hoDem;
	    }
	    public String getTen()
	    {
	    	return ten;
	    }
	    public void setTen(String ten)
	    {
	    	this.ten = ten;
	    }
	}
	 public String maNV; // Mã nhân viên
     public HoTen hoTen; // Họ và tên
     public String ngaySinh; // Ngày sinh
     public String SDT; // Số điện thoại

     public NhanVien(String maNV, HoTen hoTen, String ngaySinh, String SDT, List<PhieuNhap> dsPhieuNhap, List<PhieuXuat> dsPhieuXuat)
     {
         this.maNV = maNV;
         this.hoTen = hoTen;
         this.ngaySinh = ngaySinh;
         this.SDT = SDT;
         this.dsPhieuNhap = dsPhieuNhap;
         this.dsPhieuXuat = dsPhieuXuat;
     }

     public NhanVien(NhanVien nv)
     {
         maNV = nv.maNV;
         hoTen = nv.hoTen;
         ngaySinh = nv.ngaySinh;
         SDT = nv.SDT;
         dsPhieuNhap = nv.dsPhieuNhap;
         dsPhieuXuat = nv.dsPhieuXuat;
     }
     public List<PhieuNhap> dsPhieuNhap;
     public List<PhieuXuat> dsPhieuXuat;
     
     public String getMaNV()
     {
     	return maNV;
     }
     public void setMaNV (String maNV)
     {
     	this.maNV = maNV;
     }
     public HoTen getHoTen()
     {
     	return hoTen;
     }
     public void setHoTen (HoTen hoTen)
     {
     	this.hoTen = hoTen;
     }
     public String getNgaySinh()
     {
     	return ngaySinh;
     }
     public void setNgaySinh(String ngaySinh)
     {
     	this.ngaySinh = ngaySinh;
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
     public List<PhieuXuat> getDsPhieuXuat()
     {
     	return dsPhieuXuat;
     }
     public void setDsPhieuXuat(List<PhieuXuat> dsPhieuXuat)
     {
     	this.dsPhieuXuat = dsPhieuXuat;
     }
}
