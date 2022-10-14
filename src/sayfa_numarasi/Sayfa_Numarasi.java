// Klavyeden Girilen Kitabın Sayfa Numarasındaki Toplam Kullanılan Rakam Sayısını Veren Program.

/*
Adım 1: Başla.
Adım 2: Kullanıcıdan Kitabın Toplam Kaç Sayfadan Oluştuğu Bilgisini Al.
Adım 3: int  rakamsayisi=((3*sonumara)-108) Formülünü Kullanarak Rakam Sayısını Bul.
Adım 4: Bulduğun Değeri Ekrana Yazdır.
Adım 5: Dur.
*/

package sayfa_numarasi;
import java.util.Scanner; //Java'nın Util kütüphanesinden Scanner Class'ı Programımıza import ettik.


public class Sayfa_Numarasi {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Kolsoldan Değer Almak için Tanımladık.
        System.out.println("Lütfen Son Kullanılan Üç Basamaklı Sayfa Sayısını Giriniz :");
        int sonnumara = input.nextInt();
        
        int rakamsayisi =((3*sonnumara)-108); 
        
        System.out.println("Kitabınızda Toplam Kullanılan Rakam Sayısı :" +rakamsayisi); // En Son Yaptığımız İşlemi Ekrana Yazdırdık.
     
        
    }
    
}
