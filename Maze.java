public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        printPath("", 3, 3);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

    static void printPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            printPath(p + "D",r-1, c);
        }

        if (c > 1){
            printPath(p + "R", r, c - 1);
        }
    }
}
