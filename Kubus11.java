import java.util.Scanner;
public class Kubus11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Luas Permukaan & Volume Balok---");
        System.out.print("Masukkan sisi: ");
        int sisi = sc.nextInt();
        hitungLuas(sisi);
        System.out.println("Luas permukaan balok: "+hitungLuas(sisi));
        hitungLuas(sisi);
        System.out.println("Volume balok: "+hitungVolume(sisi));
    }
    static int hitungLuas (int s) {
        int luas = 6 * s * s;
        return luas;
    }
    static int hitungVolume (int s) {
        int volume = s*s*s;
        return volume;
    }
}
