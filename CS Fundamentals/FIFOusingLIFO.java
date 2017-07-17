package Unity;
public class FIFOusingLIFO {
	public static void main(String[] args) {
		FIFO<Integer> fifoObjectUsingLifo = new FIFO<Integer>();
		fifoObjectUsingLifo.enqueue(null);
		fifoObjectUsingLifo.enqueue(2);
		System.out.println(fifoObjectUsingLifo.dequeue());
	}
}