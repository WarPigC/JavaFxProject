module org.example.jfxproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens org.example.jfxproject to javafx.fxml;
    exports org.example.jfxproject;
}