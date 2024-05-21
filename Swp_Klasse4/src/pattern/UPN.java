package pattern;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UPN {
	
	public static int calculateUPN(String input) {
		LinkedList<Integer> stack = new LinkedList<>();
		Pattern operatorPattern = Pattern.compile("[+*/-]");
		Pattern numericPattern = Pattern.compile("\\d+");
		
		for(String token : input.split("\\s+")) {
			Matcher operatorMatcher = operatorPattern.matcher(token);
			Matcher numericMatcher = numericPattern.matcher(token);
			if(numericMatcher.matches()) {
				stack.push(Integer.parseInt(token));
			} else if(operatorMatcher.matches()) {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				stack.push(switch(token) {
					case "+" -> operand1 + operand2;
					case "-" -> operand1 - operand2;
					case "*" -> operand1 * operand2;
					case "/" -> operand1 / operand2;
					default -> throw new IllegalArgumentException("Illegal operator");
				});
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
