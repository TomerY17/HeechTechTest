public class Main {  
	
	static void sort(String []s, int n) 
	{ 
	    for (int i=1 ;i<n; i++) 
	    { 
	        String temp = s[i]; 
	  
	        int j = i - 1; 
	        while (j >= 0 && temp.length() < s[j].length()) 
	        { 
	            s[j+1] = s[j]; 
	            j--; 
	        } 
	        s[j+1] = temp; 
	    } 
	} 
	  
	static void printArraystring(String str[], int n) 
	{ 
	    for (int i=0; i<n; i++) 
	        System.out.print(str[i]+" "); 
	} 
	  
	
	public static void main(String args[]) 
	{ 
	    String []arr = {"am","I","France","from"}; 
	    printArraystring(arr,0); 
	    int n = arr.length; 
	      
	    sort(arr,n); 
	    printArraystring(arr, n); 
	      
	} 
	
}  

/*
 * good test case would be
 * {"France", "I", "in", "am"} - strings with same length
 * {"France", "", "I", ""} - empty strings
 * {"France"} - single string
 * 
 */
