package collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");

        } if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("D00", 13.00));
        priceSeats.add(theatre.new Seat("C00", 13.00));
        Collections.sort(priceSeats, (seat1, seat2) -> {
            if (seat1.getPrice() < seat2.getPrice()) {
            return -1;
        } else if (seat1.getPrice() > seat2.getPrice()) {
            return 1;
        } else {
            return 0;
        }
        });
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("==================================================");
    }
}
