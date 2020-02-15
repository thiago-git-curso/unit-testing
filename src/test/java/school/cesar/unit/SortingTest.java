package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {

    @Test
    public void bubbleSort_emptyArray_emptyArray() {
        int[] emptyArray = {};
        int[] array = {};
        Sorting.bubbleSort(emptyArray);
        Assertions.assertArrayEquals(emptyArray, array);
    }

    @Test
    public void bubbleSort_singleElement_noArrayChanges() {
        int[] expected = {1};
        int[] array = {1};
        Sorting.bubbleSort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSort_sortedArray_noArrayChanges() {
        int[] expected = {1,2};
        int[] array = {1,2};
        Sorting.bubbleSort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSort_unsortedArray_sortedArray() {
        int[] expected = {1,2};
        int[] array = {2,1};
        Sorting.bubbleSort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSort_verifyArray_verifyArray() {
        int[] expected = {1,3,5,10,12,24};
        int[] array = {10,5,3,1,24,12};
        Sorting.bubbleSort(array);
        Assertions.assertArrayEquals(expected, array);
    }

}
