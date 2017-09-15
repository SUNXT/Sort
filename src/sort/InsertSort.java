package sort;

import java.util.Scanner;

/**
 * 插入排序
 * 时间复杂度也是O(n^2)
 */
public class InsertSort {

    /**
     * 选择一个合适的位置进行插入
     * 升序排序
     * @param array
     */
    public static void insertSort(int[] array){
        int length = array.length;
        int j,temp;
        for (int i = 1; i < length; i ++){
            temp = array[i];
            j = i - 1;
            while (j >= 0 && temp < array[j]){
                array[j+1] = array[j];
                j --;
            }
            array[j+1] = temp;
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
        insertSort(array);
        System.out.println("使用插入排序升序排序的结果：");
        for (Integer i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
