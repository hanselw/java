package cn.han.algs.sort;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class SelectionSortTest {

    Comparable[] a;
    Comparable[] b;

    public SelectionSortTest(Comparable[] a, Comparable[] b){
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters(name = "{index}:{0}.equals({1})")
    public static Iterable<Object[]> data(){

        return Arrays.asList(new Object[][]{
                {"1,2,2".split(","),"1,2,2".split(",")}
        });
    }

    @Test
    public void sort() {
        SelectionSort.sort(a);
        SelectionSort.show(a);
        Assert.assertArrayEquals(b, a);
    }
}