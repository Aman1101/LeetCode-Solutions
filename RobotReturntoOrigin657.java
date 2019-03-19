public class RobotReturntoOrigin657 {

    public boolean judgeCircle(String moves) {

        int count = 0, counter = 0;

        for(int i = 0; i < moves.length(); i++){

            switch (moves.charAt(i)){
                case 'U' : count++; System.out.println(count);
                case 'D' : count--;
                case 'L' : counter++; System.out.println(counter);
                case 'R' : counter--;
                default : break;
            }
        }

        if(count == 0 && counter == 0){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
