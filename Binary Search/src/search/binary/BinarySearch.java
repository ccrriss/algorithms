package search.binary;

public class BinarySearch {
	public int search(int[] nums, int value) {
		int beginIndex = 0;
		int endIndex = nums.length -1;
		int searchIndex = (beginIndex + endIndex)/2;
		int result = nums[searchIndex];
		while(beginIndex <= endIndex) {
			if(result == value) {
				return searchIndex;
			} else if(result > value) {
				endIndex = searchIndex;
				searchIndex = (beginIndex + endIndex)/2;
				result = nums[searchIndex];
			} else if(result < value) {
				beginIndex = searchIndex;
				searchIndex = (beginIndex + endIndex)/2;
				result = nums[searchIndex];
			}
		}
		
		return result;
	}
}
