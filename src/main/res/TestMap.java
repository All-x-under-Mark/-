package main.res;




import java.io.Serializable;
import java.util.Map;

public class TestMap implements Serializable {
    public Map<Integer, Players> playersMap;



    public TestMap (){

playersMap.put(1, new Players("Роман", "Боровик", "Захисник", (double) 25, "ФК Юність"));
        playersMap.put(2, new Players("Владислав", "Павлов", "Півзахисник", (double) 24, "ФК Юність"));
    }



   public Map<Integer, Players> createMap (){
       playersMap.put(1, new Players("Роман", "Боровик", "Захисник", (double) 25, "ФК Юність"));
       playersMap.put(2, new Players("Владислав", "Павлов", "Півзахисник", (double) 24, "ФК Юність"));
  return playersMap;
   }
    public Map<Integer, Players> getPlayersMap() {

        playersMap.put(1, new Players("Роман", "Боровик", "Захисник", (double) 25, "ФК Юність"));
        playersMap.put(2, new Players("Владислав", "Павлов", "Півзахисник", (double) 24, "ФК Юність"));
        return playersMap;
    }

    public void setPlayersMap(Map<Integer, Players> playersMap) {
        this.playersMap = playersMap;
    }
}


