package com.oops.concepts.encapsulationDemo;

class Account{
	private long acc_no;
    private String name, email;
    private float amount;
    
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Account(long acc_no, String name, String email, float amount) {
		this.acc_no = acc_no;
		this.name = name;
		this.email = email;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [" + acc_no + ", " + name + ","+ email + ", "+ amount + "]";
	}


}

public class EncapsulationDemo_Accounts1 {

	public static void main(String[] args) {

		Account ramu = new Account();
		ramu.setAcc_no(2323532523257567567L);
		ramu.setName("Ramu");
		ramu.setEmail("abc@gmail.com");
		ramu.setAmount(55555f);
		
		
		System.out.println("The Ramu account details are:  "+ ramu.getAcc_no()+"  "+ ramu.getName()+"  "+ramu.getEmail()+ "  "+ramu.getAmount());
		

		Account sunny = new Account(986686986066760L,"sunny","cda@gmail.com",3949079f);
		System.out.println("The sunny account details are: "+ sunny);
		
	}

}
