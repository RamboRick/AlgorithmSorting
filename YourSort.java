package cs61blab12;

public class YourSort {

	 public static void sort(int[] A) {
		    if (A.length <= 70){
		    	Sort.insertionSort(A);
		    } else {
		    	Sort.quicksort(A);
		    }
		  }
		}
