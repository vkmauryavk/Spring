package vijay.spring.first.first_spring.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortAlgorithm {

	public int[] sort(int[] array) {
		return array;
	}

}
