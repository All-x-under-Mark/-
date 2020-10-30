package main.res;


import java.io.Serializable;
import java.util.*;

public class TestMap implements Serializable {
    public List<Players> playersList = new ArrayList();


    public TestMap() {

        playersList.add(new Players("Роман", "Боровик", "Захисник", 1994, "ФК Юність"));
        playersList.add(new Players("Владислав", "Павлов", "Півзахисник", 1995, "ФК Юність"));
        playersList.add(new Players("Сергій", "Суддя", "Півзахисник", 1995, "ФК Юність"));
        playersList.add(new Players("Вячеслав", "Давиденко", "Півзахисник", 1975, "ФК Юність"));
        playersList.add(new Players("Олександр", "Мина", "Захисник", 1989, "ФК Юність"));
        playersList.add(new Players("Олександр", "Коршак", "Воротар", 1995, "ФК Юність"));
        playersList.add(new Players("Владислав", "Давиденко", "Півзахисник", 2004, "ФК Юність"));
        playersList.add(new Players("Іван", "Щербина", "Нападник", 2002, "ФК Юність"));
        playersList.add(new Players("Вадим", "Магдич", "Захисник", 1989, "ФК Юність"));
        playersList.add(new Players("Сергій", "Коршак", "Захисник", 1998, "ФК Юність"));
        playersList.add(new Players("Олександр", "Суддя", "Нападник", 1991, "ФК Юність"));


    }


    public List<Players> getPlayersList() {

        return playersList;
    }


}


