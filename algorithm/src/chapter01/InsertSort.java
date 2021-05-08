package chapter01;


import static chapter01.Utils.print;
import static chapter01.Utils.swap;

/**
 * @Author: yexinming
 * @Description: 插入排序
 * @Date: 2021/5/9 7:00 上午
 */
public class InsertSort {
    /**
     *插入排序:
     * 1、数组每一个元素都跟他前面的元素比较,如果发现前面一个元素为空,或者比此元素小时,交换位置
     */

    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        //1、数组每一个元素:从第二位开始
        for(int i=1;i<arr.length;i++){

            //2、次元素跟前一个元素比较
            for(int j=i;j>0 && arr[j]<arr[j-1];j--){
                System.out.println("i:"+i +"j:"+j+" j-1:"+(j-1));
                 swap(arr,j,j-1);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,5,4,7,1,2};
        System.out.println("======初始数据=====");
        print(arr);
        insertSort(arr);
        System.out.println("======排序后数据=====");
        print(arr);
    }
}
