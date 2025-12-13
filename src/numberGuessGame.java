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
            düzeyde kullanmanı öneririm. İyi çalışmalar
             */

import java.util.Scanner;

public class numberGuessGame {
    public static void main(String[] args) 
{
    System.out.println("haydi! tahminimi bil");
    int secret = (int)(Math.random() * 100) + 1;
    Scanner scannnnner = new Scanner(System.in) ;
    int guess = 0 ;
    int attempts = 0 ;
    while (guess!=secret)
        {
            System.out.println("Tahminin ne ?????????: ");
            guess = scannnnner.nextInt();
            attempts++ ;
            if (secret < guess) 
            {
                System.out.println("Tahmininiz yanlış lütfen daha küçük bir sayı dene");
                guess++ ;
            }
            else if (secret > guess) 
            {
                System.out.println("tahmin yanlış lütfen daha büyük bir sayı girin");
                guess++ ;
            }
            else if (secret == guess) 
            {
                System.out.println("TEBRİKLER BAŞARDINIZ  " + "Toplam deneme sayınız:" + attempts);
            }
            if (attempts>10) 
            {
                System.out.println("Yapabilirsin PES ETME!!!");
            }
        }
    }
}
