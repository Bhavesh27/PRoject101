package com.rest.service;

import java.util.List;

import com.rest.model.Category;
import com.rest.model.Library;

public interface LibraryService {

	public List<Library> getAllLibrary();
	public void addLibrary(Library library);
	public void deleteLibrary(long id);
	public void updateLibrary(Library library);
	
	public List<Category> getAllCategorys();
	
}
