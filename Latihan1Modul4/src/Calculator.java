import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    double sqrtNumber = scanner.nextDouble();
                    System.out.println("Hasil akar kuadrat dari " + sqrtNumber + " adalah " + calculateSquareRoot(sqrtNumber));
                    break;
                case 2:
                    System.out.print("Masukkan angka: ");
                    double base = scanner.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " pangkat " + exponent + " adalah " + calculatePower(base, exponent));
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    double logNumber = scanner.nextDouble();
                    System.out.println("Logaritma natural dari " + logNumber + " adalah " + calculateNaturalLogarithm(logNumber));
                    break;
                case 4:
                    System.out.print("Masukkan angka: ");
                    int factorialNumber = scanner.nextInt();
                    System.out.println("Faktorial dari " + factorialNumber + " adalah " + calculateFactorial(factorialNumber));
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }

        scanner.close();
    }

    // Fungsi untuk menghitung akar kuadrat
    private static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    // Fungsi untuk menghitung pangkat
    private static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Fungsi untuk menghitung logaritma natural
    private static double calculateNaturalLogarithm(double number) {
        return Math.log(number);
    }

    // Fungsi untuk menghitung faktorial
    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
