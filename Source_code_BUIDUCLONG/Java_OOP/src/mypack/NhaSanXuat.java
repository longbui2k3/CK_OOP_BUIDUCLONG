package mypack;

import java.util.List;

public class NhaSanXuat {
	 public String maNSX; // Mã nhà sản xuất
     public String tenNSX; // Tên nhà sản xuất
     public String quocGia; // Quốc gia
     
     public NhaSanXuat(String maNSX, String tenNSX, String quocGia, List<ThietBi> dsThietBi)
     {
         this.maNSX = maNSX;
         this.tenNSX = tenNSX;
         this.quocGia = quocGia;
         this.dsThietBi = dsThietBi;
     }
     public NhaSanXuat(NhaSanXuat nsx)
     {
         maNSX = nsx.maNSX;
         tenNSX = nsx.tenNSX;
         quocGia = nsx.quocGia;
         dsThietBi = nsx.dsThietBi;
     }
     public List<ThietBi> dsThietBi;
     
     public String getMaNSX()
     {
     	return maNSX;
     }
     public void setMaNSX (String maNSX)
     {
     	this.maNSX = maNSX;
     }
     public String getTenNSX()
     {
     	return tenNSX;
     }
     public void setTenNSX (String tenNSX)
     {
     	this.tenNSX = tenNSX;
     }
     public String getQuocGia()
     {
     	return quocGia;
     }
     public void setQuocGia(String quocGia)
     {
     	this.quocGia = quocGia;
     }
     public List<ThietBi> getDsPhieuNhap()
     {
     	return dsThietBi;
     }
     public void setDsPhieuNhap(List<ThietBi> dsThietBi)
     {
     	this.dsThietBi = dsThietBi;
     }
}
