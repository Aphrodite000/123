import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        //大List（线性表）里面的元素的类型是List<Integer>线性表，括号里List<Integer>里面的元素是int，填它的封装类
        //大List的引用里面有小List的引用，小List里的引用是Integer
        /**
         * list是一种引用，List类型的接口引用（java语法）
         * list逻辑上是一种线性表
         */
        //里面的List<Integer>不用创建对象，它的对象就是顺序表元素，外面的List对象是顺序表
        List<List<Integer>> list = new ArrayList<>();  //数组容量
        //下标和size（实际元素个数）有关，容量足够大，但是如果没有填数，就不能访问，
        //必须这个地方有确切的元素才能用set，才能获取下标，用过add的才能用set
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>(100));//列
        }
        list.get(0).add(1);  //add（int v）为尾插
        list.get(1).add(1);
        list.get(1).add(1);
        //有下标才能调用set
        for (int i = 2; i < numRows; i++) {
            List<Integer> nums = list.get(i);
            nums.add(1);
            for (int j = 1; j < i; j++) {
                int sum = list.get(i - 1).get(j - 1) +
                        list.get(i - 1).get(j);
                nums.add(sum);
            }
            nums.add(1);
        }
        return list;
    }
    private static void printPascalsTriangle(Solution s,int numRows){
        System.out.println(s.generate(numRows));
    }
    public static void main (String[] args){
        Solution solution=new Solution();
        printPascalsTriangle(solution,10);

    }
}