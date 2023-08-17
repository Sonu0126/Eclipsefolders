
public class Revisionday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c1 = new Cars();
		System.out.println(c1 instanceof Cars);
		System.out.println(c1 instanceof Vehicles1);

		Invoice iv = new Invoice("0524", "Soni", "Subedi", "0479384", "021 street");
		System.out.println(iv instanceof Invoice);

	}

}

class Vehicles1 {

}

class Cars extends Vehicles1 {

}

class Invoice {
	String Billno;
	String firstname;
	String lastName;
	String phonenum;
	String address;

	public Invoice(String bn, String fn, String ln, String pn, String ad) {
		this.Billno = "0524";
		this.firstname = "Soni";
		this.lastName = "Subedi";
		this.phonenum = "0479384";
		this.address = "021 street";
	}

}
