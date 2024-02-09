module com.example.hibernatecrud {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hibernatecrud to javafx.fxml;
    exports com.example.hibernatecrud;
}