package org.gui.benedict.sortchallenge;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BubbleSort {
    public static ObservableList<Integer> bubbleSort() {
        ObservableList<Integer> numbers = FXCollections.observableArrayList(SortController.getNumbers());
        int temp;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size()-1; j++) {
                if (numbers.get(j) < numbers.get(j + 1)) {
                    temp = numbers.get(j);
                    numbers.set(j,numbers.get(j + 1));
                    numbers.set(j+1,temp);
                }
            }
        }
        return numbers;
    }
}
