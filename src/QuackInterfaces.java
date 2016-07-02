/**
 * Created by Adam Kalman on 7/1/2016. Lab 5
 */
public interface QuackInterfaces {

/*    public boolean inFront(Object element);
    public boolean inBack(Object element);
    public Object outFront();
    public Object outBack();*/
    public boolean enqueue(Object element);
    public Object dequeue();
    public Object front();
    public boolean isEmpty();
    public boolean push(Object element);
    public Object pop();
    public Object top();

}
