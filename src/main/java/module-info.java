module com.example.tugasbesarpemrogramanlanjut {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.tugasbesarpemrogramanlanjut to javafx.fxml;
    exports com.example.tugasbesarpemrogramanlanjut;
}