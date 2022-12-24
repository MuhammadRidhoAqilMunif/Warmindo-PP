import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // java.io.File file = new java.io.File("Invoice.txt");
        Customer a = new Customer();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int counter = 0;

        do {
            System.out.println("LOGIN");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            System.out.print("PILIH : ");
            int chose = input.nextInt();

            switch (chose) {
                // java.io.File file = new java.io.File("Invoice-ku1.txt");

                case 1:
                    System.out.println("=====Menu Admin=====\n");
                    System.out.println("1. Input id Customer");
                    System.out.println("2. Baca Id Customer");
                    System.out.println("2. Input Menu");
                    System.out.print("PILIH MENU : ");
                    int inutt = input.nextInt();

                    if (inutt == 1) {
                        for (String b = "y"; b.equals("y") || b.equals("Y");) {
                            // try {
                            // java.io.PrintWriter output = new java.io.PrintWriter(file);
                            System.out.print("Masukkan id Customer : ");
                            int idCustomer = input.nextInt();
                            try {
                                FileWriter tulis = new FileWriter("Enter/src/idCustomer.txt", true);
                                tulis.write(idCustomer + "\n");
                                tulis.close();
                            } catch (Exception exception) {
                                System.out.println("Error ketika menulis file");
                            }
                            DataCust Penjual = new Penjual(idCustomer);
                            System.out.println("ID CUSTOMER    : " + idCustomer + " \nTelah Ditambahkan");
                            // System.out.println("KODE TRANSAKSI : "+getKodeTransaksi);
                            System.out.print("MASUKKAN ANTRIAN CUSTOMER :");
                            int antriCust = input.nextInt();
                            Transaksi kode = new Transaksi(antriCust);
                            System.out.println("KODE TRANSAKSI : " + kode.getKodeTransaksi());
                            // kode.getKodeTransaksi();
                            System.out.print("INGIN MENAMBAH ID CUSTOMER ? (Y/T): ");
                            b = input.next();
                            // output.println("ID CUSOMER : " + idCustomer);
                            // output.print("KODE TRANSAKSI : " + kode.getKodeTransaksi());
                            // output.close();
                            // } catch (Exception e) {
                            // e.printStackTrace();
                            // }
                            System.out.println("------------------------------------------");
                        }
                    } else if (inutt == 2) {
                        File bacaFile = new File("Enter/src/idCustomer.txt");
                        Scanner baca = new Scanner(bacaFile);
                        int idCustomer[] = new int[20];
                        int index = 0;
                        while (baca.hasNextInt()) {
                            idCustomer[index++] = baca.nextInt();
                        }
                        System.out.println("Hasil Baca ID Customer : ");
                        for (int i = 0; i < index; i++) {
                            System.out.println(idCustomer[i]);
                        }
                    } else if (inutt == 3) {
                        a.Menu();
                        // java.io.PrintWriter output = new java.io.PrintWriter(file);
                        for (String b = "y"; b.equals("y") || b.equals("Y");) {
                            a.Hitung();
                            System.out.println("INPUT Y JIKA INGIN TAMBAH ORDER ");
                            System.out.println("INPUT N JIKA TIDAK IGIN TAMABH ORDER");
                            System.out.print("INPUT PILIHAN : ");
                            b = input.next();
                            System.out.println("------------------------------------------");
                        }
                        a.Total();
                        a.Pembayaran();
                        // output.println("TOTAL HARGA " + a.totalHarga);
                        // output.print();
                    }

                    break;
                case 2:
                    System.out.println("=====Menu Customer=====\n");
                    a.Menu();
                    for (String b = "y"; b.equals("y") || b.equals("Y");) {
                        a.Hitung();
                        System.out.print("APA ADA TAMBAHAN? (Y/T): ");
                        b = input.next();
                        System.out.println("------------------------------------------");
                    }
                    a.Total();
                    a.Pembayaran();
                    a.tulisInvoice();
                    break;
                case 3:
                    running = false;
                    break;
            }
        } while (running == true);
        // output.println(a.Total())
        // output.print(a.Total());
        // output.print(a.Pembayaran());

    }
}
