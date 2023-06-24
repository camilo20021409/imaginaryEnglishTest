module com.example.imaginaryenglishtest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.imaginaryenglishtest to javafx.fxml;
    exports com.example.imaginaryenglishtest;
}