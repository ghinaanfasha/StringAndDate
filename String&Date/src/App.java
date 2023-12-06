import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

public class App {
     public static void main(String[] args) {
        //Membuat format Date
        Date HariSekarang = new Date();
        SimpleDateFormat day = new SimpleDateFormat ("EEEE',' dd/MM/yyyy" );
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss z");

        //Menampilkan Date
        System.out.println("");
        System.out.println("ANFASHA SUPERMARKET");
        System.out.println("Tanggal\t\t: " + day.format(HariSekarang));
        System.out.println("Waktu\t\t: " + time.format(HariSekarang));
        System.out.println("======================================");

        try {
            //Membuat objek pelanggan dan menampilkan data pelanggan
            Pelanggan pelanggan = new Pelanggan();
            pelanggan.inputDataPelanggan();

            //Membuat objek barang dan menampilkan struk data barang
            Barang barang = new Barang("M004", "Indomie", 3000);
            Kasir kasir = new Kasir("Ghina");
            kasir.cetakStruk(barang);
        }

        //Apabila input jumlah barang tidak berupa angka
        catch (InputMismatchException e){
            System.out.println("\n====================================");
            System.out.println("\nInput Jumlah Barang tidak valid");
            System.out.println("");
        }

        //Apabila input jumlah barang melebihi kapasitas
        catch (Exception e){
            System.out.println("\n====================================");
            System.out.println("\nInput Jumlah Barang tidak valid");
            System.out.println("");
        }
     }
}
