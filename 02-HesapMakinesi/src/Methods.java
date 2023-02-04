import java.util.Scanner;

public class Methods {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus(int a,int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalıdır!");
            return 0;

        }
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi: " + (2 * (a + b)));
        System.out.println("Alanı: " + (a * b));

    }

    private static boolean numberControl(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return true;
        }
        return false;
    }

    public static int enterNumber (String s){
        Scanner sc = new Scanner(System.in);
        while (numberControl(s)) {
            System.out.print("Lütfen integer bir sayı giriniz: ");
            s = sc.next();
        }
        return Integer.parseInt(s);
    }

}
