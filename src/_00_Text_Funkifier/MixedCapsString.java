package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
		String modified = "";
		for(int i = 0; i<s.length(); i++) {
			if(i%2==0) {
				modified = modified + Character.toLowerCase(s.charAt(i));
			} else if(i%2==1) {
				modified = modified + Character.toUpperCase(s.charAt(i));
			}

		}
		System.out.println(modified);
		return modified;
	}

}
