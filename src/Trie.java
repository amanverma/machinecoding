import java.util.ArrayList;
import java.util.List;

public class Trie {
    List<Trie> trieList;
    boolean isEndofWord;
    Trie(){
        isEndofWord=false;
        this.trieList = new ArrayList<>();
    }
}
