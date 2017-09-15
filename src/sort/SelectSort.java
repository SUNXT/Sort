package sort;

import java.util.Scanner;

/**
 * 选择排序
 * 时间复杂度为O(n^2)
 */
public class SelectSort {

    /**
     * for + for
     * 升序排序
     * @param array
     */
    public static void selectSort(int[] array){
        int length = array.length;
        int k,temp;
        for (int i = 0; i < length; i ++){
            k = i;
            for (int j = i+1; j < length; j ++){
                if (array[k] > array[j]){
                    k = j;
                }
            }
            if (k != i){
                temp = array[k];
                array[k] = array[i];
                array[i] = temp;
            }
        }
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
        selectSort(array);
        System.out.println("使用选择排序升序排序的结果：");
        for (Integer i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
