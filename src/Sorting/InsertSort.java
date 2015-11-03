package Sorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class InsertSort {
	
	
	 @Test
	 public void testInsertSort(){
	 final List<Integer> numbers = Arrays.asList(4,2,1,6,3,5,4);
	 final List<Integer> expected = Arrays.asList(1,2,3,4,4,5,6);
	
	 ArrayList<Integer> newArrayList = insertSort(numbers);
	
	 assertEquals(expected,newArrayList);
	 }



}
