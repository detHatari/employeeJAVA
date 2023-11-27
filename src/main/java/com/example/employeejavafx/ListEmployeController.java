package com.example.employeejavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListEmployeController implements Initializable {
    ObservableList<employeedata> list= FXCollections.observableArrayList();
    @FXML
    TableView<employeedata> list_tabelview;

    @FXML
    TableColumn<employeedata, String> list_name;
    @FXML
    TableColumn<employeedata, String> list_gender;
    @FXML
    TableColumn<employeedata, String> list_age;
    @FXML
    TableColumn<employeedata, String> list_id;
    @FXML
    TableColumn<employeedata, String> list_salary;


    private void initeCols(){
        list_name.setCellValueFactory(new PropertyValueFactory<>("list_name"));
        list_gender.setCellValueFactory(new PropertyValueFactory<>("list_gender"));
        list_age.setCellValueFactory(new PropertyValueFactory<>("list_age"));
        list_id.setCellValueFactory(new PropertyValueFactory<>("list_id"));
        list_salary.setCellValueFactory(new PropertyValueFactory<>("list_salary"));
    }
    private void loadEmploye(){
        list.removeAll(list);
        list.addAll(employeeApp.ulist);
        list_tabelview.setItems(list);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initeCols();
        loadEmploye();
    }

    @FXML
    protected  void onAddUser(Event event) throws IOException {
        Parent root = FXMLLoader.load(employeeApp.class.getResource("employyeView.fxml"));
        Stage stage = (Stage) ( (Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Add Employe");
        stage.setWidth(stage.getWidth());
        stage.setHeight(stage.getHeight());
        stage.setScene(scene);

        stage.show();
    }

//    @FXML
//    protected  void onTest(Event event) throws IOException {
//
//        list.clear();
////        /*
////        employeeApp.ulist.addAll(
////                Arrays.asList(
////                        ne w employeedata("sok","male",20),
////                        new User("sao","male",25),
////                        new User("jonh","male",30),
////                        new User("dara","male",22)
////                )
////        );
//        //*/
//        list.addAll(employeeApp.ulist);
//        list_tabelview.setItems(list);
//
//
//    }
}

