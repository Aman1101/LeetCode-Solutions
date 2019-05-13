import java.util.List;

public class RobotToObstacle {

    public int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot){

        int [][] obstacleGrid = new int[numRows][numColumns];

        for (int i =0; i < lot.size(); i++){
            for (int j = 0; j<lot.get(i).size(); j++){
                obstacleGrid[i][j] = lot.get(i).get(j);
            }
        }

return 0;

    }

}
