package com.rest.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.rest.model.Category;
import com.rest.model.Library;
import com.rest.service.LibraryService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class LibraryController {
	
	@Autowired
	LibraryService libraryService;

    @RequestMapping(value = "/library", method = RequestMethod.GET)
    public Iterable<Library> library() {
        return libraryService.getAllLibrary();
    }
    @RequestMapping(value = "/library", method = RequestMethod.POST)
    public String post(@RequestBody String lib) {
    	System.out.println("Lib" + lib);
        Library library = new Gson().fromJson(lib, Library.class);
        System.out.println("Library: " + library);
        long id = library.getCategory().getCategoryId();
        System.out.println("Lib" + library.getCategory());
        
    	libraryService.addLibrary(library);
    	return "Got data";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteLibrary(@PathVariable("id") long id) {
    	System.out.println(id);	
    	libraryService.deleteLibrary(id);
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public Iterable<Category> category() {
    	System.out.println(libraryService.getAllCategorys());
        return libraryService.getAllCategorys();
    }
}
