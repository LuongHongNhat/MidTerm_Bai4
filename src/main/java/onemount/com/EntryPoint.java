package onemount.com;

import entities.Passenger;
import entities.Ticket;

import java.time.LocalDateTime;
import java.time.Month;

public class EntryPoint {
    public static void main(String[] args) {

        Ticket ticket_1 = new Ticket();
        ticket_1.setGiaVe(100000);
        ticket_1.setTenChuyen("Ha Noi");
        LocalDateTime localDateTime = LocalDateTime.of(2021, Month.MARCH, 28, 14, 33, 48, 123456789);
        ticket_1.setNgayBay(localDateTime);

        Passenger passenger_1 = new Passenger();
        passenger_1.setFullName("Nguyen Van A");
        passenger_1.setGender(true);
        passenger_1.setAge(25);

        // Trường hợp em có danh sách ticket thì dùng hàm này cũng được
//         passenger_1.setTicket(ticket_1);
        // Dung ham setTicket nay ma add ArrayList la phai tao 1 ArrayList ben ay de dien data vao dung k a?

        // Nếu chưa có thì push từng cái vô thôi
        passenger_1.addTicket(ticket_1);

        Ticket ticket2 = new Ticket();
        ticket2.setGiaVe(2000000);
        ticket2.setTenChuyen("Ho Chi Minh");
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, Month.MARCH, 28, 14, 33, 48, 123456789);
        ticket2.setNgayBay(localDateTime2);

        passenger_1.addTicket(ticket2);

        System.out.println(passenger_1.toString());
        System.out.println(passenger_1.sumBill());

    }

}
