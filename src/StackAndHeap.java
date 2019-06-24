public class StackAndHeap {
    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        StackAndHeap mem = new StackAndHeap();
         mem.foo(obj);
    }

    private void foo(Object param) {
        String str = param.toString();
        System.out.println(str);
    }
}
