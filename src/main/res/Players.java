package main.res;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;

public class Players implements Serializable {

    private String name;
    private String surname;
    private String position;
    private Double age;
    private String command;

    public Players (){


    }
    @Contract(pure = true)
    public Players (String name, String surname, String position, Double age, String command){
        name = this.name;
        surname = this.surname;
        position = this.position;
        age = this.age;
        command = this.command;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
