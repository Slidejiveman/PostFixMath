package PostFixMathPD;

public class PostFixMath {
	 
	int rightOperand = 0;
	int leftOperand = 0;
	int newOperand = 0;
	LinkedStack<String> numberStack = new LinkedStack<String>();
	
	/**--------Constructor---------*/
	public PostFixMath() {
	}
	/**--------Calculation Method--*/
	public String calculate(String[] result){
		
		for (int x=0; x<result.length; x++) {          
		System.out.println(result[x]);
		if(result[x].matches("[0-9]*")) {
			numberStack.push(result[x]);
		}
		else if(result[x].matches("[*-/+]")) {
			if(result[x].equals("*")) {
				rightOperand = Integer.parseInt(numberStack.pop());
				leftOperand = Integer.parseInt(numberStack.pop());
				newOperand = leftOperand * rightOperand;
				numberStack.push("" + newOperand); // Convert back to String
			} else if(result[x].equals("/")) {
				rightOperand = Integer.parseInt(numberStack.pop());
				leftOperand = Integer.parseInt(numberStack.pop());
				newOperand = leftOperand / rightOperand;    //Integer Division
				numberStack.push("" + newOperand);
			} else if(result[x].equals("+")) {
				rightOperand = Integer.parseInt(numberStack.pop());
				leftOperand = Integer.parseInt(numberStack.pop());
				newOperand = leftOperand + rightOperand;
				numberStack.push("" + newOperand);
			} else if(result[x].equals("-")) {
				rightOperand = Integer.parseInt(numberStack.pop());
				leftOperand = Integer.parseInt(numberStack.pop());
				newOperand = leftOperand - rightOperand;
				numberStack.push("" + newOperand);
			} else {
				return "Invalid character Entered";
			}
		}
	}
    return "answer: " + numberStack.pop();
	}
}

