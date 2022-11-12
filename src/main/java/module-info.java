module com.bartt.windowswindows {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.bartt.notePad to javafx.fxml;
    exports com.bartt.notePad;
}