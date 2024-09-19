package ADTExample;
/**
 * Stack
 */
public class Stack {
    private int size;
    private int[] items;

    public Stack(){
        this.size = 0;
        this.items = new int[5];
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public int peek(){
        return this.items[this.size - 1];
    }

    public int pop(){
        // get the last item
        int itemToReturn = peek();
        // remove the item by pretending
        // it isn't there
        this.size--;
        // return the former last item
        return itemToReturn;

    }

    public void push(int item){
        // did we run out of room?
        if(this.size == this.items.length){
            // make the array double in size
            // to make room for new things
            doubleTheSize();
        }
        // put the item on top of stack
        this.items[this.size] = item;
        // increase the size
        this.size++;
    }

    private void doubleTheSize() {
        // make a new array twice as big
        int[] biggerItems = new int[this.size*2];
        // copy everything across
        for(int i = 0; i < this.size; i++){
            biggerItems[i] = this.items[i];
        }
        // set the items array to the bigger one
        this.items = biggerItems;
    }
    
}
