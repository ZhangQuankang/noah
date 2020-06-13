package PriorityQueue;


import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * create by zhangquankang on 2020/6/5
 */
public class priorityQueue {

    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue();
        pq.add(LocalDate.of(1991,10,10));
        pq.add(LocalDate.of(1992,11,10));
        pq.add(LocalDate.of(1942,1,10));
        pq.add(LocalDate.of(1999,7,10));

        System.out.println("Iterating over elements...");
        for (LocalDate date: pq) {
            System.out.println(date);
        }
        System.out.println("Removing elementes...");
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }

    }

}
