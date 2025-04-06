package org.gui.benedict.sortchallenge;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SelectionSort {
    public static ObservableList<Integer> selectionSort(){
        ObservableList<Integer> numbers = FXCollections.observableArrayList(SortController.getNumbers());
        int temp;
        for(int i=0; i<numbers.size()-1; i++){
            for(int j=i+1; j<numbers.size(); j++){
                if(numbers.get(i)>numbers.get(j)){
                    temp = numbers.get(i);
                    numbers.set(i,numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
        return numbers;
    }
}
