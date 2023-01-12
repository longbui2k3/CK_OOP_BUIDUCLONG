using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class ThietBi
    {
        public string maThietBi { get; set; } // Mã thiết bị
        public string tenThietBi { get; set; } // Tên thiết bị
        public string maNSX { get; set; } // Mã nhà sản xuất
        public int giaThanh { get; set; } // Giá thành
        public string thongSoKT { get; set; } // Thông số kĩ thuật
        public string maLoai { get; set; } // Mã loại
       
        public string maNhaCungCap { get; set; } // Mã nhà cung cấp

        public ThietBi(string maThietBi, string tenThietBi, string thongSoKT, int giaThanh, string maNhaCungCap, NhaCungCap ncc, string maLoai, LoaiThietBi ltb, 
            string maNSX, NhaSanXuat nsx, ICollection<PhieuNhap> dsPhieuNhap, ICollection<PhieuXuat> dsPhieuXuat)
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
            ltb = tb.ltb;
            nsx = tb.nsx;
            ncc = tb.ncc;
            dsPhieuNhap = tb.dsPhieuNhap;
            dsPhieuXuat = tb.dsPhieuXuat;
        }
        public NhaCungCap ncc { get; set; }
        public LoaiThietBi ltb { get; set; }
        public NhaSanXuat nsx { get; set; }
        public ICollection<PhieuNhap> dsPhieuNhap { get; set; }
        public ICollection<PhieuXuat> dsPhieuXuat { get; set; }



    }
}
