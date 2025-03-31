package conwaysGameOfLife;

public class CheckBoard {
    public boolean isEqual(int[][] from, int[][] to){
        int count= 0;

        for (int i = 0; i < from.length; i++) {
            for (int j = 0; j < from[0].length; j++) {
                if(from[i][j] != to[i][j]){
                    count +=1;
                }
            }
        }

        if(count <1){
            return true;
        }

        return false;
    }
}
