module edu.sharif.monoplytest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens edu.sharif.monoplytest to javafx.fxml;
    exports edu.sharif.monoplytest;
}