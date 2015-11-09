import java.util.*;


public class arrayCreator {
	
	public static ArrayList<Integer[]> createdArrays(){
		ArrayList<Integer[]> createdArrays = new ArrayList<Integer[]>();
		
		Random rand = new Random();
		for(int i = 0; i < 100; i++){
			int size = rand.nextInt(10) + 2;
			Integer[] arr = new Integer[size];
			for(int j = 0; j < size; j++){
				Random arrRand = new Random();
				int insert = arrRand.nextInt(100);
				arr[j] = insert;
			}
			createdArrays.add(arr);
		}
		return createdArrays;
	}
	
	public static ArrayList<Integer[]> sortedArrays(ArrayList<Integer[]> createdArrays){
		ArrayList<Integer[]> sortedArrays = new ArrayList<Integer[]>();
		for(Integer[] arr: createdArrays){
			Arrays.sort(arr);
			sortedArrays.add(arr);
		}
		return sortedArrays;
	}
	
	
	/*
	public static void main(String[] args) {
		ArrayList<Integer[]> createdArrays = createdArrays();
		System.out.println("Unsorted Arrays: ");
		for(Integer[] arr : createdArrays){
			System.out.println(Arrays.deepToString(arr));
		}

		ArrayList<Integer[]> sortedArrays = sortedArrays(createdArrays);
		System.out.println("Sorted Arrays: ");
		for(Integer[] arr : sortedArrays){
			System.out.println(Arrays.deepToString(arr));
		}
	}
	*/
	
}

