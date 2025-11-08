import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) 
    {
        //kaynak1: https://youtu.be/eIrMbAQSU34
        //kaynak2: https://youtu.be/1Pve-uH5FSM

        /*
        28 EYLÜL 2025 PAZAR
            15.24’e kadar “full java course for beginners” videosu tamamlandı
            ilk kodumu yazdım”hamburger” 
            kod satırındaki terimleri öğrendim
            medium,github hesapları açıldı
            bu siteler hakkında bilgi öğrendim
            bilgisayarı daha verimli kullanmayı öğrendim
            temel kod yazımını tekrar ettim
        */
        System.out.println("hamburger");

        /* 
         29 EYLÜL PAZARTESİ
            kod yazmayı denedim 
            video yada deneyebileceğim ufak kod örneklerine açığım
        */

        /*
         9 KASIM 2025 PAZAR Diziler
         diziler, aynı türden birden fazla veriyi tek bir değişkende saklamamızı sağlar
         */
        //kabakcilar adlı bir dizi oluşturuyor
        String[] kabakcilar = {"alitolaz", "asya", "emirhan"};
        //bütün diziyi yazdırıyoruz
        System.out.println(Arrays.toString(kabakcilar));
        //numbers adlı bir dizi oluşturuyoruz
        int[] numbers = {5, 3, 8, 1, 2};
        //dizinin ilk, üçüncü ve beşinci elemanlarını yazdırıyoruz
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println(numbers[4]);
    }
}
