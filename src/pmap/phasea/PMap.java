/*
 * Phase A <Yue Cheng YC26939><Meini Yin my7343>

 */

package pmap.phasea;
import java.util.*;
/**
 * PMap stands for Paired Map. A map is a collection of key-value
 * pairs, e.g., (1, 2) (2, 3) (3, 4) are all pairs with an integer key
 * and an integer value. See the
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">
 * java.util.Map documentation</a> for how these methods are supposed
 * to work.
 */
public class PMap {

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
	
	private List<PEntry> list = new ArrayList<>() ;
    public Integer size() {
       
        return list.size();
    }

    /**
     * Returns <tt>true</tt> if this map contains no key-value
     * mappings.
     *
     * @return <tt>true</tt> if this map contains no key-value
     *         mappings
     */
    public boolean isEmpty() {
        
        return list.isEmpty();
    }

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the
     * specified key.
     *
     * @param key key whose presence in this map is to be tested
     * @return <tt>true</tt> if this map contains a mapping for the
     *         specified key
     */
    public boolean containsKey(Integer key) {
        for(PEntry each : list) {
        	if(each.getKey().equals(key)) {
        		return true;
        	}
        }
        return false;
    }

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value.
     *
     * @param value value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to the
     *         specified value
     */
    public boolean containsValue(Integer value) {
        for(PEntry each : list) {
        	if(each.getValue().equals(value)) {
        		return true;
        	}
        }
        return false;
    }

    /**
     * Returns the value to which the specified key is mapped, or
     * {@code null} if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or
     *         {@code null} if this map contains no mapping for the
     *         key
     */
    public Integer get(Integer key) {
        for(PEntry each : list) {
        	if(each.getKey().equals(key)) {
        		return each.getValue();
        	}
        }
        return null;

    }

    /**
     * Associates the specified value with the specified key in this
     * map (optional operation).  If the map previously contained a
     * mapping for the key, the old value is replaced by the specified
     * value.
     *
     * @param key key with which the specified value is to be
     *        associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer put(Integer key, Integer value) {
        for(PEntry each : list) {
        	if(each.getKey().equals(key)) {
        		Integer old = each.getValue();
        		each.setValue(value);
        		return old;
        	}
        }
        list.add(new PEntry(key, value));
       return null;
    }

    /**
     * Removes the mapping for a key from this map if it is present
     * (optional operation).
     *
     * <p>Returns the value to which this map previously associated
     * the key, or <tt>null</tt> if the map contained no mapping for
     * the key.
     *
     * <p>The map will not contain a mapping for the specified key
     * once the call returns.
     *
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer remove(Integer key) {
        for(PEntry each : list) {
        	if(each.getKey().equals(key)) {
 
        		list.remove(each);

        		
        		return each.getValue();
        	}
        }
        return null;
    }

    /**
     * Put all of the mappings from a pair of arrays to this map. Each
     * pair of elements sharing the same index in <tt>keys</tt> and
     * <tt>values</tt> composes a mapping to be stored the map.
     *
     * @param keys the array of keys to be stored in this map
     * @param values the array of values to be stored in this map
     */
    public void putAll(Integer[] keys, Integer[] values) {
    	
        for(int i=0; i< keys.length; i++){
        	PEntry each = new PEntry(keys[i], values[i]);
        	this.list.add(each);
        }
        
    }

    /**
     * Removes all of the mappings from this map. The map will be
     * empty after this call returns.
     */
    public void clear() {
        list.clear();
    }

    /**
     * Returns an array of the keys contained in this map.
     *
     * @return an array of the keys contained in this map
     */
    public Integer[] keySet() {
        Integer[] ans = new Integer[list.size()];
        for(int i=0; i<list.size(); i++){
        	PEntry each = list.get(i);
        	ans[i] = each.getKey();
        }
        
        return ans;
}

    /**
     * Returns an array of the values contained in this map.
     *
     * @return an array of the values contained in this map
     */
    public Integer[] values() {
        Integer[] ans = new Integer[list.size()];
        for(int i=0; i<list.size(); i++) {
        	PEntry each = list.get(i);
        	ans[i] = each.getValue();
        }
        
        return ans;
    }

    /**
     * Returns an array of the mappings contained in this map.
     *
     * @return an array of the mappings contained in this map
     */
    public PEntry[] entrySet() {
    	PEntry[] ans = new PEntry[list.size()];
        for(int i=0; i<list.size(); i++) {
        	PEntry each = list.get(i);
        	ans[i] = each;
        }
        
        return ans;
    
    }
}
