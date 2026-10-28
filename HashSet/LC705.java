//705. Design HashSet
/*Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing. */

package HashSet;
import java.util.LinkedList;

class Bucket {
    // Changed to LinkedList instead of List so addFirst() works
    private LinkedList<Integer> container;

    public Bucket() {
        this.container = new LinkedList<Integer>();
    }

    public void insert(Integer val) {
        int index = this.container.indexOf(val);
        if (index == -1) {
            this.container.addFirst(val);
        }
    }

    public void remove(Integer val) {
        // Fixed typo: was this.contains
        this.container.remove(val); 
    }

    public boolean contains(Integer val) {
        int index = this.container.indexOf(val);
        return index != -1;
    }
}

class MyHashSet {
    int numBuckets = 769;
    Bucket[] buckets; // Using the Bucket class defined above

    public MyHashSet() {
        this.buckets = new Bucket[this.numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            this.buckets[i] = new Bucket(); // Fixed typo: was Buckets()
        }
    }

    private int getIndex(int key) {
        return key % numBuckets;
    }

    public void add(int key) {
        int bucketIndex = this.getIndex(key); // Fixed typo: was bucketIxdex
        this.buckets[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].remove(key);
    }

    public boolean contains(int key) {
        int bucketIndex = this.getIndex(key);
        return this.buckets[bucketIndex].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
