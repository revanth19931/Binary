  package revanth;

public class BinarySearch {
	 public static void binarySearch(int arr[], int first, int last, int r){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < r ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == r ){  
		        System.out.println("Element not found index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;     
		      
		      
		      
		      
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		 public static void main(String args[]){  
		        int arr[] = {1,2,3,4,5};  
		        int r = 3;  
		        int last=arr.length-1;  
		        binarySearch(arr,0,last,r);     
		 }  
		}  


