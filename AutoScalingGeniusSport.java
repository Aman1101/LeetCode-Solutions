import java.util.List;

public class AutoScalingGeniusSport {

    public int finalInstance(int instances, List<Integer> averageUtil){

        for(int i = 0; i < averageUtil.size(); i++){

            if (averageUtil.get(i) < 25 && instances != 1){
                instances = (int)Math.ceil(instances/2.0);
                i += 10;
            }else if(averageUtil.get(i) > 60 && (2*instances) <= 2*Math.pow(10,8)){
                instances *= 2;
                i +=10;
            }
        }
        return instances;
    }
}
