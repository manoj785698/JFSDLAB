package com.klu.library;

import javax.persistence.Entity;

@Entity
public class Book extends Item{

	private String author;
	private long isbn;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

}
