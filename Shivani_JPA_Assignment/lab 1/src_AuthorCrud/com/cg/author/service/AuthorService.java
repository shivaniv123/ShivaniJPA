package com.cg.author.service;

import com.cg.author.entities.Author;


public interface AuthorService {

	public abstract void addAuthor(Author student);

	public abstract void updateAuthor(Author student);

	public abstract void removeAuthor(Author student);

	public abstract Author findAuthorById(int id);
}
