module com.example.employeejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.employeejavafx to javafx.fxml;
    exports com.example.employeejavafx;
}