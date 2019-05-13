public class PairResult {

    public static String isItPossible(Integer a, Integer b, Integer c, Integer d) {

        if(a>1000 || b>1000 ||c>1000 ||d>1000){
            return "No";
        }
        if (a > c || b > d) {
            return "No";
        }



        if (a == c && b == d) {
            return "Yes";
        }

        if(isItPossible(a + b, b, c, d)=="Yes"){
            return "Yes";
        }
        if(isItPossible(a,a+b, c, d)=="Yes"){
            return "Yes";
        }


        return "No";
    }

    public static void main(String[] args) {
        int a=1,b=2,c=3,d=6;

        System.out.println(isItPossible(a,b,c,d));
    }
}
