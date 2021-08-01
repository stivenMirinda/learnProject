package offer;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class JZ1 {

    public static void main(String[] args) {
        Queue<Integer> queue =new PriorityQueue<>();
        Random random = new Random();
        Map<Integer,Integer> map = new HashMap<>();
        ConcurrentHashMap<Integer, Integer> map1 = new ConcurrentHashMap<>();

        for (int i = 0; i < 10; i++) {
            queue.add(Integer.valueOf(random.nextInt(100)));
        }
        System.out.println(queue.toString());
    }


}

