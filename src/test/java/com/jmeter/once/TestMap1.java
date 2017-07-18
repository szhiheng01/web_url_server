package com.jmeter.once;

import org.junit.Test;

import javax.swing.text.html.parser.Entity;
import java.security.Key;
import java.util.*;

/**
 * Created by songzhiheng on 2017/7/16.
 */
public class TestMap1 {

    @Test
    public void testMap1(){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);

        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue() - o1.getValue());
            }
        });
        Map map1 = new LinkedHashMap();
        Iterator<Map.Entry<String,Integer>> iterator = list.iterator();
        Map.Entry<String,Integer> entry = null;
        while(iterator.hasNext()){
            entry = iterator.next();
            map1.put(entry.getKey(),entry.getValue());
        }
        System.out.println(map1.toString());
    }


}
