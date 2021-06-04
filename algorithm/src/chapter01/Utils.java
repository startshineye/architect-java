package chapter01;

/**
 * @Author: yexinming
 * @Description: 数据交换
 * @Date: 2021/5/9 7:10 上午
 */
public class Utils {
    /**
     * 数组位置交换
     * @param arr 数组
     * @param i i位置
     * @param j j位置
     */
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 打印数组
     * @param arr 数组
     */
    public static void print(int[]  arr){
        if(null == arr || arr.length==0){
            return;
        }
        for (int a:arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int a=3;
        System.out.println(a/3);
    }
}
