using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class ChiTietPhieuNhap
    {
        public int soLuong { get; set; } // Số lượng
        public string maPN { get; set; } // Mã phiếu nhập
        public string maThietBi { get; set; } // Mã thiết bị

        public ChiTietPhieuNhap(int soLuong, string maPN, PhieuNhap pn, string maThietBi, ThietBi tb)
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
        public ThietBi tb { get; set; }
        public PhieuNhap pn { get; set; }

    }
}
