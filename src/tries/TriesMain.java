package tries;

import java.util.List;

public class TriesMain {
    public static void main(String[] args) {
        Trie trie = new Trie();
//        trie.insert("care");
//        trie.insert("car");
//        trie.insert("care");
//        System.out.println(trie.contains("can"));
//        trie.traverse();
//        trie.remove("care");
//        System.out.println(trie.contains("car"));
//        System.out.println(trie.contains("care"));
        trie.insert("car");
        trie.insert("care");
        trie.insert("card");
        trie.insert("careful");
        trie.insert("egg");
        List<String> words = trie.findWords(null);
        System.out.println(words);
    }
}
