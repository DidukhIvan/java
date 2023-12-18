public class Lab3 {
    public static Double firstEquation (double a, double b, int k) {
        if (k > 30) throw new IllegalArgumentException("Incorrect value for argument k!!!");
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += Math.sqrt(a*i*(Math.sqrt(b/i)));
        }

        return sum;
    }

    public static Double secondEquation (int t, int l) {
        double sum = 0;
        for (int i = 1; i <= l; i++) {
            if (t%2 == 0) {
                sum += (1/Math.sqrt(t))*l;
            } else {
                sum += Math.sqrt(t*l);
            }
        }
        return sum;
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static Double thirdEquation (double e) {
        if (e <= 0) throw new IllegalArgumentException("Incorrect value for argument e!!!");
        double sum = 0;
        for (int i = 1; i< Double.POSITIVE_INFINITY; i++) {
            double current = 1 / (double) (i * (i + 1));
            if (Math.abs(current) < e) {
                break;
            }
            sum += current;
        }
        return sum;
    }

    static void printResults(double a, double b, int k) {
        System.out.print("a: " + a + "b: " + b + "k: " + k + " result: ");
        try {
            System.out.println(firstEquation(a, b, k));
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    static void printResults2(int t, int l) {
        System.out.print("t: " + t + " l: " + l + " result: ");
        try {
            System.out.println(secondEquation(t, l));
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    static void printResults3(double e) {
        System.out.print("e: " + e + " result: ");
        try {
            System.out.println(thirdEquation(e));
        } catch (IllegalArgumentException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        printResults(3, 2, 5);
        printResults2(2, 6);
        printResults3(0.1);
    }
}