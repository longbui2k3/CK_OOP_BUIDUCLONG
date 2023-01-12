using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class PhieuNhap
    {
        public string maPN { get; set; } // Mã phiếu nhập
        public string maNV { get; set; } // Mã nhân viên
        public string maNhaCungCap { get; set; } // Mã nhà cung cấp 
        public string ngayNhap { get; set; } // Ngày nhập

        public PhieuNhap(string maPN, string ngayNhap, string maNV, NhanVien nv, string maNhaCungCap, NhaCungCap ncc, ICollection<ThietBi> dsThietBi)
        {
            this.maPN = maPN;
            this.maNV = maNV;
            this.maNhaCungCap = maNhaCungCap;
            this.ngayNhap = ngayNhap;
            this.dsThietBi = dsThietBi;
            this.ncc = ncc;
            this.nv = nv;
        }
        public PhieuNhap(PhieuNhap pn)
        {
            maPN = pn.maPN;
            maNV = pn.maNV;
            maNhaCungCap = pn.maNhaCungCap;
            ngayNhap = pn.ngayNhap;
            dsThietBi = pn.dsThietBi;
            ncc = pn.ncc;
            nv = pn.nv;
            
        }
        public ICollection<ThietBi> dsThietBi { get; set; }
        public NhaCungCap ncc { get; set; }
        public NhanVien nv { get; set; }
    }
}
