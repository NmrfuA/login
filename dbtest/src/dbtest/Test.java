package dbtest;

public class Test {
	public static void main(String[] args)
	{
		String testjString="{\"id\":\"201730682010\",\"password\":\"aaaaaa\"}";
		Json.Jsonparse(testjString);
		Login.getAll();
		Login.check();
		System.out.println(Json.test());
	}

}
