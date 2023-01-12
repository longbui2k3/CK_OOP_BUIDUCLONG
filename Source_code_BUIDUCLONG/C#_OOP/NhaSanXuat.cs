using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CK_OOP_BuiDucLong
{
    internal class NhaSanXuat
    {
        public string maNSX { get; set; } // Mã nhà sản xuất
        public string tenNSX { get; set; } // Tên nhà sản xuất
        public string quocGia { get; set; } // Quốc gia
        
        public NhaSanXuat(string maNSX, string tenNSX, string quocGia, ICollection<ThietBi> dsThietBi)
        {
            this.maNSX = maNSX;
            this.tenNSX = tenNSX;
            this.quocGia = quocGia;
            this.dsThietBi = dsThietBi;
        }
        public NhaSanXuat(NhaSanXuat nsx)
        {
            maNSX = nsx.maNSX;
            tenNSX = nsx.tenNSX;
            quocGia = nsx.quocGia;
            dsThietBi = nsx.dsThietBi;
        }
        public ICollection<ThietBi> dsThietBi { get; set; }

    }
}
