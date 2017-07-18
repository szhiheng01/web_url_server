package com.jmeter.once;

import org.junit.Test;

import java.util.*;

/**
 * Created by songzhiheng on 2017/7/16.
 */
public class TestMap {

    @Test
    public void testMap1(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);


        for (String key : map.keySet()){
            List list = new ArrayList();
            list.add(map.get(key));
            
        }
        System.out.println();


        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        for (Map.Entry<String,Object> entry : map.entrySet()){

            System.out.println(entry.getKey());
        }
        System.out.println();



        Iterator<Map.Entry<String,Object>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Object> entry = iter.next();
            System.out.println(entry.getKey());
        }




    }


}
