module pl.lublin.wsei.cwiczenia.lab3b.lab_3b {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires mysql.connector.java;

    opens pl.lublin.wsei.cwiczenia.lab3b.lab_3b to javafx.fxml;
    exports pl.lublin.wsei.cwiczenia.lab3b.lab_3b;
}