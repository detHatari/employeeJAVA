package com.example.employeejavafx;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class employeeController {
    private static ArrayList<employeedata> ulist = new ArrayList<>();
    @FXML
    TextField input_name;
    @FXML
    TextField input_gender;
    @FXML
    TextField input_age;
    @FXML
    TextField input_id;
    @FXML
    TextField input_salary;
    @FXML
    Label label_message;
    @FXML
    protected void OnSubmitButton(Event e){
        if(input_name.getText().length()>0 && input_age.getText().length()>0 &&input_id.getText().length()>0 && input_gender.getText().length() > 0 && input_salary.getText().length() > 0)
        {
            employeedata u = new employeedata();
            u.setList_name(input_name.getText());
            u.setList_gender(input_gender.getText());
            u.setList_age(Integer.parseInt(input_age.getText()));
            u.setList_id(Integer.parseInt(input_id.getText()));
            u.setList_salary(Integer.parseInt(input_salary.getText()));
            input_name.setText("");
            input_gender.setText("");
            input_age.setText("");
            input_id.setText("");
            input_salary.setText("");
            employeeApp.ulist.add(u);
            System.out.println("Save Success!");
            label_message.setText("save Success!");
//            label_message.err();

//            u.name = input_name.getText();
//            u.gender=input_gender.getText();
//            u.age = Integer.parseInt(input_age.getText());
//            u.id= Integer.parseInt(input_id.getText());
//            u.salary=Integer.parseInt(input_salary.getText());

//            info.add(u);

            label_message.setText("Information is Added!");
        }else{
            System.out.println("please Fill in the Information");
        }
    }
    @FXML
    protected void OnListButton(Event event) throws IOException {
//        System.out.println("=====Employee Information=====");
//        for (employeedata u: info) {
//            System.out.println("Name: " +u.name);
//            System.out.println("Gender: " +u.gender);
//            System.out.println("Age: " +u.age);
//            System.out.println("ID: " +u.id);
//            System.out.println("Salary: " +u.salary);
//        }
        Parent root = FXMLLoader.load(employeeApp.class.getResource("listUser.fxml"));
        Stage stage = (Stage) ( (Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setWidth(stage.getWidth());
        stage.setHeight(stage.getHeight());
        stage.setTitle("List Employe");
        stage.setScene(scene);
        stage.show();

    }
}

