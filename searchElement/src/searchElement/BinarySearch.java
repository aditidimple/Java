package searchElement;

public class BinarySearch implements Search {
	public int search(int[] numbers, int key) {
		int low = 0;
		int high = numbers.length - 1;
		int mid = 0;
		while (low <= high) {

			mid = (low + high) / 2;

			if (numbers[mid] < key) {
				low = mid + 1;
			}

			else if (numbers[mid] == key) {
				return mid;
			}

			else {
				high = mid - 1;
			}

		}
		return -1;

	}

}
