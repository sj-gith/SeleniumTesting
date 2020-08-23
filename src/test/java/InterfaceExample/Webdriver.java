package InterfaceExample;

public interface Webdriver {
	
	public void click();
	
	public void sendKeys(String s);//using abstract keyword is not mandatory. 
	
	public  abstract void clear();// we can use abstract keyword if we want to that will make any difference.

}
