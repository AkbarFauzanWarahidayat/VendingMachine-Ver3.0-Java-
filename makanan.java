import java.util.Scanner;

public class makanan {
    
    public void menumakanan(){
        Scanner keyboard = new Scanner(System.in);
        int pilihmakanan;
        System.out.println("Selamat Datang Di Vending Machine!");
        System.out.println("Silahkan Pilih Makanan..");
        System.out.println("[1] Chitatos Rp5000");
        System.out.println("[2] Biskuit Regal Rp10.000");
        System.out.println("[3] Silver Queen Rp20.000");
        System.out.println("[4] Marshmallow Rp15.000");
        System.out.println("[5] Choco Crunch Rp20.000");

        System.out.println();
        
        System.out.print("Silahkan Pilih Selera Anda : ");
        pilihmakanan = keyboard.nextInt();

        if(pilihmakanan == 1){
            int uang,totalbelanja;
            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang : ");
            uang = keyboard.nextInt();

            System.out.println("Uang yang anda input sebesar Rp"+uang);

            totalbelanja = 5000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalbelanja);
            System.out.println("Terima Kasih:)");
        }
        else if(pilihmakanan == 2){
            int uang,totalbelanja;

            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang : ");
            uang = keyboard.nextInt();

            System.out.println("Uang yang anda input sebesar Rp"+uang);

            totalbelanja = 10000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalbelanja);
            System.out.println("Terima Kasih");
        }
        else if(pilihmakanan == 3){
            int uang,totalbelanja;

            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang : ");
            uang = keyboard.nextInt();

            System.out.println("Uang yang anda input sebesar Rp"+uang);

            totalbelanja = 20000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalbelanja);
            System.out.println("Terima Kasih");
        }
        else if(pilihmakanan == 4){
            int uang,totalbelanja;

            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang : ");
            uang = keyboard.nextInt();

            System.out.println("Uang yang anda input sebesar Rp"+uang);

            totalbelanja = 15000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalbelanja);
            System.out.println("Terima Kasih");
        }
        else if(pilihanmakanan == 5){
            int uang,totalbelanja;

            System.out.println("Terima Kasih Telah Memilih");
            System.out.println();
            System.out.print("Masukan uang : ");
            uang = keyboard.nextInt();

            System.out.println("uang yang anda input sebesar Rp"+uang);

            totalbelanja = 20000 - uang;

            System.out.println("Kembalian anda sebesar Rp"+totalbelanja);
            System.out.println("Terima Kasih");
        }


    }
}
