import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class arrayCreatorTest {

	@Test
	// Test if the size of the sorted array is the
	// same as the size of the unsorted array.
	public void testSize() {
		ArrayList<Integer[]> create = arrayCreator.createdArrays();
		ArrayList<Integer[]> sort = arrayCreator.sortedArrays(create);
		
		for(int i = 0; i < 100; i++){
			int size1 = create.get(i).length;
			int size2 = sort.get(i).length;
			
			assertEquals(size1, size2);
		}
		
	}
	
	@Test
	// Test if the values are either increasing or staying the same
	public void testIncrease() {
		ArrayList<Integer[]> create = arrayCreator.createdArrays();
		ArrayList<Integer[]> sort = arrayCreator.sortedArrays(create);
		Boolean greater = false;
		
		for(int i = 0; i < 100; i++){
			Integer[] arr = sort.get(i);
			int size = arr.length;
			for(int j = 0; j < size-2; j++){
				int comp1 = arr[j];
				int comp2 = arr[j+1];
				if (comp1 < comp2){
					greater = true;
				}
				else if(comp1 == comp2){
					greater = true;
				}
				assertTrue(greater);
			}
		}
	}
	
	@Test
	// Test if every element in the unsorted array
	// still exists in the sorted array.
	public void testElements() {
		ArrayList<Integer[]> create = arrayCreator.createdArrays();
		ArrayList<Integer[]> sort = arrayCreator.sortedArrays(create);
		Boolean exist = false;
		
		for(int i = 0; i < 100; i++){
			Integer[] arr1 = sort.get(i);
			Integer[] arr2 = create.get(i);
			int size = arr1.length;
			for(int j = 0; j < size-1; j++){
				int find = arr2[j];
				
				if (Arrays.asList(arr1).contains(find)){
					exist = true;
				}
				assertTrue(exist);
			}
		}
	}
	
	@Test
	// Test if sorting an already sorted array does not
	// change the array
	public void testDoubleSort() {
		ArrayList<Integer[]> create = arrayCreator.createdArrays();
		ArrayList<Integer[]> sort = arrayCreator.sortedArrays(create);
		ArrayList<Integer[]> sort2 = arrayCreator.sortedArrays(create);

		assertEquals(sort, sort2);
	}

}
