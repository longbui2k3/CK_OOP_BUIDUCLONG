using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class LoaiThietBi
    {
        public string maLoai { get; set; } // Mã loại
        public string theLoai { get; set; } // Thể loại
        public string donViTinh { get; set; } // Đơn vị tính
        public string ghiChu { get; set; } // Ghi chú

        public LoaiThietBi(string maLoai, string theLoai, string donViTinh, string ghiChu, ICollection<ThietBi> dsThietBi)
        {
            this.maLoai = maLoai;
            this.theLoai = theLoai;
            this.donViTinh = donViTinh;
            this.ghiChu = ghiChu;
            this.dsThietBi = dsThietBi;
        }
        public LoaiThietBi(LoaiThietBi ltb)
        {
            maLoai = ltb.maLoai;
            theLoai = ltb.theLoai;
            donViTinh = ltb.donViTinh;
            ghiChu = ltb.ghiChu;
            dsThietBi = ltb.dsThietBi;
        }
        public ICollection<ThietBi> dsThietBi { get; set; }
    }
}
