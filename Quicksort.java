//Tyson Hichman, CSCI 333, Quicksort
import java.util.Random;
public class Quicksort {

	//main class to test my sorting algorithms
	public static void main(String[] args) {
		
		int[] test1 = new int[] {20,5,30,6,1,2,1,1,3,4};
		
		quicksort(test1,0,test1.length-1);
		
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + ", ");
		}
		System.out.println();
		
		
		int[] test2 = new int[] {20,5,30,6,1,2,1,1,3,4};
		
		randomizedQuicksort(test2,0,test2.length-1);
		
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + ", ");
		}
		System.out.println();
		
		int[] test3 = new int[] {90,212,0,13,1,10000,635,99,99,50,551,552,553,554};
		
		randomizedQuicksort(test3,0,test3.length-1);
		
		for(int i = 0; i < test3.length; i++) {
			System.out.print(test3[i] + ", ");
		}
		System.out.println();
		
		
		int[] test4 = new int[] {0,9000,900000,8999,1,2,3,4,5,6,7,8,9,1,2,3,4,56,4,5,6,7,8,9,4,5,6,2,1,5,4,8,7,9,6,4};
		
		quicksort(test4,0,test4.length-1);
		
		for(int i = 0; i < test4.length; i++) {
			System.out.print(test4[i] + ", ");
		}
		System.out.println();
		
		int[] test5 = new int[] {0,9000,900000,8999,1,2,3,4,5,6,7,8,9,1,2,3,4,56,4,5,6,7,8,9,4,5,6,2,1,5,4,8,7,9,6,4};
		
		quicksort(test5,0,test5.length-1);
		
		for(int i = 0; i < test5.length; i++) {
			System.out.print(test5[i] + ", ");
		}
		System.out.println();
	}
	
	
	//simple recursive quicksorting class that calls partition class
	public static void quicksort(int[] array, int start, int end) {
		
		if(start < end) {
			int q = partition(array,start,end);
			quicksort(array, start, q-1);
			quicksort(array, q+1, end);
			
		}
		
		
		
	}
	
	//where most of the work is done this looks at points in the array and swaps them according to the value
	public static int partition(int[] array, int start, int end) {
		int x = array[end];
		int i = start-1;
		for(int j = start; j <= end-1; j++) {
			if(array[j] <= x) {
				i = i+1;
				
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[end];
		array[end] = temp;
		
		return i+1;
	}
	
	//same as my quicksort class except randomly finding the pivot using a random number generator 
	public static void randomizedQuicksort(int[] array, int start, int end) {
		Random ran = new Random();
		if(start < end) {  
			int point = ran.nextInt(end-start)+start;
			int temp = array[point];
			array[point] = array[end];
			array[end] = temp;
			
			
		   int q = partition(array, start, end); 
		   randomizedQuicksort(array, start, q - 1);
		   randomizedQuicksort(array, q + 1, end);
		}

	}
	
	

}
