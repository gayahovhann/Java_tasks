import org.graalvm.compiler.lir.ssa.SSAUtil.PhiValueVisitor;

public class arrays1 {
    public static void main(String[] args) {
        exercise211();

        exercise213();

        exercise215();

        exercise218();

    }

    public static void exercise211() {
        int numbers[] = { 1, 4, -58, 12, -12 };
        double S = 0;
        int k = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                S = S + numbers[i];
                k = k + 1;
            }
        }
        S = S / k;
        System.out.println("S = " + S);
    }

    public static void exercise213() {
        int numbers[] = { -10, -7, 2, 1, -3, -1, 3 };
        double S = 0;
        int k = 0;
        for (int i = 0; i < 7; i++) {
            if (numbers[i] < 0) {
                S = S + Math.pow(numbers[i], 2);
                k = k + 1;
            }
        }
        S = Math.sqrt(S) / k;
        System.out.println("S = " + S);
    }

    public static void exercise215() {
        int numbers[] = { 1, -5, 485, 7, 8, 36, 48, 7, 8 };
        int S = 0;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                S = S + numbers[i];
            }

        }
        System.out.print("S = " + S);
    }

    public static void exercise218() {
        int numbers[] = { 1, -9, 5, 9, 547, -69, 7, -7, 36, -32 };
        int S = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                S = S + Math.abs(numbers[i]);
            }
        }
        System.out.println("S = " + S);
    }
}