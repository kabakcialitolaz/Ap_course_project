import java.text.NumberFormat;
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
        int[] nubers= new int[5];
        numbers[0]= 1;
        numbers[1]= 2;
        System.out.println(numbers);
        //bu bize  bu arrayın kimşiği gibi olan numara ve harf dizisini verir
        Arrays.toString(numbers);
        // ve bu kodu ekleyerek de gerçek değerimizi görürüz
        int[] numers = {2,3,5,6,7,};
        System.out.println(numbers.length);
        //bu da sayılarımızın toplam sayısını vermemizi sağlar

        //Multi-Dimensional Arrays | 00:58:47
        int[][] numbrs = new int[2][3];
        System.out.println((numbers));
        // bu sayede iki tane verimiz olursa ikisini farklı şekilde göstermemizi sağlar


        //Constants | 01:01:23
        float pı = 3.14F;
        pı = 1;
        // burada final kullanmamızın sebebi final koyulduktan sonra değerin değiştirelemeyecek olmasıdır
        // bu sayede hesaplamalarda hat önlenmiş olur büyük f ise float veri olduğunu belirtmemizi sağlar

        //Arithmetic Expressions | 01:03:15
        int result = 10 /3;
        System.out.println(result);
        // javada virgüllü bölünmeyi bu şekide belirtemeyiz bu bize 3 sonucunu verir
        double reslt= (double) 10/(double) 3;
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
        short h = 1;
        int y = h + 2;
        System.out.println(y);
        // byte > short > int > long > float > double
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


        //ABİ ÖDEV TAMAM
        //YENİ ÖDEVE HAZIRIM


        //Son tarih: 22 Kasım 2025. Sorun olursa WhatsApp'dan yazabilirsin. Kolay gelsin:)
        final byte MONTHS_İN_YEAR = 12;
        final byte  PERCENT = 100;

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("principal:");
        int principal = scanner1.nextInt();

        System.out.print("Annua interest rate");
        float annuaalInterest = scanner1.nextFloat();
        float monthlyInterest = annuaalInterest / PERCENT /MONTHS_İN_YEAR ;

        System.out.println("Period(Years): ");
        byte years = scanner1.nextByte();
        int umberOfPayments = years * MONTHS_İN_YEAR;

        double mortgage = principal
                *(monthlyInterest * Math.pow(1 + monthlyInterest, umberOfPayments))
                /(Math.pow(1 + monthlyInterest , umberOfPayments) - 1);

        String mortgageFormatted =NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
        // bu bir ipotek hesaplayıcısıdır bunu videodan yardım alarak yaptım

        // 2 ARALIK 2025 SALI YENİ ÖDEV
        /* 
            ===========================================================
            =              MİNİ PROJE 1 - ÖDEV (GRADE CALCULATOR)    =
            ===========================================================
            Amaç:
            - Kullanıcıdan ders isimlerini ve notlarını alıp ortalama hesaplayan
            küçük bir Java uygulaması yazmak.
            - Scanner, diziler, döngüler, if-else ve algoritma kurma becerilerini
            geliştirmek.

            Gereksinimler:
            1. Kullanıcıya kaç ders olduğunu sor.
            2. Bu sayıya göre:
                String[] lessonNames
                int[] lessonGrades
                dizilerini oluştur.
            3. Her dersin adını (String) ve notunu (int) kullanıcıdan for döngüsüyle al.
            4. Bütün notların toplamını ve ortalamasını hesapla.
            5. Ortalama puana göre harf notu ver:
                    90-100 -> A
                    80-89  -> B
                    70-79  -> C
                    60-69  -> D
                    0-59   -> F
            6. Sonuçları ekrana düzgün bir formatla yazdır:
                Ders adı - Not
                Ortalama
                Harf notu
            7. Kod mutlaka ayrı bir sınıfta yazılacaktır:
                    public class GradeCalculator {
                        public static void main(String[] args) {

                        }
                    }

            BONUS (İsteğe bağlı geliştirmeler):
            - En yüksek ve en düşük notu bul.
            - Geçti / Kaldı şeklinde yazdır (60 geçme notu).
            - Ortalama değeri 2 basamaklı göster: String.format("%.2f", average)
            - Kullanıcı ders isimlerinde boşluk bırakırsa "trim()" kullan.

            Teslim:
            - Kod dosyası oluşturulacak: GradeCalculator.java
            - GitHub'a push edilecek.

            Son tarih: 7 ARALIK 2025 PAZAR
            ===========================================================

         */
        class GradeCalculator {
            void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Kaç ders yazacaksın ?");
                int dersSayisi = scan.nextInt() ;
                scan.nextLine() ;

                int toplam = 0 ;

                for (int i = 1;i <= dersSayisi; i++) {

                    System.out.print(i + "dersin adı ");
                    String dersAdi = scan.nextLine();

                    System.out.print(dersAdi + "not:");
                    int not = scan.nextInt();
                    scan.nextLine();

                    double ort = (double) toplam / dersSayisi ;

                    String amerikan_tarzı_not_harflendirmesi = "";
                    if (ort>= 90) amerikan_tarzı_not_harflendirmesi = "A :)";
                    else if (ort>= 80) amerikan_tarzı_not_harflendirmesi = "B :|" ;
                    else if (ort>=70) amerikan_tarzı_not_harflendirmesi = "C :|" ;
                    else if (ort>=60) amerikan_tarzı_not_harflendirmesi = "D :|" ;
                    else if (ort>=0)  amerikan_tarzı_not_harflendirmesi = "F :(" ;

                    System.out.println("sonuç");
                    System.out.println("Toplam:"+ toplam);
                    System.out.println("ortalamanız:"+ort) ;
                    System.out.println("harflendirilmiş not :" + amerikan_tarzı_not_harflendirmesi);

                    toplam += not;
                    //BU KOD PARANTEZLERİN DIŞINDA KALMIŞTI. İÇERİ ALINCA DÜZELDİ


                }


            }
        }

        //BU SENİN YAZDIĞIN KOD, PARANTER DIŞINDA KALDIĞI İÇİN HATA ALIYORDUN.
        //toplam += not;
                }   




            /*

            ===========================================================
            =              MİNİ PROJE 2 - ÖDEV (NUMBER GUESS)         =
            ===========================================================
            Amaç:
            - Random sayı üretip tahmin ettiren "Sayı Tahmin Oyunu" yapmak.
            - Döngü, koşullar, Scanner, Math.random ve algoritma pratiği.

            Gereksinimler:
            1. Bilgisayar 1–100 arasında bir sayı üretecek:
                    int secret = (int)(Math.random() * 100) + 1;

            2. Kullanıcıdan sürekli tahmin al:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Tahminin: ");
                    int guess = scanner.nextInt();

            3. Tahmin:
                    - büyükse → "Daha küçük bir sayı dene!"
                    - küçükse → "Daha büyük bir sayı dene!"
                    - doğruysa → "Tebrikler! Doğru bildin!" + deneme sayısı

            4. Kullanıcı doğru bilene kadar döngü devam etsin (while / do-while).

            5. Deneme sayısını tutan bir sayaç kullan:
                    int attempts = 0;

            6. Kod mutlaka ayrı bir sınıfta olacak:
                    public class NumberGuess {
                        public static void main(String[] args) {



                        }
                    }

            BONUS (İsteğe bağlı geliştirmeler):
            - Kullanıcıya “1-100 arası sayı tuttum, tahmin et!” mesajı ver.
            - Kullanıcı 0 girerse oyunu erken bitir.
            - 10 denemeden uzun sürerse “Pes etme, başaracaksın!” gibi mesaj göster.
            - Zorluk seviyesi ekle:
                Kolay: 1-50
                Orta: 1-100
                Zor: 1-500

            Teslim:
            - Kod dosyası: NumberGuess.java
            - GitHub'a push edilecek.

            Son tarih: 14 ARALIK 2025 PAZAR
            ===========================================================

            Çalışmalarını yaparken Youtube ve Stackoverflow'dan yardım alabilirsin. Yapay zekayı minimum
            düzeyde kullanmanı öneririm. İyi çalışmalar!
            */



    }

