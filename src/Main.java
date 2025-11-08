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
        //------------------------------------------------------
        /*
         30 EYLÜL SALI
            BİLGİSAYAR NOTLARI
            Algoritma
            Bariz ve net kavramlar veriyoruz
            sanki karşıdaki zekasızmış gibi sadece verilen komutları takip ediyor
            kavramlar net şekilde verilmelidir
            algoritma belirli bir problemi çözmek yada belirli bir amaca ulaşmak için tasarlanan yol
            Algoritma ne kod ne ?
            adım adım çözüm yolu
            önce düz yazı 
            sonra sözde kod/akış şeması
            kod(c basic phyton javasript)
            ÖRNEK ALGORİTMA ÖRNEĞİ
            4 sayının ortalamasının sözde kodu
            başla
            sayaç=0 toplam=0
            sayıyı oku sayının toplamını ekle
            sayacı bir arttır
            sayç<4 ise 3. adıma git
            ortalamayı hesapla(0=toplam/4)
            ortalamayı yazdır 
            bitir
            ALGORİTMA NASIL OLMALI
            girdileri ve çıktıları olmalı
            adım adım çözüme götürmeli
            belirsizliklerden arındırılmış olmalı(anlaşılır ve kesin olmalı)
            sonu olmalı (elbette sonsuz algoritma var fakat çoğu için bir sonu olmalı)
            doğru sonucu vermeli(birçok sonucu olabilir doğruya en yakın olan seçilmelidir)
            genellenebilmeli
            olabildiğince hızlı olmalı(çünkü örneğin bir iş yerinde sonuçların en hızlı şekilde elimize ulaşmasını isteriz)
         */
        /*
         3 EKİM SALI
            Ödev:
            Jobs biyografisi 50 sayfa oku
            Java Full Course for Beginners 8:45 - 29:07 arası yapılacak, yapılırken ki tüm süreç (yapılan, yapılamayan, zorlanılan, çözülen her şey) bu dosyaya not alınacak)
            komuttları gruplandırmayı öğrendim 
            terminaldaki javanın altyapısı öğrendim
            sistem komutlarını ve farklı grupları yürütmeyi öğrendim
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

        //ESCAPE SEQUENCES
        // bu yazdırdığımız şeyin içinde bir daha parantez kullanabilmemizi sağlıyor
        String message = "al\"h\"";
        System.out.println(message);

        /*8 KASIM 2025 ÖDEV
            1. JAVA videosundaki ESCAPE SEQUENCES bölümüne kadar, eğitmenin yazdığı tüm kodlar, sırayla ve başlık atılarak
                buraya geçişirilecek
            2. Yukarıdaki ödevi tamamlayınca 01:03:15 e kadarki konular izlenecek ve 
                oradaki kodlar da aynı şekilde buraya aktarılacak
        SON TARİH: 16 KASIM 2025 PAZAR
        */

    }
}
