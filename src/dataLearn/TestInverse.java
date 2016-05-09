package dataLearn;

import org.junit.Test;

public class TestInverse {
	@Test
	public void testPerson(){
		Person[] array = new Person[6];
		for(int i = 0; i<6;i++){
			array[i] = new Person(i,"name"+i);
		}
		InverseArray<Person> ia = new InverseArray<Person>();
		ia.printArray(array);
		ia.inverse01(array);
		ia.printArray(array);
		
	}
}
