import jep.Jep;
import jep.JepException;

public class Calculator {
	public int Calculator(int num1, int num2) throws JepException {
		Jep jep = new Jep(false, "E:\\big12\\Spring_dev\\WorkSpace\\java-python");
		jep.runScript("test1.py");
		Object result = jep.invoke("sum", num1, num2);
		int solution = Integer.parseInt(result.toString());
		return solution;
	}
}
