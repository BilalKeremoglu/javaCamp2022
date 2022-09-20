public class Main {
    public static void main(String[] args) {
        // args is empty :)
        /*for (var a :
             args) {
            System.out.println("args = " + a);
        }*/
        System.out.println("Hello World!");

        String metin = "İlginizi çekebilir";

        System.out.println(metin);

        int vade = 30;
        System.out.println(vade);

        long vadeLong = 30;

        double dolarDun = 18.15;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;

        if (dolarDun < dolarBugun) {
            dolarDustuMu = true;
        } else {
            dolarDustuMu = false;
        }

        System.out.println(dolarDustuMu);

        String[] krediler = {"veri1", "veri2", "veri3"};

        for (String veri:
                krediler) {
            System.out.println(veri);
        }

    }
}
