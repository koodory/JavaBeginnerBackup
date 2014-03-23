package java0124;

public class UserException extends Exception {
	String msg;
	public UserException() {
		// TODO Auto-generated constructor stub
	}
	public UserException(String msg) {
		this.msg = msg;
	}
	public String toString(){
		return msg;
	}
}
