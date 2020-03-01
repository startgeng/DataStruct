public class Array {

    private int data[];
    private int size;

    /**
     * 能知道数组长度
     * @param capacity
     */
    public Array(int capacity){
        data = new int[capacity];
        size=0;
    }

    /**
     * 不知道数组的长度
     */
    public Array(){
        this(10);
    }

    /**
     * 查看数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 获取元素个数
     * @return
     */
    public int getSize(){
        return size;
    }
}
