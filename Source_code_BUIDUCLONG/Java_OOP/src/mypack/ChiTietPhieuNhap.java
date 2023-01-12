package mypack;

public class ChiTietPhieuNhap {
	 public int soLuong; // Số lượng
     public String maPN;// Mã phiếu nhập
     public String maThietBi;// Mã thiết bị

     public ChiTietPhieuNhap(int soLuong, String maPN, PhieuNhap pn, String maThietBi, ThietBi tb)
     {
         this.soLuong = soLuong;
         this.maPN = maPN;
         this.maThietBi = maThietBi;
         this.tb = tb;
         this.pn = pn;
     }
     public ChiTietPhieuNhap(ChiTietPhieuNhap ctpn)
     {
         soLuong = ctpn.soLuong;
         maPN = ctpn.maPN;
         maThietBi = ctpn.maThietBi;
         tb = ctpn.tb;
         pn = ctpn.pn;
     }
     public ThietBi tb;
     public PhieuNhap pn;
     
     public int getSoLuong()
	 {
		 return soLuong;
	 }
	 public void setSoLuong(int soLuong)
	 {
		 this.soLuong = soLuong;
	 }
	 public String getMaPN()
	 {
		 return maPN;
	 }
	 public void setMaPN(String maPN)
	 {
		 this.maPN = maPN;
	 }
	 public String getMaThietBi()
	 {
		 return maThietBi;
	 }
	 public void setMaThietBi(String maThietBi)
	 {
		 this.maThietBi = maThietBi;
	 }
	 public ThietBi getTb()
	 {
		 return tb;
	 }
	 public void setTb(ThietBi tb)
	 {
		 this.tb = tb;
	 }
	 public PhieuNhap getPn()
	 {
		 return pn;
	 }
	 public void setPn(PhieuNhap pn)
	 {
		 this.pn = pn;
	 }
}
