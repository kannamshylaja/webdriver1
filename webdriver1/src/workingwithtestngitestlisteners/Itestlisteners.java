package workingwithtestngitestlisteners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Itestlisteners implements ITestListener {

	@Override
	public void onFinish(ITestContext result1) {
		System.out.println("TC on finish results are"+" "+result1.getName());
		
	}

	@Override
	public void onStart(ITestContext result2) {
		System.out.println("Tc on start results are"+" "+result2.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result3) {
		System.out.println("Tiled but withinsuccpercentage"+" "+result3.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result4) {
		System.out.println("TC failure results are"+" "+result4.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result5) {
		System.out.println("TC skipped results are"+" "+result5.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result6) {
		System.out.println("TC start results are"+" "+result6.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result7) {
		System.out.println("TC success results are"+" "+result7.getName());
		
	}
}









