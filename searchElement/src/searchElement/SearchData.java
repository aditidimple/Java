package searchElement;

public class SearchData {

	public static void main(String[] args) {
        int[]  numbers= {10,20,30,50,70,90,100,110};    
        int findData = 110;
        
        System.out.println(findData+" is found at index: "+ searchData(numbers, findData));    

        
	}
	

	public static int searchData(int[] arr, int toSearch )
	{
		for(int i=0; i< arr.length;i++) {    
            if(arr[i] == toSearch){
            	
                return i;
            
            }    
        }    
        return -1;		
	}	
	
}


