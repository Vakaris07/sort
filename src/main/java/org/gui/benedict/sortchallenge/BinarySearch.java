package org.gui.benedict.sortchallenge;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BinarySearch {
    public static String binarySearch(int n){
        ObservableList<Integer> numbers = FXCollections.observableArrayList(SortController.getNumbers());
        int low = 0;
        int high = numbers.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers.get(mid) == n) {
                return "Number "+ n+ " found at index: "+(mid+1);
            } else if (n < numbers.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return "Number not found";


    }
}
