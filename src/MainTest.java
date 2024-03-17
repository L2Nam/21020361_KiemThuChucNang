import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    // PHUONG PHAP BANG QUYET DINH
     @Test
     public void testBangQuyetDinh1() {
         assertEquals("Invalid error", Main.tinhHocPhi(1, -2));
     }

     @Test
     public void testBangQuyetDinh2() {
         assertEquals("750k", Main.tinhHocPhi(1, 3));

     }

     @Test
     public void testBangQuyetDinh3() {
         assertEquals("1940k", Main.tinhHocPhi(1, 8));
     }

     @Test
     public void testBangQuyetDinh4() {
         assertEquals("3280k", Main.tinhHocPhi(1, 14));
     }

     @Test
     public void testBangQuyetDinh5() {
         assertEquals("4100k", Main.tinhHocPhi(1, 18));
     }

     @Test
     public void testBangQuyetDinh6() {
         assertEquals("Invalid error", Main.tinhHocPhi(2, -3));
     }

     @Test
     public void testBangQuyetDinh7() {
         assertEquals("2400k", Main.tinhHocPhi(2, 12));
     }

     @Test
     public void testBangQuyetDinh8() {
         assertEquals("3300k", Main.tinhHocPhi(2, 17));
     }

     @Test
     public void testBangQuyetDinh9() {
         assertEquals("Invalid error", Main.tinhHocPhi(3, -6));
     }

     @Test
     public void testBangQuyetDinh10() {
         assertEquals("1050k", Main.tinhHocPhi(3, 7));
     }

     @Test
     public void testBangQuyetDinh11() {
         assertEquals("Invalid error", Main.tinhHocPhi(4, 9));
     }

     // PHUONG PHAP PHAN HOACH TUONG DUONG

    @Test
    public void testPhanHoachTuongDuong1() {
        assertEquals("Invalid error", Main.tinhHocPhi(-2, -3));
    }

    @Test
    public void testPhanHoachTuongDuong2() {
        assertEquals("Invalid error", Main.tinhHocPhi(-2, 4));
    }

    @Test
    public void testPhanHoachTuongDuong3() {
        assertEquals("Invalid error", Main.tinhHocPhi(-2, 7));
    }

    @Test
    public void testPhanHoachTuongDuong4() {
        assertEquals("Invalid error", Main.tinhHocPhi(-2, 11));
    }

    @Test
    public void testPhanHoachTuongDuong5() {
        assertEquals("Invalid error", Main.tinhHocPhi(-2, 17));
    }

    @Test
    public void testPhanHoachTuongDuong6() {
        assertEquals("Invalid error", Main.tinhHocPhi(1, -3));
    }

    @Test
    public void testPhanHoachTuongDuong7() {
        assertEquals("1000k", Main.tinhHocPhi(1, 4));
    }

    @Test
    public void testPhanHoachTuongDuong8() {
        assertEquals("1710k", Main.tinhHocPhi(1, 7));
    }

    @Test
    public void testPhanHoachTuongDuong9() {
        assertEquals("2620k", Main.tinhHocPhi(1, 11));
    }

    @Test
    public void testPhanHoachTuongDuong10() {
        assertEquals("3900k", Main.tinhHocPhi(1, 17));
    }

    @Test
    public void testPhanHoachTuongDuong11() {
        assertEquals("Invalid error", Main.tinhHocPhi(2, -3));
    }

    @Test
    public void testPhanHoachTuongDuong12() {
        assertEquals("800k", Main.tinhHocPhi(2, 4));
    }

    @Test
    public void testPhanHoachTuongDuong13() {
        assertEquals("1400k", Main.tinhHocPhi(2, 7));
    }

    @Test
    public void testPhanHoachTuongDuong14() {
        assertEquals("2200k", Main.tinhHocPhi(2, 11));
    }

    @Test
    public void testPhanHoachTuongDuong15() {
        assertEquals("3300k", Main.tinhHocPhi(2, 17));
    }

    @Test
    public void testPhanHoachTuongDuong16() {
        assertEquals("Invalid error", Main.tinhHocPhi(3, -3));
    }

    @Test
    public void testPhanHoachTuongDuong17() {
        assertEquals("600k", Main.tinhHocPhi(3, 4));
    }

    @Test
    public void testPhanHoachTuongDuong18() {
        assertEquals("1050k", Main.tinhHocPhi(3, 7));
    }

    @Test
    public void testPhanHoachTuongDuong19() {
        assertEquals("1650k", Main.tinhHocPhi(3, 11));
    }

    @Test
    public void testPhanHoachTuongDuong20() {
        assertEquals("2550k", Main.tinhHocPhi(3, 17));
    }

    @Test
    public void testPhanHoachTuongDuong21() {
        assertEquals("Invalid error", Main.tinhHocPhi(5, -3));
    }

    @Test
    public void testPhanHoachTuongDuong22() {
        assertEquals("Invalid error", Main.tinhHocPhi(5, 4));
    }

    @Test
    public void testPhanHoachTuongDuong23() {
        assertEquals("Invalid error", Main.tinhHocPhi(5, 7));
    }

    @Test
    public void testPhanHoachTuongDuong24() {
        assertEquals("Invalid error", Main.tinhHocPhi(5, 11));
    }

    @Test
    public void testPhanHoachTuongDuong25() {
        assertEquals("Invalid error", Main.tinhHocPhi(5, 17));
    }

    // KIEM THU GIA TRI BIEN

    @Test
    public void testKiemThuBien1() {
        assertEquals("Invalid error", Main.tinhHocPhi(1, 0));
    }

    @Test
    public void testKiemThuBien2() {
        assertEquals("200k", Main.tinhHocPhi(2, 1));
    }

    @Test
    public void testKiemThuBien3() {
        assertEquals("400k", Main.tinhHocPhi(2, 2));
    }

    @Test
    public void testKiemThuBien4() {
        assertEquals("2000k", Main.tinhHocPhi(2, 10));
    }

    @Test
    public void testKiemThuBien5() {
        assertEquals("322122547650k", Main.tinhHocPhi(2, 2147483646));
    }

    @Test
    public void testKiemThuBien6() {
        assertEquals("322122547800k", Main.tinhHocPhi(2, 2147483647));
    }


    @Test
    public void testKiemThuBien7() {
        assertEquals("Invalid error", Main.tinhHocPhi(0, 10));
    }

    @Test
    public void testKiemThuBien8() {
        assertEquals("2400k", Main.tinhHocPhi(1, 10));
    }

    @Test
    public void testKiemThuBien9() {
        assertEquals("1500k", Main.tinhHocPhi(3, 10));
    }

    @Test
    public void testKiemThuBien10() {
        assertEquals("Invalid error", Main.tinhHocPhi(4, 10));
    }
}
