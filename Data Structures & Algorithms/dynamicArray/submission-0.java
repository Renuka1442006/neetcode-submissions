class DynamicArray {
    private int capacity;
    private int size;
    private int[] arr; 
    public DynamicArray(int capacity) {
        this.capacity=capacity;
        this.size=0;
        arr=new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i]=n;
    }

    public void pushback(int n) {
        if(size==capacity)
        {
            resize();
        }
        arr[size]=n;
        size++;
    }

    public int popback() {
        int value=arr[size-1];
        size--;
        return value;
    }

    private void resize() {
        int newsize=capacity*2;
        int[] newarr=new int[newsize];
        for(int i=0;i<size;i++)
        {
            newarr[i]=arr[i];
        }
        arr=newarr;
        capacity=newsize;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
