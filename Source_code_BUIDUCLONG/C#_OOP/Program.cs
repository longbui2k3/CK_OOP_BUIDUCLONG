using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class Program
    {
        public static List<ThietBi> TB = new List<ThietBi>();
        public static List<NhaSanXuat> NSX = new List<NhaSanXuat>();
        public static List<NhaCungCap> NCC = new List<NhaCungCap>();
        public static List<LoaiThietBi> LTB = new List<LoaiThietBi>();
        public static List<KhachHang> KH = new List<KhachHang>();
        public static List<NhanVien> NV = new List<NhanVien>();
        public static List<PhieuNhap> PN = new List<PhieuNhap>();
        public static List<ChiTietPhieuNhap> CTPN = new List<ChiTietPhieuNhap>();
        public static List<PhieuXuat> PX = new List<PhieuXuat>();
        public static List<ChiTietPhieuXuat> CTPX = new List<ChiTietPhieuXuat>();

        public static void taoLoaiThietBi()
        {
            //LoaiThietBi(string maLoai, string theLoai, string donViTinh, string ghiChu, ICollection<ThietBi> dsThietBi)
            LTB.Add(new LoaiThietBi("CPU0001", "CPU", "Hộp", "Còn hàng", new List<ThietBi>()));
            LTB.Add(new LoaiThietBi("RAM0002", "RAM", "Cái", "Còn hàng", new List<ThietBi>()));
            LTB.Add(new LoaiThietBi("MAN0003", "Mainboard", "Cái", "Sắp hết hàng", new List<ThietBi>()));
            LTB.Add(new LoaiThietBi("HDD0004", "Ổ Cứng", "Cái", "Còn hàng", new List<ThietBi>()));
            LTB.Add(new LoaiThietBi("CAR0005", "Card Màn Hình", "Hộp", "Sắp hết hàng", new List<ThietBi>()));
            LTB.Add(new LoaiThietBi("POW0006", "Nguồn Máy Tính", "Hộp", "Còn hàng", new List<ThietBi>()));
            LTB.Add(new LoaiThietBi("COO0007", "Quạt Tản Nhiệt", "Hộp", "Còn hàng", new List<ThietBi>()));
            LTB.Add(new LoaiThietBi("CAS0008", "Case Máy Tính", "Hộp", "Còn hàng", new List<ThietBi>()));
            LTB.Add(new LoaiThietBi("MON0009", "Màn Hình", "Cái", "Còn hàng", new List<ThietBi>()));
        }
        public static void taoNhaSanXuat()
        {
            //NhaSanXuat(string maNSX, string tenNSX, string quocGia, ICollection <ThietBi> dsThietBi)
            NSX.Add(new NhaSanXuat("NSX0001", "Intel", "Mỹ", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0002", "AMD", "Mỹ", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0003", "Kingston", "Mỹ", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0004", "G.Skill", "Đài Loan", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0005", "Gigabyte", "Đài Loan", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0006", "Asus", "Đài Loan", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0007", "Samsung", "Hàn Quốc", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0008", "MSI", "Đài Loan", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0009", "DeepCool", "Trung Quốc", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0010", "Xigmatek", "Trung Quốc", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0011", "Dell", "Mỹ", new List<ThietBi>()));
            NSX.Add(new NhaSanXuat("NSX0012", "LG", "Hàn Quốc", new List<ThietBi>()));
        }
        public static void taoNhaCungCap()
        {
            //NhaCungCap(string maNhaCungCap, string tenNhaCungCap, string diaChi, string SDT, ICollection<PhieuNhap> dsPhieuNhap, ICollection<ThietBi> dsThietBi)
            NCC.Add(new NhaCungCap("NCC0001", "HANOICOMPUTER", "43 Thái Hà, Đống Đa, Hà Nội", "02435380088", new List<PhieuNhap>(), new List<ThietBi>()));
            NCC.Add(new NhaCungCap("NCC0002", "An Phát Computer", "Số 19 Ngõ 178 Thái Hà – Đống Đa – Hà Nội", "0971851111", new List<PhieuNhap>(), new List<ThietBi>()));
            NCC.Add(new NhaCungCap("NCC0003", "Ngọc Tuyền Computer", "Số 131 Vũ Tông Phan, Khương Trung, Thanh Xuân, Hà Nội", "0971237999", new List<PhieuNhap>(), new List<ThietBi>()));
            NCC.Add(new NhaCungCap("NCC0004", "Trung tâm Laptopcentre", "Số 23 ngõ 131, Phố Thái Hà, Quận Đống Đa, TP Hà Nội", "02437478366", new List<PhieuNhap>(), new List<ThietBi>()));
            NCC.Add(new NhaCungCap("NCC0005", "Công Ty TNHH Máy Tính Hà Thành", "182 Lê Thanh Nghị, Đồng Tâm, Hai Bà Trưng, Hà Nội", "02473031661", new List<PhieuNhap>(), new List<ThietBi>()));
        }
        public static void taoKhachHang()
        {
            //KhachHang(string maKH, string tenKH, string diaChi, string SDT, ICollection<PhieuXuat> dsPhieuXuat)
            KH.Add(new KhachHang("KH0001", "Trần Đào Anh Trung", "Lâm Đồng", "0459225577", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0002", "Bùi Đức Long", "TPHCM", "0777981051", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0003", "Đỗ Hoàng Đăng Khanh", "Bến Tre", "0243575685", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0004", "Hoàng Thị Lan", "Thanh Hoá", "0935646677", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0005", "Vũ Quốc Hoàng Anh", "Bắc Ninh", "0875562244", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0006", "Trần Ngọc An", "Bình Thuận", "0558367798", new List<PhieuXuat>()));

            KH.Add(new KhachHang("KH0007", "Nguyễn Thị Vân Anh", "TPHCM", "0674354365", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0008", "Nguyễn Văn Thể", "Bình Dương", "0234546677", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0009", "Vũ Văn B", "Đồng Nai", "0246676888", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0010", "Ngô Ngọc Huy", "Vũng Tàu", "0835467512", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0011", "Phan Đỗ Ngọc Anh", "Cà Mau", "0456777245", new List<PhieuXuat>()));
            KH.Add(new KhachHang("KH0012", "Bùi Văn A", "Hà Nội", "0345768688", new List<PhieuXuat>()));
        }
        public static void taoNhanVien()
        {
            // NhanVien(string maNV, HoTen hoTen, string ngaySinh, string SDT, ICollection<PhieuNhap> dsPhieuNhap, ICollection<PhieuXuat> dsPhieuXuat)
            NV.Add(new NhanVien("NV0001", new HoTen("Đỗ Thị Hoàng", "Diệu"), "04/05/1997", "0932196235", new List<PhieuNhap>(), new List<PhieuXuat>()));
            NV.Add(new NhanVien("NV0002", new HoTen("Hồ Văn", "Hiếu"), "09/11/1993", "0561257677", new List<PhieuNhap>(), new List<PhieuXuat>()));
            NV.Add(new NhanVien("NV0003", new HoTen("Cao Quang", "Anh"), "20/05/1999", "0782245651", new List<PhieuNhap>(), new List<PhieuXuat>()));
            NV.Add(new NhanVien("NV0004", new HoTen("Bùi Hoàng Việt", "Trung"), "12/04/1995", "0395657575", new List<PhieuNhap>(), new List<PhieuXuat>()));
            NV.Add(new NhanVien("NV0005", new HoTen("Nguyễn Hoàng", "Hải"), "25/03/2000", "0845225657", new List<PhieuNhap>(), new List<PhieuXuat>()));
            NV.Add(new NhanVien("NV0006", new HoTen("Trần Thị Thanh", "Hoa"), "14/06/1996", "0561243577", new List<PhieuNhap>(), new List<PhieuXuat>()));
            NV.Add(new NhanVien("NV0007", new HoTen("Vũ Văn", "An"), "20/08/1998", "0897584554", new List<PhieuNhap>(), new List<PhieuXuat>()));
        }
        public static void taoThietBi()
        {
            //ThietBi(string maThietBi, string tenThietBi, string thongSoKT, int giaThanh, string maNhaCungCap, NhaCungCap ncc, string maLoai, LoaiThietBi ltb, string maNSX, NhaSanXuat nsx, ICollection <PhieuNhap> dsPhieuNhap, ICollection <PhieuXuat> dsPhieuXuat)
            TB.Add(new ThietBi("TB00001", "CPU Intel Core I5-12400F", "6 nhân 12 luồng", 5400000, NCC[3].maNhaCungCap, NCC[3], LTB[0].maLoai, LTB[0], NSX[0].maNSX, NSX[0], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00002", "CPU Intel Core I3-12100", "4 nhân 8 luồng", 3750000, NCC[2].maNhaCungCap, NCC[2], LTB[0].maLoai, LTB[0], NSX[0].maNSX, NSX[0], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00003", "AMD Ryzen 5 5600X", "6 nhân 12 luồng", 4490000, NCC[2].maNhaCungCap, NCC[2], LTB[0].maLoai, LTB[0], NSX[1].maNSX, NSX[1], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00004", "Kingston Fury Beast KF432C16BB", "8GB 3200Mhz", 690000, NCC[1].maNhaCungCap, NCC[1], LTB[1].maLoai, LTB[1], NSX[2].maNSX, NSX[2], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00005", "G.Skill Trident Z RGB", "16GB 3600MHz", 2090000, NCC[0].maNhaCungCap, NCC[0], LTB[1].maLoai, LTB[1], NSX[3].maNSX, NSX[3], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00006", "G.SKILL Aegis", "8GB 3200MHz DDR4", 890000, NCC[0].maNhaCungCap, NCC[0], LTB[1].maLoai, LTB[1], NSX[3].maNSX, NSX[3], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00007", "Mainboard Gigabyte B560M Aorus Pro", "4 khe RAM DDR4", 2590000, NCC[4].maNhaCungCap, NCC[4], LTB[2].maLoai, LTB[2], NSX[4].maNSX, NSX[4], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00008", "Mainboard Asus TUF Gaming B660M Plus D4", "4 khe RAM 4DDR4", 3990000, NCC[3].maNhaCungCap, NCC[3], LTB[2].maLoai, LTB[2], NSX[5].maNSX, NSX[5], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00009", "Mainboard Asus ROG STRIX Z690 D4", "4 khe RAM DDR4", 8990000, NCC[1].maNhaCungCap, NCC[1], LTB[2].maLoai, LTB[2], NSX[5].maNSX, NSX[5], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00010", "Ổ cứng SSD Kingston SA400S37", "240GB 2.5' SATA", 750000, NCC[2].maNhaCungCap, NCC[2], LTB[3].maLoai, LTB[3], NSX[2].maNSX, NSX[2], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00011", "Ổ cứng Gigabyte SSD", "120GB Sata III", 390000, NCC[4].maNhaCungCap, NCC[4], LTB[3].maLoai, LTB[3], NSX[4].maNSX, NSX[4], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00012", "Ổ cứng SSD Samsung 980", "M.2 PCIe NVMe 250GB", 1200000, NCC[3].maNhaCungCap, NCC[3], LTB[3].maLoai, LTB[3], NSX[6].maNSX, NSX[6], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00013", "Card màn hình Gigabyte Geforce RTX 3060 Gaming OC", "12GB GDDR6 192bit", 9190000, NCC[1].maNhaCungCap, NCC[1], LTB[4].maLoai, LTB[4], NSX[4].maNSX, NSX[4], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00014", "VGA MSI GTX 1050 Ti 4GT OCV1", "4GB GDDR5 128 bit", 3850000, NCC[0].maNhaCungCap, NCC[0], LTB[4].maLoai, LTB[4], NSX[7].maNSX, NSX[7], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00015", "Nguồn máy tính DeepCool DN500", "500W Hiệu suất 85%", 760000, NCC[2].maNhaCungCap, NCC[2], LTB[5].maLoai, LTB[5], NSX[8].maNSX, NSX[8], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00016", "Nguồn máy tính Gigabyte P650B", "650W Hiệu suất 85%", 1200000, NCC[4].maNhaCungCap, NCC[4], LTB[5].maLoai, LTB[5], NSX[4].maNSX, NSX[4], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00017", "Tản nhiệt DeepCool AG400 ARGB", "500 ~ 2000 vòng / phút ± 10%", 580000, NCC[1].maNhaCungCap, NCC[1], LTB[6].maLoai, LTB[6], NSX[8].maNSX, NSX[8], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00018", "Tản nhiệt Xigmatek Air Killer S", "1800 RPM +/- 10%", 1500000, NCC[3].maNhaCungCap, NCC[3], LTB[6].maLoai, LTB[6], NSX[9].maNSX, NSX[9], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00019", "Case máy tính DeepCool Matrexx 30", "Mini Tower", 490000, NCC[0].maNhaCungCap, NCC[0], LTB[7].maLoai, LTB[7], NSX[8].maNSX, NSX[8], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00020", "Case máy tính Xigmatek Gaming X 3FX", "Mid Tower", 950000, NCC[2].maNhaCungCap, NCC[2], LTB[7].maLoai, LTB[7], NSX[9].maNSX, NSX[9], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00021", "Màn hình Asus TUF Gaming VG247Q1A", "24 inch 165Hz Full HD", 3890000, NCC[4].maNhaCungCap, NCC[4], LTB[8].maLoai, LTB[8], NSX[5].maNSX, NSX[5], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00022", "Màn hình Gaming LG Ultragear 24GN650-B", "23.8 inch 144Hz Full HD", 4450000, NCC[2].maNhaCungCap, NCC[2], LTB[8].maLoai, LTB[8], NSX[11].maNSX, NSX[11], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00023", "Màn hình Samsung Gaming Odyssey G5 LC34G55TWWEXXV", "34 inch 165Hz 4K", 10290000, NCC[3].maNhaCungCap, NCC[3], LTB[8].maLoai, LTB[8], NSX[6].maNSX, NSX[6], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00024", "Màn hình Dell UltraSharp", "23.8 inch 60Hz Full HD", 6590000, NCC[1].maNhaCungCap, NCC[1], LTB[8].maLoai, LTB[8], NSX[10].maNSX, NSX[10], new List<PhieuNhap>(), new List<PhieuXuat>()));
            TB.Add(new ThietBi("TB00025", "Màn hình Dell S2421HN", "24 inch 75Hz FullHD", 4590000, NCC[4].maNhaCungCap, NCC[4], LTB[8].maLoai, LTB[8], NSX[10].maNSX, NSX[10], new List<PhieuNhap>(), new List<PhieuXuat>()));

            // Liên kết nhà SX với thiết bị (1-n)
            NSX[0].dsThietBi.Add(TB[0]);
            NSX[0].dsThietBi.Add(TB[1]);
            NSX[1].dsThietBi.Add(TB[2]);
            NSX[2].dsThietBi.Add(TB[3]);
            NSX[2].dsThietBi.Add(TB[9]);
            NSX[3].dsThietBi.Add(TB[4]);
            NSX[3].dsThietBi.Add(TB[5]);
            NSX[4].dsThietBi.Add(TB[6]);
            NSX[4].dsThietBi.Add(TB[10]);
            NSX[4].dsThietBi.Add(TB[12]);
            NSX[4].dsThietBi.Add(TB[15]);
            NSX[5].dsThietBi.Add(TB[7]);
            NSX[5].dsThietBi.Add(TB[8]);
            NSX[5].dsThietBi.Add(TB[20]);
            NSX[6].dsThietBi.Add(TB[11]);
            NSX[6].dsThietBi.Add(TB[22]);
            NSX[7].dsThietBi.Add(TB[13]);
            NSX[8].dsThietBi.Add(TB[14]);
            NSX[8].dsThietBi.Add(TB[16]);
            NSX[8].dsThietBi.Add(TB[18]);
            NSX[9].dsThietBi.Add(TB[17]);
            NSX[9].dsThietBi.Add(TB[19]);
            NSX[10].dsThietBi.Add(TB[23]);
            NSX[10].dsThietBi.Add(TB[24]);
            NSX[11].dsThietBi.Add(TB[21]);

            // Liên kết loại TB với thiết bị (1-n)
            LTB[0].dsThietBi.Add(TB[0]);
            LTB[0].dsThietBi.Add(TB[1]);
            LTB[0].dsThietBi.Add(TB[2]);
            LTB[1].dsThietBi.Add(TB[3]);
            LTB[1].dsThietBi.Add(TB[4]);
            LTB[1].dsThietBi.Add(TB[5]);
            LTB[2].dsThietBi.Add(TB[6]);
            LTB[2].dsThietBi.Add(TB[7]);
            LTB[2].dsThietBi.Add(TB[8]);
            LTB[3].dsThietBi.Add(TB[9]);
            LTB[3].dsThietBi.Add(TB[10]);
            LTB[3].dsThietBi.Add(TB[11]);
            LTB[4].dsThietBi.Add(TB[12]);
            LTB[4].dsThietBi.Add(TB[13]);
            LTB[5].dsThietBi.Add(TB[14]);
            LTB[5].dsThietBi.Add(TB[15]);
            LTB[6].dsThietBi.Add(TB[16]);
            LTB[6].dsThietBi.Add(TB[17]);
            LTB[7].dsThietBi.Add(TB[18]);
            LTB[7].dsThietBi.Add(TB[19]);
            LTB[8].dsThietBi.Add(TB[20]);
            LTB[8].dsThietBi.Add(TB[21]);
            LTB[8].dsThietBi.Add(TB[22]);
            LTB[8].dsThietBi.Add(TB[23]);
            LTB[8].dsThietBi.Add(TB[24]);

            // Liên kết nhà cung cấp với thiết bị (1 - n)
            NCC[0].dsThietBi.Add(TB[4]);
            NCC[0].dsThietBi.Add(TB[5]);
            NCC[0].dsThietBi.Add(TB[13]);
            NCC[0].dsThietBi.Add(TB[18]);
            NCC[1].dsThietBi.Add(TB[3]);
            NCC[1].dsThietBi.Add(TB[8]);
            NCC[1].dsThietBi.Add(TB[12]);
            NCC[1].dsThietBi.Add(TB[16]);
            NCC[1].dsThietBi.Add(TB[23]);
            NCC[2].dsThietBi.Add(TB[1]);
            NCC[2].dsThietBi.Add(TB[2]);
            NCC[2].dsThietBi.Add(TB[9]);
            NCC[2].dsThietBi.Add(TB[14]);
            NCC[2].dsThietBi.Add(TB[19]);
            NCC[2].dsThietBi.Add(TB[21]);
            NCC[3].dsThietBi.Add(TB[0]);
            NCC[3].dsThietBi.Add(TB[7]);
            NCC[3].dsThietBi.Add(TB[11]);
            NCC[3].dsThietBi.Add(TB[17]);
            NCC[3].dsThietBi.Add(TB[22]);
            NCC[4].dsThietBi.Add(TB[6]);
            NCC[4].dsThietBi.Add(TB[10]);
            NCC[4].dsThietBi.Add(TB[15]);
            NCC[4].dsThietBi.Add(TB[20]);
            NCC[4].dsThietBi.Add(TB[24]);
        }
        public static void taoPhieuNhap()
        {
            //PhieuNhap(string maPN, string ngayNhap, string maNV, NhanVien nv, string maNhaCungCap, NhaCungCap ncc, ICollection<ThietBi> dsThietBi)
            PN.Add(new PhieuNhap("PN0001", "05/11/2022", NV[0].maNV, NV[0], NCC[1].maNhaCungCap, NCC[1], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0002", "26/10/2022", NV[0].maNV, NV[0], NCC[3].maNhaCungCap, NCC[3], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0003", "27/10/2022", NV[0].maNV, NV[0], NCC[1].maNhaCungCap, NCC[1], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0004", "15/11/2022", NV[1].maNV, NV[1], NCC[4].maNhaCungCap, NCC[4], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0005", "25/11/2022", NV[1].maNV, NV[1], NCC[0].maNhaCungCap, NCC[0], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0006", "26/11/2022", NV[1].maNV, NV[1], NCC[1].maNhaCungCap, NCC[1], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0007", "07/11/2022", NV[2].maNV, NV[2], NCC[2].maNhaCungCap, NCC[2], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0008", "29/10/2022", NV[2].maNV, NV[2], NCC[4].maNhaCungCap, NCC[4], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0009", "15/11/2022", NV[3].maNV, NV[3], NCC[3].maNhaCungCap, NCC[3], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0010", "18/11/2022", NV[3].maNV, NV[3], NCC[1].maNhaCungCap, NCC[1], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0011", "30/10/2022", NV[3].maNV, NV[3], NCC[4].maNhaCungCap, NCC[4], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0012", "21/11/2022", NV[4].maNV, NV[4], NCC[3].maNhaCungCap, NCC[3], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0013", "18/11/2022", NV[4].maNV, NV[4], NCC[2].maNhaCungCap, NCC[2], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0014", "30/10/2022", NV[5].maNV, NV[5], NCC[1].maNhaCungCap, NCC[1], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0015", "01/11/2022", NV[5].maNV, NV[5], NCC[3].maNhaCungCap, NCC[3], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0016", "30/10/2022", NV[6].maNV, NV[6], NCC[1].maNhaCungCap, NCC[1], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0017", "21/11/2022", NV[6].maNV, NV[6], NCC[0].maNhaCungCap, NCC[0], new List<ThietBi>()));
            PN.Add(new PhieuNhap("PN0018", "18/11/2022", NV[6].maNV, NV[6], NCC[2].maNhaCungCap, NCC[2], new List<ThietBi>()));
 
            // Liên kết nhân viên với phiếu nhập (1 - n)
            NV[0].dsPhieuNhap.Add(PN[0]);
            NV[0].dsPhieuNhap.Add(PN[1]);
            NV[0].dsPhieuNhap.Add(PN[2]);
            NV[1].dsPhieuNhap.Add(PN[3]);
            NV[1].dsPhieuNhap.Add(PN[4]);
            NV[1].dsPhieuNhap.Add(PN[5]);
            NV[2].dsPhieuNhap.Add(PN[6]);
            NV[2].dsPhieuNhap.Add(PN[7]);
            NV[3].dsPhieuNhap.Add(PN[8]);
            NV[3].dsPhieuNhap.Add(PN[9]);
            NV[3].dsPhieuNhap.Add(PN[10]);
            NV[4].dsPhieuNhap.Add(PN[11]);
            NV[4].dsPhieuNhap.Add(PN[12]);
            NV[5].dsPhieuNhap.Add(PN[13]);
            NV[5].dsPhieuNhap.Add(PN[14]);
            NV[6].dsPhieuNhap.Add(PN[15]);
            NV[6].dsPhieuNhap.Add(PN[16]);
            NV[6].dsPhieuNhap.Add(PN[17]);

            //Liên kết nhà cung cấp với phiếu nhập (1 - n)
            NCC[0].dsPhieuNhap.Add(PN[4]);
            NCC[0].dsPhieuNhap.Add(PN[16]);
            NCC[1].dsPhieuNhap.Add(PN[0]);
            NCC[1].dsPhieuNhap.Add(PN[2]);
            NCC[1].dsPhieuNhap.Add(PN[5]);
            NCC[1].dsPhieuNhap.Add(PN[9]);
            NCC[1].dsPhieuNhap.Add(PN[13]);
            NCC[1].dsPhieuNhap.Add(PN[15]);
            NCC[2].dsPhieuNhap.Add(PN[6]);
            NCC[2].dsPhieuNhap.Add(PN[12]);
            NCC[2].dsPhieuNhap.Add(PN[17]);
            NCC[3].dsPhieuNhap.Add(PN[1]);
            NCC[3].dsPhieuNhap.Add(PN[8]);
            NCC[3].dsPhieuNhap.Add(PN[11]);
            NCC[3].dsPhieuNhap.Add(PN[14]);
            NCC[4].dsPhieuNhap.Add(PN[3]);
            NCC[4].dsPhieuNhap.Add(PN[7]);
            NCC[4].dsPhieuNhap.Add(PN[10]);

            // Liên kết phiếu nhập với thiết bị (n - n)
            PN[4].dsThietBi.Add(TB[4]);
            PN[4].dsThietBi.Add(TB[5]);
            PN[4].dsThietBi.Add(TB[13]);
            PN[4].dsThietBi.Add(TB[18]);
            PN[16].dsThietBi.Add(TB[4]);
            PN[16].dsThietBi.Add(TB[13]);
            PN[16].dsThietBi.Add(TB[18]);
            PN[0].dsThietBi.Add(TB[8]);
            PN[0].dsThietBi.Add(TB[23]);
            PN[2].dsThietBi.Add(TB[3]);
            PN[2].dsThietBi.Add(TB[12]);
            PN[2].dsThietBi.Add(TB[16]);
            PN[5].dsThietBi.Add(TB[3]);
            PN[5].dsThietBi.Add(TB[12]);
            PN[9].dsThietBi.Add(TB[16]);
            PN[13].dsThietBi.Add(TB[8]);
            PN[13].dsThietBi.Add(TB[23]);
            PN[15].dsThietBi.Add(TB[23]);
            PN[15].dsThietBi.Add(TB[3]);
            PN[6].dsThietBi.Add(TB[1]);
            PN[6].dsThietBi.Add(TB[2]);
            PN[6].dsThietBi.Add(TB[9]);
            PN[6].dsThietBi.Add(TB[14]);
            PN[7].dsThietBi.Add(TB[19]);
            PN[7].dsThietBi.Add(TB[21]);
            PN[7].dsThietBi.Add(TB[9]);
            PN[12].dsThietBi.Add(TB[1]);
            PN[12].dsThietBi.Add(TB[2]);
            PN[12].dsThietBi.Add(TB[14]);
            PN[17].dsThietBi.Add(TB[9]);
            PN[17].dsThietBi.Add(TB[19]);
            PN[17].dsThietBi.Add(TB[21]);
            PN[1].dsThietBi.Add(TB[0]);
            PN[1].dsThietBi.Add(TB[7]);
            PN[1].dsThietBi.Add(TB[11]);
            PN[1].dsThietBi.Add(TB[22]);
            PN[8].dsThietBi.Add(TB[17]);
            PN[8].dsThietBi.Add(TB[22]);
            PN[11].dsThietBi.Add(TB[0]);
            PN[11].dsThietBi.Add(TB[7]);
            PN[14].dsThietBi.Add(TB[11]);
            PN[14].dsThietBi.Add(TB[17]);
            PN[3].dsThietBi.Add(TB[6]);
            PN[3].dsThietBi.Add(TB[10]);
            PN[3].dsThietBi.Add(TB[20]);
            PN[7].dsThietBi.Add(TB[6]);
            PN[7].dsThietBi.Add(TB[15]);
            PN[7].dsThietBi.Add(TB[24]);
            PN[10].dsThietBi.Add(TB[10]);
            PN[10].dsThietBi.Add(TB[15]);

            TB[0].dsPhieuNhap.Add(PN[1]);
            TB[0].dsPhieuNhap.Add(PN[11]);
            TB[1].dsPhieuNhap.Add(PN[6]);
            TB[1].dsPhieuNhap.Add(PN[12]);
            TB[2].dsPhieuNhap.Add(PN[6]);
            TB[2].dsPhieuNhap.Add(PN[12]);
            TB[3].dsPhieuNhap.Add(PN[2]);
            TB[3].dsPhieuNhap.Add(PN[5]);
            TB[3].dsPhieuNhap.Add(PN[15]);
            TB[4].dsPhieuNhap.Add(PN[4]);
            TB[4].dsPhieuNhap.Add(PN[16]);
            TB[5].dsPhieuNhap.Add(PN[4]);
            TB[6].dsPhieuNhap.Add(PN[3]);
            TB[6].dsPhieuNhap.Add(PN[7]);
            TB[7].dsPhieuNhap.Add(PN[1]);
            TB[7].dsPhieuNhap.Add(PN[11]);
            TB[8].dsPhieuNhap.Add(PN[0]);
            TB[8].dsPhieuNhap.Add(PN[13]);
            TB[9].dsPhieuNhap.Add(PN[6]);
            TB[9].dsPhieuNhap.Add(PN[7]);
            TB[9].dsPhieuNhap.Add(PN[17]);
            TB[10].dsPhieuNhap.Add(PN[3]);
            TB[10].dsPhieuNhap.Add(PN[10]);
            TB[11].dsPhieuNhap.Add(PN[1]);
            TB[11].dsPhieuNhap.Add(PN[14]);
            TB[12].dsPhieuNhap.Add(PN[2]);
            TB[12].dsPhieuNhap.Add(PN[5]);
            TB[13].dsPhieuNhap.Add(PN[4]);
            TB[13].dsPhieuNhap.Add(PN[16]);
            TB[14].dsPhieuNhap.Add(PN[6]);
            TB[14].dsPhieuNhap.Add(PN[12]);
            TB[15].dsPhieuNhap.Add(PN[7]);
            TB[15].dsPhieuNhap.Add(PN[10]);
            TB[16].dsPhieuNhap.Add(PN[2]);
            TB[16].dsPhieuNhap.Add(PN[9]);
            TB[17].dsPhieuNhap.Add(PN[8]);
            TB[17].dsPhieuNhap.Add(PN[14]);
            TB[18].dsPhieuNhap.Add(PN[4]);
            TB[18].dsPhieuNhap.Add(PN[16]);
            TB[19].dsPhieuNhap.Add(PN[7]);
            TB[19].dsPhieuNhap.Add(PN[17]);
            TB[20].dsPhieuNhap.Add(PN[3]);
            TB[21].dsPhieuNhap.Add(PN[7]);
            TB[21].dsPhieuNhap.Add(PN[17]);
            TB[22].dsPhieuNhap.Add(PN[1]);
            TB[22].dsPhieuNhap.Add(PN[8]);
            TB[23].dsPhieuNhap.Add(PN[0]);
            TB[23].dsPhieuNhap.Add(PN[13]);
            TB[23].dsPhieuNhap.Add(PN[15]);
            TB[24].dsPhieuNhap.Add(PN[7]);
        }
        public static void taoChiTietPhieuNhap()
        {
            //ChiTietPhieuNhap(int soLuong, string maPN, PhieuNhap pn, string maThietBi, ThietBi tb)
            CTPN.Add(new ChiTietPhieuNhap(50, PN[4].maPN, PN[4], TB[4].maThietBi, TB[4]));
            CTPN.Add(new ChiTietPhieuNhap(20, PN[4].maPN, PN[4], TB[5].maThietBi, TB[5]));
            CTPN.Add(new ChiTietPhieuNhap(40, PN[4].maPN, PN[4], TB[13].maThietBi, TB[13]));
            CTPN.Add(new ChiTietPhieuNhap(60, PN[4].maPN, PN[4], TB[18].maThietBi, TB[18]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[16].maPN, PN[16], TB[4].maThietBi, TB[4]));
            CTPN.Add(new ChiTietPhieuNhap(30, PN[16].maPN, PN[16], TB[13].maThietBi, TB[13]));
            CTPN.Add(new ChiTietPhieuNhap(20, PN[16].maPN, PN[16], TB[18].maThietBi, TB[18]));

            CTPN.Add(new ChiTietPhieuNhap(35, PN[0].maPN, PN[0], TB[8].maThietBi, TB[8]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[0].maPN, PN[0], TB[23].maThietBi, TB[23]));
            CTPN.Add(new ChiTietPhieuNhap(40, PN[2].maPN, PN[2], TB[3].maThietBi, TB[3]));
            CTPN.Add(new ChiTietPhieuNhap(55, PN[2].maPN, PN[2], TB[12].maThietBi, TB[12]));
            CTPN.Add(new ChiTietPhieuNhap(100, PN[2].maPN, PN[2], TB[16].maThietBi, TB[16]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[5].maPN, PN[5], TB[3].maThietBi, TB[3]));
            CTPN.Add(new ChiTietPhieuNhap(55, PN[5].maPN, PN[5], TB[12].maThietBi, TB[12]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[9].maPN, PN[9], TB[16].maThietBi, TB[16]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[13].maPN, PN[13], TB[8].maThietBi, TB[8]));
            CTPN.Add(new ChiTietPhieuNhap(40, PN[13].maPN, PN[13], TB[23].maThietBi, TB[23]));
            CTPN.Add(new ChiTietPhieuNhap(45, PN[15].maPN, PN[15], TB[23].maThietBi, TB[23]));
            CTPN.Add(new ChiTietPhieuNhap(20, PN[15].maPN, PN[15], TB[3].maThietBi, TB[3]));

            CTPN.Add(new ChiTietPhieuNhap(50, PN[6].maPN, PN[6], TB[1].maThietBi, TB[1]));
            CTPN.Add(new ChiTietPhieuNhap(25, PN[6].maPN, PN[6], TB[2].maThietBi, TB[2]));
            CTPN.Add(new ChiTietPhieuNhap(80, PN[6].maPN, PN[6], TB[9].maThietBi, TB[9]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[6].maPN, PN[6], TB[14].maThietBi, TB[14]));
            CTPN.Add(new ChiTietPhieuNhap(60, PN[7].maPN, PN[7], TB[19].maThietBi, TB[19]));
            CTPN.Add(new ChiTietPhieuNhap(30, PN[7].maPN, PN[7], TB[21].maThietBi, TB[21]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[7].maPN, PN[7], TB[9].maThietBi, TB[9]));
            CTPN.Add(new ChiTietPhieuNhap(40, PN[12].maPN, PN[12], TB[1].maThietBi, TB[1]));
            CTPN.Add(new ChiTietPhieuNhap(15, PN[12].maPN, PN[12], TB[2].maThietBi, TB[2]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[12].maPN, PN[12], TB[14].maThietBi, TB[14]));
            CTPN.Add(new ChiTietPhieuNhap(40, PN[17].maPN, PN[17], TB[9].maThietBi, TB[9]));
            CTPN.Add(new ChiTietPhieuNhap(30, PN[17].maPN, PN[17], TB[19].maThietBi, TB[19]));
            CTPN.Add(new ChiTietPhieuNhap(45, PN[17].maPN, PN[17], TB[21].maThietBi, TB[21]));

            CTPN.Add(new ChiTietPhieuNhap(50, PN[1].maPN, PN[1], TB[0].maThietBi, TB[0]));
            CTPN.Add(new ChiTietPhieuNhap(30, PN[1].maPN, PN[1], TB[7].maThietBi, TB[7]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[1].maPN, PN[1], TB[11].maThietBi, TB[11]));
            CTPN.Add(new ChiTietPhieuNhap(60, PN[1].maPN, PN[1], TB[22].maThietBi, TB[22]));
            CTPN.Add(new ChiTietPhieuNhap(10, PN[8].maPN, PN[8], TB[17].maThietBi, TB[17]));
            CTPN.Add(new ChiTietPhieuNhap(20, PN[8].maPN, PN[8], TB[22].maThietBi, TB[22]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[11].maPN, PN[11], TB[0].maThietBi, TB[0]));
            CTPN.Add(new ChiTietPhieuNhap(20, PN[11].maPN, PN[11], TB[7].maThietBi, TB[7]));
            CTPN.Add(new ChiTietPhieuNhap(25, PN[14].maPN, PN[14], TB[11].maThietBi, TB[11]));
            CTPN.Add(new ChiTietPhieuNhap(25, PN[14].maPN, PN[14], TB[17].maThietBi, TB[17]));

            CTPN.Add(new ChiTietPhieuNhap(40, PN[3].maPN, PN[3], TB[6].maThietBi, TB[6]));
            CTPN.Add(new ChiTietPhieuNhap(45, PN[3].maPN, PN[3], TB[10].maThietBi, TB[10]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[3].maPN, PN[3], TB[20].maThietBi, TB[20]));
            CTPN.Add(new ChiTietPhieuNhap(20, PN[7].maPN, PN[7], TB[6].maThietBi, TB[6]));
            CTPN.Add(new ChiTietPhieuNhap(30, PN[7].maPN, PN[7], TB[15].maThietBi, TB[15]));
            CTPN.Add(new ChiTietPhieuNhap(20, PN[7].maPN, PN[7], TB[24].maThietBi, TB[24]));
            CTPN.Add(new ChiTietPhieuNhap(50, PN[10].maPN, PN[10], TB[10].maThietBi, TB[10]));
            CTPN.Add(new ChiTietPhieuNhap(15, PN[10].maPN, PN[10], TB[15].maThietBi, TB[15]));
        }
        public static void taoPhieuXuat()
        {
            //PhieuXuat(string maPX, string ngayXuat, string maNV, NhanVien nv, string maKhachHang, KhachHang kh, ICollection<ThietBi> dsThietBi)
            PX.Add(new PhieuXuat("PX0001", "11/12/2022", NV[0].maNV, NV[0], KH[0].maKH, KH[0], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0002", "13/12/2022", NV[0].maNV, NV[0], KH[0].maKH, KH[0], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0003", "09/12/2022", NV[0].maNV, NV[0], KH[1].maKH, KH[1], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0004", "08/12/2022", NV[1].maNV, NV[1], KH[1].maKH, KH[1], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0005", "09/12/2022", NV[1].maNV, NV[1], KH[2].maKH, KH[2], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0006", "10/12/2022", NV[1].maNV, NV[1], KH[3].maKH, KH[3], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0007", "11/12/2022", NV[1].maNV, NV[1], KH[3].maKH, KH[3], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0008", "01/12/2022", NV[2].maNV, NV[2], KH[4].maKH, KH[4], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0009", "02/12/2022", NV[2].maNV, NV[2], KH[4].maKH, KH[4], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0010", "05/12/2022", NV[2].maNV, NV[2], KH[5].maKH, KH[5], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0011", "05/12/2022", NV[2].maNV, NV[2], KH[5].maKH, KH[5], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0012", "06/12/2022", NV[2].maNV, NV[2], KH[6].maKH, KH[6], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0013", "12/12/2022", NV[3].maNV, NV[3], KH[7].maKH, KH[7], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0014", "09/12/2022", NV[3].maNV, NV[3], KH[7].maKH, KH[7], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0015", "10/12/2022", NV[3].maNV, NV[3], KH[7].maKH, KH[7], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0016", "03/12/2022", NV[3].maNV, NV[3], KH[8].maKH, KH[8], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0017", "04/12/2022", NV[3].maNV, NV[3], KH[8].maKH, KH[8], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0018", "07/12/2022", NV[4].maNV, NV[4], KH[9].maKH, KH[9], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0019", "07/12/2022", NV[4].maNV, NV[4], KH[9].maKH, KH[9], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0020", "08/12/2022", NV[4].maNV, NV[4], KH[10].maKH, KH[10], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0021", "04/12/2022", NV[5].maNV, NV[5], KH[10].maKH, KH[10], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0022", "09/12/2022", NV[5].maNV, NV[5], KH[11].maKH, KH[11], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0023", "09/12/2022", NV[5].maNV, NV[5], KH[11].maKH, KH[11], new List<ThietBi>()));
            PX.Add(new PhieuXuat("PX0024", "09/12/2022", NV[6].maNV, NV[6], KH[11].maKH, KH[11], new List<ThietBi>()));

            // Liên kết nhân viên với phiếu xuất (1 - n)
            NV[0].dsPhieuXuat.Add(PX[0]);
            NV[0].dsPhieuXuat.Add(PX[1]);
            NV[0].dsPhieuXuat.Add(PX[2]);
            NV[1].dsPhieuXuat.Add(PX[3]);
            NV[1].dsPhieuXuat.Add(PX[4]);
            NV[1].dsPhieuXuat.Add(PX[5]);
            NV[1].dsPhieuXuat.Add(PX[6]);
            NV[2].dsPhieuXuat.Add(PX[7]);
            NV[2].dsPhieuXuat.Add(PX[8]);
            NV[2].dsPhieuXuat.Add(PX[9]);
            NV[2].dsPhieuXuat.Add(PX[10]);
            NV[2].dsPhieuXuat.Add(PX[11]);
            NV[3].dsPhieuXuat.Add(PX[12]);
            NV[3].dsPhieuXuat.Add(PX[13]);
            NV[3].dsPhieuXuat.Add(PX[14]);
            NV[3].dsPhieuXuat.Add(PX[15]);
            NV[3].dsPhieuXuat.Add(PX[16]);
            NV[4].dsPhieuXuat.Add(PX[17]);
            NV[4].dsPhieuXuat.Add(PX[18]);
            NV[4].dsPhieuXuat.Add(PX[19]);
            NV[5].dsPhieuXuat.Add(PX[20]);
            NV[5].dsPhieuXuat.Add(PX[21]);
            NV[5].dsPhieuXuat.Add(PX[22]);
            NV[6].dsPhieuXuat.Add(PX[23]);

            // Liên kết khách hàng với phiếu xuất (1 - n)
            KH[0].dsPhieuXuat.Add(PX[0]);
            KH[0].dsPhieuXuat.Add(PX[1]);
            KH[1].dsPhieuXuat.Add(PX[2]);
            KH[1].dsPhieuXuat.Add(PX[3]);
            KH[2].dsPhieuXuat.Add(PX[4]);
            KH[3].dsPhieuXuat.Add(PX[5]);
            KH[3].dsPhieuXuat.Add(PX[6]);
            KH[4].dsPhieuXuat.Add(PX[7]);
            KH[4].dsPhieuXuat.Add(PX[8]);
            KH[5].dsPhieuXuat.Add(PX[9]);
            KH[5].dsPhieuXuat.Add(PX[10]);
            KH[6].dsPhieuXuat.Add(PX[11]);
            KH[7].dsPhieuXuat.Add(PX[12]);
            KH[7].dsPhieuXuat.Add(PX[13]);
            KH[7].dsPhieuXuat.Add(PX[14]);
            KH[8].dsPhieuXuat.Add(PX[15]);
            KH[8].dsPhieuXuat.Add(PX[16]);
            KH[9].dsPhieuXuat.Add(PX[17]);
            KH[9].dsPhieuXuat.Add(PX[18]);
            KH[10].dsPhieuXuat.Add(PX[19]);
            KH[10].dsPhieuXuat.Add(PX[20]);
            KH[11].dsPhieuXuat.Add(PX[21]);
            KH[11].dsPhieuXuat.Add(PX[22]);
            KH[11].dsPhieuXuat.Add(PX[23]);

            // Liên kết phiếu xuất với thiết bị (n - n)
            PX[0].dsThietBi.Add(TB[0]);
            PX[0].dsThietBi.Add(TB[4]);
            PX[0].dsThietBi.Add(TB[11]);
            PX[1].dsThietBi.Add(TB[1]);
            PX[1].dsThietBi.Add(TB[23]);
            PX[1].dsThietBi.Add(TB[14]);
            PX[2].dsThietBi.Add(TB[3]);
            PX[2].dsThietBi.Add(TB[15]);
            PX[2].dsThietBi.Add(TB[21]);
            PX[3].dsThietBi.Add(TB[2]);
            PX[3].dsThietBi.Add(TB[7]);
            PX[4].dsThietBi.Add(TB[5]);
            PX[4].dsThietBi.Add(TB[12]);
            PX[4].dsThietBi.Add(TB[9]);
            PX[5].dsThietBi.Add(TB[17]);
            PX[5].dsThietBi.Add(TB[6]);
            PX[5].dsThietBi.Add(TB[24]);
            PX[6].dsThietBi.Add(TB[20]);
            PX[6].dsThietBi.Add(TB[8]);
            PX[7].dsThietBi.Add(TB[13]);
            PX[7].dsThietBi.Add(TB[16]);
            PX[8].dsThietBi.Add(TB[18]);
            PX[8].dsThietBi.Add(TB[22]);
            PX[8].dsThietBi.Add(TB[23]);
            PX[9].dsThietBi.Add(TB[24]);
            PX[10].dsThietBi.Add(TB[2]);
            PX[11].dsThietBi.Add(TB[11]);
            PX[11].dsThietBi.Add(TB[15]);
            PX[12].dsThietBi.Add(TB[12]);
            PX[12].dsThietBi.Add(TB[1]);
            PX[13].dsThietBi.Add(TB[5]);
            PX[13].dsThietBi.Add(TB[18]);
            PX[14].dsThietBi.Add(TB[4]);
            PX[15].dsThietBi.Add(TB[9]);
            PX[15].dsThietBi.Add(TB[7]);
            PX[15].dsThietBi.Add(TB[21]);
            PX[16].dsThietBi.Add(TB[3]);
            PX[16].dsThietBi.Add(TB[13]);
            PX[16].dsThietBi.Add(TB[8]);
            PX[17].dsThietBi.Add(TB[17]);
            PX[17].dsThietBi.Add(TB[24]);
            PX[18].dsThietBi.Add(TB[6]);
            PX[18].dsThietBi.Add(TB[10]);
            PX[18].dsThietBi.Add(TB[14]);
            PX[19].dsThietBi.Add(TB[16]);
            PX[19].dsThietBi.Add(TB[22]);
            PX[20].dsThietBi.Add(TB[19]);
            PX[20].dsThietBi.Add(TB[23]);
            PX[21].dsThietBi.Add(TB[20]);
            PX[22].dsThietBi.Add(TB[18]);
            PX[23].dsThietBi.Add(TB[9]);


            TB[0].dsPhieuXuat.Add(PX[0]);
            TB[1].dsPhieuXuat.Add(PX[1]);
            TB[1].dsPhieuXuat.Add(PX[12]);
            TB[2].dsPhieuXuat.Add(PX[3]);
            TB[2].dsPhieuXuat.Add(PX[10]);
            TB[3].dsPhieuXuat.Add(PX[2]);
            TB[3].dsPhieuXuat.Add(PX[15]);
            TB[4].dsPhieuXuat.Add(PX[0]);
            TB[4].dsPhieuXuat.Add(PX[14]);
            TB[5].dsPhieuXuat.Add(PX[4]);
            TB[5].dsPhieuXuat.Add(PX[13]);
            TB[6].dsPhieuXuat.Add(PX[5]);
            TB[6].dsPhieuXuat.Add(PX[18]);
            TB[7].dsPhieuXuat.Add(PX[3]);
            TB[7].dsPhieuXuat.Add(PX[15]);
            TB[8].dsPhieuXuat.Add(PX[6]);
            TB[8].dsPhieuXuat.Add(PX[16]);
            TB[9].dsPhieuXuat.Add(PX[4]);
            TB[9].dsPhieuXuat.Add(PX[15]);
            TB[9].dsPhieuXuat.Add(PX[23]);
            TB[10].dsPhieuXuat.Add(PX[18]);
            TB[11].dsPhieuXuat.Add(PX[0]);
            TB[11].dsPhieuXuat.Add(PX[11]);
            TB[12].dsPhieuXuat.Add(PX[4]);
            TB[12].dsPhieuXuat.Add(PX[12]);
            TB[13].dsPhieuXuat.Add(PX[7]);
            TB[13].dsPhieuXuat.Add(PX[16]);
            TB[14].dsPhieuXuat.Add(PX[1]);
            TB[14].dsPhieuXuat.Add(PX[18]);
            TB[15].dsPhieuXuat.Add(PX[2]);
            TB[15].dsPhieuXuat.Add(PX[11]);
            TB[16].dsPhieuXuat.Add(PX[7]);
            TB[16].dsPhieuXuat.Add(PX[19]);
            TB[17].dsPhieuXuat.Add(PX[5]);
            TB[17].dsPhieuXuat.Add(PX[17]);
            TB[18].dsPhieuXuat.Add(PX[8]);
            TB[18].dsPhieuXuat.Add(PX[13]);
            TB[18].dsPhieuXuat.Add(PX[22]);
            TB[19].dsPhieuXuat.Add(PX[20]);
            TB[20].dsPhieuXuat.Add(PX[6]);
            TB[20].dsPhieuXuat.Add(PX[21]);
            TB[21].dsPhieuXuat.Add(PX[2]);
            TB[21].dsPhieuXuat.Add(PX[15]);
            TB[22].dsPhieuXuat.Add(PX[8]);
            TB[22].dsPhieuXuat.Add(PX[19]);
            TB[23].dsPhieuXuat.Add(PX[8]);
            TB[23].dsPhieuXuat.Add(PX[20]);
            TB[23].dsPhieuXuat.Add(PX[1]);
            TB[24].dsPhieuXuat.Add(PX[5]);
            TB[24].dsPhieuXuat.Add(PX[9]);
            TB[24].dsPhieuXuat.Add(PX[17]);
        }
        public static void taoChiTietPhieuXuat()
        {
            //ChiTietPhieuXuat(int soLuong, string maPX, PhieuXuat px, string maThietBi, ThietBi tb)
            CTPX.Add(new ChiTietPhieuXuat(2, PX[0].maPX, PX[0], TB[0].maThietBi, TB[0]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[0].maPX, PX[0], TB[4].maThietBi, TB[4]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[0].maPX, PX[0], TB[11].maThietBi, TB[11]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[1].maPX, PX[1], TB[1].maThietBi, TB[1]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[1].maPX, PX[1], TB[23].maThietBi, TB[23]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[1].maPX, PX[1], TB[14].maThietBi, TB[14]));
            CTPX.Add(new ChiTietPhieuXuat(3, PX[2].maPX, PX[2], TB[3].maThietBi, TB[3]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[2].maPX, PX[2], TB[15].maThietBi, TB[15]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[2].maPX, PX[2], TB[21].maThietBi, TB[21]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[3].maPX, PX[3], TB[2].maThietBi, TB[2]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[3].maPX, PX[3], TB[7].maThietBi, TB[7]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[4].maPX, PX[4], TB[5].maThietBi, TB[5]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[4].maPX, PX[4], TB[12].maThietBi, TB[12]));
            CTPX.Add(new ChiTietPhieuXuat(3, PX[4].maPX, PX[4], TB[9].maThietBi, TB[9]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[5].maPX, PX[5], TB[17].maThietBi, TB[17]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[5].maPX, PX[5], TB[6].maThietBi, TB[6]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[5].maPX, PX[5], TB[24].maThietBi, TB[24]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[6].maPX, PX[6], TB[20].maThietBi, TB[20]));
            CTPX.Add(new ChiTietPhieuXuat(3, PX[6].maPX, PX[6], TB[8].maThietBi, TB[8]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[7].maPX, PX[7], TB[13].maThietBi, TB[13]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[7].maPX, PX[7], TB[16].maThietBi, TB[16]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[8].maPX, PX[8], TB[18].maThietBi, TB[18]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[8].maPX, PX[8], TB[22].maThietBi, TB[22]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[8].maPX, PX[8], TB[23].maThietBi, TB[23]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[9].maPX, PX[9], TB[24].maThietBi, TB[24]));
            CTPX.Add(new ChiTietPhieuXuat(3, PX[10].maPX, PX[10], TB[2].maThietBi, TB[2]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[11].maPX, PX[11], TB[11].maThietBi, TB[11]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[11].maPX, PX[11], TB[15].maThietBi, TB[15]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[12].maPX, PX[12], TB[12].maThietBi, TB[12]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[12].maPX, PX[12], TB[1].maThietBi, TB[1]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[13].maPX, PX[13], TB[5].maThietBi, TB[5]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[13].maPX, PX[13], TB[18].maThietBi, TB[18]));
            CTPX.Add(new ChiTietPhieuXuat(4, PX[14].maPX, PX[14], TB[4].maThietBi, TB[4]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[15].maPX, PX[15], TB[9].maThietBi, TB[9]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[15].maPX, PX[15], TB[7].maThietBi, TB[7]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[15].maPX, PX[15], TB[21].maThietBi, TB[21]));
            CTPX.Add(new ChiTietPhieuXuat(3, PX[16].maPX, PX[16], TB[3].maThietBi, TB[3]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[16].maPX, PX[16], TB[13].maThietBi, TB[13]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[16].maPX, PX[16], TB[8].maThietBi, TB[8]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[17].maPX, PX[17], TB[17].maThietBi, TB[17]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[17].maPX, PX[17], TB[24].maThietBi, TB[24]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[18].maPX, PX[18], TB[6].maThietBi, TB[6]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[18].maPX, PX[18], TB[10].maThietBi, TB[10]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[18].maPX, PX[18], TB[14].maThietBi, TB[14]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[19].maPX, PX[19], TB[16].maThietBi, TB[16]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[19].maPX, PX[19], TB[22].maThietBi, TB[22]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[20].maPX, PX[20], TB[19].maThietBi, TB[19]));
            CTPX.Add(new ChiTietPhieuXuat(2, PX[20].maPX, PX[20], TB[23].maThietBi, TB[23]));
            CTPX.Add(new ChiTietPhieuXuat(3, PX[21].maPX, PX[21], TB[20].maThietBi, TB[20]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[22].maPX, PX[22], TB[18].maThietBi, TB[18]));
            CTPX.Add(new ChiTietPhieuXuat(1, PX[23].maPX, PX[23], TB[9].maThietBi, TB[9]));

        }
        public static void Cau1()
        {
            // 1) In ra tên, loại, tên nhà sản xuất, giá thành (tăng dần) của các thiết bị trong cửa hàng
            var result = TB.Select(tb =>
            {
                return new
                {
                    ten = tb.tenThietBi,
                    loai = tb.ltb.theLoai,
                    nsx = tb.nsx.tenNSX,
                    giaThanh = tb.giaThanh,
                };
            }).OrderBy(tb => tb.giaThanh);
            Console.WriteLine("1) In ra tên, loại, tên nhà sản xuất, giá thành (tăng dần) của thiết bị trong cửa hàng");
            foreach (var t in result)
            {
                Console.WriteLine("\tTên thiết bị: " + t.ten + ", Loại: " + t.loai + ", NSX: " + t.nsx + ", Giá: " + t.giaThanh);
            }
        }
        public static void Cau2()
        {
            // 2) Liệt kê các thiết bị mà mỗi nhà cung cấp cung cấp đến
            Console.WriteLine("2) Liệt kê các thiết bị mà mỗi nhà cung cấp cung cấp đến ");
            var result = from tb in TB
                         group tb by tb.ncc.tenNhaCungCap into g
                         select g;
            foreach (var t in result)
            {
                Console.WriteLine("\tNhà cung cấp: " + t.Key);
                foreach (var k in t)
                {
                    Console.WriteLine("\t\t" + "Thiết bị: " + k.tenThietBi);
                }
            }
        }
        public static void Cau3()
        {
            // 3) Liệt kê các phiếu nhập, phiếu xuất mà mỗi nhân viên nhập vào
            var result = NV.Select(nv =>
            {
                return new
                {
                    tenNhanVien = nv.hoTen.hoDem + " " + nv.hoTen.ten,
                    phieuNhap = nv.dsPhieuNhap.OrderBy(pn => pn.maPN),
                    phieuXuat = nv.dsPhieuXuat.OrderBy(px => px.maPX),
                };
            });
            Console.WriteLine("3) Liệt kê các phiếu nhập, phiếu xuất mà mỗi nhân viên nhập vào");
            foreach (var t in result)
            {
                Console.WriteLine("\tNhân viên: " + t.tenNhanVien);
                Console.WriteLine("\t\tPhiếu nhập: ");
                foreach (var pn in t.phieuNhap)
                {
                    Console.WriteLine("\t\t\tMã phiếu nhập: " + pn.maPN + "\tNgày nhập: " + pn.ngayNhap);
                }
                Console.WriteLine("\t\tPhiếu xuất: ");
                foreach (var px in t.phieuXuat)
                {
                    Console.WriteLine("\t\t\tMã phiếu xuất: " + px.maPX + "\tNgày xuất: " + px.ngayXuat);
                }
            }

        }
        public static void Cau4()
        {
            // 4) Liệt kê các thiết bị và số lượng mỗi thiết bị trong mỗi phiếu xuất của ngày 09/12/2022
            var result = PX.Where(px => px.ngayXuat == "09/12/2022")
                           .Join(CTPX, px => px, ctpx => ctpx.px, (px, ctpx) => ctpx)
                           .GroupBy(ctpx => ctpx.maPX);
            Console.WriteLine("4) Liệt kê các thiết bị và số lượng mỗi thiết bị trong mỗi phiếu xuất của ngày 09/12/2022");
            foreach ( var t in result)
            {
                Console.WriteLine("\tMã phiếu xuất: " + t.Key);
                foreach(var n in t)
                {
                    Console.WriteLine("\t\t" + n.soLuong + " " + n.tb.tenThietBi);
                }
            }
        }
        public static void Cau5()
        {
            // 5) In ra loại thiết bị được bán nhiều nhất trong cửa hàng
            var r1 = from ctpx in CTPX
                     group ctpx by ctpx.tb.ltb into g
                     select new
                     {
                         ltb = g.Key,
                         tongSL = g.Select(k => k.soLuong).Sum(),
                     };
            var result = r1.OrderByDescending(r => r.tongSL).First();
            Console.WriteLine("5) In ra loại thiết bị được bán nhiều nhất trong cửa hàng");
            Console.WriteLine("\tLoại thiết bị được bán nhiều nhất trong cửa hàng là: " + result.ltb.theLoai + " (" + result.tongSL + " thiết bị)");

        }
        public static void Cau6()
        {
            // 6) Liệt kê tổng số tiền bán được của từng thiết bị
            var result = from tb in TB
                         select new
                         {
                             key = tb.tenThietBi,
                             px = tb.dsPhieuXuat.Join(CTPX, px => px, ctpx => ctpx.px, (px, ctpx) => ctpx)
                                                .Where(ctpx => ctpx.tb == tb)
                                                .Select(ctpx => ctpx.soLuong * ctpx.tb.giaThanh)
                                                .Sum()
                         };
            Console.WriteLine("6) Liệt kê tổng số tiền bán được của từng thiết bị");
            foreach (var t in result)
            {
                Console.Write("\tThiết bị: " + t.key);
                Console.WriteLine("\t\tTổng tiền bán: " + t.px);
            }
        }
        public static void Cau7()
        {
            // 7) Liệt kê số lượng tất cả các thiết bị mà mỗi khách hàng mua tại cửa hàng (theo thứ tự tăng dần về số lượng)
            var result = from px in PX
                         group px by px.kh.tenKH into g
                         select new
                         {
                             key = g.Key,
                             tb = g.Join(CTPX, px => px, ctpx => ctpx.px, (px, ctpx) => ctpx)
                                   .Select(ctpx =>
                                   {
                                        return new
                                        {
                                            soLuong = ctpx.soLuong,
                                            thietBi = ctpx.tb.tenThietBi
                                        };
                                   }).OrderBy(tb => tb.soLuong)
                         };
            Console.WriteLine("7) Liệt kê số lượng tất cả các thiết bị mà mỗi khách hàng mua tại cửa hàng (theo thứ tự tăng dần về số lượng)");
            foreach (var t in result)
            {
                Console.WriteLine("\tKhách hàng: " + t.key);
                foreach (var k in t.tb)
                {
                    Console.WriteLine("\t\t" + k.soLuong + " " + k.thietBi);
                }
            }

        }
        
        public static void Cau8()
        {
            // 8) In ra các khách hàng mua các thiết bị có phiếu xuất (hóa đơn) trên 15.000.000
            var result = KH.Select(kh =>
            {
                return new
                {
                    tenKH = kh.tenKH,
                    dspx = kh.dsPhieuXuat.Join(CTPX, px => px.maPX, ctpx => ctpx.maPX, (px, ctpx) => ctpx)
                                         .GroupBy(ctpx => ctpx.maPX)
                                         .Select(g => new 
                                         {
                                             maPX = g.Key,
                                             tongTien = g.Select(gg => gg.soLuong * gg.tb.giaThanh).Aggregate((a, b) => a + b),
                                         }).Where(dspx => dspx.tongTien >= 15000000)
                };
            }).Where(res => res.dspx.Count() != 0);
            Console.WriteLine("8) In ra các khách hàng mua các thiết bị có phiếu xuất (hóa đơn) trên 15.000.000");
            foreach (var n in result)
            {
                Console.WriteLine("\tKhách hàng: " + n.tenKH);
                foreach (var i in n.dspx)
                {
                    Console.WriteLine("\t\tMã phiếu xuất: " + i.maPX + " " + "Tổng tiền: " + i.tongTien);
                    
                }
            }
        }
        public static void Cau9()
        {
            // 9) In ra nhà sản xuất có tổng số lượng thiết bị được nhập từ nhà cung cấp trong cửa hàng nhiều nhất, ít nhất
            var r = from tb in TB
                    group tb by tb.nsx.tenNSX into g
                    select new
                    {
                        key = g.Key,
                        dspn = g.Select(tb => tb.dsPhieuNhap.Join(CTPN, pn => pn, ctpn => ctpn.pn, (pn, ctpn) => ctpn)
                                                            .Where(ctpn => ctpn.maThietBi == tb.maThietBi)
                                                            .Select(pn => pn.soLuong)
                                                            .Sum())
                                .Aggregate((a, b) => (a + b))
                    };
            var resultMax = r.Where(k => k.dspn == r.Max(d => d.dspn));
            var resultMin = r.Where(k => k.dspn == r.Min(d => d.dspn));
            
            Console.WriteLine("9) In ra nhà sản xuất có tổng số lượng thiết bị được nhập từ nhà cung cấp trong cửa hàng nhiều nhất, ít nhất");
            Console.Write("\tNhiều nhất là: ");
            foreach (var k in resultMax)
            {
                Console.WriteLine("\tNhà sản xuất " + k.key + " với " + k.dspn + " thiết bị");
            }
            Console.Write("\tÍt nhất là: ");
            foreach (var k in resultMin)
            {
                Console.WriteLine("\tNhà sản xuất " + k.key + " với " + k.dspn + " thiết bị");
            }
        }
        public static void Cau10()
        {
            // 10) Liệt kê các phiếu xuất có giá trung bình trên mỗi thiết bị lớn hơn hoặc bằng 3.500.000.
            var r1 = PX.Join(CTPX, px => px, ctpx => ctpx.px, (px, ctpx) => ctpx).GroupBy(ctpx => ctpx.px);
            var r2 = from i in r1
                     select new
                     {
                         px = i.Key,
                         tongSL = i.Select(px => px.soLuong).Sum(),
                         tongTien = i.Select(px => px.tb.giaThanh * px.soLuong).Sum(),
                     };
            var r3 = from i in r2
                     select new
                     {
                         maPX = i.px.maPX,
                         giaTB = i.tongTien / i.tongSL,
                     };
            var result = from i in r3
                         where i.giaTB >= 3500000
                         select i;
            Console.WriteLine("10) Liệt kê các phiếu xuất có giá trung bình trên mỗi thiết bị lớn hơn hoặc bằng 3.500.000 ");
            foreach(var t in result)
            {
                Console.WriteLine("\tMã PX: " + t.maPX + "\tGiá trung bình: " + t.giaTB + "/1 thiết bị");
            }
        }
        
        
        static void Main(string[] args)
        {
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
            Console.OutputEncoding = Encoding.UTF8;
            Cau1();
            Cau2();
            Cau3();
            Cau4();
            Cau5();
            Cau6();
            Cau7();
            Cau8();
            Cau9();
            Cau10();
        }
    }
}
