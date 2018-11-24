package Map61B;

import org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * An array based implementation of the Map61B class.
 */
public class ArrayMap<K, V> implements Map61B<K, V> {
    private int size;
    private K[] keys;
    private V[] values;  
    public ArrayMap() {
        size = 0;
        keys = new Object[100]；
        values = new Object[100];
    }

    /** Returns the index of the given key if it exists,
     *  -1 otherwise. */
    private int keyIndex(K key) {
        for(int i = 0;i < K.length,i++){
            if(keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }


    public boolean containsKey(K key) {
        int i = keyIndex(key);
        return i > -1;
    }

    public void put(K key, V value) {
        int i = keyIndex(key);
        if(i != -1){
            values[i] = value;
        else
            keys[keys.size] = key;
            values[values.size] = value;
            size = size + 1;
    }

    public V get(K key) {
        if(containKey(key){
          int i = keyIndex(key);
          return values[i];
        else 
            return -1;
    }

    public int size() {
        return size;
    }

    public List<K> keys() {
        List<K> keylist = new ArrayList<K>();
        for (int i = 0; i < size; i += 1) {
            keylist.add(keys[i]);
        }
        return keylist;
    }
    

    /*@Test
    public void test() {
        ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
        am.put(2, 5);
        int expected = 5;
        assertEquals(expected, am.get(2));
    }*/

    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse", 3);
        m.put("fish", 9);
        m.put("house", 10);
    }
}
