package while_;

public class TestClass02 {
	public static void main(String[] args) {
		boolean bool = true;
		for(int i=0; bool ; i++) {
			System.out.println(i+".execute");
			if(i>10)
				bool=false;
		}
	}
}
