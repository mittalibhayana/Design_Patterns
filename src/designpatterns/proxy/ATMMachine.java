package designpatterns.proxy;

public class ATMMachine implements GetATMData{

	
	private String bankName;
	
	private String modelNumber;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	@Override
	public void getCurrentState() {
		System.out.println("hi, the current state is active");
	}

	@Override
	public int getCashInMachine() {
		return 60000;
		return 0;
	}
	
}
