import java.util.Scanner;

public class NilaiMahasiswa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] nilaiMhs = isianArray(n);
        System.out.println();
        tampilArray(nilaiMhs);
        hitTot(nilaiMhs);
        System.out.println("Total nilai seluruh mahasiswa: " + hitTot(nilaiMhs));
    }

    static int[] isianArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[n];

        System.out.println("--INPUT NILAI MAHASISWA--");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        return nilaiMhs;
    }

    static void tampilArray(int[] nilai) {
        System.out.println("--DAFTAR NILAI MAHASISWA--");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }
}
