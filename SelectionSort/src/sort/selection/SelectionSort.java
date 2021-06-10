package sort.selection;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
	public List<Integer> sort(List<Integer> numList) {
		int size = numList.size();
		List<Integer> resultList = new ArrayList<Integer>(size);
		int temp = 0;
		for(int i=0; i<size;i++) {
			temp = numList.get(0);
			for(int k=1;k<numList.size();k++) {
				if(temp < numList.get(k)) {
					temp = numList.get(k);
				}
			}
			numList.remove(new Integer(temp));
			resultList.add(temp);
		}
		return resultList;
	}
}
