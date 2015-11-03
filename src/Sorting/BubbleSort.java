package Sorting;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleSort {

	public void bubbleSort(List<Integer> numbers) {

		boolean isSwapped = true;
		while (isSwapped) {
			isSwapped = false;
			for (int i = 0; i < numbers.size(); i++) {
				if (i == numbers.size() - 1) {
					break;
				}
				if (numbers.get(i) > numbers.get(i + 1)) {
					int swapSpace = numbers.get(i);
					numbers.set(i, numbers.get(i + 1));
					numbers.set(i + 1, swapSpace);
					isSwapped = true;
				}
				System.out.print("i Loop:=" + i);
				System.out.println(numbers);
			}
		}
		System.out.println(" ");
	}

	@Test
	public void testBubbleSort() {
		final List<Integer> numbers = Arrays.asList(4, 2, 1, 6, 3, 5, 4);
		final List<Integer> expected = Arrays.asList(1, 2, 3, 4, 4, 5, 6);

		bubbleSort(numbers);

		assertEquals(expected, numbers);

	}

}
