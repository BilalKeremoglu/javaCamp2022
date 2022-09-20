public class Main {
    public static void main(String[] args) {
        int number = 23;
        int remainer = 0;

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
            return;
        }

        if (number < 1) {
            System.out.println("Sayı geçersizdir.");
        }

        for (int i = 2; i < number; i++) {
            remainer = number % i;
            if (remainer == 0) {
                System.out.println("Sayı asal değildir!");
                break;
            }
        }

        if (remainer > 0 || number == 2) {
            System.out.println(number + " asaldır!");
        }
    }
}
