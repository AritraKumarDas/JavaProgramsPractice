// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();
         
        list1.add(10);
        list1.add(20);
        list1.set(1,30);
        list1.add(2,20);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        
        // using while
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        
//         using for each
         for(Integer obj: list1){
             System.out.print(obj + "  ");
         }
    }
}