import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi olacak: ");
        int n = enterNumber(sc.next());
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print((i+1) + ". elemanı giriniz: ");
            arr[i]=enterNumber(sc.next());
        }
        quicksort(arr, 0, n - 1);
        System.out.println("Dizinin quick sortu: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int a = partition(arr, low, high);
            quicksort(arr, low, a);
            quicksort(arr, a + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int b = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < b);
            do {
                j--;
            } while (arr[j] > b);
            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
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