package com.creditease.lianbiao;

import org.junit.Test;

/**
 * Created by songzhiheng on 2017/7/3.
 */
public class CatchE {


    @Test
    public void catchE() throws Exception {

        try {
            int n = 10 / 0;
        }catch (Exception e){
            System.out.println("aaa");
        }



        System.out.println("bbb");

    }
}
