import java.util.Scanner;

public class RekapPenjualanCafe11 {
    static String[] menu;
    static int jmlHari;
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
        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        jmlHari = sc.nextInt();
        sc.nextLine();

        menu = new String[jmlMenu];
        System.out.println("--JENIS MENU--");
        for (int i =0; i < menu.length; i++) {
            System.out.print("Nama menu ke-"+(i+1)+": ");
            menu[i]= sc.nextLine();
        }

        int[][] data = new int[jmlMenu][jmlHari];

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
        System.out.printf("%-15s","Menu");
        for (int n = 1; n <= jmlHari; n++){
            System.out.printf("H%-6d",n);
        }
        System.out.println();

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