using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class PhieuXuat
    {
        public string maPX { get; set; } // Mã phiếu xuất
        public string maNV { get; set; } // Mã nhân viên
        public string maKhachHang { get; set; } // Mã khách hàng
        public string ngayXuat { get; set; } // Ngày xuất

        public PhieuXuat(string maPX, string ngayXuat, string maNV, NhanVien nv, string maKhachHang, KhachHang kh, ICollection<ThietBi> dsThietBi)
        {
            this.maPX = maPX;
            this.maNV = maNV;
            this.maKhachHang = maKhachHang;
            this.ngayXuat = ngayXuat;
            this.kh = kh;
            this.nv = nv;
            this.dsThietBi = dsThietBi;
        }
        public PhieuXuat(PhieuXuat px)
        {
            maPX = px.maPX;
            maNV = px.maNV;
            maKhachHang = px.maKhachHang;
            ngayXuat = px.ngayXuat;
            kh = px.kh;
            nv = px.nv;
            dsThietBi = px.dsThietBi;
        }
        public KhachHang kh { get; set; }
        public NhanVien nv { get; set; }
        public ICollection<ThietBi> dsThietBi { get; set; }

    }
}
