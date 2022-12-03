import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * <p></p>
 *
 * @author 小怪兽
 * @version 1.0
 * @since 2022-07-17
 */
public class T565 {

    int[] ans = null;
    boolean[] visited = null;

    public int arrayNesting(int[] nums) {
        ans = new int[nums.length];
        visited = new boolean[nums.length];
        Arrays.fill(ans, 0);

        for (int i = 0; i < nums.length; i++) {
            if (ans[i] != 0) {
                continue;
            }
            dfs(nums, i);
        }

        return Arrays.stream(ans).max().getAsInt();
    }

    private void dfs(int[] nums, int index) {

        if (visited[index]) {
            return;
        }
        if (index==nums[index]) {
            ans[index] = 1;
            return;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(index);
        int ret = 0;

        while (!stack.isEmpty()) {
            index = stack.pop();

            if (!visited[index]) {
                visited[index] = true;
                ans[index] = ++ret;

                stack.push(nums[index]);
            }
            else {
                break;
            }

        }

        //if (visited[index]) {
        //    return ret;
        //}
        //if (index==nums[index]) {
        //    return ret;
        //}
        //if (ans[index] != 0) {
        //    visited[index] = true;
        //    return ans[index];
        //}
        //if (!visited[index] && !visited[nums[index]]) {
        //    visited[index] = true;
        //    int tmp = ret + dfs(nums, nums[index], 1);
        //    ans[index] = tmp;
        //    return tmp;
        //}
        //ans[index]++;
        //return ret;
    }

    @Test
    public void test40() throws Exception {

        List arr = new LinkedList();
        arr = Arrays.asList(0,1,2);


        //FileInputStream inputStream = new FileInputStream("C:\\Code\\LeetCode\\src\\565.txt");
        //InputStreamReader reader = new InputStreamReader(inputStream);
        //BufferedReader stream = new BufferedReader(reader);
        //String line;
        //while ((line = stream.readLine()) != null) {
        //    arr.add(Integer.valueOf(line));
        //}


        int i = arrayNesting(arr.stream().mapToInt(a->Integer.parseInt(""+a)).toArray());
        System.out.println(i);
    }
}
