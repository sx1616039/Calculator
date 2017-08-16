package org.wxq.unitTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)   //1.����Ĭ�ϵĲ���������ΪRunWith(Parameterized.class) 
public class MultiParaCalculatorTest {

	//2.�����������Ԥ��ֵ�Ͳ�������  
    int expected =0;  
    int input1 = 0;  
    int input2 = 0;  
      
    //3.����һ������ֵ ΪCollection�Ĺ�����̬��������ʹ��@Parameters��������  
    @Parameters  
    public static Collection data() {  
        return Arrays.asList(new Object[][]{  
                {3,1,2},  
                {4,2,2}  
        }) ;  
    }  
      
    //4.Ϊ����������һ�����в����Ĺ������캯������������Ϊ֮����������ֵ  
    public MultiParaCalculatorTest(int expected,int input1,int input2) {  
        this.expected = expected;  
        this.input1 = input1;  
        this.input2 = input2;  
    }  
      
    //5.���в��Է�����������ɶԶ������ݵĲ���  
    @Test  
    public void testAdd() {  
        assertEquals(expected, new Calculator().add(input1, input2));  
    }  
}
