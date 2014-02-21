
public class Client1 implements Callback {

	/**
	 * @param args
	 */
	
	public int performCallback(int a){
		return a/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client1 win = new Client1();
		win.performCallback(3);

	}

}
