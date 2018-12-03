package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Category;
import com.rest.model.Library;
import com.rest.repository.CategoryRepository;
import com.rest.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService {
		
	@Autowired
	LibraryRepository libraryRepository;
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Library> getAllLibrary() {
		// TODO Auto-generated method stub
		List<Library> librarys = (List)libraryRepository.findAll();
		return librarys;
	}
	
	@Override
	public void addLibrary(Library library) {
		// TODO Auto-generated method stub
		libraryRepository.save(library);
	}

	@Override
	public void deleteLibrary(long id) {
		// TODO Auto-generated method stub
		libraryRepository.deleteById(id);
	}

	@Override
	public void updateLibrary(Library library) {
		// TODO Auto-generated method stub
		libraryRepository.save(library);
	}

	@Override
	public List<Category> getAllCategorys() {
		// TODO Auto-generated method stub
		List<Category> categorys = (List)categoryRepository.findAll();
		System.out.println("data: " + categorys);
		return categorys;
	}

}
