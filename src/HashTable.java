import java.util.LinkedList;

public class HashTable {

    private int                     tableSize;          // The default size fo HashTable

    private int                     collisionsCount;    // Total number of collisions

    private int                     wordsCount;         // Total number of words inserted in HashTable

    private LinkedList<Anagram>[]   HashTable;          // HashTable is represented as an array of LinkedList of Anagrams


    public HashTable(int tableSize) {
        this.tableSize      = tableSize;
        this.HashTable      = new LinkedList[10];
    }

}
