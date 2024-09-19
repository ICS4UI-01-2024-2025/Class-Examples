package ADTExample;
public class TestStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        // add some things
        for (int i = 0; i < 10; i++) {
            myStack.push(1);
        }
        myStack.push(2);
        myStack.push(6);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
    }
}
