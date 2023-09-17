package belajar;

// Memasukkan tools 'Scanner' ke dalam program
import java.util.Scanner;

public class belajarScanner {
    public static void main(String[] args) {

        // Membuat sistem 'Scanner baru' untuk program
        Scanner inputUser= new Scanner(System.in);

        // Penentuan tipe data variabel
        String nama, NIM, kamping;
        Float IPK;

        //                                            Memasukkan data pertama
        System.out.print("Nama anda adalah:"); nama = inputUser.next();
        //                                            Memasukkan data kedua
        System.out.println("Masukkan NIM: "); NIM = inputUser.next();
        System.out.println("Masukkan nama kamping"); kamping = inputUser.nextLine();
        inputUser.nextLine(); // harus dimasukkan karena next line akan membaca next float
        System.out.println("Masukkan IPK anda"); IPK = inputUser.nextFloat();


        System.out.println("Nama anda adalah: " + nama);
        System.out.println("NIM anda adalah: " + NIM);
        System.out.println("Oh kamping anda" + kamping);
        System.out.println("IPK anda: " + IPK);

    }
}
