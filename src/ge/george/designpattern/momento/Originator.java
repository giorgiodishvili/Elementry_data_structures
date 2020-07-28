package ge.george.designpattern.momento;

public class Originator {
    private String text;

    public  void set(String text){
        System.out.println("From Originator: Current version\n"+ text+"\n");
     this.text = text;
    }
    public Memory storeInMemory(){
        System.out.println("From originator: Saving to momento");
        return new Memory(text);
    }
    public String restoreFromMemory(Memory memory){
        text =  memory.getSavedText();
        System.out.println("From Originator: Previous text saved in memory\n"+text+"\n");
return text;
    }

}
