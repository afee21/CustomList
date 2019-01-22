package com.naztech.CustomList;

public class BookInfo {


	private int prize;
	private String Bookname;
	private String writer;
	
	BookInfo(){
		this. prize = 0;
		this.Bookname = "";
		this.writer = "";
	}
	BookInfo(int prize, String Bookname, String writer){
		this. prize = prize;
		this.Bookname = Bookname;
		this.writer = writer;
	}

	public int getprize() {
		return  prize;
	}

	public void setprize(int  prize) {
		this. prize =  prize;
	}

	public String getName() {
		return Bookname;
	}

	public void setName(String Bookname) {
		this.Bookname = Bookname;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public boolean equals(Object obj) {
		BookInfo book = (BookInfo)obj;
		if(this. prize == book.prize && this.Bookname.equals(book.Bookname) && this.writer.equals(book.writer))
			return true;
		return false;
	}
	@Override
	public String toString() {
		return  prize+" "+Bookname+" "+writer;
	}

	
}
