module org.example.jfxproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires java.compiler;

    opens org.example.jfxproject to javafx.fxml;
    exports org.example.jfxproject;
}