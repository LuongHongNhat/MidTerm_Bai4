package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passenger {
    private String fullName;
    private boolean gender;
    private int age;
    private List<Ticket> tickets;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        if (this.tickets == null)
            this.tickets = new ArrayList<>();

        this.tickets.add(ticket);
    }

    public String toString() {
        String passengerInfo = "Name: " + this.fullName + "\nGender: " + this.gender + "\nAge: " + this.age;

        if (this.tickets != null) {
            for (int i = 0; i < this.tickets.size(); i++) {
                passengerInfo = passengerInfo + "\nTicket " + String.valueOf(i + 1) + this.tickets.get(i).toString();
            }
        }

        return passengerInfo;
    }

    public int totalPrice() {
        int sum = 0;
        if (this.tickets != null) {
            for (int i = 0; i < this.tickets.size(); i++) {
                sum = sum + tickets.get(i).getGiaVe();
            }
        }
        return sum;
    }

    public void inputPassInfo() {
        // input thông tin khách hàng
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full name : ");
        this.fullName = input.nextLine();
        System.out.println("Enter gender : ");
        this.gender = input.nextBoolean();
        System.out.println("Enter age : ");
        this.age = input.nextInt();
        System.out.println("Enter number of ticket : ");
        int totalTicket = input.nextInt();
        // input từng ticket
        if (this.tickets == null)
            this.tickets = new ArrayList<>();
        for (int i = 0; i < totalTicket; i++) {
            Ticket newTicket = new Ticket();
            newTicket.inputTicket();
            this.tickets.add(newTicket);
        }
    }


}
