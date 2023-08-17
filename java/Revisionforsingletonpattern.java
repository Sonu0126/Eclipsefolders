
public class Revisionforsingletonpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database1 db = Database1.getObject();
		db.Connect();
	}

}

class Database1 {
	private static Database1 obj;

	private Database1() {

	}

	public static Database1 getObject() {
		if (obj == null) {
			obj = new Database1();
		}
		return obj;
	}

	public void Connect() {
		System.out.println("You are now Connected.");
	}
}
