package entities;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String fullName;
    private boolean gender;
    private int age;
    private List<Ticket> tickets; // =)) đi dạy tiếng Anh

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
                passengerInfo = passengerInfo + "\nTicket " + (i+1) + this.tickets.get(i).toString();
            }
        }

        return passengerInfo;
    }

    public int sumBill() {
        int sum = 0;
        if (this.tickets != null) {
            for (int i = 0; i < this.tickets.size(); i++) {
                sum = sum + tickets.get(i).getGiaVe();
            }
        }
        return sum;
    }
}
