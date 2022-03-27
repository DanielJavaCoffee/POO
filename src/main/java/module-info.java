module com.example.poo {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;
    requires hibernate.entitymanager;
    requires mysql.connector.java;

    opens com.example.poo to javafx.fxml;
    exports com.example.poo;

}