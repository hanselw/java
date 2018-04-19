package com.han.test;

/**
 * @authot hansel
 * @date 2018/04/06 18:36
 */
public class TestAllAllocation {

    private static final int _1MB = 1024 * 1024;

    /**
     * vm args:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void testAllocation(){
        byte[] allocation1, allocation2, allocation3, allocation4;

      //  allocation1 = new byte[2 * _1MB];
        //allocation2 = new byte[2 * _1MB];
        //allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];

    }

    public static void main(String[] args){
        //testAllocation();

    }
}
