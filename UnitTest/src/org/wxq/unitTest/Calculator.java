package org.wxq.unitTest;

public class Calculator {
    private static int result; // ��̬���������ڴ洢���н��
    public void add(int n) {
        result = result + n;
    }
    public void substract(int n) {
        result = result - n;  //Bug: ��ȷ��Ӧ���� result =result-n
    }
    public void multiply(int n) {
    }         // �˷�����δд��
    public void divide(int n) {
        result = result / n;
    }
    public void square(int n) {
        result = n * 1;
    }
    public void squareRoot(int n) {
        for (; ;) ;            //Bug : ��ѭ��
    }
    public void clear() {     // ���������
        result = 0;
    }
    public int getResult() {
        return result;
    }
	public int add(int input1, int input2) {
		
		return input1 + input2;
	}
}