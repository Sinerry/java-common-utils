package com.zeroten.common.util;


import org.testng.Assert;
import org.testng.annotations.Test;


public class ArrayUtilsTest {
    @Test
    public void testArraySort() {
        int[] arr = {17,21,31,12,45,37,28};
        Assert.assertEquals(ArrayUtils.sort(arr),new int[]{12,17,21,28,31,37,45});
    }
}
