package com.hyr.AbstractKeyword;


public class Hdfc extends Bank{
	
	@Override
	void withDraw() { //Implementes Withdraw Logic won hdfc bank 
		// TODO Auto-generated method stub
		System.out.println("Cash Limit:- 50000");
	}
	@Override
	void balEnquary() {  //Implementes Logic won hdfc bank 
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc hdfc = new Hdfc();
		hdfc.withDraw();
	}


}


