import java.util.Scanner;

/*
Kullanıcıdan iki sayı ve bir işlem alıp sonucu hesaplayan bir Java programı yaz.
1) Kullanıcıdan şu bilgileri al:
	•	Birinci sayı (double)
	•	İkinci sayı (double)
	•	İşlem türü (char veya String): +  -  *  /

2) Sonucu hesapla ve yazdır:
1. sayıyı gir: 8
2. sayıyı gir: 4
işlem seç (+ - * /): /
sonuç: 2.0

3) Hata kontrolü (zorunlu)
	•	Kullanıcı / seçerse ve ikinci sayı 0 ise:
    0'a bölme hatası!

yazdır ve programı güvenli şekilde bitir.

4) Geçersiz işlem kontrolü (zorunlu)

Kullanıcı + - * / dışında bir şey girerse:
    •	Geçersiz işlem! Lütfen + - * / gir.
*/
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz :");
        double birincisayi = sc.nextDouble();
        System.out.print("Lütfen ikici sayıyı giriniz :");
        double ikincisayi = sc.nextDouble();
        System.out.print("lütfen işleminizi seçin (+,-,/,*):");
        char girilenislem = sc.next().charAt(0);
        if (girilenislem == '+') {
            System.out.println("sonucunuz = " + (birincisayi + ikincisayi));
        } else if (girilenislem == '-') {
            System.out.println("sonucunuz = " + (birincisayi - ikincisayi));
        } else if (girilenislem == '*') {
            System.out.println("sonucunuz = " + (birincisayi * ikincisayi));
        } else if (girilenislem == '/') {
            if (ikincisayi == 0) {
                System.out.println("0 a bölme hatası,tanımsız");
            } else {
                System.out.println("sonucunuz = " + (birincisayi / ikincisayi));
            }
        }
        else {
            System.out.println("geçersiz işlem ,lütfen belirtilen işlmelrden birini giriniz(+,/,-,*)");
        }
        sc.close();
    }
}

