package main.res;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.Objects;

public class Players implements Serializable {

    private String name;
    private String surname;
    private String position;
    private Double age;
    private String command;

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", command='" + command + '\'' +
                '}';
    }

    public Players (){


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Players)) return false;
        Players players = (Players) o;
        return getName().equals(players.getName()) &&
                getSurname().equals(players.getSurname()) &&
                getPosition().equals(players.getPosition()) &&
                getAge().equals(players.getAge()) &&
                getCommand().equals(players.getCommand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getPosition(), getAge(), getCommand());
    }

    @Contract(pure = true)
    public Players (String name, String surname, String position, Double age, String command){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.age = age;
        this.command = command;

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
