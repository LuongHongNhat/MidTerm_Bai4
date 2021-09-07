package onemount.com;

import entities.Passenger;
import entities.Ticket;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {

        int numOfPassenger;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of passenger:");
        numOfPassenger = sc.nextInt();
        // chỗ này cho nhập số lượng hành khách vào
        ArrayList<Passenger> passInfo = new ArrayList<>();
        for (int i = 0; i < numOfPassenger; i++) {
            Passenger new_passenger = new Passenger();
            new_passenger.inputPassInfo();
            passInfo.add(new_passenger);
        }

        // Total price per passenger
        for (int i = 0; i < passInfo.size(); i++) {
            System.out.println(passInfo.get(i).toString());
            System.out.println("Total price of passenger " + passInfo.get(i).getFullName()
                    + " is "+ passInfo.get(i).totalPrice());
        }

        //descending sort by total price of tickets
        for (int i = 0; i < passInfo.size() - 1; i++) {
            for (int j = 0; j < passInfo.size() - i - 1; j++) {
                if(passInfo.get(j).totalPrice() < passInfo.get(j + 1).totalPrice()){
                    Collections.swap(passInfo, j, j + 1);
                }
            }
        }
        // print list of passenger after sort
        for (int i = 0; i < passInfo.size(); i++) {
            System.out.println(passInfo.get(i).toString());
        }


//        Ticket ticket_1 = new Ticket();
//        ticket_1.setGiaVe(100000);
//        ticket_1.setTenChuyen("Ha Noi");
//        LocalDateTime localDateTime = LocalDateTime.of(2021, Month.MARCH, 28, 14, 33, 48, 123456789);
//        ticket_1.setNgayBay(localDateTime);
//
//        Passenger passenger_1 = new Passenger();
//        passenger_1.setFullName("Nguyen Van A");
//        passenger_1.setGender(true);
//        passenger_1.setAge(25);
//
////      Trường hợp em có danh sách ticket thì dùng hàm này cũng được
////      passenger_1.setTicket(ticket_1);
//
//        passenger_1.addTicket(ticket_1);
//
//        Ticket ticket2 = new Ticket();
//        ticket2.setGiaVe(2000000);
//        ticket2.setTenChuyen("Ho Chi Minh");
//        LocalDateTime localDateTime2 = LocalDateTime.of(2021, Month.MARCH, 28, 14, 33, 48, 123456789);
//        ticket2.setNgayBay(localDateTime2);
//
//        passenger_1.addTicket(ticket2);
//
//        System.out.println(passenger_1.toString());
//        System.out.println(passenger_1.sumBill());

    }



}
