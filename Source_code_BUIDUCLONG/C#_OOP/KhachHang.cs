using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class KhachHang
    {
        public string maKH { get; set; }// Mã khách hàng
        public string tenKH { get; set; }// Tên khách hàng
        public string diaChi { get; set; }// Địa chỉ
        public string SDT { get; set; } // Số điện thoại

        public KhachHang(string maKH, string tenKH, string diaChi, string SDT, ICollection<PhieuXuat> dsPhieuXuat)
        {
            this.maKH = maKH;
            this.tenKH = tenKH;
            this.diaChi = diaChi;
            this.SDT = SDT;
            this.dsPhieuXuat = dsPhieuXuat;
        }
        public KhachHang(KhachHang kh)
        {
            maKH = kh.maKH;
            tenKH = kh.tenKH;
            diaChi = kh.diaChi;
            SDT = kh.SDT;
            dsPhieuXuat = kh.dsPhieuXuat;
        }
        public ICollection<PhieuXuat> dsPhieuXuat { get; set; }




    }
}
