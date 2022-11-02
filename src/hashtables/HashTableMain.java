package hashtables;

public class HashTableMain {
    public static void main(String[] args) {
//        CharFinder finder = new CharFinder();
//        System.out.println(finder.findFirstNonRepeatingChar("a green apple"));
//        System.out.println(finder.findFirstRepeatedChar("a green apple"));
        HashTable hashTable = new HashTable();
        hashTable.put(6, "A");
        hashTable.put(8, "B");
        hashTable.put(11, "C");
        hashTable.put(6, "A+");
        hashTable.remove(6);
        System.out.println(hashTable.get(11));
    }
}
