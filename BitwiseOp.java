public class BitwiseOp {
    public static void main(String[] args) {
        oddOrEven(200);
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(findNonRepeatingNum(arr));
        System.out.println(findMagicNumber(6));
        System.out.println(findNoOfDigits(6));
    }

    //find number is odd or even
    static void oddOrEven(int num) {
        if ((num & 1) == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    //Find the number that only appears once (Note: Better understand XOR concept)
    static int findNonRepeatingNum(int[] num) {
        int unique = 0;

        for (int n : num) {
            unique ^= n;
        }
        return unique;
    }

    //find ith bit of a num
    static int findIthBit(int num, int bitNum) {
        return num & (1 << bitNum - 1);
    }

    //find magic number
    static int findMagicNumber(int n) {
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;

            ans += last * base;
            base = base * 5;
        }
        return ans;
    }

    //Find number of digits in base b

    static int findNoOfDigits(int n) {
        return (int) (Math.log(n) / Math.log(2)) + 1;
    }

}
