package methods;

public class EqualsHashcode {

	private boolean byVals = false;

	public String id = "";

	public static void main(String[] args) {
		EqualsHashcode e1 = new EqualsHashcode();
		EqualsHashcode e2 = e1;
		EqualsHashcode e3 = new EqualsHashcode();
		EqualsHashcode e4 = new EqualsHashcode(true, "123");
		String str1 = "1";
		String str2 = ""+1;
		String str3 = new String("1");
		System.out.println("String 1 == String 2 -> "+(str1==str2));
		System.out.println("String 1 == String 3 -> "+(str1==str3));
		System.out.println("String 1 HashCode -> " + str1.hashCode());
		System.out.println("String 2 HashCode -> " + str2.hashCode());
		System.out.println("String 3 HashCode -> " + str3.hashCode());
		System.out.println("EqualsHashcode 1 -> "+e1);
		System.out.println("EqualsHashcode 2 -> "+e2);
		System.out.println("EqualsHashcode 3 -> "+e3);
		System.out.println("EqualsHashcode 4 -> "+e4.toString());
		System.out.println("EqualsHashcode 1 == EqualsHashcode 2 -> "+(e1==e2));
		System.out.println("EqualsHashcode 1 == EqualsHashcode 3 -> "+(e1==e3));
		System.out.println("EqualsHashcode 1 EQUALS EqualsHashcode 3 -> "+e1.equals(e3));
		System.out.println("EqualsHashcode 1 EQUALS EqualsHashcode 3 -> "+e1.equals(e4));
		Double i = 0d;
		Double j = 0d;
		int o = 0;
		long s = 0;
		/*System.out.println(i.hashCode());
		System.out.println(j.hashCode());
		System.out.println(i.equals(j));*/
		System.out.println(i==j);
		System.out.println(o==s);
	}

	public EqualsHashcode() { }

	public EqualsHashcode(boolean byVals, String id) {
		this.byVals = byVals;
		this.id = id;
	}

	// CONTRACT

	@Override
	public int hashCode() {
		if(byVals) {
			StringBuilder hashString = new StringBuilder(this.getClass().getName());
			hashString.append(id);
			return produceHash(hashString.toString().getBytes());
		}
		return produceHash(this.getClass().getName().getBytes());
	}

	@Override
	public boolean equals(Object equals) {
		if(equals==null)
			return false;
		return hashCode()==equals.hashCode();
	}

	/*@Override
	public String toString() {
		return Integer.toHexString(hashCode());
	}*/


	private Integer produceHash(byte[]bytes) {
		int hash = 0;
		int len = bytes.length;
		for(int i=0; i<len; i++) {
			int num = bytes[i];
			if(i%9==0)
				hash -= num;
			else if(i%11==0)
				hash *= num;
			else if(i%17==0)
				hash /= num;
			else if(i%23==0)
				hash += num%13;
			else
				hash += num;
		}
		return hash;
	}

}
