public class FactorialOfANumbere {
    public static void main(String[] args) {
        System.out.println("Fact of num " + factNum(6));
    }

    static long factNum(long num) {
        if (num <= 1) {
            return 1;
        }
        return num * factNum(num - 1);
    }
}
