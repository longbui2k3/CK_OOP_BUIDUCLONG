using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class ChiTietPhieuXuat
    {
        public int soLuong { get; set; } // Số lượng
        public string maPX { get; set; } // Mã Phiếu xuất 
        public string maThietBi { get; set; } // Mã Thiết bị

        public ChiTietPhieuXuat(int soLuong, string maPX, PhieuXuat px, string maThietBi, ThietBi tb)
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

        public ThietBi tb { get; set; }
        public PhieuXuat px { get; set; }

    }
}
