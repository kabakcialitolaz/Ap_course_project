import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
        System.out.println("ali");
        /* Bu kod yazılımın girişdir bu kod sayesinde istediğimiz bir sayı kelime veya be
        String message= nzeri birşeyi yazdırabiliriz
         */
        String bildirim = "Ali" + "122";
        System.out.println(bildirim.endsWith("122"));
        /* Bu kod sayesind yazdıracağımız mesajın doğru yada yanlış olup olmadığını belirleyebiliriz
         */
        Byte age = 30;
        Date now = new Date();
        System.out.println(now);
        /*Bu kod bizim güncel tarihi görmemizi ve istersek yaş hesaplaması yapmamızı sağlar
         */
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);
        /*Bu bizim bir değişkeni öbürküne kopyalamamızı sağlar UYARI!! birinci harf küçük iken ikinci kelimenin ilk harfi büyüktür
         */
        /*--------------------------------------------------------------------------------------------------------------------------------*/
        //17 KASIM 2025 PAZARTESİ
        //01:30:45 e kadar izlenecek. videodaki (https://youtu.be/eIrMbAQSU34) tüm kodlar buraya aktarılacak, hangi kodun ne işe yaradığı mutlaka yorum satırı
        //belirtilecek. Ben başlıkları senin yerine atacağım, eğer çalıştığın başlık varsa tekrar çalışmanı isteyeceğim:
        
        //Arrays | 00:53:22
        int[] numbers= new int[5];
        numbers[0]= 1;
        numbers[1]= 2;
        System.out.println(numbers);
        //bu bize  bu arrayın kimşiği gibi olan numara ve harf dizisini verir
        Arrays.toString(numbers);
        // ve bu kodu ekleyerek de gerçek değerimizi görürüz
        int[] numbers = {2,3,5,6,7,};
        System.out.println(numbers.length);
        //bu da sayılarımızın toplam sayısını vermemizi sağlar

        //Multi-Dimensional Arrays | 00:58:47
        int[][] numbers = new int[2][3];
        System.out.println(Arrays.deepToString(numbers));
        // bu sayede iki tane verimiz olursa ikisini farklı şekilde göstermemizi sağlar


        //Constants | 01:01:23
        final float PI = 3.14F;
        PI = 1;
        // burada final kullanmamızın sebebi final koyulduktan sonra değerin değiştirelemeyecek olmasıdır
        // bu sayede hesaplamalarda hat önlenmiş olur büyük f ise float veri olduğunu belirtmemizi sağlar

        //Arithmetic Expressions | 01:03:15
        int result = 10 /3;
        System.out.println(result);
        // javada virgüllü bölünmeyi bu şekide belirtemeyiz bu bize 3 sonucunu verir
        double result= (double) 10/(double) 3;
        // bu sayede tam sonuca ulaşabiliriz
        //ayrıca önüne ++ ekleyerek de veriyi istediğimiz kadar artırabiliriz
        //ve örneğin x+1 = 4 işlemini yapıcaz 1+= 4 şekilde belirtebiliriz

        //Order of Operations | 01:07:18
        int x = 10 + 3 * 2;
        System.out.println(x);
        // aslında burada 10 +3 ü önce yapmak istiyorsak öncelikle parantez kullanmalıyız
        // yani bildiğimiz matematikteki işlem önceliği kuralları javda da geçerli


        //Casting | 01:08:40
        // implicit
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        // byte > short > int > long > float > double
        String x = 1;
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
        // bukadar uğraşmamızın başlıca sebebi
        // stringleri sayısal verilere dönüştürerek yapmamız gerekmesidir

        //The Math Class | 01:15:08
        int rsult =(int) Math .ceil(1.1F);
        // bu sayede syımızı en yakın tam sayıya yuvarlayabiliriz
        // ve aynı zamanda bunun gibi matematikte olan aritmetik ve diğer işleri yapmımıza olanak tanır

        //Formatting Numbers | 01:19:50
        NumberFormat currency =  NumberFormat.getCurrencyInstance();
        currency.format(12345.123);
        String rst = currency.format(12345.13);
        System.out.println(rst);
        // bu klass numaraları birimlere çevirmek için çok kullanışlıdır

        //Reading Input | 01:25:40
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:");
        byte ag = scanner.nextByte();
        System.out.println("You are" + ag);
        // bu sayede terminalde değişiklik yapılabilir örneğin bize ismimizi yada
        // yaşımızı sorar(yukarıdaki kod) ve sonrasında "senin adın ali!" seklinde terminale komut verir bunların
        // hepsini terminalden düzenlememizi sağlayan kod "in" dir
        // ve tokenler vardır bir metod bir token olur yani isim yazdıracaksak soyadımızı
        // vermez eğer soyad da istiyorsak scanner next line komutunu uygulamamız gerekir
        //ve boşluk bırakarak yazıp sonrasında boşluksuz istiyorsak önceden gördüğümüz
        // "trim"
        // metodunu kullanırız
        //ABİ ÖDEV TAMAM BAZI İSİM VE Y GİBİ DEĞİŞKENLERİ BİRDEN FAZLA VE DEĞİŞİK KOMUTLARDA
        // KULLANDIĞIM İÇİN TERMİNALDE HATA VERİYOR FAKAT KODLAR DOĞRU VE DÜZGÜNCE ÇALIŞIYOR
        // ASLINDA SADECE İSİMLERİ BİRDEN FAZLA YERDE KULLANDIĞIM İÇİN HATA VERİYOR
        //YENİ ÖDEVE HAZIRIM






        //Son tarih: 22 Kasım 2025. Sorun olursa WhatsApp'dan yazabilirsin. Kolay gelsin:)

    }
}
