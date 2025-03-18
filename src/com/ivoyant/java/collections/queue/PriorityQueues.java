package com.ivoyant.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
                PriorityQueue<Integer> p = new PriorityQueue<>();
                p.add(8);
                p.add(90);
                p.add(98);
                p.add(675);
                p.add(88);
                p.add(88);

                System.out.println("Queue : " + p);
                System.out.println("Peek : " + p.peek());
                System.out.println("Poll : " + p.poll());
                System.out.println("Contains 8 : " + p.contains(8));
                System.out.println("Remove 90: " + p.remove(90));
                System.out.println("Is empty : " + p.isEmpty());
                System.out.println("HashCode : " + p.hashCode());
                System.out.println("Size : " + p.size());

                Object[] arr = p.toArray();
                System.out.print("Elements using toArray(): ");
                for (Object ele : arr) {
                    System.out.print(ele + " ");
                }
                System.out.println();

                p.clear();
                System.out.println("After clear(), is empty? " + p.isEmpty());
            }
        }

//Subclass of Queue interface.
//size is dynamic and increased by 50%
//default capacity  is 10.
//Allows duplicates.
//Do not allow nulls.
