import java.util.Arrays;

/**
 * Created by Adam Kalman on 7/1/2016. Lab 5
 */
public class Quack implements Stack,Queue{ //dont forget to add back queue
    public static void main(String[] args){

        Quack q1 = new Quack();
        q1.push(5);
        q1.enqueue(6);
        q1.enqueue(10);
        System.out.println(q1);
        //System.out.println("back: " +q1.back);
        System.out.println(q1.pop());
        //System.out.println("back: " +q1.back);
        System.out.println(q1.dequeue());
        System.out.println(q1.pop()); //not working
    }
    private Object[] myElements;
    private int currentPosition;
    private int size;
    private int front;
    private int back;
    private int amount;
    public Quack(){
        size=10;
        front=0;
        back=front;
        amount=0;
        myElements=new Object[size];
    }
    public boolean isEmpty(){
        return (amount<1);
    }

    public boolean push(Object element)
    {
        if (amount<size) {
            myElements[back]=element;
            back++;
            amount++;
            return true;
        } else {
            return false;
        }
    }
    public Object pop()
    {
        if (amount<1){
            //Object result= myElements[currentPlace];
            //myElements[currentPlace]=null;
            // return result;
            return null;
        }else {
            back--;
            Object result=myElements[back];
            //myElements[currentPlace]=null;
            return result;
        }
    }
    public Object top()
    {
        return myElements[back-1];
    }
    public boolean enqueue(Object toAdd){
/*
        if (amount>=size){
            return false;
        }
        myElements[back] = toAdd;
        if (back==size-1){
            back=0;
        }

//use incrementer
        back++;
        amount++;
        return true;
*/
        return push(toAdd);

    }
    public Object front(){
        return myElements[front];
    }
    public Object dequeue(){
        if (amount<1){
            return null;
        }
        Object result=myElements[front];
        if (front==size-1){
            front=0;
        } else {
            front++;
        }
        amount--;
        //System.out.println("front \t" + front);
        return result;
    }

    public String toString(){
        return Arrays.toString(myElements);
    }
}
