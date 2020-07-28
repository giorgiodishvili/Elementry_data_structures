package ge.george.designpattern.momento;

public class Memory {
    private String text;
    public Memory(String text){
        this.text=text;
    }

    public String getSavedText() {
        return text;
    }
}
