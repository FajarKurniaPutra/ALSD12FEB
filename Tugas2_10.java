import java.util.Scanner;

public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("===============================");
        System.out.print("Antum hitung opsi: ");
        int pilihan = input.nextInt();
        System.out.println("===============================");

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = input.nextDouble();
                double volume = hitungVolume(sisi);
                System.out.println("Volume kubus: " + volume);
                break;
            case 2:
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = input.nextDouble();
                double luas = hitungLuasPermukaan(sisi);
                System.out.println("Luas permukaan kubus: " + luas);
                break;
            case 3:
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = input.nextDouble();
                double keliling = hitungKeliling(sisi);
                System.out.println("Keliling kubus: " + keliling);
                break;
            default:
                System.out.println("Pilihan antum tidak ada");
        }
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}
