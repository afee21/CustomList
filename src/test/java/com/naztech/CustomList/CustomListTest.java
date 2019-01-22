package com.naztech.CustomList;

import static org.junit.Assert.*;





public class CustomListTest {
	
	@Test
	public void testGet() {
		
	}

	@Test
	
	public void testAdd() 	{
		CustomList<BookInfo> cs = new CustomList<BookInfo>();
		BookInfo[] bookArray = new BookInfo[10];
		
		bookArray[0] = new BookInfo(700, "300Days", "Greg Bear ");
		bookArray[1] = new BookInfo(800, "Youruba Girl", "Simi Bedford");
		bookArray[2] = new BookInfo(900, "New York Times", "Elizabeth Bevarly");
		
		BookInfo book1 = new BookInfo(700, "300Days", "Greg Bear ");
		BookInfo book2 = new BookInfo(800, "Youruba Girl", "Simi Bedford");
		BookInfo book3 = new BookInfo(900, "New York Times", "Elizabeth Bevarly");
		
		
		cs.add(book1);
		cs.add(book2);
		cs.add(book3);
		
		
		if(bookArray.length == cs.size()) {
			for(int i=0; i< bookArray.length;i++) {
				assertEquals(bookArray[i], cs.get(i));
			}
		}
		
	}
	
	public void display(CustomList<BookInfo> cs) {
		for(int i=0; i<cs.size();i++)
		{
			System.out.println(cs.get(i).getName());
		}
		System.out.println("\n\n");
	}
	

}

