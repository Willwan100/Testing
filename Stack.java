public class Stack {
    private Node top;
    private int no_ele;

    public Stack(){
        this.top = null;
        this.no_ele = 0;
    }
    public boolean isStackEmpty(){
        return top == null;
    }
    public int peek(){
        if(isStackEmpty()){
            System.out.println("Stack is EMPTY.");
            System.exit(-1);
        }
        return top.entry;
    }
    public int pop(){
        if(top==null){
            System.out.println("\nStack is EMpty");
            return 0;
        }
        else{
            int element = top.entry;
            this.no_ele-=1;
            this.top = this.top.next;
            return element;
        }
    }
}
