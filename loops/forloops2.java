public class forloops2 {
    public static void main(String[] args) {
        exercise121(1);

        exercise123(1);

        exercise125(1);

        exercise127(1);

        exercise129(1);

        exercise130(1);
    }

    public static void exercise121(int n) {
        double x, y, S;
        S = 0;
        for (int i = 1; i <= 16; i++) {
            if (i % 2 == 1) {
                x = i;
            } else {
                x = Math.pow(i, 3);
            }
            if (Math.pow(i, 2) % 2 == 1) {
                y = Math.pow(i, 2);
            } else {
                y = i;
            }
            S = S + Math.pow(x - y, 2);
        }
        System.out.println("S = " + S);
    }

    public static void exercise123(int n) {
        double x, y;
        double S = 1;
        for (i = 1; i <= 14; i++) {
            if (i % 2 == 1) {
                x = Math.exp(i - 4);
            } else {
                x = Math.pow(i, 2) - i;
            }
            y = Mah.pow(i, 4);
            S = S * Math.pow(x, 2) * Math.pow(y, 2);
        }
        System.out.println("S = " + S);
    }

    public static void exercise125(int n) {
        double S = 0;
        double x, y;
        for (i = 1; i <= 10; i++) {
            if (i / 3 == 0) {
                x = Math.log(i);
            } else {
                x = 3;
            }
            if (i / 7 == 0) {
                y = Math.log(i) / Math.log(3);
            } else {
                y = 3;
            }
            S = S + x - y;
        }
        System.out.println("S = " + S);
    }

    public static void exercise127(int n) {
        double x, y;
        double S = 1;
        for (i = 1; i <= 17; i++) {
            if (i % 2 == 1) {
                x = Math.pow(Math.sin(i), 2);
                y = Math.tan(i);
            } else {
                x = 0;
                y = 1 / Math.tan(i);
            }
            S = S * Math.pow(x, 2) * y;
        }
        System.out.println("S = " + S);
    }

    public static void exercise129(int n) {
        double x, y;
        double S = 0;
        for (int i = 1; i <= 16; i++) {
            if (Math.sqrt(i) / 2 == 0) {
                x = Math.tan(i);
            } else {
                x = 1 / Math.tan(i);
            }
            y = Math.exp(i - 4);
            S = S + x * y - i;
        }
        System.out.println("S = " + S);
    }

    public static void exercise130(int n) {
        double x, y;
        double S = 0;
        for (i = 1; i <= 10; i++) {
            if (i / 5 == 0) {
                x = i;
            } else {
                x = Math.pow(i, 2);
            }
            if (i / 3 == 0) {
                y = Math.pow(i, 3);
            } else {
                y = 6;
            }
            S = S * x * y;
        }
        System.out.println("S = " + S);
    }
}