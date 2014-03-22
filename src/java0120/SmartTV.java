package java0120;

public class SmartTV extends TV {
	private String externalInput;
	private String internetAddress;
	private String appName;
	
	public SmartTV() {
		
	}
	
	public SmartTV(String externalInput, String internetAddress) {
		this.externalInput = externalInput;
		this.internetAddress = internetAddress;
	}
		
	public String getExternalInput() {
		System.out.println(externalInput+"��(��) �����ϼ̽��ϴ�.");
		return externalInput;
	}
	public void setExternalInput(String externalInput) {
		this.externalInput = externalInput;
	}
	public String getInternetAddress() {
		return internetAddress;
	}
	
	public void setInternetAddress(String internetAddress) {
		this.internetAddress = internetAddress;
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void selectExternalInput(){
		setExternalInput("USB �޸�");
		System.out.println(getExternalInput()+"��(��) �����ߴ�.");
	}
	public void playExternalInput(){
		System.out.println(getExternalInput()+"��(��) ����Ѵ�.");
	}	
	
	public void selectApp(String appName){
		setAppName(appName);
		System.out.println(getAppName()+"��(��) �����ߴ�.");
	}	
	public void installApp(){
		System.out.println(getAppName()+"��(��) ��ġ�Ѵ�.");
	}	
	public void runApp(){
		System.out.println(getAppName()+"��(��) �����Ѵ�.");
	}	
	public void updateSW(){
		System.out.println("����Ʈ��� ������Ʈ �Ѵ�.");
	}
	public void searchInternet(String internetAddress){
		setInternetAddress(internetAddress);
		System.out.println(getInternetAddress()+" �ּ��� ���ͳ� �������� �˻��Ѵ�.");
	}
	
	@Override
	public String toString() {
		return "SmartTV [externalInput=" + externalInput + ", internetAddress="
				+ internetAddress + "]";
	}
	
	
}
