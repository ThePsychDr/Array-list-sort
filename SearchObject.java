class SearchObject {

	public static int linearSearch(Object[] inputArray, int arraySize, Object keySearch) {
		Tweet[] tmp = (Tweet[]) inputArray;
		for (int i = 0; i < arraySize; i++) {
			if (keySearch.equals(tmp[i])) {
				return i;
			}
		}
		return -1;

	}

	public static int binarySearch(Object[] inputArray, int arraySize, Comparable<Object> keySearch) {
		int leftBound = 1;
		int rightBound = arraySize - 1;

		while (leftBound <= rightBound) {
			int midIndex = (leftBound + rightBound) / 2;
			int cmp = keySearch.compareTo(inputArray[midIndex]);
			if (keySearch.equals(inputArray[midIndex])) {
				return midIndex;
			} else if (cmp < 0) {
				rightBound = midIndex - 1;
			} else {
				leftBound = midIndex + 1;
			}

		}
		return -1;

	} // end of binary search.
}
