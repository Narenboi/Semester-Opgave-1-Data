module com.example.projekt1fxmln {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projekt1fxmln to javafx.fxml;
    exports com.example.projekt1fxmln;
}