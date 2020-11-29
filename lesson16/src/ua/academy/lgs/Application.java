package ua.academy.lgs;

public class Application {

	public static void main(String[] args) {
		Number[] array = { 18,2,3,324,54,3452,65,4, 5, 47, 43, 7, 1, 34, 51, 22, 84, 99, 81, 25, 343, 288 };
		Collection collection = new Collection(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("");
		Iterator skipperIterator = collection.createSkipper();
		while (skipperIterator.hasNext()) {
			System.out.println(skipperIterator.next());
		}
		System.out.println("");
		 Iterator oddChangerIterator = collection.createChanger();
		 while (oddChangerIterator.hasNext()) {
		 System.out.println(oddChangerIterator.next());
		 }

	
			
	}

}
