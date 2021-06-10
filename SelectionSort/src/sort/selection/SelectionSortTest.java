package sort.selection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void testSort() {
		SelectionSort selectionSort = new SelectionSort();
		List<Integer> testList = new ArrayList<Integer>() {
			{	
				add(100);
				add(1);	
				add(11);
				add(5);
				add(3);
				add(4);
				add(2);
			}
		};
		System.out.println(testList );
		System.out.println(selectionSort.sort(testList));
	}
}
