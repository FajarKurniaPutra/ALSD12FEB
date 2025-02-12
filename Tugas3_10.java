import java.util.Scanner;

public class Tugas3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah " + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
            System.out.println("=============================");
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.println("===============================");
            System.out.print("Antum pilih opsi: ");
            int pilihan = input.nextInt();
            input.nextLine(); 
            

            switch (pilihan) {
                case 1:
                    System.out.println("\nJadwal Kuliah:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                    }
                    break;

                case 2:
                    System.out.print("\nMasukkan hari kuliah: ");
                    String hari = input.nextLine();
                    System.out.println("\nJadwal Kuliah Hari " + hari + ":");
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Hari " + hari + " kosong XD");
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan semester: ");
                    int sem = input.nextInt();
                    System.out.println("\nJadwal Kuliah Semester " + sem + ":");
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == sem) {
                            System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Semester " + sem + " kosong XD");
                    }
                    break;

                case 4:
                    System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
                    String cariMataKuliah = input.nextLine();
                    found = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMataKuliah[i].equalsIgnoreCase(cariMataKuliah)) {
                            System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Mata kuliah " + cariMataKuliah + " tidak ditemukan :(");
                    }
                    break;

                case 5:
                    System.out.println("Udahan yahh...");
                    return; 

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi ;)");
            }
        }
    }
}
