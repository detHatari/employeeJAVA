package com.example.employeejavafx;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class employeedata {
//    String name;
//    String gender;
//    int id;
//    int salary;
//    int age;

    private final SimpleStringProperty list_name = new SimpleStringProperty("");
    private final SimpleStringProperty list_gender = new SimpleStringProperty("");
    private final SimpleIntegerProperty list_age = new SimpleIntegerProperty(0);
    private final SimpleIntegerProperty list_id = new SimpleIntegerProperty(0);
    private final SimpleIntegerProperty list_salary = new SimpleIntegerProperty(0);

    public employeedata() {
        this("","",0,0,0);
    }
    public employeedata(String list_name, String list_gender, int list_age, int list_id, int list_salary){
        setList_name(list_name);
        setList_gender(list_gender);
        setList_age(list_age);
        setList_id(list_id);
        setList_salary(list_salary);
    }

    public String getList_name() {
        return list_name.get();
    }

    public SimpleStringProperty list_nameProperty() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name.set(list_name);
    }

    public String getList_gender() {
        return list_gender.get();
    }

    public SimpleStringProperty list_genderProperty() {
        return list_gender;
    }

    public void setList_gender(String list_gender) {
        this.list_gender.set(list_gender);
    }

    public int getList_id() {
        return list_id.get();
    }

    public SimpleIntegerProperty list_idProperty() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id.set(list_id);
    }

    public int getList_salary() {
        return list_salary.get();
    }

    public SimpleIntegerProperty list_salaryProperty() {
        return list_salary;
    }

    public void setList_salary(int list_salary) {
        this.list_salary.set(list_salary);
    }

    public int getList_age() {
        return list_age.get();
    }

    public SimpleIntegerProperty list_ageProperty() {
        return list_age;
    }

    public void setList_age(int list_age) {
        this.list_age.set(list_age);
    }




}


