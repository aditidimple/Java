package searchElement;

public  class LinearSearch implements Search {
	
	@Override
	public int search(int[] numbers, int toSearch) {
		for(int i=0; i< numbers.length;i++) {    
            if(numbers[i] == toSearch){
                return i;
            }    
        }    
        return -1;		
	}	
		
	

		
}
