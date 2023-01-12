package mypack;

public class ChiTietPhieuXuat {
	public int soLuong; // Số lượng
    public String maPX; // Mã Phiếu xuất 
    public String maThietBi; // Mã Thiết bị

    public ChiTietPhieuXuat(int soLuong, String maPX, PhieuXuat px, String maThietBi, ThietBi tb)
    {
        this.soLuong = soLuong;
        this.maPX = maPX;
        this.maThietBi = maThietBi;
        this.tb = tb;
        this.px = px;
    }
    public ChiTietPhieuXuat(ChiTietPhieuXuat ctpx)
    {
        soLuong = ctpx.soLuong;
        maPX = ctpx.maPX;
        maThietBi = ctpx.maThietBi;
        tb = ctpx.tb;
        px = ctpx.px;
    }

    public ThietBi tb;
    public PhieuXuat px;
    
    public int getSoLuong()
	{
		return soLuong;
	}
	public void setSoLuong(int soLuong)
	{
		this.soLuong = soLuong;
	}
	public String getMaPX()
	{
		return maPX;
	}
	public void setMaPN(String maPX)
	{
		this.maPX = maPX;
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
	public PhieuXuat getPx()
	{
		return px;
	}
	public void setPx(PhieuXuat px)
	{
		this.px = px;
	}
}
