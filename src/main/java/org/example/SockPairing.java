package org.example;

import java.util.HashMap;

public class SockPairing {

    public int countPairing(int[] socks) {
        int counter=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<socks.length;i++) {
            if (!map.containsKey(socks[i])){
                map.put(socks[i],i);
            } else {
                int count = map.get(socks[i]);
                if (count % 2 == 1) {
                    counter++;
                }
                map.put(socks[i], count + 1);
            }
        }
        System.out.println(counter);
        return counter;
    }

}
