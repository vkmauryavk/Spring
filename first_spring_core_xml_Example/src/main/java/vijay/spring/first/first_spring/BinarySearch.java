package vijay.spring.first.first_spring;

public class BinarySearch {

	BubbleSortAlgo bubbleSortAlgo;

	public BubbleSortAlgo getBubbleSortAlgo() {
		return bubbleSortAlgo;
	}

	public void setBubbleSortAlgo(BubbleSortAlgo bubbleSortAlgo) {
		this.bubbleSortAlgo = bubbleSortAlgo;
	}

	public int BinarySearchAlgo(int[] array, int number) {

		// sort array bubbleSort or QuickSort
		// then we will search element
		// finally we will print Data

		bubbleSortAlgo.sort(array); // by this method array will sort
		System.out.println(bubbleSortAlgo);
		return 3;

	}

}
