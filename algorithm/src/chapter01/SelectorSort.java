package chapter01;

/**
 * @Author: yexinming
 * @Description: 选择排序算法
 * @Date: 2021/5/8 10:21 下午
 */
public class SelectorSort {
    /**
     * 选择排序算法核心:
     * 1、线性数据:从首位开始,每次与后面的数据比较
     * 2、开始位置i的数作为最小值:min 比后面的大时候就将后面小的位置数据下标赋值给min,然后拿最min下标比较完毕
     * 3、最后交换i跟min下标的数
     */
    public static void selectorSort(int[] arr){
        if(null == arr || arr.length<2){
            return;
        }
        //1、线性数据:从首位0开始,每次与后面的数据比较
        for(int i=0;i<arr.length-1;i++){//只需要比较到倒数第二位

            //2、开始位置i的数作为最小值:min 比后面的大时候就将后面小的位置数据下标赋值给min,然后拿最min下标比较完毕
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                  min = arr[min]>arr[j]?j:min;
            }
            //3、最后交换i跟min下标的数
            swap(arr,i,min);
        }
    }

    public static void swap(int[] arr,int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    //test
    public static void main(String[] args) {
        int[] arr = {6,5,4,7,1,2};
        System.out.println("======初始数据=====");
        print(arr);
        selectorSort(arr);

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
