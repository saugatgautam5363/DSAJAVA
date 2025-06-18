public class Hashing {
    int[] hashTable;
    int size;

    // Constructor
    public Hashing(int size) {
        this.size = size;
        hashTable = new int[size];

        // Initialize hash table with -1 to indicate empty
        for (int i = 0; i < size; i++) {
            hashTable[i] = -1;
        }
    }

    // Hash Function
    public int hashFunction(int key) {
        return key % size;
    }

    // Insert using Linear Probing
    public void insert(int key) {
        int index = hashFunction(key);

        // If collision occurs
        while (hashTable[index] != -1) {
            index = (index + 1) % size;
        }

        hashTable[index] = key;
        System.out.println("Inserted " + key + " at index " + index);
    }

    // Search
    public boolean search(int key) {
        int index = hashFunction(key);
        int start = index;

        while (hashTable[index] != -1) {
            if (hashTable[index] == key) {
                return true;
            }
            index = (index + 1) % size;

            // If we come full circle
            if (index == start) break;
        }

        return false;
    }

    // Display table
    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + " : " + (hashTable[i] == -1 ? "Empty" : hashTable[i]));
        }
    }

    // Main method
    public static void main(String[] args) {
        Hashing h = new Hashing(10);

        // Insert keys
        h.insert(23);
        h.insert(43);
        h.insert(13);
        h.insert(27);

        h.display();

        // Search keys
        System.out.println("Search 43: " + (h.search(43) ? "Found" : "Not Found"));
        System.out.println("Search 99: " + (h.search(99) ? "Found" : "Not Found"));
    }
}
