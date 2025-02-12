import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    String [] MataKuliah = {"Pancasila", "KTI", "CTPS", "MatDas", "BIng" , "Daspro", "Daspro Praktikum", "K3LH"};
    double [] SKS = {2.0, 3.0, 3.0, 2.0, 3.0, 4.0, 4.0, 3.0};
    double nilai [] = new double [MataKuliah.length];
    double bobot [] = new double [MataKuliah.length];
    String huruf [] = new String[MataKuliah.length];
    double totalBobot = 0;
    double totalSKS = 0;

    for (int i = 0; i < MataKuliah.length; i++) {
        System.out.print("Masukkan nilai angka untuk MK " + MataKuliah[i] + ": ");
        nilai[i] = input.nextDouble();
    }

    System.out.println("====================");
    System.out.println("Hasil Konversi Nilai");
    System.out.println("==========================================================================");
    System.out.printf("%-30s %-15s %-15s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < MataKuliah.length; i++) {
            if (nilai[i] > 80 && nilai[i] <= 100) {
                huruf[i] = "A";
                bobot[i] = 4.00;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                huruf[i] = "B+";
                bobot[i] = 3.50;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                huruf[i] = "B";
                bobot[i] = 3.00;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                huruf[i] = "C+";
                bobot[i] = 2.50;
            } else if (nilai[i] > 50 && nilai[i] <= 60) {
                huruf[i] = "C";
                bobot[i] = 2.00;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                huruf[i] = "D";
                bobot[i] = 1.50;
            } else if (nilai[i] >= 0 && nilai[i] <= 39) {
                huruf[i] = "E";
                bobot[i] = 1.00;
            } else {
                System.out.println("Kagak ada bang");
            }

            totalBobot += bobot[i] * SKS[i];
            totalSKS += SKS[i];

            System.out.printf("%-30s %-15.2f %-15s %-10.2f\n", MataKuliah[i], nilai[i], huruf[i], bobot[i]);
        }
        double ip = totalBobot / totalSKS;
        System.out.println("==========================================================================");
        System.out.printf("IP Semester : %.2f\n", ip);
    }
}