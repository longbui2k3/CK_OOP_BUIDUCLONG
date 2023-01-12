package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Program 
{
	public static List<ThietBi> TB = new ArrayList<ThietBi>();
	public static List<NhaSanXuat> NSX = new ArrayList<NhaSanXuat>();
	public static List<NhaCungCap> NCC = new ArrayList<NhaCungCap>();
	public static List<LoaiThietBi> LTB = new ArrayList<LoaiThietBi>();
	public static List<KhachHang> KH = new ArrayList<KhachHang>();
	public static List<NhanVien> NV = new ArrayList<NhanVien>();
	public static List<PhieuNhap> PN = new ArrayList<PhieuNhap>();
	public static List<ChiTietPhieuNhap> CTPN = new ArrayList<ChiTietPhieuNhap>();
	public static List<PhieuXuat> PX = new ArrayList<PhieuXuat>();
	public static List<ChiTietPhieuXuat> CTPX = new ArrayList<ChiTietPhieuXuat>();
	
	public static void taoLoaiThietBi()
    {
		//LoaiThietBi(string maLoai, string theLoai, string donViTinh, string ghiChu, ICollection<ThietBi> dsThietBi)
         LTB.add(new LoaiThietBi("CPU0001", "CPU", "Hộp", "Còn hàng", new ArrayList<ThietBi>()));
         LTB.add(new LoaiThietBi("RAM0002", "RAM", "Cái", "Còn hàng", new ArrayList<ThietBi>()));
         LTB.add(new LoaiThietBi("MAN0003", "Mainboard", "Cái", "Sắp hết hàng", new ArrayList<ThietBi>()));
         LTB.add(new LoaiThietBi("HDD0004", "Ổ Cứng", "Cái", "Còn hàng", new ArrayList<ThietBi>()));
         LTB.add(new LoaiThietBi("CAR0005", "Card Màn Hình", "Hộp", "Sắp hết hàng", new ArrayList<ThietBi>()));
         LTB.add(new LoaiThietBi("POW0006", "Nguồn Máy Tính", "Hộp", "Còn hàng", new ArrayList<ThietBi>()));
         LTB.add(new LoaiThietBi("COO0007", "Quạt Tản Nhiệt", "Hộp", "Còn hàng", new ArrayList<ThietBi>()));
         LTB.add(new LoaiThietBi("CAS0008", "Case Máy Tính", "Hộp", "Còn hàng", new ArrayList<ThietBi>()));
         LTB.add(new LoaiThietBi("MON0009", "Màn Hình", "Cái", "Còn hàng", new ArrayList<ThietBi>()));
    }
	public static void taoNhaSanXuat()
    {
		//NhaSanXuat(string maNSX, string tenNSX, string quocGia, ICollection <ThietBi> dsThietBi)
         NSX.add(new NhaSanXuat("NSX0001", "Intel", "Mỹ", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0002", "AMD", "Mỹ", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0003", "Kingston", "Mỹ", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0004", "G.Skill", "Đài Loan", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0005", "Gigabyte", "Đài Loan", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0006", "Asus", "Đài Loan", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0007", "Samsung", "Hàn Quốc", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0008", "MSI", "Đài Loan", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0009", "DeepCool", "Trung Quốc", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0010", "Xigmatek", "Trung Quốc", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0011", "Dell", "Mỹ", new ArrayList<ThietBi>()));
         NSX.add(new NhaSanXuat("NSX0012", "LG", "Hàn Quốc", new ArrayList<ThietBi>()));
    }
	public static void taoNhaCungCap()
    {
		 //NhaCungCap(string maNhaCungCap, string tenNhaCungCap, string diaChi, string SDT, ICollection<PhieuNhap> dsPhieuNhap, ICollection<ThietBi> dsThietBi)
        NCC.add(new NhaCungCap("NCC0001", "HANOICOMPUTER", "43 Thái Hà, Đống Đa, Hà Nội", "02435380088", new ArrayList<PhieuNhap>(), new ArrayList<ThietBi>()));
        NCC.add(new NhaCungCap("NCC0002", "An Phát Computer", "Số 19 Ngõ 178 Thái Hà – Đống Đa – Hà Nội", "0971851111", new ArrayList<PhieuNhap>(), new ArrayList<ThietBi>()));
        NCC.add(new NhaCungCap("NCC0003", "Ngọc Tuyền Computer", "Số 131 Vũ Tông Phan, Khương Trung, Thanh Xuân, Hà Nội", "0971237999", new ArrayList<PhieuNhap>(), new ArrayList<ThietBi>()));
        NCC.add(new NhaCungCap("NCC0004", "Trung tâm Laptopcentre", "Số 23 ngõ 131, Phố Thái Hà, Quận Đống Đa, TP Hà Nội", "02437478366", new ArrayList<PhieuNhap>(), new ArrayList<ThietBi>()));
        NCC.add(new NhaCungCap("NCC0005", "Công Ty TNHH Máy Tính Hà Thành", "182 Lê Thanh Nghị, Đồng Tâm, Hai Bà Trưng, Hà Nội", "02473031661", new ArrayList<PhieuNhap>(), new ArrayList<ThietBi>()));
    }
    public static void taoKhachHang()
    {
    	//KhachHang(string maKH, string tenKH, string diaChi, string SDT, ICollection<PhieuXuat> dsPhieuXuat)
        KH.add(new KhachHang("KH0001", "Trần Đào Anh Trung", "Lâm Đồng", "0459225577", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0002", "Bùi Đức Long", "TPHCM", "0777981051", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0003", "Đỗ Hoàng Đăng Khanh", "Bến Tre", "0243575685", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0004", "Hoàng Thị Lan", "Thanh Hoá", "0935646677", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0005", "Vũ Quốc Hoàng Anh", "Bắc Ninh", "0875562244", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0006", "Trần Ngọc An", "Bình Thuận", "0558367798", new ArrayList<PhieuXuat>()));

        KH.add(new KhachHang("KH0007", "Nguyễn Thị Vân Anh", "TPHCM", "0674354365", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0008", "Nguyễn Văn Thể", "Bình Dương", "0234546677", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0009", "Vũ Văn B", "Đồng Nai", "0246676888", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0010", "Ngô Ngọc Huy", "Vũng Tàu", "0835467512", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0011", "Phan Đỗ Ngọc Anh", "Cà Mau", "0456777245", new ArrayList<PhieuXuat>()));
        KH.add(new KhachHang("KH0012", "Bùi Văn A", "Hà Nội", "0345768688", new ArrayList<PhieuXuat>()));
    }
    public static void taoNhanVien()
    {
    	// NhanVien(string maNV, HoTen hoTen, string ngaySinh, string SDT, ICollection<PhieuNhap> dsPhieuNhap, ICollection<PhieuXuat> dsPhieuXuat)
        NV.add(new NhanVien("NV0001", new NhanVien.HoTen("Đỗ Thị Hoàng", "Diệu"), "04/05/1997", "0932196235", new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        NV.add(new NhanVien("NV0002", new NhanVien.HoTen("Hồ Văn", "Hiếu"), "09/11/1993", "0561257677", new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        NV.add(new NhanVien("NV0003", new NhanVien.HoTen("Cao Quang", "Anh"), "20/05/1999", "0782245651", new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        NV.add(new NhanVien("NV0004", new NhanVien.HoTen("Bùi Hoàng Việt", "Trung"), "12/04/1995", "0395657575", new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        NV.add(new NhanVien("NV0005", new NhanVien.HoTen("Nguyễn Hoàng", "Hải"), "25/03/2000", "0845225657", new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        NV.add(new NhanVien("NV0006", new NhanVien.HoTen("Trần Thị Thanh", "Hoa"), "14/06/1996", "0561243577", new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        NV.add(new NhanVien("NV0007", new NhanVien.HoTen("Vũ Văn", "An"), "20/08/1998", "0897584554", new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
    }
    public static void taoThietBi()
    {
    	 //ThietBi(string maThietBi, string tenThietBi, string thongSoKT, int giaThanh, string maNhaCungCap, NhaCungCap ncc, string maLoai, LoaiThietBi ltb, string maNSX, NhaSanXuat nsx, ICollection <PhieuNhap> dsPhieuNhap, ICollection <PhieuXuat> dsPhieuXuat)
        TB.add(new ThietBi("TB00001", "CPU Intel Core I5-12400F", "6 nhân 12 luồng", 5400000, NCC.get(3).maNhaCungCap, NCC.get(3), LTB.get(0).maLoai, LTB.get(0), NSX.get(0).maNSX, NSX.get(0), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00002", "CPU Intel Core I3-12100", "4 nhân 8 luồng", 3750000, NCC.get(2).maNhaCungCap, NCC.get(2), LTB.get(0).maLoai, LTB.get(0), NSX.get(0).maNSX, NSX.get(0), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00003", "AMD Ryzen 5 5600X", "6 nhân 12 luồng", 4490000, NCC.get(2).maNhaCungCap, NCC.get(2), LTB.get(0).maLoai, LTB.get(0), NSX.get(1).maNSX, NSX.get(1), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00004", "Kingston Fury Beast KF432C16BB", "8GB 3200Mhz", 690000, NCC.get(1).maNhaCungCap, NCC.get(1), LTB.get(1).maLoai, LTB.get(1), NSX.get(2).maNSX, NSX.get(2), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00005", "G.Skill Trident Z RGB", "16GB 3600MHz", 2090000, NCC.get(0).maNhaCungCap, NCC.get(0), LTB.get(1).maLoai, LTB.get(1), NSX.get(3).maNSX, NSX.get(3), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00006", "G.SKILL Aegis", "8GB 3200MHz DDR4", 890000, NCC.get(0).maNhaCungCap, NCC.get(0), LTB.get(1).maLoai, LTB.get(1), NSX.get(3).maNSX, NSX.get(3), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00007", "Mainboard Gigabyte B560M Aorus Pro", "4 khe RAM DDR4", 2590000, NCC.get(4).maNhaCungCap, NCC.get(4), LTB.get(2).maLoai, LTB.get(2), NSX.get(4).maNSX, NSX.get(4), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00008", "Mainboard Asus TUF Gaming B660M Plus D4", "4 khe RAM 4DDR4", 3990000, NCC.get(3).maNhaCungCap, NCC.get(3), LTB.get(2).maLoai, LTB.get(2), NSX.get(5).maNSX, NSX.get(5), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00009", "Mainboard Asus ROG STRIX Z690 D4", "4 khe RAM DDR4", 8990000, NCC.get(1).maNhaCungCap, NCC.get(1), LTB.get(2).maLoai, LTB.get(2), NSX.get(5).maNSX, NSX.get(5), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00010", "Ổ cứng SSD Kingston SA400S37", "240GB 2.5' SATA", 750000, NCC.get(2).maNhaCungCap, NCC.get(2), LTB.get(3).maLoai, LTB.get(3), NSX.get(2).maNSX, NSX.get(2), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00011", "Ổ cứng Gigabyte SSD", "120GB Sata III", 390000, NCC.get(4).maNhaCungCap, NCC.get(4), LTB.get(3).maLoai, LTB.get(3), NSX.get(4).maNSX, NSX.get(4), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00012", "Ổ cứng SSD Samsung 980", "M.2 PCIe NVMe 250GB", 1200000, NCC.get(3).maNhaCungCap, NCC.get(3), LTB.get(3).maLoai, LTB.get(3), NSX.get(6).maNSX, NSX.get(6), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00013", "Card màn hình Gigabyte Geforce RTX 3060 Gaming OC", "12GB GDDR6 192bit", 9190000, NCC.get(1).maNhaCungCap, NCC.get(1), LTB.get(4).maLoai, LTB.get(4), NSX.get(4).maNSX, NSX.get(4), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00014", "VGA MSI GTX 1050 Ti 4GT OCV1", "4GB GDDR5 128 bit", 3850000, NCC.get(0).maNhaCungCap, NCC.get(0), LTB.get(4).maLoai, LTB.get(4), NSX.get(7).maNSX, NSX.get(7), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00015", "Nguồn máy tính DeepCool DN500", "500W Hiệu suất 85%", 760000, NCC.get(2).maNhaCungCap, NCC.get(2), LTB.get(5).maLoai, LTB.get(5), NSX.get(8).maNSX, NSX.get(8), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00016", "Nguồn máy tính Gigabyte P650B", "650W Hiệu suất 85%", 1200000, NCC.get(4).maNhaCungCap, NCC.get(4), LTB.get(5).maLoai, LTB.get(5), NSX.get(4).maNSX, NSX.get(4), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00017", "Tản nhiệt DeepCool AG400 ARGB", "500 ~ 2000 vòng / phút ± 10%", 580000, NCC.get(1).maNhaCungCap, NCC.get(1), LTB.get(6).maLoai, LTB.get(6), NSX.get(8).maNSX, NSX.get(8), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00018", "Tản nhiệt Xigmatek Air Killer S", "1800 RPM +/- 10%", 1500000, NCC.get(3).maNhaCungCap, NCC.get(3), LTB.get(6).maLoai, LTB.get(6), NSX.get(9).maNSX, NSX.get(9), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00019", "Case máy tính DeepCool Matrexx 30", "Mini Tower", 490000, NCC.get(0).maNhaCungCap, NCC.get(0), LTB.get(7).maLoai, LTB.get(7), NSX.get(8).maNSX, NSX.get(8), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00020", "Case máy tính Xigmatek Gaming X 3FX", "Mid Tower", 950000, NCC.get(2).maNhaCungCap, NCC.get(2), LTB.get(7).maLoai, LTB.get(7), NSX.get(9).maNSX, NSX.get(9), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00021", "Màn hình Asus TUF Gaming VG247Q1A", "24 inch 165Hz Full HD", 3890000, NCC.get(4).maNhaCungCap, NCC.get(4), LTB.get(8).maLoai, LTB.get(8), NSX.get(5).maNSX, NSX.get(5), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00022", "Màn hình Gaming LG Ultragear 24GN650-B", "23.8 inch 144Hz Full HD", 4450000, NCC.get(2).maNhaCungCap, NCC.get(2), LTB.get(8).maLoai, LTB.get(8), NSX.get(11).maNSX, NSX.get(11), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00023", "Màn hình Samsung Gaming Odyssey G5 LC34G55TWWEXXV", "34 inch 165Hz 4K", 10290000, NCC.get(3).maNhaCungCap, NCC.get(3), LTB.get(8).maLoai, LTB.get(8), NSX.get(6).maNSX, NSX.get(6), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00024", "Màn hình Dell UltraSharp", "23.8 inch 60Hz Full HD", 6590000, NCC.get(1).maNhaCungCap, NCC.get(1), LTB.get(8).maLoai, LTB.get(8), NSX.get(10).maNSX, NSX.get(10), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));
        TB.add(new ThietBi("TB00025", "Màn hình Dell S2421HN", "24 inch 75Hz FullHD", 4590000, NCC.get(4).maNhaCungCap, NCC.get(4), LTB.get(8).maLoai, LTB.get(8), NSX.get(10).maNSX, NSX.get(10), new ArrayList<PhieuNhap>(), new ArrayList<PhieuXuat>()));

        // Liên kết nhà SX với thiết bị (1-n)
        NSX.get(0).dsThietBi.add(TB.get(0));
        NSX.get(0).dsThietBi.add(TB.get(1));
        NSX.get(1).dsThietBi.add(TB.get(2));
        NSX.get(2).dsThietBi.add(TB.get(3));
        NSX.get(2).dsThietBi.add(TB.get(9));
        NSX.get(3).dsThietBi.add(TB.get(4));
        NSX.get(3).dsThietBi.add(TB.get(5));
        NSX.get(4).dsThietBi.add(TB.get(6));
        NSX.get(4).dsThietBi.add(TB.get(10));
        NSX.get(4).dsThietBi.add(TB.get(12));
        NSX.get(4).dsThietBi.add(TB.get(15));
        NSX.get(5).dsThietBi.add(TB.get(7));
        NSX.get(5).dsThietBi.add(TB.get(8));
        NSX.get(5).dsThietBi.add(TB.get(20));
        NSX.get(6).dsThietBi.add(TB.get(11));
        NSX.get(6).dsThietBi.add(TB.get(22));
        NSX.get(7).dsThietBi.add(TB.get(13));
        NSX.get(8).dsThietBi.add(TB.get(14));
        NSX.get(8).dsThietBi.add(TB.get(16));
        NSX.get(8).dsThietBi.add(TB.get(18));
        NSX.get(9).dsThietBi.add(TB.get(17));
        NSX.get(9).dsThietBi.add(TB.get(19));
        NSX.get(10).dsThietBi.add(TB.get(23));
        NSX.get(10).dsThietBi.add(TB.get(24));
        NSX.get(11).dsThietBi.add(TB.get(21));
        
        // Liên kết loại TB với thiết bị (1-n)
        LTB.get(0).dsThietBi.add(TB.get(0));
        LTB.get(0).dsThietBi.add(TB.get(1));
        LTB.get(0).dsThietBi.add(TB.get(2));
        LTB.get(1).dsThietBi.add(TB.get(3));
        LTB.get(1).dsThietBi.add(TB.get(4));
        LTB.get(1).dsThietBi.add(TB.get(5));
        LTB.get(2).dsThietBi.add(TB.get(6));
        LTB.get(2).dsThietBi.add(TB.get(7));
        LTB.get(2).dsThietBi.add(TB.get(8));
        LTB.get(3).dsThietBi.add(TB.get(9));
        LTB.get(3).dsThietBi.add(TB.get(10));
        LTB.get(3).dsThietBi.add(TB.get(11));
        LTB.get(4).dsThietBi.add(TB.get(12));
        LTB.get(4).dsThietBi.add(TB.get(13));
        LTB.get(5).dsThietBi.add(TB.get(14));
        LTB.get(5).dsThietBi.add(TB.get(15));
        LTB.get(6).dsThietBi.add(TB.get(16));
        LTB.get(6).dsThietBi.add(TB.get(17));
        LTB.get(7).dsThietBi.add(TB.get(18));
        LTB.get(7).dsThietBi.add(TB.get(19));
        LTB.get(8).dsThietBi.add(TB.get(20));
        LTB.get(8).dsThietBi.add(TB.get(21));
        LTB.get(8).dsThietBi.add(TB.get(22));
        LTB.get(8).dsThietBi.add(TB.get(23));
        LTB.get(8).dsThietBi.add(TB.get(24));

        // Liên kết nhà cung cấp với thiết bị (1 - n)
        NCC.get(0).dsThietBi.add(TB.get(4));
        NCC.get(0).dsThietBi.add(TB.get(5));
        NCC.get(0).dsThietBi.add(TB.get(13));
        NCC.get(0).dsThietBi.add(TB.get(18));
        NCC.get(1).dsThietBi.add(TB.get(3));
        NCC.get(1).dsThietBi.add(TB.get(8));
        NCC.get(1).dsThietBi.add(TB.get(12));
        NCC.get(1).dsThietBi.add(TB.get(16));
        NCC.get(1).dsThietBi.add(TB.get(23));
        NCC.get(2).dsThietBi.add(TB.get(1));
        NCC.get(2).dsThietBi.add(TB.get(2));
        NCC.get(2).dsThietBi.add(TB.get(9));
        NCC.get(2).dsThietBi.add(TB.get(14));
        NCC.get(2).dsThietBi.add(TB.get(19));
        NCC.get(2).dsThietBi.add(TB.get(21));
        NCC.get(3).dsThietBi.add(TB.get(0));
        NCC.get(3).dsThietBi.add(TB.get(7));
        NCC.get(3).dsThietBi.add(TB.get(11));
        NCC.get(3).dsThietBi.add(TB.get(17));
        NCC.get(3).dsThietBi.add(TB.get(22));
        NCC.get(4).dsThietBi.add(TB.get(6));
        NCC.get(4).dsThietBi.add(TB.get(10));
        NCC.get(4).dsThietBi.add(TB.get(15));
        NCC.get(4).dsThietBi.add(TB.get(20));
        NCC.get(4).dsThietBi.add(TB.get(24));
        
        
    }
    public static void taoPhieuNhap()
    {
    	//PhieuNhap(string maPN, string ngayNhap, string maNV, NhanVien nv, string maNhaCungCap, NhaCungCap ncc, ICollection<ThietBi> dsThietBi)
        PN.add(new PhieuNhap("PN0001", "05/11/2022", NV.get(0).maNV, NV.get(0), NCC.get(1).maNhaCungCap, NCC.get(1), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0002", "26/10/2022", NV.get(0).maNV, NV.get(0), NCC.get(3).maNhaCungCap, NCC.get(3), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0003", "27/10/2022", NV.get(0).maNV, NV.get(0), NCC.get(1).maNhaCungCap, NCC.get(1), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0004", "15/11/2022", NV.get(1).maNV, NV.get(1), NCC.get(4).maNhaCungCap, NCC.get(4), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0005", "25/11/2022", NV.get(1).maNV, NV.get(1), NCC.get(0).maNhaCungCap, NCC.get(0), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0006", "26/11/2022", NV.get(1).maNV, NV.get(1), NCC.get(1).maNhaCungCap, NCC.get(1), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0007", "07/11/2022", NV.get(2).maNV, NV.get(2), NCC.get(2).maNhaCungCap, NCC.get(2), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0008", "29/10/2022", NV.get(2).maNV, NV.get(2), NCC.get(4).maNhaCungCap, NCC.get(4), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0009", "15/11/2022", NV.get(3).maNV, NV.get(3), NCC.get(3).maNhaCungCap, NCC.get(3), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0010", "18/11/2022", NV.get(3).maNV, NV.get(3), NCC.get(1).maNhaCungCap, NCC.get(1), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0011", "30/10/2022", NV.get(3).maNV, NV.get(3), NCC.get(4).maNhaCungCap, NCC.get(4), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0012", "21/11/2022", NV.get(4).maNV, NV.get(4), NCC.get(3).maNhaCungCap, NCC.get(3), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0013", "18/11/2022", NV.get(4).maNV, NV.get(4), NCC.get(2).maNhaCungCap, NCC.get(2), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0014", "30/10/2022", NV.get(5).maNV, NV.get(5), NCC.get(1).maNhaCungCap, NCC.get(1), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0015", "01/11/2022", NV.get(5).maNV, NV.get(5), NCC.get(3).maNhaCungCap, NCC.get(3), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0016", "30/10/2022", NV.get(6).maNV, NV.get(6), NCC.get(1).maNhaCungCap, NCC.get(1), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0017", "21/11/2022", NV.get(6).maNV, NV.get(6), NCC.get(0).maNhaCungCap, NCC.get(0), new ArrayList<ThietBi>()));
        PN.add(new PhieuNhap("PN0018", "18/11/2022", NV.get(6).maNV, NV.get(6), NCC.get(2).maNhaCungCap, NCC.get(2), new ArrayList<ThietBi>()));

        // Liên kết nhân viên với phiếu nhập (1 - n)
        NV.get(0).dsPhieuNhap.add(PN.get(0));
        NV.get(0).dsPhieuNhap.add(PN.get(1));
        NV.get(0).dsPhieuNhap.add(PN.get(2));
        NV.get(1).dsPhieuNhap.add(PN.get(3));
        NV.get(1).dsPhieuNhap.add(PN.get(4));
        NV.get(1).dsPhieuNhap.add(PN.get(5));
        NV.get(2).dsPhieuNhap.add(PN.get(6));
        NV.get(2).dsPhieuNhap.add(PN.get(7));
        NV.get(3).dsPhieuNhap.add(PN.get(8));
        NV.get(3).dsPhieuNhap.add(PN.get(9));
        NV.get(3).dsPhieuNhap.add(PN.get(10));
        NV.get(4).dsPhieuNhap.add(PN.get(11));
        NV.get(4).dsPhieuNhap.add(PN.get(12));
        NV.get(5).dsPhieuNhap.add(PN.get(13));
        NV.get(5).dsPhieuNhap.add(PN.get(14));
        NV.get(6).dsPhieuNhap.add(PN.get(15));
        NV.get(6).dsPhieuNhap.add(PN.get(16));
        NV.get(6).dsPhieuNhap.add(PN.get(17));

        //Liên kết nhà cung cấp với phiếu nhập (1 - n)
        NCC.get(0).dsPhieuNhap.add(PN.get(4));
        NCC.get(0).dsPhieuNhap.add(PN.get(16));
        NCC.get(1).dsPhieuNhap.add(PN.get(0));
        NCC.get(1).dsPhieuNhap.add(PN.get(2));
        NCC.get(1).dsPhieuNhap.add(PN.get(5));
        NCC.get(1).dsPhieuNhap.add(PN.get(9));
        NCC.get(1).dsPhieuNhap.add(PN.get(13));
        NCC.get(1).dsPhieuNhap.add(PN.get(15));
        NCC.get(2).dsPhieuNhap.add(PN.get(6));
        NCC.get(2).dsPhieuNhap.add(PN.get(12));
        NCC.get(2).dsPhieuNhap.add(PN.get(17));
        NCC.get(3).dsPhieuNhap.add(PN.get(1));
        NCC.get(3).dsPhieuNhap.add(PN.get(8));
        NCC.get(3).dsPhieuNhap.add(PN.get(11));
        NCC.get(3).dsPhieuNhap.add(PN.get(14));
        NCC.get(4).dsPhieuNhap.add(PN.get(3));
        NCC.get(4).dsPhieuNhap.add(PN.get(7));
        NCC.get(4).dsPhieuNhap.add(PN.get(10));

        // Liên kết phiếu nhập với thiết bị (n - n)
        PN.get(4).dsThietBi.add(TB.get(4));
        PN.get(4).dsThietBi.add(TB.get(5));
        PN.get(4).dsThietBi.add(TB.get(13));
        PN.get(4).dsThietBi.add(TB.get(18));
        PN.get(16).dsThietBi.add(TB.get(4));
        PN.get(16).dsThietBi.add(TB.get(13));
        PN.get(16).dsThietBi.add(TB.get(18));

        PN.get(0).dsThietBi.add(TB.get(8));
        PN.get(0).dsThietBi.add(TB.get(23));
        PN.get(2).dsThietBi.add(TB.get(3));
        PN.get(2).dsThietBi.add(TB.get(12));
        PN.get(2).dsThietBi.add(TB.get(16));
        PN.get(5).dsThietBi.add(TB.get(3));
        PN.get(5).dsThietBi.add(TB.get(12));
        PN.get(9).dsThietBi.add(TB.get(16));
        PN.get(13).dsThietBi.add(TB.get(8));
        PN.get(13).dsThietBi.add(TB.get(23));
        PN.get(15).dsThietBi.add(TB.get(23));
        PN.get(15).dsThietBi.add(TB.get(3));

        PN.get(6).dsThietBi.add(TB.get(1));
        PN.get(6).dsThietBi.add(TB.get(2));
        PN.get(6).dsThietBi.add(TB.get(9));
        PN.get(6).dsThietBi.add(TB.get(14));
        PN.get(7).dsThietBi.add(TB.get(19));
        PN.get(7).dsThietBi.add(TB.get(21));
        PN.get(7).dsThietBi.add(TB.get(9));
        PN.get(12).dsThietBi.add(TB.get(1));
        PN.get(12).dsThietBi.add(TB.get(2));
        PN.get(12).dsThietBi.add(TB.get(14));
        PN.get(17).dsThietBi.add(TB.get(9));
        PN.get(17).dsThietBi.add(TB.get(19));
        PN.get(17).dsThietBi.add(TB.get(21));

        PN.get(1).dsThietBi.add(TB.get(0));
        PN.get(1).dsThietBi.add(TB.get(7));
        PN.get(1).dsThietBi.add(TB.get(11));
        PN.get(1).dsThietBi.add(TB.get(22));
        PN.get(8).dsThietBi.add(TB.get(17));
        PN.get(8).dsThietBi.add(TB.get(22));
        PN.get(11).dsThietBi.add(TB.get(0));
        PN.get(11).dsThietBi.add(TB.get(7));
        PN.get(14).dsThietBi.add(TB.get(11));
        PN.get(14).dsThietBi.add(TB.get(17));

        PN.get(3).dsThietBi.add(TB.get(6));
        PN.get(3).dsThietBi.add(TB.get(10));
        PN.get(3).dsThietBi.add(TB.get(20));
        PN.get(7).dsThietBi.add(TB.get(6));
        PN.get(7).dsThietBi.add(TB.get(15));
        PN.get(7).dsThietBi.add(TB.get(24));
        PN.get(10).dsThietBi.add(TB.get(10));
        PN.get(10).dsThietBi.add(TB.get(15));

        TB.get(0).dsPhieuNhap.add(PN.get(1));
        TB.get(0).dsPhieuNhap.add(PN.get(11));
        TB.get(1).dsPhieuNhap.add(PN.get(6));
        TB.get(1).dsPhieuNhap.add(PN.get(12));
        TB.get(2).dsPhieuNhap.add(PN.get(6));
        TB.get(2).dsPhieuNhap.add(PN.get(12));
        TB.get(3).dsPhieuNhap.add(PN.get(2));
        TB.get(3).dsPhieuNhap.add(PN.get(5));
        TB.get(3).dsPhieuNhap.add(PN.get(15));
        TB.get(4).dsPhieuNhap.add(PN.get(4));
        TB.get(4).dsPhieuNhap.add(PN.get(16));
        TB.get(5).dsPhieuNhap.add(PN.get(4));
        TB.get(6).dsPhieuNhap.add(PN.get(3));
        TB.get(6).dsPhieuNhap.add(PN.get(7));
        TB.get(7).dsPhieuNhap.add(PN.get(1));
        TB.get(7).dsPhieuNhap.add(PN.get(11));
        TB.get(8).dsPhieuNhap.add(PN.get(0));
        TB.get(8).dsPhieuNhap.add(PN.get(13));
        TB.get(9).dsPhieuNhap.add(PN.get(6));
        TB.get(9).dsPhieuNhap.add(PN.get(7));
        TB.get(9).dsPhieuNhap.add(PN.get(17));
        TB.get(10).dsPhieuNhap.add(PN.get(3));
        TB.get(10).dsPhieuNhap.add(PN.get(10));
        TB.get(11).dsPhieuNhap.add(PN.get(1));
        TB.get(11).dsPhieuNhap.add(PN.get(14));
        TB.get(12).dsPhieuNhap.add(PN.get(2));
        TB.get(12).dsPhieuNhap.add(PN.get(5));
        TB.get(13).dsPhieuNhap.add(PN.get(4));
        TB.get(13).dsPhieuNhap.add(PN.get(16));
        TB.get(14).dsPhieuNhap.add(PN.get(6));
        TB.get(14).dsPhieuNhap.add(PN.get(12));
        TB.get(15).dsPhieuNhap.add(PN.get(7));
        TB.get(15).dsPhieuNhap.add(PN.get(10));
        TB.get(16).dsPhieuNhap.add(PN.get(2));
        TB.get(16).dsPhieuNhap.add(PN.get(9));
        TB.get(17).dsPhieuNhap.add(PN.get(8));
        TB.get(17).dsPhieuNhap.add(PN.get(14));
        TB.get(18).dsPhieuNhap.add(PN.get(4));
        TB.get(18).dsPhieuNhap.add(PN.get(16));
        TB.get(19).dsPhieuNhap.add(PN.get(7));
        TB.get(19).dsPhieuNhap.add(PN.get(17));
        TB.get(20).dsPhieuNhap.add(PN.get(3));
        TB.get(21).dsPhieuNhap.add(PN.get(7));
        TB.get(21).dsPhieuNhap.add(PN.get(17));
        TB.get(22).dsPhieuNhap.add(PN.get(1));
        TB.get(22).dsPhieuNhap.add(PN.get(8));
        TB.get(23).dsPhieuNhap.add(PN.get(0));
        TB.get(23).dsPhieuNhap.add(PN.get(13));
        TB.get(23).dsPhieuNhap.add(PN.get(15));
        TB.get(24).dsPhieuNhap.add(PN.get(7));
    }
    public static void taoChiTietPhieuNhap()
    {
    	//ChiTietPhieuNhap(int soLuong, string maPN, PhieuNhap pn, string maThietBi, ThietBi tb)
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(4).maPN, PN.get(4), TB.get(4).maThietBi, TB.get(4)));
        CTPN.add(new ChiTietPhieuNhap(20, PN.get(4).maPN, PN.get(4), TB.get(5).maThietBi, TB.get(5)));
        CTPN.add(new ChiTietPhieuNhap(40, PN.get(4).maPN, PN.get(4), TB.get(13).maThietBi, TB.get(13)));
        CTPN.add(new ChiTietPhieuNhap(60, PN.get(4).maPN, PN.get(4), TB.get(18).maThietBi, TB.get(18)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(16).maPN, PN.get(16), TB.get(4).maThietBi, TB.get(4)));
        CTPN.add(new ChiTietPhieuNhap(30, PN.get(16).maPN, PN.get(16), TB.get(13).maThietBi, TB.get(13)));
        CTPN.add(new ChiTietPhieuNhap(20, PN.get(16).maPN, PN.get(16), TB.get(18).maThietBi, TB.get(18)));

        CTPN.add(new ChiTietPhieuNhap(35, PN.get(0).maPN, PN.get(0), TB.get(8).maThietBi, TB.get(8)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(0).maPN, PN.get(0), TB.get(23).maThietBi, TB.get(23)));
        CTPN.add(new ChiTietPhieuNhap(40, PN.get(2).maPN, PN.get(2), TB.get(3).maThietBi, TB.get(3)));
        CTPN.add(new ChiTietPhieuNhap(55, PN.get(2).maPN, PN.get(2), TB.get(12).maThietBi, TB.get(12)));
        CTPN.add(new ChiTietPhieuNhap(100, PN.get(2).maPN, PN.get(2), TB.get(16).maThietBi, TB.get(16)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(5).maPN, PN.get(5), TB.get(3).maThietBi, TB.get(3)));
        CTPN.add(new ChiTietPhieuNhap(55, PN.get(5).maPN, PN.get(5), TB.get(12).maThietBi, TB.get(12)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(9).maPN, PN.get(9), TB.get(16).maThietBi, TB.get(16)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(13).maPN, PN.get(13), TB.get(8).maThietBi, TB.get(8)));
        CTPN.add(new ChiTietPhieuNhap(40, PN.get(13).maPN, PN.get(13), TB.get(23).maThietBi, TB.get(23)));
        CTPN.add(new ChiTietPhieuNhap(45, PN.get(15).maPN, PN.get(15), TB.get(23).maThietBi, TB.get(23)));
        CTPN.add(new ChiTietPhieuNhap(20, PN.get(15).maPN, PN.get(15), TB.get(3).maThietBi, TB.get(3)));

        CTPN.add(new ChiTietPhieuNhap(50, PN.get(6).maPN, PN.get(6), TB.get(1).maThietBi, TB.get(1)));
        CTPN.add(new ChiTietPhieuNhap(25, PN.get(6).maPN, PN.get(6), TB.get(2).maThietBi, TB.get(2)));
        CTPN.add(new ChiTietPhieuNhap(80, PN.get(6).maPN, PN.get(6), TB.get(9).maThietBi, TB.get(9)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(6).maPN, PN.get(6), TB.get(14).maThietBi, TB.get(14)));
        CTPN.add(new ChiTietPhieuNhap(60, PN.get(7).maPN, PN.get(7), TB.get(19).maThietBi, TB.get(19)));
        CTPN.add(new ChiTietPhieuNhap(30, PN.get(7).maPN, PN.get(7), TB.get(21).maThietBi, TB.get(21)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(7).maPN, PN.get(7), TB.get(9).maThietBi, TB.get(9)));
        CTPN.add(new ChiTietPhieuNhap(40, PN.get(12).maPN, PN.get(12), TB.get(1).maThietBi, TB.get(1)));
        CTPN.add(new ChiTietPhieuNhap(15, PN.get(12).maPN, PN.get(12), TB.get(2).maThietBi, TB.get(2)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(12).maPN, PN.get(12), TB.get(14).maThietBi, TB.get(14)));
        CTPN.add(new ChiTietPhieuNhap(40, PN.get(17).maPN, PN.get(17), TB.get(9).maThietBi, TB.get(9)));
        CTPN.add(new ChiTietPhieuNhap(30, PN.get(17).maPN, PN.get(17), TB.get(19).maThietBi, TB.get(19)));
        CTPN.add(new ChiTietPhieuNhap(45, PN.get(17).maPN, PN.get(17), TB.get(21).maThietBi, TB.get(21)));

        CTPN.add(new ChiTietPhieuNhap(50, PN.get(1).maPN, PN.get(1), TB.get(0).maThietBi, TB.get(0)));
        CTPN.add(new ChiTietPhieuNhap(30, PN.get(1).maPN, PN.get(1), TB.get(7).maThietBi, TB.get(7)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(1).maPN, PN.get(1), TB.get(11).maThietBi, TB.get(11)));
        CTPN.add(new ChiTietPhieuNhap(60, PN.get(1).maPN, PN.get(1), TB.get(22).maThietBi, TB.get(22)));
        CTPN.add(new ChiTietPhieuNhap(10, PN.get(8).maPN, PN.get(8), TB.get(17).maThietBi, TB.get(17)));
        CTPN.add(new ChiTietPhieuNhap(20, PN.get(8).maPN, PN.get(8), TB.get(22).maThietBi, TB.get(22)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(11).maPN, PN.get(11), TB.get(0).maThietBi, TB.get(0)));
        CTPN.add(new ChiTietPhieuNhap(20, PN.get(11).maPN, PN.get(11), TB.get(7).maThietBi, TB.get(7)));
        CTPN.add(new ChiTietPhieuNhap(25, PN.get(14).maPN, PN.get(14), TB.get(11).maThietBi, TB.get(11)));
        CTPN.add(new ChiTietPhieuNhap(25, PN.get(14).maPN, PN.get(14), TB.get(17).maThietBi, TB.get(17)));

        CTPN.add(new ChiTietPhieuNhap(40, PN.get(3).maPN, PN.get(3), TB.get(6).maThietBi, TB.get(6)));
        CTPN.add(new ChiTietPhieuNhap(45, PN.get(3).maPN, PN.get(3), TB.get(10).maThietBi, TB.get(10)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(3).maPN, PN.get(3), TB.get(20).maThietBi, TB.get(20)));
        CTPN.add(new ChiTietPhieuNhap(20, PN.get(7).maPN, PN.get(7), TB.get(6).maThietBi, TB.get(6)));
        CTPN.add(new ChiTietPhieuNhap(30, PN.get(7).maPN, PN.get(7), TB.get(15).maThietBi, TB.get(15)));
        CTPN.add(new ChiTietPhieuNhap(20, PN.get(7).maPN, PN.get(7), TB.get(24).maThietBi, TB.get(24)));
        CTPN.add(new ChiTietPhieuNhap(50, PN.get(10).maPN, PN.get(10), TB.get(10).maThietBi, TB.get(10)));
        CTPN.add(new ChiTietPhieuNhap(15, PN.get(10).maPN, PN.get(10), TB.get(15).maThietBi, TB.get(15)));
    }
    public static void taoPhieuXuat()
    {
    	//PhieuXuat(string maPX, string ngayXuat, string maNV, NhanVien nv, string maKhachHang, KhachHang kh, ICollection<ThietBi> dsThietBi)
        PX.add(new PhieuXuat("PX0001", "11/12/2022", NV.get(0).maNV, NV.get(0), KH.get(0).maKH, KH.get(0), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0002", "13/12/2022", NV.get(0).maNV, NV.get(0), KH.get(0).maKH, KH.get(0), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0003", "09/12/2022", NV.get(0).maNV, NV.get(0), KH.get(1).maKH, KH.get(1), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0004", "08/12/2022", NV.get(1).maNV, NV.get(1), KH.get(1).maKH, KH.get(1), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0005", "09/12/2022", NV.get(1).maNV, NV.get(1), KH.get(2).maKH, KH.get(2), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0006", "10/12/2022", NV.get(1).maNV, NV.get(1), KH.get(3).maKH, KH.get(3), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0007", "11/12/2022", NV.get(1).maNV, NV.get(1), KH.get(3).maKH, KH.get(3), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0008", "01/12/2022", NV.get(2).maNV, NV.get(2), KH.get(4).maKH, KH.get(4), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0009", "02/12/2022", NV.get(2).maNV, NV.get(2), KH.get(4).maKH, KH.get(4), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0010", "05/12/2022", NV.get(2).maNV, NV.get(2), KH.get(5).maKH, KH.get(5), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0011", "05/12/2022", NV.get(2).maNV, NV.get(2), KH.get(5).maKH, KH.get(5), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0012", "06/12/2022", NV.get(2).maNV, NV.get(2), KH.get(6).maKH, KH.get(6), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0013", "12/12/2022", NV.get(3).maNV, NV.get(3), KH.get(7).maKH, KH.get(7), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0014", "09/12/2022", NV.get(3).maNV, NV.get(3), KH.get(7).maKH, KH.get(7), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0015", "10/12/2022", NV.get(3).maNV, NV.get(3), KH.get(7).maKH, KH.get(7), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0016", "03/12/2022", NV.get(3).maNV, NV.get(3), KH.get(8).maKH, KH.get(8), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0017", "04/12/2022", NV.get(3).maNV, NV.get(3), KH.get(8).maKH, KH.get(8), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0018", "07/12/2022", NV.get(4).maNV, NV.get(4), KH.get(9).maKH, KH.get(9), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0019", "07/12/2022", NV.get(4).maNV, NV.get(4), KH.get(9).maKH, KH.get(9), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0020", "08/12/2022", NV.get(4).maNV, NV.get(4), KH.get(10).maKH, KH.get(10), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0021", "04/12/2022", NV.get(5).maNV, NV.get(5), KH.get(10).maKH, KH.get(10), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0022", "09/12/2022", NV.get(5).maNV, NV.get(5), KH.get(11).maKH, KH.get(11), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0023", "09/12/2022", NV.get(5).maNV, NV.get(5), KH.get(11).maKH, KH.get(11), new ArrayList<ThietBi>()));
        PX.add(new PhieuXuat("PX0024", "09/12/2022", NV.get(6).maNV, NV.get(6), KH.get(11).maKH, KH.get(11), new ArrayList<ThietBi>()));

        // Liên kết nhân viên với phiếu xuất (1 - n)
        NV.get(0).dsPhieuXuat.add(PX.get(0));
        NV.get(0).dsPhieuXuat.add(PX.get(1));
        NV.get(0).dsPhieuXuat.add(PX.get(2));
        NV.get(1).dsPhieuXuat.add(PX.get(3));
        NV.get(1).dsPhieuXuat.add(PX.get(4));
        NV.get(1).dsPhieuXuat.add(PX.get(5));
        NV.get(1).dsPhieuXuat.add(PX.get(6));
        NV.get(2).dsPhieuXuat.add(PX.get(7));
        NV.get(2).dsPhieuXuat.add(PX.get(8));
        NV.get(2).dsPhieuXuat.add(PX.get(9));
        NV.get(2).dsPhieuXuat.add(PX.get(10));
        NV.get(2).dsPhieuXuat.add(PX.get(11));
        NV.get(3).dsPhieuXuat.add(PX.get(12));
        NV.get(3).dsPhieuXuat.add(PX.get(13));
        NV.get(3).dsPhieuXuat.add(PX.get(14));
        NV.get(3).dsPhieuXuat.add(PX.get(15));
        NV.get(3).dsPhieuXuat.add(PX.get(16));
        NV.get(4).dsPhieuXuat.add(PX.get(17));
        NV.get(4).dsPhieuXuat.add(PX.get(18));
        NV.get(4).dsPhieuXuat.add(PX.get(19));
        NV.get(5).dsPhieuXuat.add(PX.get(20));
        NV.get(5).dsPhieuXuat.add(PX.get(21));
        NV.get(5).dsPhieuXuat.add(PX.get(22));
        NV.get(6).dsPhieuXuat.add(PX.get(23));

        // Liên kết khách hàng với phiếu xuất (1 - n)
        KH.get(0).dsPhieuXuat.add(PX.get(0));
        KH.get(0).dsPhieuXuat.add(PX.get(1));
        KH.get(1).dsPhieuXuat.add(PX.get(2));
        KH.get(1).dsPhieuXuat.add(PX.get(3));
        KH.get(2).dsPhieuXuat.add(PX.get(4));
        KH.get(3).dsPhieuXuat.add(PX.get(5));
        KH.get(3).dsPhieuXuat.add(PX.get(6));
        KH.get(4).dsPhieuXuat.add(PX.get(7));
        KH.get(4).dsPhieuXuat.add(PX.get(8));
        KH.get(5).dsPhieuXuat.add(PX.get(9));
        KH.get(5).dsPhieuXuat.add(PX.get(10));
        KH.get(6).dsPhieuXuat.add(PX.get(11));
        KH.get(7).dsPhieuXuat.add(PX.get(12));
        KH.get(7).dsPhieuXuat.add(PX.get(13));
        KH.get(7).dsPhieuXuat.add(PX.get(14));
        KH.get(8).dsPhieuXuat.add(PX.get(15));
        KH.get(8).dsPhieuXuat.add(PX.get(16));
        KH.get(9).dsPhieuXuat.add(PX.get(17));
        KH.get(9).dsPhieuXuat.add(PX.get(18));
        KH.get(10).dsPhieuXuat.add(PX.get(19));
        KH.get(10).dsPhieuXuat.add(PX.get(20));
        KH.get(11).dsPhieuXuat.add(PX.get(21));
        KH.get(11).dsPhieuXuat.add(PX.get(22));
        KH.get(11).dsPhieuXuat.add(PX.get(23));

        // Liên kết phiếu xuất với thiết bị (n - n)
        PX.get(0).dsThietBi.add(TB.get(0));
        PX.get(0).dsThietBi.add(TB.get(4));
        PX.get(0).dsThietBi.add(TB.get(11));
        PX.get(1).dsThietBi.add(TB.get(1));
        PX.get(1).dsThietBi.add(TB.get(23));
        PX.get(1).dsThietBi.add(TB.get(14));
        PX.get(2).dsThietBi.add(TB.get(3));
        PX.get(2).dsThietBi.add(TB.get(15));
        PX.get(2).dsThietBi.add(TB.get(21));
        PX.get(3).dsThietBi.add(TB.get(2));
        PX.get(3).dsThietBi.add(TB.get(7));
        PX.get(4).dsThietBi.add(TB.get(5));
        PX.get(4).dsThietBi.add(TB.get(12));
        PX.get(4).dsThietBi.add(TB.get(9));
        PX.get(5).dsThietBi.add(TB.get(17));
        PX.get(5).dsThietBi.add(TB.get(6));
        PX.get(5).dsThietBi.add(TB.get(24));
        PX.get(6).dsThietBi.add(TB.get(20));
        PX.get(6).dsThietBi.add(TB.get(8));
        PX.get(7).dsThietBi.add(TB.get(13));
        PX.get(7).dsThietBi.add(TB.get(16));
        PX.get(8).dsThietBi.add(TB.get(18));
        PX.get(8).dsThietBi.add(TB.get(22));
        PX.get(8).dsThietBi.add(TB.get(23));
        PX.get(9).dsThietBi.add(TB.get(24));
        PX.get(10).dsThietBi.add(TB.get(2));
        PX.get(11).dsThietBi.add(TB.get(11));
        PX.get(11).dsThietBi.add(TB.get(15));
        PX.get(12).dsThietBi.add(TB.get(12));
        PX.get(12).dsThietBi.add(TB.get(1));
        PX.get(13).dsThietBi.add(TB.get(5));
        PX.get(13).dsThietBi.add(TB.get(18));
        PX.get(14).dsThietBi.add(TB.get(4));
        PX.get(15).dsThietBi.add(TB.get(9));
        PX.get(15).dsThietBi.add(TB.get(7));
        PX.get(15).dsThietBi.add(TB.get(21));
        PX.get(16).dsThietBi.add(TB.get(3));
        PX.get(16).dsThietBi.add(TB.get(13));
        PX.get(16).dsThietBi.add(TB.get(8));
        PX.get(17).dsThietBi.add(TB.get(17));
        PX.get(17).dsThietBi.add(TB.get(24));
        PX.get(18).dsThietBi.add(TB.get(6));
        PX.get(18).dsThietBi.add(TB.get(10));
        PX.get(18).dsThietBi.add(TB.get(14));
        PX.get(19).dsThietBi.add(TB.get(16));
        PX.get(19).dsThietBi.add(TB.get(22));
        PX.get(20).dsThietBi.add(TB.get(19));
        PX.get(20).dsThietBi.add(TB.get(23));
        PX.get(21).dsThietBi.add(TB.get(20));
        PX.get(22).dsThietBi.add(TB.get(18));
        PX.get(23).dsThietBi.add(TB.get(9));

        
        TB.get(0).dsPhieuXuat.add(PX.get(0));
        TB.get(1).dsPhieuXuat.add(PX.get(1));
        TB.get(1).dsPhieuXuat.add(PX.get(12));
        TB.get(2).dsPhieuXuat.add(PX.get(3));
        TB.get(2).dsPhieuXuat.add(PX.get(10));
        TB.get(3).dsPhieuXuat.add(PX.get(2));
        TB.get(3).dsPhieuXuat.add(PX.get(15));
        TB.get(4).dsPhieuXuat.add(PX.get(0));
        TB.get(4).dsPhieuXuat.add(PX.get(14));
        TB.get(5).dsPhieuXuat.add(PX.get(4));
        TB.get(5).dsPhieuXuat.add(PX.get(13));
        TB.get(6).dsPhieuXuat.add(PX.get(5));
        TB.get(6).dsPhieuXuat.add(PX.get(18));
        TB.get(7).dsPhieuXuat.add(PX.get(3));
        TB.get(7).dsPhieuXuat.add(PX.get(15));
        TB.get(8).dsPhieuXuat.add(PX.get(6));
        TB.get(8).dsPhieuXuat.add(PX.get(16));
        TB.get(9).dsPhieuXuat.add(PX.get(4));
        TB.get(9).dsPhieuXuat.add(PX.get(15));
        TB.get(9).dsPhieuXuat.add(PX.get(23));
        TB.get(10).dsPhieuXuat.add(PX.get(18));
        TB.get(11).dsPhieuXuat.add(PX.get(0));
        TB.get(11).dsPhieuXuat.add(PX.get(11));
        TB.get(12).dsPhieuXuat.add(PX.get(4));
        TB.get(12).dsPhieuXuat.add(PX.get(12));
        TB.get(13).dsPhieuXuat.add(PX.get(7));
        TB.get(13).dsPhieuXuat.add(PX.get(16));
        TB.get(14).dsPhieuXuat.add(PX.get(1));
        TB.get(14).dsPhieuXuat.add(PX.get(18));
        TB.get(15).dsPhieuXuat.add(PX.get(2));
        TB.get(15).dsPhieuXuat.add(PX.get(11));
        TB.get(16).dsPhieuXuat.add(PX.get(7));
        TB.get(16).dsPhieuXuat.add(PX.get(19));
        TB.get(17).dsPhieuXuat.add(PX.get(5));
        TB.get(17).dsPhieuXuat.add(PX.get(17));
        TB.get(18).dsPhieuXuat.add(PX.get(8));
        TB.get(18).dsPhieuXuat.add(PX.get(13));
        TB.get(18).dsPhieuXuat.add(PX.get(22));
        TB.get(19).dsPhieuXuat.add(PX.get(20));
        TB.get(20).dsPhieuXuat.add(PX.get(6));
        TB.get(20).dsPhieuXuat.add(PX.get(21));
        TB.get(21).dsPhieuXuat.add(PX.get(2));
        TB.get(21).dsPhieuXuat.add(PX.get(15));
        TB.get(22).dsPhieuXuat.add(PX.get(8));
        TB.get(22).dsPhieuXuat.add(PX.get(19));
        TB.get(23).dsPhieuXuat.add(PX.get(8));
        TB.get(23).dsPhieuXuat.add(PX.get(20));
        TB.get(23).dsPhieuXuat.add(PX.get(1));
        TB.get(24).dsPhieuXuat.add(PX.get(5));
        TB.get(24).dsPhieuXuat.add(PX.get(9));
        TB.get(24).dsPhieuXuat.add(PX.get(17));

    }
    public static void taoChiTietPhieuXuat()
    {
    	//ChiTietPhieuXuat(int soLuong, string maPX, PhieuXuat px, string maThietBi, ThietBi tb)
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(0).maPX, PX.get(0), TB.get(0).maThietBi, TB.get(0)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(0).maPX, PX.get(0), TB.get(4).maThietBi, TB.get(4)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(0).maPX, PX.get(0), TB.get(11).maThietBi, TB.get(11)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(1).maPX, PX.get(1), TB.get(1).maThietBi, TB.get(1)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(1).maPX, PX.get(1), TB.get(23).maThietBi, TB.get(23)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(1).maPX, PX.get(1), TB.get(14).maThietBi, TB.get(14)));
        CTPX.add(new ChiTietPhieuXuat(3, PX.get(2).maPX, PX.get(2), TB.get(3).maThietBi, TB.get(3)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(2).maPX, PX.get(2), TB.get(15).maThietBi, TB.get(15)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(2).maPX, PX.get(2), TB.get(21).maThietBi, TB.get(21)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(3).maPX, PX.get(3), TB.get(2).maThietBi, TB.get(2)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(3).maPX, PX.get(3), TB.get(7).maThietBi, TB.get(7)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(4).maPX, PX.get(4), TB.get(5).maThietBi, TB.get(5)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(4).maPX, PX.get(4), TB.get(12).maThietBi, TB.get(12)));
        CTPX.add(new ChiTietPhieuXuat(3, PX.get(4).maPX, PX.get(4), TB.get(9).maThietBi, TB.get(9)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(5).maPX, PX.get(5), TB.get(17).maThietBi, TB.get(17)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(5).maPX, PX.get(5), TB.get(6).maThietBi, TB.get(6)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(5).maPX, PX.get(5), TB.get(24).maThietBi, TB.get(24)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(6).maPX, PX.get(6), TB.get(20).maThietBi, TB.get(20)));
        CTPX.add(new ChiTietPhieuXuat(3, PX.get(6).maPX, PX.get(6), TB.get(8).maThietBi, TB.get(8)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(7).maPX, PX.get(7), TB.get(13).maThietBi, TB.get(13)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(7).maPX, PX.get(7), TB.get(16).maThietBi, TB.get(16)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(8).maPX, PX.get(8), TB.get(18).maThietBi, TB.get(18)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(8).maPX, PX.get(8), TB.get(22).maThietBi, TB.get(22)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(8).maPX, PX.get(8), TB.get(23).maThietBi, TB.get(23)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(9).maPX, PX.get(9), TB.get(24).maThietBi, TB.get(24)));
        CTPX.add(new ChiTietPhieuXuat(3, PX.get(10).maPX, PX.get(10), TB.get(2).maThietBi, TB.get(2)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(11).maPX, PX.get(11), TB.get(11).maThietBi, TB.get(11)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(11).maPX, PX.get(11), TB.get(15).maThietBi, TB.get(15)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(12).maPX, PX.get(12), TB.get(12).maThietBi, TB.get(12)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(12).maPX, PX.get(12), TB.get(1).maThietBi, TB.get(1)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(13).maPX, PX.get(13), TB.get(5).maThietBi, TB.get(5)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(13).maPX, PX.get(13), TB.get(18).maThietBi, TB.get(18)));
        CTPX.add(new ChiTietPhieuXuat(4, PX.get(14).maPX, PX.get(14), TB.get(4).maThietBi, TB.get(4)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(15).maPX, PX.get(15), TB.get(9).maThietBi, TB.get(9)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(15).maPX, PX.get(15), TB.get(7).maThietBi, TB.get(7)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(15).maPX, PX.get(15), TB.get(21).maThietBi, TB.get(21)));
        CTPX.add(new ChiTietPhieuXuat(3, PX.get(16).maPX, PX.get(16), TB.get(3).maThietBi, TB.get(3)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(16).maPX, PX.get(16), TB.get(13).maThietBi, TB.get(13)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(16).maPX, PX.get(16), TB.get(8).maThietBi, TB.get(8)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(17).maPX, PX.get(17), TB.get(17).maThietBi, TB.get(17)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(17).maPX, PX.get(17), TB.get(24).maThietBi, TB.get(24)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(18).maPX, PX.get(18), TB.get(6).maThietBi, TB.get(6)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(18).maPX, PX.get(18), TB.get(10).maThietBi, TB.get(10)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(18).maPX, PX.get(18), TB.get(14).maThietBi, TB.get(14)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(19).maPX, PX.get(19), TB.get(16).maThietBi, TB.get(16)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(19).maPX, PX.get(19), TB.get(22).maThietBi, TB.get(22)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(20).maPX, PX.get(20), TB.get(19).maThietBi, TB.get(19)));
        CTPX.add(new ChiTietPhieuXuat(2, PX.get(20).maPX, PX.get(20), TB.get(23).maThietBi, TB.get(23)));
        CTPX.add(new ChiTietPhieuXuat(3, PX.get(21).maPX, PX.get(21), TB.get(20).maThietBi, TB.get(20)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(22).maPX, PX.get(22), TB.get(18).maThietBi, TB.get(18)));
        CTPX.add(new ChiTietPhieuXuat(1, PX.get(23).maPX, PX.get(23), TB.get(9).maThietBi, TB.get(9)));

    }
	public static void Cau1()
	{
		//1) In ra danh sách các thiết bị theo nhà sản xuất
		System.out.println("1) In ra danh sách các thiết bị theo nhà sản xuất");
		TB.stream().collect(Collectors.groupingBy(ThietBi::getNhaSanXuat)).forEach((nsx, dstb) -> {
						System.out.println("\tNhà sản xuất: " + nsx.tenNSX);
						dstb.forEach(tb -> System.out.println("\t\tThiết bi: " + tb.tenThietBi));
		});	
	}
	public static void Cau2()
    {
		//2) In ra các phiếu nhập được nhập trong tháng 11
		System.out.println("2) In ra các phiếu nhập được nhập trong tháng 11");
		PN.stream().filter(pn -> pn.ngayNhap.contains("/11/"))
				   .forEach(pn -> System.out.println("\tMã phiếu nhập: " + pn.maPN + "\tNgày nhập: " + pn.ngayNhap));
	}
	public static void Cau3()
	{
		//3) In ra tổng số lượng từng thiết bị được nhập từ nhà cung cấp
		System.out.println("3) In ra tổng số lượng từng thiết bị được nhập từ nhà cung cấp");
		CTPN.stream().collect(Collectors.groupingBy(ChiTietPhieuNhap::getTb)).forEach((tb, dsctpn) -> {
			System.out.print("\tThiết bị: " + tb.tenThietBi);
			var sum = dsctpn.stream().map(ctpn -> ctpn.soLuong).reduce(0, (a, b) -> a + b);
			System.out.println("\tTổng số lượng: " + sum);
			
		});
	}
	public static void Cau4()
	{
		//4) In ra các khách hàng có phiếu xuất (hóa đơn) chứa thiết bị là màn hình
		System.out.println("4) In ra các khách hàng có hóa đơn chứa thiết bị là màn hình");
		var result = KH.stream().filter(kh -> kh.dsPhieuXuat.stream()
															.filter(px -> px.dsThietBi.stream()
																	                  .filter(tb -> tb.maLoai == "MON0009")
																	                  .count() != 0)
															.count() != 0);
		result.forEach(k -> System.out.println("\tKhách hàng: " + k.tenKH));
		
	}
	public static void Cau5()
	{
		//5) Liệt kê các thiết bị trong 10 phiếu nhập đầu tiên
		System.out.println("5) Liệt kê các thiết bị trong 10 phiếu nhập đầu tiên");
		var result = PN.stream().limit(10);
		result.forEach(pn -> {
			System.out.println("\tMã phiếu nhập: " + pn.maPN);
			pn.dsThietBi.forEach(tb -> System.out.println("\t\tThiết bị: " + tb.tenThietBi));
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taoNhaSanXuat();
        taoLoaiThietBi();
        taoNhaCungCap();
        taoKhachHang();
        taoNhanVien();
        taoThietBi();
        taoPhieuNhap();
        taoChiTietPhieuNhap();
        taoPhieuXuat();
        taoChiTietPhieuXuat();
        
        Cau1();
        Cau2();
        Cau3();
        Cau4();
        Cau5();
	}

}
