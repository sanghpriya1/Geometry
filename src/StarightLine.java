
public class StarightLine {
	public static void main(String[] args) {
		int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		int len = coordinates.length;
        boolean ans = true;
        double slope = (coordinates[1][1] - coordinates[0][1])/(coordinates[1][0] - coordinates[0][0]); 
        for(int i = 1; i < len-1; ++i){
        	int y2 = coordinates[i+1][1];
        	int y1 = coordinates[i][1];
        	int x2 = coordinates[i+1][0];
        	int x1 = coordinates[i][0];
            double slopes = (y2 - y1)/(x2 - x1);
            if(slope != slopes){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
            
        }
	}


