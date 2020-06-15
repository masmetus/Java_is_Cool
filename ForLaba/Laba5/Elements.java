package Laba5;

public class Elements {
    private final int value;
    private Elements next;

    public Elements(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    public Elements getNext() {
        return next;
    }
    public void SetNext (Elements element) {
        this.next=element;
    }
}
