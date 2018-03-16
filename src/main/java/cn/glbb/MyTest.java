package cn.glbb;

import org.junit.Test;

import java.util.Arrays;

public class MyTest {
    /**
     * int类型一直相加是否会出现负数
     *
     * result console
     * -32768
     * 32768.0
     */
    @Test
    public void test1(){
        short i = 1;
        while(i>0){
            i++;
        }
        if(i<0){
            System.out.println(i);
            System.out.println(Math.pow(2,15));
        }
    }

    /**
     * 两个数交换，不借助第三个变量
     * 原理 a^a=0 a^b^a=b
     * x=6 y=7
     * result
     * x=7   y=6
     */
    @Test
    public void test2(){
        int x = 6;
        int y = 7;
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("x="+x+"   y="+y);
    }

    /**
     * 对数组第一个和最后一个，第二个和倒数第二个依次进行交换
     */
    @Test
    public void test3(){
        int[] arr = {1,2,3,4,5};
        for(int first=0,last=arr.length-1; first<last; first++,last--){
            arr[first] = arr[first]^arr[last];
            arr[last] = arr[first]^arr[last];
            arr[first] = arr[first]^arr[last];
        }
        System.out.println(Arrays.toString(arr));
    }

}
