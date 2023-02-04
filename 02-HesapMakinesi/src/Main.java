import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int select;

        System.out.println("""
                        1- Toplama İşlemi
                        2- Çıkarma İşlemi
                        3- Çarpma İşlemi
                        4- Bölme İşlemi
                        5- Üslü Sayı Hesaplama
                        6- Mod Alma
                        7- Dikdörtgen Alan ve Çevre Hesabı
                        8- Çıkış Yap"""
        );

        while (true){
            System.out.print("\nBir işlem seçiniz: ");
            select = Methods.enterNumber(sc.next());
            System.out.print("\nİlk sayıyı giriniz: ");
            int a = Methods.enterNumber(sc.next());
            System.out.print("İkinci sayıyı giriniz: ");
            int b = Methods.enterNumber(sc.next());

            switch (select) {
                case 1 -> Methods.sum(a, b);
                case 2 -> Methods.minus(a, b);
                case 3 -> Methods.times(a, b);
                case 4 -> Methods.divided(a, b);
                case 5 -> System.out.println("Üs Hesabı:" + Methods.power(a, b));
                case 6 -> System.out.println("Mod İşlemi:" + Methods.mod(a, b));
                case 7 -> Methods.calc(a, b);
                case 8 -> System.exit(0);
                default -> System.out.println("Geçersiz bir işlem yaptınız!");
            }
        }
    }
}