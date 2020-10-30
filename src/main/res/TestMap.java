package main.res;




import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class TestMap implements Serializable {
    public Map<Integer, Players> playersMap = new Map<Integer, Players>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Players get(Object key) {
            return null;
        }

        @Nullable
        @Override
        public Players put(Integer key, Players value) {
            return null;
        }

        @Override
        public Players remove(Object key) {
            return null;
        }

        @Override
        public void putAll(@NotNull Map<? extends Integer, ? extends Players> m) {

        }

        @Override
        public void clear() {

        }

        @NotNull
        @Override
        public Set<Integer> keySet() {
            return null;
        }

        @NotNull
        @Override
        public Collection<Players> values() {
            return null;
        }

        @NotNull
        @Override
        public Set<Entry<Integer, Players>> entrySet() {
            return null;
        }
    };



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

         return playersMap;
    }

    public void setPlayersMap(Map<Integer, Players> playersMap) {
        this.playersMap = playersMap;
    }
}


