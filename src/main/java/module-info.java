module com.bartt.windowswindows {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.bartt.windowswindows to javafx.fxml;
    exports com.bartt.windowswindows;
}