public class WaterFlow {
    
    public static boolean canFlowOff(int[][] map, int row, int col){
        System.out.println("visiting " + map[row][col]);
        if(row == 0 || col == 0 || row == map.length-1 || col == map[0].length-1){
            System.out.println("flowing off map");
            return true;
        }
        if(map[row][col]>map[row-1][col]){
            System.out.println("row-1");
            return canFlowOff(map, row-1, col);
        }
        if(map[row][col]>map[row+1][col]){
            System.out.println("row+1");
            return canFlowOff(map, row+1, col);
        }       
        if(map[row][col]>map[row][col-1]){
            System.out.println("col-1");
            return canFlowOff(map, row, col-1);
        }
        if(map[row][col]>map[row][col+1]){
            System.out.println("col+1");
            return canFlowOff(map, row, col+1);
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int[][] map = {
			{100, 99, 200, 200, 200, 200, 200, 200, 200, 200}, 
			{200, 98, 200, 200, 200, 200, 200, 200, 200, 200},
			{200, 97, 96, 200, 200, 200, 200, 200, 200, 200},
			{200, 200, 95, 200, 200, 200, 85, 84, 83, 200},
			{200, 200, 94, 93, 92, 200, 86, 200, 82, 200},
			{200, 150, 200, 200, 91, 200, 87, 200, 81, 200},
			{200, 200, 200, 200, 90, 89, 88, 200, 80, 200},
			{200, 150, 100, 200, 200, 200, 200, 200, 79, 200},
			{200, 200, 200, 200, 200, 200, 200, 200, 78, 77},
			{200, 98, 200, 200, 200, 200, 200, 200, 200, 76}		
	};
        System.out.println("Should be true: " + canFlowOff(map, 2, 2));
        System.out.println("Should be true: " + canFlowOff(map, 3, 0));
        System.out.print("Should be true: " + canFlowOff(map, 3, 1));
        System.out.print("Should be false: " + canFlowOff(map, 6, 1));
    }
}

