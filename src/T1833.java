import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class T1833 {

    @Test
    public int maxIceCream(int[] costs, int coins) {
        // int[] costs, int coins
        // int[] costs = new int[] {1,3,2,4,1};
        // int coins = 7;

        Queue<Item> items = new PriorityQueue<>();
        for (int i=0; i<costs.length; i++) {
            Item item = new Item(i, costs[i]);
            items.add(item);
        }
        
        

        int num = 0;
        Arrays.sort(costs);
        for (int i=0; i<costs.length; i++) {
            if ((coins-costs[i])>=0) {
                coins -= costs[i];
                num++;
            }
        }
        return num;

        

        // return 0;
    }
    
    /**
     * 封装雪糕信息
     */
    static class Item implements Comparable {

        private int index;
        private int value;

        Item(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Object o) {
            Item other = (Item) o;
            return this.value - other.value;
        }

        @Override
        public String toString() {
            return "Item [index=" + index + ", value=" + value + "]";
        }
        
    }
}
