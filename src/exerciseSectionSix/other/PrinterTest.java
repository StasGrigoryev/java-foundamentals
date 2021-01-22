package exerciseSectionSix.other;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println("Initial page count " + printer.getPagesPrinted());
        System.out.println(printer.print(11));
        System.out.println("Total pages printed " + printer.getPagesPrinted());
        System.out.println(printer.print(1));
        System.out.println("Total pages printed " + printer.getPagesPrinted());
    }
}
