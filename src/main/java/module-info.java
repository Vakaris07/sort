module org.gui.benedict.sortchallenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.gui.benedict.sortchallenge to javafx.fxml;
    exports org.gui.benedict.sortchallenge;
}