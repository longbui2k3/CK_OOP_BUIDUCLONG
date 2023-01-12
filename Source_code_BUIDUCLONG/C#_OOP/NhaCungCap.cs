using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class NhaCungCap
    {
        public string maNhaCungCap { get; set; } // Mã nhà cung cấp
        public string tenNhaCungCap { get; set; } // Tên nhà cung cấp
        public string diaChi { get; set; } // Địa chỉ
        public string SDT { get; set; } // Số điện thoại

        public NhaCungCap(string maNhaCungCap, string tenNhaCungCap, string diaChi, string SDT, ICollection<PhieuNhap> dsPhieuNhap, ICollection<ThietBi> dsThietBi)
        {
            this.maNhaCungCap = maNhaCungCap;
            this.tenNhaCungCap = tenNhaCungCap;
            this.diaChi = diaChi;
            this.SDT = SDT;
            this.dsPhieuNhap = dsPhieuNhap;
            this.dsThietBi = dsThietBi;
        }
        public NhaCungCap(NhaCungCap ncc)
        {
            maNhaCungCap = ncc.maNhaCungCap;
            tenNhaCungCap = ncc.tenNhaCungCap;
            diaChi = ncc.diaChi;
            SDT = ncc.SDT;
            dsPhieuNhap = ncc.dsPhieuNhap;
            dsThietBi = ncc.dsThietBi;
        }
        public ICollection<PhieuNhap> dsPhieuNhap { get; set; }
        public ICollection<ThietBi> dsThietBi { get; set; }
    }
}
