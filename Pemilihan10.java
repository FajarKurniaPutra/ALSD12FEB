import java.util.Scanner;
public class Pemilihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas, kuis, UTS, UAS;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===========================");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");  
        UTS = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");  
        UAS = input.nextInt();
        System.out.println("===========================");
        if ( tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("Nilai tidak valid!");
            System.exit(0);
        }

        tugas = tugas * 20 / 100;
        kuis = kuis * 20 / 100;
        UTS = UTS * 30 / 100;
        UAS = UAS * 30 / 100;
        
        double akhir = tugas + kuis + UTS + UAS;
        String huruf;

        System.out.println("===========================");
        System.out.println("Nilai Akhir : " + akhir);
        if (akhir > 80 && akhir <= 100) {
            huruf = "A";
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Selamat Anda Lulus :)");
        } else if (akhir > 73 && akhir <= 80) {
            huruf = "B+";
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Selamat Anda Lulus :)");
        } else if (akhir > 65 && akhir <= 73) {
            huruf = "B";
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Selamat Anda Lulus :)");
        } else if (akhir > 60 && akhir <= 65) {
            huruf = "C+";
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Selamat Anda Lulus :)");
        } else if (akhir > 50 && akhir <= 60) {
            huruf = "C";
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Selamat Anda Lulus :)");
        } else if (akhir > 39 && akhir <= 50) {
            huruf = "D";
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Selamat Anda Tidak Lulus XD");
        } else if (akhir >= 0 && akhir <= 39) {
            huruf = "E";
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Selamat Anda Tidak Lulus XD");
        } else {
            System.out.println("Nilai kelebihan bang");
        }
    }
}