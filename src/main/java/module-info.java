module com.jamesorban.javafxprojectminesweeper {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.jamesorban.javafxprojectminesweeper to javafx.fxml;
    exports com.jamesorban.javafxprojectminesweeper;
    exports com.jamesorban.javafxprojectminesweeper.controllers;
    opens com.jamesorban.javafxprojectminesweeper.controllers to javafx.fxml;
    exports com.jamesorban.javafxprojectminesweeper.models;
    opens com.jamesorban.javafxprojectminesweeper.models to javafx.fxml;
}