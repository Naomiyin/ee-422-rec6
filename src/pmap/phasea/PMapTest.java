/*
 * Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */

package pmap.phasea;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PMapTest {

    @Test
    public void testPut() {
        PMap m = new PMap();
        assertTrue(m.isEmpty());
        assertEquals(null, m.put(1, 2));
        assertEquals(1, m.size().intValue());
        assertEquals(2, m.put(1, 3).intValue());
        assertEquals(1, m.size().intValue());
    }

    @Test
    public void testGet() {
        PMap m = new PMap();
        m.put(1, 2);
        assertEquals(2, m.get(1).intValue());
        assertEquals(null, m.get(2));
    }
    
    
    @Test
    public void testcontainsKeyValue() {
        PMap m = new PMap();
        m.put(1, 2);
        assertEquals(true, m.containsKey(1));
        assertEquals(false, m.containsKey(7));
        assertEquals(true, m.containsValue(2));
        assertEquals(false, m.containsValue(3));
  
    }
    
    
    @Test
    public void testcontainsKey() {
        PMap m = new PMap();
        m.put(1, 2);
        assertEquals(true, m.containsKey(1));
  
    }
    
    
    @Test
    public void testRemove() {
        PMap m = new PMap();
        m.put(1, 2);
        Integer ret = m.remove(1);
        assertEquals(2, ret.intValue());
        
        Integer ret2 = m.remove(1);
        assertEquals(null, ret2);
  
    }
    
    
    @Test
    public void testPutAll() {
        PMap m = new PMap();
        m.putAll(new Integer[] {1, 2}, new Integer[] {3, 4});

        assertEquals(2, m.size().intValue());
 
    }
    
    
    @Test
    public void testClear() {
        PMap m = new PMap();
        m.putAll(new Integer[] {1, 2}, new Integer[] {3, 4});

        m.clear();
        assertEquals(0, m.size().intValue());
    }
    
    
    @Test
    public void testKeyValueEntrySet() {
        PMap m = new PMap();
        m.putAll(new Integer[] {1, 2}, new Integer[] {3, 4});

        Integer[] keySet = m.keySet();
        Integer[] valueSet = m.values();
        PEntry[] entrySet = m.entrySet();
        
        for(int i=0; i< entrySet.length; i++) {
        	assertEquals(entrySet[i].getKey().intValue(), keySet[i].intValue());
        	assertEquals(entrySet[i].getValue().intValue(), valueSet[i].intValue());
        }
    }


    
}
