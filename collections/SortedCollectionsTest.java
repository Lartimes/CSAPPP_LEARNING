package collections;

import java.util.*;

/**
 * @author wüsch
 * @version 1.0
 * @description:
 * @since 2025/1/15 23:21
 */
public class SortedCollectionsTest {
    public static void main(String[] args) {
//        TreeMapTest.todo();
//        TreeSetTest.todo();
//        LinkedListTest.todo();
        PriorityQueueTest.todo();
    }

    //    TODO
//    set
    public static class TreeMapTest {
        public static void todo() {
            TreeMap<Long, Long> treeMap = new TreeMap<>();
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                long l = random.nextInt(10);
                treeMap.put(l, treeMap.getOrDefault(l, 0L) + 1L);
            }
            System.out.println(treeMap);
            Long firstKey = treeMap.firstKey();
            System.out.println("第一个key: " + firstKey);
            Long lastKey = treeMap.lastKey();
            System.out.println("最后一个key: " + lastKey);
        }
    }

    public static class TreeSetTest {
        public static void todo() {
            TreeSet<Long> treeSet = new TreeSet<>();
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                long l = random.nextInt(10);
                treeSet.add(l);
            }
            System.out.println(treeSet);
            Long first = treeSet.first(); //拿到最小的
            Long last = treeSet.last(); //拿到最大的
            System.out.println(treeSet);
            Long a = treeSet.pollFirst(); //取出最小的
            Long b = treeSet.pollLast(); //取出最大的
            System.out.println(treeSet);
        }
    }

    //    list
    public static class LinkedListTest {
        public static void todo() {
            LinkedList<Long> arr = new LinkedList<>();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                long l = random.nextInt(10);
//            arr.offer(l); //offer === addLast , 添加到最后一个
                arr.add(l);
            }
//        arr.addFirst();
//        arr.addLast();
            System.out.println(arr);
            Long first = arr.pollFirst(); //移除第一个并且返回
            Long last = arr.pollLast(); //移除第一个并且返回
            System.out.println(arr);
            Long l = arr.peekFirst();//返回第一个但不删除
            Long r = arr.peekLast();//返回最后一个但不删除
            System.out.println(arr);
        }
    }

    //queue
    public static class PriorityQueueTest {
        public static void todo() {
            PriorityQueue<Long> arr = new PriorityQueue<Long>();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                long l = random.nextInt(10);
                arr.add(l);
            }
            System.out.println(arr);
            Long peek = arr.peek(); // 返回第一个但不删除
            System.out.println(arr);
            Long poll = arr.poll(); // 返回第一个且删除
            System.out.println(arr);
        }
    }
}
