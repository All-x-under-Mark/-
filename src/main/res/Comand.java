package main.res;

import java.util.Objects;

public class Comand {

    private int num;
    private String name;
    private int game;
    private int win;
    private int draw;
    private int lost;
    private int goalsScored;
    private int goalsConceded;
    private int difference;
    private int points;

    public Comand() {

    }

    public Comand(int num, String name, int game, int win, int draw, int lost, int goalsScored, int goalsConceded,
                  int difference, int points) {
        this.num = num;
        this.name = name;
        this.game = game;
        this.win = win;
        this.draw = draw;
        this.lost = lost;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
        this.difference = difference;
        this.points = points;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comand)) return false;
        Comand comand = (Comand) o;
        return getNum() == comand.getNum() &&
                getGame() == comand.getGame() &&
                getWin() == comand.getWin() &&
                getDraw() == comand.getDraw() &&
                getLost() == comand.getLost() &&
                getGoalsScored() == comand.getGoalsScored() &&
                getGoalsConceded() == comand.getGoalsConceded() &&
                getDifference() == comand.getDifference() &&
                getPoints() == comand.getPoints() &&
                getName().equals(comand.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum(), getName(), getGame(), getWin(), getDraw(), getLost(), getGoalsScored(), getGoalsConceded(), getDifference(), getPoints());
    }

    @Override
    public String toString() {
        return "Comand{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", game=" + game +
                ", win=" + win +
                ", draw=" + draw +
                ", lost=" + lost +
                ", goalsScored=" + goalsScored +
                ", goalsConceded=" + goalsConceded +
                ", difference=" + difference +
                ", points=" + points +
                '}';
    }
}
