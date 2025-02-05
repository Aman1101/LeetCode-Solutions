public class PrintStarPattern {
    public static void main(String[] args) {
        printPattern30(5);
    }

    //*
    //**
    //***
    //****
    static void printPattern2(int num) {
        for (int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPattern1(int num) {
        for (int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPattern3(int num) {
        for (int i = 0; i < num; i++) {
            for(int j = num - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPattern4(int num) {
        for (int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    static void printPattern5(int num) {
        for (int i = 0; i < 2 * num; i++) {
            int cInRow = i > num ? 2 * num - i : i;
            for(int j = 0; j < cInRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPattern28(int num) {
        for (int i = 0; i < 2 * num; i++) {
            int cInRow = i > num ? 2 * num - i : i;
            int noOfSpaces = num - cInRow;

            for(int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for(int j = 0; j < cInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern30(int num) {
        for (int row = 1; row <= num; row++) {
            for (int s = 0; s < num - row; s++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
