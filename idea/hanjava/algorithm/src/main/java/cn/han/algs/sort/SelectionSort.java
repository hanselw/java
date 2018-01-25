package cn.han.algs.sort;

/**
 * 选择排序（Selection sort）
 * <pre>
 * 基本思想：每次在n-i（i＝0，1，..., n-1）个记录找到最小的记录作为有序序列中的第i个记录。
 *          基于此思想的算法主要有简单选择排序、树形选择排序和堆排序。
 *
 * @authot hansel
 * @date 18/1/24 17:06
 */

public class SelectionSort extends MySort {

    /**
     *
     * 简单选择排序(直接选择排序)
     * <pre>
     *     理解：
     * <pre>
     *     稳定性：不稳定，如 2(a)，2(b)，1 排序后 1，2(b)，2(a)
     * <pre>
     *     时间复杂度：(n-1)+(n-2)+...+2+1+0 = (n-1)n/2 ~ n^2/2 ~ O(n^2)
     *                平均情况：O(n^2)
     *                最好情况：O(n^2)
     *                最坏情况：O(n^2)
     * <pre>
     *     空间复杂度：O(1)
     * <pre>
     *     改进想法：exch交换前，先判断是否找到比min更小的记录，如 min ！＝ i 可减少交换次数
     * <pre>
     *     应用场景：
     * @param a
     * @return void
     */

    public static void sort(Comparable[] a) {

        int min;//记录每次找到最小元素的下标
        int N = a.length;
        for(int i = 0; i < N; i++){
            min = i;
            for(int j = i + 1; j < N; j++){
                if(less(a[j],a[min])){
                    min = j;
                }
            }
            show(a);
            exch(a, i, min);
        }
    }
}
