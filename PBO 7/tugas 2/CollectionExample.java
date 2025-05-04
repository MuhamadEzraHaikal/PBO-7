import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Ezra");
        mahasiswaList.add("Andi");
        mahasiswaList.add("Yopi");

        System.out.println("Daftar Mahasiswa (ArrayList):");
        for (String nama : mahasiswaList) {
            System.out.println(nama);
        }

        // ArrayDeque
        ArrayDeque<Integer> antrianNomor = new ArrayDeque<>();
        antrianNomor.add(20);
        antrianNomor.add(21);
        antrianNomor.add(22);
        
        System.out.println("\nAntrian Nomor (ArrayDeque):");
        while (!antrianNomor.isEmpty()) {
            System.out.println("Nomor: " + antrianNomor.poll());
        }
    }
}
