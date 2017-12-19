package vijay.spring.first.first_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	@Autowired
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
