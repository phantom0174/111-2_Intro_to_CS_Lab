package P9_111502552;


public class Token {
	private String token, type;
	
	Token(String token) {
		this.token = token;
		this.get_token_type();
	}
	
	// getter
	public String getToken() {
		return this.token;
	}
	
	public String getType() {
		return this.type;
	}
	// end getter
	
	public void get_token() {
	}
	
	public void get_token_type() {
	    // Given a token, return the type of the token.(Identifier, Number, or Special Symbol?)

	    boolean is_number_string = true;
	    for (int i = 0; i < token.length(); i++) {
	    	char c = token.charAt(i);
	    	
	    	if (!is_number(c)) {
	            is_number_string = false;
	            break;
	        }
	    }
	    if (is_number_string) {
	    	this.type = "Number";
	    	return;
	    }

	    
	    boolean is_special_symbol_string = true;
	    for (int i = 0; i < token.length(); i++) {
	    	char c = token.charAt(i);
	    	
	    	if (!is_special_symbol(c)) {
	            is_special_symbol_string = false;
	            break;
	        }
	    }
	    if (is_special_symbol_string) {
	    	this.type = "Special Symbol";
	    	return;
	    }

	    // the case left is identifier
	    this.type = "Identifier";
	}
	
	public char[] SPECIAL_SYMBOLS = {
	    '+', '-', '*', '/', '>', '<', '=', '%', '&', '|',
	    '^', '\"', '\'', '.', ',', '(', ')', '[', ']', '{',
	    '}', '!', ':', ';'
	};
	
	public String[] SPECIAL_DOUBLE_SYMBOLS = {
		"++", "--", "+=", "<=", ">=", "==", "!=", "&&", "||"
	};
	
	public boolean is_number(char c) {
	    // given a character, return true if it is a number
	    // using ascii code to determine whether c is a number

	    if ((int)c < 48 || (int)c > 57) return false;
	    return true;
	}
	
	public boolean is_special_symbol(char c) {
	    // given a character, return true if it is a special symbol or not

	    for (char symbol : SPECIAL_SYMBOLS) {
	        if (c == symbol) return true;
	    }
	    return false;
	}
	
	public boolean is_double_special_symbol(String s) {
	    for (String double_symbol : SPECIAL_DOUBLE_SYMBOLS) {
	        if (s.equals(double_symbol)) return true;
	    }
	    return false;
	}
	
	public boolean is_alphabet(char c) {
	    // using ascii code to determine whether c is an alphabet
	    if ((int)c < 65 || ((int)c > 90 && (int)c < 97) || (int)c > 122) return false;
	    return true;
	}
	
	public boolean is_unknown_token(char c) {
	    // none of the above
	    return !(is_number(c) || is_special_symbol(c) || is_alphabet(c));
	}
}
