module com.example.p2_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;



    opens com.example.p2_1 to javafx.fxml;
    exports com.example.p2_1;
}