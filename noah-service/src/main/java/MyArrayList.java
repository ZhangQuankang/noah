/**
 * create by zhangquankang on 2020/1/19
 */
public class MyArrayList<T> {
    /**
     * 存储元素的数组
     */
    private Object[] elementData;
    /**
     * 当前存储的元素个数
     */
    private int size;

    public MyArrayList(){
        /**
         * 默认长度为16
         */
        elementData = new Object[16];

        /**
         * 默认长度为空
         */
        size = 0;
    }

    public void add(T t){
        checkArrayLength(size+1);
        elementData[size++] = t;
    }

    public void checkArrayLength(int length){


    }


}
