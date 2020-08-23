package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixed = "";
		for(int i = 0; i<s.length(); i+=2) {
			mixed = mixed + s.charAt(i) + Character.toUpperCase(s.charAt(i+1));
		}
		
		return mixed;
	}

}
