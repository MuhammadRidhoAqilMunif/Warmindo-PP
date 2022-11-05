import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Customer a = new Customer();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int counter = 0;
        a.Menu();
        for (String b = "y"; b.equals("y") || b.equals("Y");) {
            a.Hitung();
            System.out.print("APA ADA TAMBAHAN? (Y/T): ");
            b = input.next();
            System.out.println("------------------------------------------");
        }
        a.Total();
        a.Pembayaran();
    }
}
