package vijay.spring.first.first_spring;

public class BinarySearch {

	SortAlgorithm sortAlgorithm;

	public BinarySearch(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int BinarySearchAlgo(int[] array, int number) {

		// sort array bubbleSort or QuickSort
		// then we will search element
		// finally we will print Data

		sortAlgorithm.sort(array); // by this method array will sort
		System.out.println(sortAlgorithm);
		return 3;

	}

}
