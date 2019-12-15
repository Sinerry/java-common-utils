package com.zeroten.common.util;


public class CheckUtils {
    public static boolean isAnyEmpty(String ...strings) {
        for (String s:strings) {
            if(s == null || s.equals("")){
                return true;
            }
        }
        return false;
    }

    public static boolean isEmpty(Object[] objs) {
        return objs == null || objs.length == 0;
    }

    public static boolean equals(String str1,String str2) {
        if(str1 == null || str2 == null) {
            return false;
        }else if(str1.length() != str2.length()) {
            return false;
        }else {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            int index = 0;
            for (char c:ch1) {
                if(c != ch2[index]) {
                    return false;
                }
                index++;
            }
            return true;
        }
    }

    public static boolean equals(Integer n1,Integer n2) {
       if(n1 == null || n2 == null) {
           return false;
       }
       return n1.intValue() == n2.intValue();
    }

    public static String replaceLast(String src,String old,String now) {
        int start = src.lastIndexOf(old);
        char[] chs = src.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chs.length; i++) {
            sb.append(chs[i]);
        }
        sb.replace(start,start + old.length(),now);
        return sb.toString();
    }
}
