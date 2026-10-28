//706. Design HashMap
/*Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key. */

package HashSet;
import java.util.LinkedList;

class Pair<U, V> {
    U first;
    V second;

    public Pair(U f, V s) {
        first = f;
        second = s;
    }
}

class Bucket {
    LinkedList<Pair<Integer, Integer>> list;

    public Bucket() {
        list = new LinkedList<Pair<Integer, Integer>>();
    }

    public void put(int key, int value) {
        for (Pair<Integer, Integer> p : list) {
            if (p.first == key) {
                p.second = value;
                return;
            }
        }
        list.addFirst(new Pair<Integer, Integer>(key, value));
    }

    public int get(int key) {
        for (Pair<Integer, Integer> p : list) {
            if (p.first == key) {
                return p.second;
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (Pair<Integer, Integer> p : list) {
            if (p.first == key) {
                list.remove(p);
                return;
            }
        }
    }
}

class MyHashMap {
    Bucket[] buckets;
    int keyRange = 769;

    public MyHashMap() {
        buckets = new Bucket[keyRange];
        for (int i = 0; i < keyRange; i++) {
            this.buckets[i] = new Bucket();
        }
    }

    public int getBucketIndex(int key) {
        return key % keyRange;
    }

    public void put(int key, int value) {
        int bucketIdx = this.getBucketIndex(key);
        this.buckets[bucketIdx].put(key, value);
    }

    public int get(int key) {
        int bucketIdx = this.getBucketIndex(key);
        return this.buckets[bucketIdx].get(key);
    }

    public void remove(int key) {
        int bucketIdx = this.getBucketIndex(key);
        this.buckets[bucketIdx].remove(key);
    }
}

// /**
//  * Your MyHashMap object will be instantiated and called as such:
//  * MyHashMap obj = new MyHashMap();
//  * obj.put(key,value);
//  * int param_2 = obj.get(key);
//  * obj.remove(key);
//  */
