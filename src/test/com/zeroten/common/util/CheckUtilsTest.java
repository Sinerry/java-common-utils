package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;


/*
* TDD，测试驱动开发，编写测试用例
* */
public class CheckUtilsTest {
    @Test
    public void testIsAnyEmpty() {
        Assert.assertEquals(CheckUtils.isAnyEmpty("123",null),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("java",""),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("java","mysql","spring"),false);
    }

    @Test
    public void testIsEmpty() {
        Assert.assertEquals(CheckUtils.isEmpty(new String[]{}),true);
        Assert.assertEquals(CheckUtils.isEmpty(null),true);
        Assert.assertEquals(CheckUtils.isEmpty(new String[]{"java","","spring"}),false);
    }

    @Test
    public void testStringEquals() {
        Assert.assertEquals(CheckUtils.equals(null,""),false);
        Assert.assertEquals(CheckUtils.equals("",null),false);
        Assert.assertEquals(CheckUtils.equals("java","spring"),false);
        Assert.assertEquals(CheckUtils.equals("abc","abd"),false);
        Assert.assertEquals(CheckUtils.equals("java","java"),true);
        Assert.assertEquals(CheckUtils.equals("",""),true);
    }

    @Test
    public void testIntegerEquals() {
        Assert.assertEquals(CheckUtils.equals(null,100),false);
        Assert.assertEquals(CheckUtils.equals(100,null),false);
        Assert.assertEquals(CheckUtils.equals(100,200),false);
        Assert.assertEquals(CheckUtils.equals(100,100),true);
    }

    @Test
    public void testReplaceLast() {
        Assert.assertEquals(CheckUtils.replaceLast("java is use very useful","use","news"),"java is use very newsful");
    }

}
