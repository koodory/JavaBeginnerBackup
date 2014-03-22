package java0120;

public class TV {
	private int size, chanel, volume;
	private String productName, modelNumber;
	
	public TV() {
	}
	
	public TV(int size, int chanel, int volume, String productName,
			String modelNumber) {
		this.size = size;
		this.chanel = chanel;
		this.volume = volume;
		this.productName = productName;
		this.modelNumber = modelNumber;
	}


	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	public int getChanel() {
		return chanel;
	}

	public void setChanel(int chanel) {
		this.chanel = chanel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void onPower(){
		System.out.println("TV ����� ������.");
	}
	public void offPower(){
		System.out.println("TV ����� ������.");		
	}	
	public void downChannel(){
		if(chanel>1)
			chanel--;
		else
			chanel=300;
	}	
	public void upChannel(){
			if(chanel==300)
				chanel=1;
			chanel++;
	}
	public void downVolume(){
		if (volume>0) {
			volume--;
		}
		
	}	
	public void upVolume(){
		if(volume<50)
			volume++;
	}		
	
	@Override
	public String toString() {
		return "TV [size=" + size + ", productName=" + productName
				+ ", modelNumber=" + modelNumber + "]";
	}
	
}
