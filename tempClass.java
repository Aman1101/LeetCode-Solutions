public class tempClass {

     int temp(int i){
        if(i > 0){
            temp1(i);
        }
        return i;

    }

  void temp1(int i){
        i = i+1;
    }

    public static void main(String[] args) {
        /*String a ="a";
        String b = new String("a");
        String c = a;

        System.out.println(a == b);
        System.out.println(a==c);
        System.out.println(b.equals(c));
        char a1[]={'a','b','c'};
        System.out.println(String.valueOf(a1));*/

        tempClass t = new tempClass();
        System.out.println(t.temp(1));
    }
}
