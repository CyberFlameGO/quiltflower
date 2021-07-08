package pkg;

public class TestMultiCast {
    public void test(double arg1, double arg2) {
        useNumbers((int)arg1, (int)arg2);
    }

    private static void useNumbers(double arg1, double arg2) {

    }

    public void test2() {
        useNumbers(provide(), provide());
    }

    public void test3() {
        useNumbers(provide() + 1, provide() + 1);
    }

    public void test4() {
        useNumbers(provide() + 0.5, provide() + 0.5);
    }

    private static int provide() {
        return 1;
    }
}
