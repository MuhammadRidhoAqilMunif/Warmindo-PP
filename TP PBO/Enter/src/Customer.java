import java.util.Scanner;
import java.io.*;

public class Customer extends App {
    Scanner input = new Scanner(System.in);
    Menu a = new Menu();
    float total1, total2, total3, total4, total5, total6, total7, total8, total9, total10, totalHarga, tunai, kembali;

    void Menu() {
        System.out.println("------------------MENU-------------------");
        System.out.println("1.ES TEH               : RP.3000");
        System.out.println("2.ES NUTRI SARI        : RP.4000");
        System.out.println("3.AIR ES               : RP.1000");
        System.out.println("4.ES SUSU              : RP.4000");
        System.out.println("5.MAGELANGAN           : RP.9000");
        System.out.println("6.MIE REBUS            : RP.8000");
        System.out.println("7.MIE GORENG           : RP.8000");
        System.out.println("8.ORAK ARIK            : RP.7500");
        System.out.println("9.TELUR DADAR          : RP.7000");
        System.out.println("10.NASI AYAM           : RP.12.000");
        System.out.println("------------------------------------------");
    }

    void Hitung() {
        System.out.print("INPUT PESANAN : ");
        int pesan = input.nextInt();
        System.out.print("INPUT JUMLAH : ");
        float jumlah = input.nextInt();
        System.out.println("------------------------------------------");
        switch (pesan) {
            case 1:
                a.setEsTeh(jumlah * 3000);
                System.out.println("\t:TOTAL HARGA : Rp" + a.getEsTeh());
                total1 = a.getEsTeh();
                break;
            case 2:
                a.setNutriasi(jumlah * 4000);
                System.out.println("\t:TOTAL HARGA : Rp" + a.getEsNutisari());
                total2 = a.getEsNutisari();
                break;
            case 3:
                a.setAirEs(jumlah * 1000);
                System.out.println("\t:TOTAL HARGA : Rp" + a.getAirEs());
                total3 = a.getAirEs();
                break;
            case 4:
                a.setEsSusu(jumlah * 4000);
                System.out.println("\t:TOTAL HARGA : Rp" + a.getEsSusu());
                total4 = a.getEsSusu();
                break;
            case 5:
                a.setMagelangan(jumlah * 9000);
                System.out.println("\t:TOTAL HARGA : Rp" + a.getMagelangan());
                total5 = a.getMagelangan();
                break;
            case 6:
                a.setMieRebus(jumlah * 8000);
                System.out.println("\t:TOTAL HARGA : Rp" + a.getMieRebus());
                total6 = a.getMieRebus();
                break;
            case 7:
                a.setMieGoreng(jumlah * 8000);
                System.out.println("\t:TOTAL HARGA : Rp" + a.getMieGoreng());
                total7 = a.getMieGoreng();
                break;
            case 8:
                a.setOrakArik(jumlah * 7500);
                System.out.println("\t:TOTAL HARGA : Rp" + a.getOrakArik());
                total8 = a.getOrakArik();
                break;
            case 9:
                a.setTelurDadar(jumlah * 7000);
                System.out.println("\t:TOTAL HARGA : " + a.getTelurDadar());
                total9 = a.getTelurDadar();
                break;
            case 10:
                a.setNasiAyam(jumlah * 12000);
                System.out.println("\t:TOTAL HARGA : " + a.getNasiAyam());
                total10 = a.getNasiAyam();
                break;
            default:
                System.out.println("ANDA SALAH INPUTAN");
                break;
        }
    }

    void Total() {
        totalHarga = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;
        System.out.println("TOTAL SELURUH HARGA : Rp" + totalHarga);
    }

    void Pembayaran() {
        System.out.println("------------------------------------------");
        System.out.print("TUNAI PEMBELI : Rp.");
        tunai = input.nextFloat();
        kembali = tunai - totalHarga;
        if (tunai > totalHarga) {
            System.out.println("KEMBALI       : Rp" + kembali);
            System.out.println("-----TERIMAKASIH-----");
        } else if (kembali == 0) {
            System.out.println("KEMBALI       : TUNAI PAS");
            System.out.println("-----TERIMAKASIH-----");
        } else {
            System.out.println("KEMBALI       : TUNAI KURANG Rp" + kembali);
            System.out.println("-----TERIMAKASIH-----");
        }
    }

    float totalSemua() {
        return totalHarga = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;
    }

    void tulisInvoice() {
        try {
            FileWriter tulis = new FileWriter("Enter/src/Invoice.txt");
            tulis.write("Total   = " + totalSemua() + "\n");
            tulis.write("Bayar   = " + tunai + "\n");
            tulis.write("Kembali = " + kembali + "\n");
            tulis.close();
        } catch (Exception exception) {
            System.out.println("Error");
        }
    }
}
