module ku.cs.basicjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.basicjavafx to javafx.fxml;
    exports ku.cs.basicjavafx;
}