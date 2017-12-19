package vijay.spring.first.first_spring.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import vijay.spring.first.first_spring.SortAlgorithm;

@Component
@Primary
public class QuickSortAlgo implements SortAlgorithm {

	public int[] sort(int[] array) {
		return array;
	}

}
