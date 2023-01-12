using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    public class HoTen
    {
        public string hoDem { get; set; }
        public string ten { get; set; }
        public HoTen (string hoDem, string ten)
        {
            this.hoDem = hoDem;
            this.ten = ten;
        }
        public HoTen (HoTen ht)
        {
            hoDem = ht.hoDem;
            ten = ht.ten;
        }
    }
    internal class NhanVien
    {
        public string maNV { get; set; } // Mã nhân viên
        public HoTen hoTen { get; set; } // Họ và tên
        public string ngaySinh {get; set; } // Ngày sinh
        public string SDT { get; set; } // Số điện thoại

        public NhanVien(string maNV, HoTen hoTen, string ngaySinh, string SDT, ICollection<PhieuNhap> dsPhieuNhap, ICollection<PhieuXuat> dsPhieuXuat)
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
        public ICollection<PhieuNhap> dsPhieuNhap { get; set; }
        public ICollection<PhieuXuat> dsPhieuXuat { get; set; }
    }
}
