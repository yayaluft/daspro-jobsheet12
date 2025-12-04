import java.util.Scanner;

public class RekapPenjualanCafe11 {
    static String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };

    public static void main(String[] args) {
        int[][] data = inputData();
        System.out.println();
        tampilData(data);
        penjualanTertinggi(data);
        System.out.println();
        System.out.println("--RATA RATA MENU--");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Menu " + menu[i] + ": " + rataRata(data[i]));
        }

    }

    static int[][] inputData() {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[menu.length][7];

        System.out.println("--INPUT DATA PENJUALAN--");
        for (int i = 0; i < data.length; i++) {
            System.out.println();
            System.out.println("Menu " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Penjualan hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }

        }
        return data;
    }

    static void tampilData(int[][] data) {
        System.out.println("---TABEL DATA PENJUALAN---");
        System.out.println("Menu\t\tH1\tH2\tH3\tH4\tH5\tH6\tH7");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j =0; j < data[i].length; j++) {
                System.out.printf("%-7d", data[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void penjualanTertinggi(int[][] data) {
        int maks = -1;
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            if (total > maks) {
                maks = total;
                n = i;
            }
        }
        System.out.println("--MENU DENGAN PENJUALAN TERTINGGI--");
        System.out.println("Menu: " + menu[n]);
        System.out.println("Total Penjualan: " + maks);
    }

    static int rataRata(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total / data.length;
    }
}
