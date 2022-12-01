module com.example.swingnodetest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swingnodetest to javafx.fxml;
    exports com.example.swingnodetest;
}