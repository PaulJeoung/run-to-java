package ch06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean lee = new Korean("박자바", "990101-1234567");
		System.out.println("Lee, Nation : " + lee.nation);
		System.out.println("Lee, Name : " + lee.name);
		System.out.println("Lee, SSN : " + lee.ssn);
		
		Korean kim = new Korean("\n미스터킴", "571111-1050642");
		System.out.println("Kim, Nation : " + kim.nation);
		System.out.println("Kim, Name : " + kim.name);
		System.out.println("Kim, SSN : " + kim.ssn);
		
		
	}

}