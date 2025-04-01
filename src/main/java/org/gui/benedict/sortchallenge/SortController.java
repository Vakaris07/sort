package org.gui.benedict.sortchallenge;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SortController {

    @FXML
    public TableView numbersTable;
    @FXML
    public TableColumn<Integer, Integer> numbersColumns;
    @FXML
    public Button applyButton;
    @FXML
    public RadioButton burbleSortSelection;
    @FXML
    public RadioButton selectionSortSelection;
    @FXML
    public RadioButton binarySearchSelection;
    @FXML
    public TextField searchField;
    private ObservableList<Integer> data;

    public void initialize(){
        data = FXCollections.observableArrayList(5,15,4,9,47,12,13,17,89,76,2);
        numbersTable.setItems(data);
        numbersColumns.setCellValueFactory(cellData-> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue()));
    }
}