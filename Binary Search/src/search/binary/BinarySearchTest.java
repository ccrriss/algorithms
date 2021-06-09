package search.binary;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testSearch() {
		BinarySearch binarySearch = new BinarySearch();
		int[] testArray = {1,2,3,4,6,7,8,9,10,11,12,13};
		System.out.println(binarySearch.search(testArray, 8));
	}

}
