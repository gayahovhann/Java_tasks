
public class Arrays3 {
    public static void main(String[] args) {
        exercise231();

        exercise233();

        exercise234();

        exercise236();

        exercise237();

        exercise239();

        exercise241(3);
    }

    public static void exercise231() {
        int numbers[] = { 12, 5, 48, -9, -1, 257, 31, 12, 4 };
        double S = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] % 2 == 0) {
                S = S + Math.pow(numbers[i], 2);
            }
        }
        System.out.println("S = " + S);

    }

    public static void exercise233() {
        int numbers[] = { 12, 5, 48, -9, -1, 257, 31, 12, 4 };
        double S = 0;
        double P = 1;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] % 2 == 0) {
                S = S + numbers[i];
                P = P * numbers[i];
            }
        }
        System.out.println("S = " + S + "   P = " + P);

    }

    public static void exercise234() {
        int numbers[] = { 12, 5, 48, -9, -1, 257, 31, 12, 4 };
        int m = 0;
        double S = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] % 2 == 1) {
                m = m + 1;
                S = S + numbers[i];
            }
        }
        S = S / m;
        System.out.println("S = " + S);
    }

    public static void exercise236() {
        int numbers[] = { 12, 5, 48, -9, -1, 257, 31, 12, 4 };
        double m = 0;
        double P = 1;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] % 2 == 0) {
                m = m + 1;
                P = P * numbers[i];
            }
        }
        System.out.println("m = " + m + "   P = " + P);

    }

    public static void exercise237() {
        int numbers[] = { 0, 5, 48, 0, -1, 257, 0, 0, 4 };
        int m = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] == 0) {
                m = m + 1;
            }
        }
        System.out.println("m = " + m);

    }

    public static void exercise239() {
        int numbers[] = { 0, 5, 48, 25, 35, 0, -1, 257, 15, 115, 0, 0, 4 };
        int m = 0;
        double S = 0;
        for (int i = 0; i < 13; i++) {
            if (numbers[i] % 5 == 0) {
                m = m + 1;
                S = S + Math.pow(numbers[i], 2);
            }
        }
        S = S / m;
        System.out.println("S = " + S);
    }

    public static void exercise241(int k) {
        int numbers[] = { 0, 5, 18, 6, 35, 9, -1, 27, 15, 115, 0, 0, 4 };
        int S = 0;
        for(int i = 0; i < 13; i++) {
            if(numbers[i] % k == 0) {
                S = S + numbers[i];
            }
        }
        System.out.println("S = " + S);
    }
}
