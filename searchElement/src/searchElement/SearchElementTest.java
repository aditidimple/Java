package searchElement;

public class SearchElementTest {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50, 60, 70};
		int key = 40;
		
		Search linearSearch = new LinearSearch();
		Search binarySearch = new BinarySearch();

		
		System.out.println(linearSearch.search(numbers, key));
		System.out.println(binarySearch.search(numbers,key));
		
	}

}
