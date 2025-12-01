import java.util.Scanner;

public class Kafe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON30");
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukan kode promo: ");
        String promo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, promo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }

    public static void Menu(String namePelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namePelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo == "DISKON50") {
            System.out.println("Kode promo valid: Diskon 50%");
        } else if (kodePromo == "DISKON30") {
            System.out.println("Kode promo valid: Diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("====MENU RESTO KAFE====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Anda mendapatkan diskon 50%");
                hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
                break;
            case "DISKON30":
                System.out.println("Anda mendapatkan diskon 30%");
                hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
                break;
            default:
                System.out.println("Kode promo invalid.");
                break;
        }
        return hargaTotal;
    }
}