package dataLearn;

import org.junit.Test;
//反转数组
public class InverseIntArray{
	public void swap(int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	public void printArray(int[] array){
		for(int i : array){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public void inverse01(int[] array){
		if(array==null || array.length<=1)
			return;
		for(int i=0,j=array.length-1;i<j;i++,j--){
			swap(array,i ,j);
		}
	}
	@Test
	public void test01(){
		int[] array1 ={1,2,3,4,5,6,7};
		inverse01(array1);
		printArray(array1);
		
		int[] array2 = {1,2,3,4,5,6};
		inverse01(array2);
		printArray(array2);

	}
	public void inverse02(int[] array){
		if(array==null|| array.length<=1){
			return;
		}
		int n = array.length;
		int half=n/2;
		System.out.println(half);
		for(int i=0;i<half;i++){
			swap(array,i,n-1-i);
		}
	}
	
	@Test
	public void test02(){
		int[] array1 ={1,2,3,4,5,6,7};
		inverse02(array1);
		printArray(array1);
		
		int[] array2 = {1,2,3,4,5,6};
		inverse02(array2);
		printArray(array2);

	}
	
	 
}