package memento;

public class Client {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        ConfigManager configManager = new ConfigManagerImpl(mementoCaretaker);


    }
}
