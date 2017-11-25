import PostFixMathPD.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MathMain {

	/**--------Main Tests Linked Stack--------*/
	public static void main(String[] args) throws IOException {
		String answer = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter post fix format to calculate with spaces separating"
        					+ " each operator and operand: ");
        answer = br.readLine();
        
		PostFixMath postFixMath = new PostFixMath();
		answer = postFixMath.calculate(answer.split(" "));
		System.out.println(answer);
	}
}
