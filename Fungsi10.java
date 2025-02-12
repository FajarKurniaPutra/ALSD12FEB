public class Fungsi10 {
    public static void main(String[] args) {

        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        int[] harga = {75000, 50000, 60000, 10000};
        
        int[] pengurangan = {1, 2, 0, 5};
        
        System.out.println("Pendapatan tiap cabang jika semua bunga terjual:");
        tampilkanPendapatan(stok, harga);
        System.out.println("==============================\n");

        System.out.println("Total stok setiap jenis bunga:");
        tampilkanTotalStok(stok);
        System.out.println("==============================\n");

        kurangiStok(stok, pengurangan);

        System.out.println("Stok setelah pengurangan bunga mati:");
        tampilkanTotalStok(stok);
        System.out.println("==============================\n");
    }

    public static void tampilkanPendapatan(int[][] stok, int[] harga) {
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    public static void tampilkanTotalStok(int[][] stok) {
        int[] totalStok = new int[stok[0].length];
        
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                totalStok[j] += stok[i][j];
            }
        }
        
        System.out.println("Aglonema: " + totalStok[0]);
        System.out.println("Keladi: " + totalStok[1]);
        System.out.println("Alocasia: " + totalStok[2]);
        System.out.println("Mawar: " + totalStok[3]);
    }
        
        
    public static void kurangiStok(int[][] stok, int[] pengurangan) {
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                stok[i][j] -= pengurangan[j];
            }   
        }           
    }
}