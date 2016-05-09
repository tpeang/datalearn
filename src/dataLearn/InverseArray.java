package dataLearn;

//泛型反转数组

public class InverseArray<T> {
	public void swap(T[] array, int a, int b){
		T temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	public void printArray(T[] array){
		for(T i : array){
			System.out.print(i.toString()+" ");
		}
		System.out.println();
	}
	public void inverse01(T[] array){
		if(array==null || array.length<=1)
			return;
		for(int i=0,j=array.length-1;i<j;i++,j--){
			swap(array,i ,j);
		}
	}
	 
	public void inverse02(T[] array){
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
	
	 
	 
}