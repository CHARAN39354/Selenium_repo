package extendsreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {
	@Test
	public void createreports() {
		String timestamp=LocalDateTime.now().toString().replace(":", "-");
		
		//step 1: create aan instance of ExtentSparkReporters
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Reports/extentReports_"+ timestamp + ".html");
		//step 2: create an instance of ExtentsReports
		ExtentReports extReport =new ExtentReports();
		//step 3: attach ExtentSparkReporter to ExtentReports
		extReport.attachReporter(spark);
		//step 4: create ExtentTest Object
		ExtentTest test=extReport.createTest("createreports");
		//step 5: call log() to provide status and message
		test.log(Status.PASS, "Log Message added into Report");
		//step 6:call flush()
		extReport.flush();
		
	}

}
