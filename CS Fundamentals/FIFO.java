package Unity;
import java.util.Stack;

public class FIFO<T> {
	private Stack<T>  enqueueStack = new Stack<T> ();
	private Stack<T> dequeueStack = new Stack<T> ();
	
	public void enqueue(T insertValue){
		enqueueStack.push(insertValue);
	}
	
	public T dequeue(){
		if(isEmpty())
			return null;
		
		if(dequeueStack.isEmpty()){
			while(!enqueueStack.isEmpty()){
				dequeueStack.push(enqueueStack.pop());
			}
		}
		return dequeueStack.pop();
	}
	
	public boolean isEmpty(){
		if(enqueueStack.isEmpty() && dequeueStack.isEmpty()){
			return true;
		}
		return false;
	}
	
	public int size(){
		return enqueueStack.size() + dequeueStack.size();
	}
	
}