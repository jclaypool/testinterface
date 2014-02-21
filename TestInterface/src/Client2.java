
public class Client2 implements Callback {

	/**
	 * @param args
	 */
	public int performCallback(int b){
		System.out.println("jake is super cool!!");
		return b + 342;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client1 win = new Client1();
		win.performCallback(3);

	}

}
