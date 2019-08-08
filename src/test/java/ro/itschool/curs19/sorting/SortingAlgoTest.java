package ro.itschool.curs19.sorting;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ro.itschool.homework19.InsertionSort;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgoTest {

    private SortingAlgo sortAlgo;

    private static Stream<Arguments> sortAlgos() {
        return Stream.of(
                Arguments.of(new BubbleSort()),
                Arguments.of(new SelectionSort()),
                Arguments.of(new InsertionSort())
        );
    }


    @DisplayName("Simple array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void simpleArray(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, sortAlgo.sort(new int[]{3, 2, 4, 1})));
    }

    @DisplayName("Null array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void nullArray(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(null, sortAlgo.sort(null)));
    }


    @DisplayName("Single element array ")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void singleElement(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(new int[]{3}, sortAlgo.sort(new int[]{3})));
    }


    @DisplayName("Empty array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void emptyArray(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(new int[]{}, sortAlgo.sort(new int[]{})));
    }


    @DisplayName("Already sorted array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void alreadySortedarray(SortingAlgo sortAlgo) {
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5}, sortAlgo.sort(new int[]{1, 2, 3, 4, 5})));
    }
}
