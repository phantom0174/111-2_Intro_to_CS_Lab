package P9_111502552;

import java.util.ArrayList;

public class Parser {
	public ArrayList<Token> tokens = new ArrayList<>();
	
	// identifier, num, special_symbol
	public int[] TYPES_COUNT = { 0, 0, 0 };
	
	public void parse(String tok) {
		Token token = new Token(tok);
		
		String token_type = token.getType();
		if (token_type.equals("Identifier")) TYPES_COUNT[0]++;
		else if (token_type.equals("Number")) TYPES_COUNT[1]++;
		else if (token_type.equals("Special Symbol")) TYPES_COUNT[2]++;
		
		this.tokens.add(token);
	}
}
