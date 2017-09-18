package sort;

import java.util.Scanner;

/**
 * 时间复杂度为 O(n*log2(n))
 * 空间复杂度为 O(log2(n))
 * 分治法，划分思想
 */
public class QuickSort {

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right){
        if (left < right){
            int pivotPos = partition(array, left, right);
            quickSort(array, left, pivotPos - 1);
            quickSort(array, pivotPos + 1, right);
        }
    }

    /**
     * 划分函数
     * @param array
     * @param low
     * @param height
     * @return 划分的下标
     */
    private static int partition(int[] array, int low, int height){
        int pivotPos = low;
        int pivot = array[low];//基准元素
        for (int i = low + 1; i <= height; i ++){
            if (array[i] < pivot){
                pivotPos ++;
                if (pivotPos != i){
                    int temp = array[pivotPos];
                    array[pivotPos] = array[i];
                    array[i] = temp;
                }
            }
        }
        //将基准元素放到合适的位置
        array[low] = array[pivotPos];
        array[pivotPos] = pivot;
        return pivotPos;
    }

    public static void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("先输入要输入的总个数n：");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("输入的n个数：");
        for (int i = 0; i < n; i ++){
            array[i] = scanner.nextInt();
        }
        //使用选择排序
        quickSort(array);
        System.out.println("使用快排升序排序的结果：");
        for (Integer i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
