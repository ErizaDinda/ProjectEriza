//*Mulai
package quiz1;
import java.util.Scanner; //*Deklarasi Variabel Input Scanner

public class Quiz1 {

    public static void main(String[] args) {
         String identitas = "Eriza Dinda Febriana/X RPL 3/13";
         System.out.println("Identitas = "+ identitas);
         
    Scanner masuk = new Scanner (System.in);
    String namaSiswa []= {"Eriza", "Wike", "Rani", "Salsa", "Jasmine", "Shera", "Vinda", "Tantrina", "Sabrina", "Nila"}; //*Array Nama
    System.out.print("Ketikkan Nama Siswa : ");
    String nama = masuk.next ();  //*Variabel Pencarian Data
    for (String namaSiswa1 : namaSiswa)  {  //*Perulangan Untuk Array
       if (namaSiswa1.equals(nama)) {
           System.out.println("Data Ditemukan");
           return;
       }else{
       //*Percabangan Data Ditemukan    
       }
   }
   System.out.println("Data Tidak Ditemukan");
    }
    
}
//*Selesai
