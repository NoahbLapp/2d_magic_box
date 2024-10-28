public class App {
	public static void main(String[] args){
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isMagic(a)); //true
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		System.out.println(isMagic(b)); //false
		int[][] c = {
			{1,1,1},
			{2,2,2}
		};
		System.out.println(isMagic(c)); //false
		int[][] d = {
			{8,1,6},
			{3,5,7},
			{4,9,2}
		};
		System.out.println(isMagic(d)); //true
	}
	
	public static boolean isMagic(int[][] array){
		if(array[0].length == array.length){
			boolean isEqual = true;
			int sum = 0;
			for(int i = 0; i < array[0].length; i++){
				sum += array[0][i];
			}
			for(int row = 1; row < array.length; row++){
				int rowSum = 0;
				for(int col = 0; col < array[0].length; col++){
					rowSum += array[row][col];
				}
				if(rowSum != sum){
					isEqual = false;
					break;
				}
			}
			for(int col = 0; col < array[0].length; col++){
				int colSum = 0;
				for(int row = 0; row < array.length; row++){
					colSum += array[row][col];
				}
				if(colSum != sum){
					isEqual = false;
					break;
				}
			}
			return isEqual;
		}else{
			return false;
		}
	}
	
}
