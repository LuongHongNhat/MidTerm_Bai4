package entities;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class Ticket {
    private String tenChuyen;
    private LocalDateTime ngayBay;
    private int giaVe;

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

   public void setTenChuyen(String tenChuyen){
        this.tenChuyen = tenChuyen;
    }

    public void setNgayBay(LocalDateTime ngayBay) { // set là em gán vô, vậy em return chi
        this.ngayBay = ngayBay;
    }

    public int getGiaVe(){
        return this.giaVe;
    }

    public String toString() {
        // Don gian vay cung duoc
        // return this.tenChuyen + " " + this.ngayBay.toString() + " " + String.valueOf(this.giaVe);

        // Phien ban màu mè
        return "\nTen chuyen: " + this.tenChuyen + "\nNgay bay: " + this.ngayBay.toString() + "\nGia ve: " + this.giaVe;

    }


}
