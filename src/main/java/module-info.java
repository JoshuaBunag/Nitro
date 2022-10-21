module com.zure.nitro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zure.nitro to javafx.fxml;
    exports com.zure.nitro;
}