package threading;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectionHandler implements RejectedExecutionHandler{

	@Override
	public void rejectedExecution(Runnable arg0, ThreadPoolExecutor arg1) {
System.out.println(arg0.toString() +" is rjeected");		
	}

}
