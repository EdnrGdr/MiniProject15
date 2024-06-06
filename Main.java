/*

Object Oriented ( Nesne Yönelimi) ATM Programı
Login Class'ı Kullanıcı Girişini Kontrol Edecek.
Hesap Class'ı Hesap İşlemlerini Yapacak
ATM (main) ise ATM mizi Calıstıracak
 */

public class Main {

    public static  void main (String [] args ) {
        Hesap hesap = new Hesap("Eda","12345",2000);

        ATM atm = new ATM();
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor..");


    }
}
