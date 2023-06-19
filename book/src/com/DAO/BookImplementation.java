package com.DAO;
import com.Beans.BookInfo;
import java.util.*;


public class BookImplementation implements BookDetails
{
	BookInfo []book = new BookInfo[4];
	int count;
	Scanner sc = new Scanner(System.in);
    public BookImplementation()
    {
    	count=0;
    }
	@Override
	public void search(int id) {

		System.out.println("Enter the Search id");
		int s_id = sc.nextInt();
		for(int i=0;i<count;i++)
		{
			if(count==s_id)
			{
				char[][] s;
				System.out.println(book[i]);
			}
		}
	}

	@Override
	public void insert() {
		System.out.println("Enter the number of books");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Entre the book_id");
			int bid = sc.nextInt();
			System.out.println("Enter the book name");
			String bname=sc.next();
			System.out.println("Enter the Price");
			int price=sc.nextInt();
			book[i]=new BookInfo(bid,bname,price);
			count++;		
	}}

	@Override
	public void update(int id) 
	{
		System.out.println("entre the new Price");
		int price = sc.nextInt();
		for (int i = 0; i < count; i++) 
        {
			if (book[i].book_id == id && book[i] != null) 
            {
				book[i].b_prise = price;
			}
		
			
		}

		
	}

	@Override
	public void delete(int id) {
		for(int i=0;i<count;i++)
		{
			if(book[i]!=null)
			{
				if(book[i].book_id==id);
				{
					book[i]=null;
				}
			}
		}

		
	}

	@Override
	public void displayAllBooks() 
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(book[i]);
		}

		
	}
	 
	

}
