package DataStructure;

import java.util.Arrays;

/**
 * create by zhangquankang on 2020/1/19
 */
public class MyArrayList<T> {

    /**
     * 默认长度
     */
    private static final int DEFAULT_CAPACITY = 10;

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
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
         * 默认长度为10
         */
        elementData = new Object[DEFAULT_CAPACITY];

        /**
         * 默认长度为空
         */
        size = 0;
    }

    /**
     * 返回数组中元素的个数
     * @return
     */
    public int size(){
        return size;
    }

    public void add(T t){
        checkArrayLength(size+1);
        elementData[size++] = t;
    }

    public void checkArrayLength(int length){
        if(length > elementData.length){
            //扩容
            grow(length);
        }
    }

    /**
     * minCapacity 所需要的最小容量
     * @param minCapacity
     */
    public void grow(int minCapacity){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if(newCapacity - minCapacity < 0){
            newCapacity = minCapacity;
        }

        if(newCapacity - MAX_ARRAY_SIZE > 0){
            newCapacity = hugeCapacity(minCapacity);
        }

        elementData = Arrays.copyOf(elementData,newCapacity);
    }

    private static int hugeCapacity(int minCapacity){
        if(minCapacity < 0){
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }


}
