
abstract class Temp{
 abstract void test();
}

class Check{
	public static void main(String n[]){
		Temp t=new Temp(){
			public void test()
			{}
		};
	}
}