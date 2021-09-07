package entities;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Ticket {
    private String flightName;
    private int price;
    private LocalDateTime dateOfFlight;

    public void setGiaVe(int price) {
        this.price = price;
    }

   public void setTenChuyen(String flightName){
        this.flightName = flightName;
    }

    public void setNgayBay(LocalDateTime dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public int getGiaVe(){
        return this.price;
    }

    public String toString() {
       return "\nTen chuyen: " + this.flightName + "\nNgay bay: " +
               String.valueOf(this.dateOfFlight) + "\nGia ve: " + this.price;

    }

    public void inputTicket() {
        Scanner input = new Scanner(System.in);
        System.out.println("Flight name : ");
        this.flightName = input.nextLine();
        System.out.println("Date of flight (yyyy-MM-dd HH:mm:ss): ");
        String dateTimeText = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.dateOfFlight = LocalDateTime.parse(dateTimeText, formatter);
        System.out.println("Price : ");
        this.price = input.nextInt();
    }
}
