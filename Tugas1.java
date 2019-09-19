package tugas1;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
    String Nama ;
    long NIM ;
    Scanner inputan = new Scanner (System.in);
        System.out.println("====Masukkan Nama dan NIM kamu!====");
        System.out.println("masukkan Nama kamu: ");
        Nama = inputan.nextLine();
        System.out.println("masukkan NIM kamu: ");
        NIM = inputan.nextLong();
        System.out.println("Nama = "+Nama);
        System.out.println("NIM = "+NIM);
        
        System.out.println("====IDENTITASMU====");
        System.out.println("Nama :"+ Nama);
        System.out.println("NIM :" + NIM);
    }  
}
