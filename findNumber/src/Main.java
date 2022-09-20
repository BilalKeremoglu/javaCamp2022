public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,5,7,9,0};
        int find = 5;
        boolean isIn = false;

        for (int num:
             numbers) {
            if(num == find) {
                isIn = true;
            }
        }
        if (isIn) {
            System.out.println(find + " dizide bulunmaktadır.");
        } else {
            System.out.println(find + "dizide bulunmamaktadır.");
        }
    }
}
