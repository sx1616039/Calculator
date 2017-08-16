package org.wxq.unitTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)   //1.更改默认的测试运行器为RunWith(Parameterized.class) 
public class MultiParaCalculatorTest {

	//2.声明变量存放预期值和测试数据  
    int expected =0;  
    int input1 = 0;  
    int input2 = 0;  
      
    //3.声明一个返回值 为Collection的公共静态方法，并使用@Parameters进行修饰  
    @Parameters  
    public static Collection data() {  
        return Arrays.asList(new Object[][]{  
                {3,1,2},  
                {4,2,2}  
        }) ;  
    }  
      
    //4.为测试类声明一个带有参数的公共构造函数，并在其中为之声明变量赋值  
    public MultiParaCalculatorTest(int expected,int input1,int input2) {  
        this.expected = expected;  
        this.input1 = input1;  
        this.input2 = input2;  
    }  
      
    //5.运行测试方法，即可完成对多组数据的测试  
    @Test  
    public void testAdd() {  
        assertEquals(expected, new Calculator().add(input1, input2));  
    }  
}
