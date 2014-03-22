package java0115;
	public class TV{
		private String productName, modelNumber;
		private int size,channel,volume; 
	public TV(){
	}
	public TV(String productName, String modelNumber, int size, int channel,
			int volume) {
		super();
		this.productName = productName;
		this.modelNumber = modelNumber;
		this.size = size;
		this.channel = channel;
		this.volume = volume;
	}

	public String getProductName() {
		return productName;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public int getSize() {
		return size;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void onPower(){
		System.out.println("Turn on TV");
	}
	public void offPower(){
		System.out.println("Turn off TV");
	}
	public void upChannel(){
		if(channel == 300)
			channel = 1;
		else
			channel++;
		//System.out.println("Current channel is "+channel);
	}
	public void downChannel(){
		if(channel>1)
			channel--;
		else
			channel = 300;
		//System.out.println("Current channel is "+channel);
	}
	public void	upVolume(){
		if(volume<100)
			volume++;
		//System.out.println("Current volume is "+volume);
	}
	public void	downVolume(){
		if(volume>0)
			volume--;
		//System.out.println("Current volume is "+volume);
	}
	public static void main(String[] args) {
		TV main = new TV();
		System.out.println(main);
	}
	@Override
	public String toString() {
		return "Tv [productName=" + productName + ", modelNumber="
				+ modelNumber + ", size=" + size + ", channel=" + channel
				+ ", volume=" + volume + "]";
	}
}
