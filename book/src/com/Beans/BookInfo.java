package com.Beans;

public class BookInfo {

	public int book_id;
	public String book_name;
	public int b_prise;
//	public int price;
	
	
	public BookInfo(int book_id,String book_name,int b_prise) 
	{
		this.book_id=book_id;
		this.book_name=book_name;
		this.b_prise=b_prise;
	}
	public String toString()
	{
		return book_id+" "+book_name+" "+b_prise;
	}
	

}
