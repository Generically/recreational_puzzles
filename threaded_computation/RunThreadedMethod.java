package threaded_computation;

public class RunThreadedMethod {

	public static void main(String[] args) {
		int runs = 10000;

		for(int i = 0; i < runs; i++) {
			ThreadedMethod s = new ThreadedMethod();
			s.start();
		}
	}

}
