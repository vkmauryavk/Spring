package vijay.spring.first.first_spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// By Default scope is Singleton 
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // @Scope("Prototype")
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
