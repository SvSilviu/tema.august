package ro.mycode;

public class App {

//TODO: Se dă un șir cu n elemente, numere naturale.
// Determinați diferența în valoare absolută dintre numărul de valori pare din șir și numărul de valori impare din șir.

    public static int elementePare(int[] arr) {
        int cifraPara = 0;
        int contor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                cifraPara = arr[i];
                contor++;
            }
        }
        return contor;
    }

    public static int elementeImpare(int[] arr) {
        int contor = 0;
        int cifraImpara = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                cifraImpara = arr[i];
                contor++;
            }
        }
        return contor;
    }

    public static void afisare(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void pb1() {
        int[] vector = {2, 5, 3, 6, 8};
        int scadere = elementePare(vector) - elementeImpare(vector);
        afisare(vector);
        System.out.println("\nSunt " + elementePare(vector) + " elemante pare in sir, deci diferenta este : " + scadere);

    }

    //TODO: Se citește un vector cu n elemente, numere naturale.
    // Să se afișeze elementele vectorului în următoarea ordine: primul, ultimul, al doilea, penultimul, etc.

    public static void ordineaElementelor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[1]);
        System.out.println(arr[arr.length - 2]);
    }

    public static void pb2() {
        int[] vector = {3, 5, 6, 5, 3, 1, 0, 9};
        afisare(vector);
        System.out.println("\n==================");
        ordineaElementelor(vector);
    }

    //TODO: Să se determine maximul şi minimul valorilor elementelor unui vector.

    public static int max(int[] arr) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int min(int[] arr) {
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void pb3() {
        int[] vector = {5, 4, 1, 9, 0, 4};
        afisare(vector);
        System.out.println("\n===================");
        System.out.println("Cel mai mare numar este : " + max(vector));
        System.out.println("Cel mai mic numar este : " + min(vector));
    }

    //TODO: Se citește un vector cu n elemente, numere naturale.
    // Să se determine câte elemente ale vectorului sunt egale cu diferența dintre cea mai mare și cea mai mică valoare din vector.

    public static void diferentaDintreMareSiMic(int[] arr) {
        int contor = 0;
        int diferenta = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max(arr) - min(arr) == arr[i]) {
                diferenta = arr[i];
                contor++;
            }
        }
        System.out.println("Scaderea dintre cel mai mare numar si cel mai mic numar este : " + diferenta);
        System.out.println("Valoarea apare de " + contor + " ori in sir");
    }

    public static void pb4() {
        int[] vector = {1, 7, 6, 9, 8, 2, 8};
        afisare(vector);
        System.out.println("\n================================================================");
        diferentaDintreMareSiMic(vector);
    }

    // TODO: Se citește un vector cu n elemente, numere naturale distincte.
    //  Să se afișeze elementele cuprinse între elementul cu valoarea minimă și cel cu valoare maximă din vector, inclusiv acestea.

    public static int maxim(int a, int b) {
        if (a < b) {

            return b;
        }

        return a;
    }

    public static int minim(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int elemente(int[] arr) {

        int diferenta = 0;
        int pozMin = arr[0];
        int pozMax = arr[arr.length - 1];
        int min = minim(pozMin, pozMax);
        int max = maxim(pozMin, pozMax);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= max && arr[i] >= min) {
                diferenta=arr[i];
            }
        }
        return diferenta;
    }
    public static void pb5(){
        int [] vector = {9, 1, 5, 3, 12, 8};
        System.out.println("Cel mai mare numar este : "+max(vector));
        System.out.println("Cel mai mic numar este : "+min(vector));
        System.out.println("Intervalul dintre MAX si MIN este : "+elemente(vector));
    }
    

}
