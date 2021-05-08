package chapter01;

import java.util.Arrays;

/**
 * @Author: yexinming
 * @Description: 冒泡排序
 * @Date: 2021/5/8 11:07 下午
 */
public class BubbleSort {
    /**
     * 冒泡排序:(每次都可能进行数据交换)
     * 注意:冒泡到最有边的会是最大的,所以下次的话,只需要从0开始到次位置
     *1、针对于每一个数据都需要进行冒泡到最大，
     * 2、每次从0开始,到n-i为止
     */
    public static void bubbleSort(int arr[]){
        if(null == arr || arr.length <2){
               return;
        }
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                   //获取当前位置最大值
                   if(arr[j]>=arr[j+1]){
                       swap(arr,j,j+1);
                   }
            }
        }
    }

    private static void swap(int[] arr,int a, int b) {
        int tmp = arr[a];
        arr[a]= arr[b];
        arr[b]= tmp;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,7,1,2};
        System.out.println("======初始数据=====");
        print(arr);
        bubbleSort(arr);

        System.out.println("======排序后数据=====");
        print(arr);
    }
    public static void print(int[]  arr){
        if(null == arr || arr.length==0){
            return;
        }
        for (int a:arr) {
            System.out.println(a);
        }
    }
}
