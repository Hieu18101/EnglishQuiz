module com.dht.QuizApp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.tmh.QuizApp to javafx.fxml;
    exports com.tmh.QuizApp;
    requires javafx.graphicsEmpty;
}
