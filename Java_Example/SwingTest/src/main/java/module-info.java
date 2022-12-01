module com.example.swingtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swingtest to javafx.fxml;
    exports com.example.swingtest;
}