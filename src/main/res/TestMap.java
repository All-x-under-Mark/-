package main.res;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap implements Serializable {
    public Map<String, Players> playersMap = new HashMap<>();


    public TestMap() {

        playersMap.put("p1", new Players("Роман", "Боровик", "Захисник", (double) 25, "ФК Юність"));
        playersMap.put("p2", new Players("Владислав", "Павлов", "Півзахисник", (double) 24, "ФК Юність"));
    }


    /*public Map<String, Players> createMap() {
        playersMap.put(1, new Players("Роман", "Боровик", "Захисник", (double) 25, "ФК Юність"));
        playersMap.put(2, new Players("Владислав", "Павлов", "Півзахисник", (double) 24, "ФК Юність"));
        return playersMap;
    }*/

    public Map<String, Players> getPlayersMap() {

        return playersMap;
    }

    public void setPlayersMap(Map<String, Players> playersMap) {
        this.playersMap = playersMap;
    }
}


