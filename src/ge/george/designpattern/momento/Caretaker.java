package ge.george.designpattern.momento;

import java.util.ArrayList;

public class Caretaker {
    ArrayList<Memory> savedText = new ArrayList<>();
    public void addMemory(Memory m){
        savedText.add(m);
    }
    public Memory getMemory(int index){
        return getMemory(index);
    }
}
