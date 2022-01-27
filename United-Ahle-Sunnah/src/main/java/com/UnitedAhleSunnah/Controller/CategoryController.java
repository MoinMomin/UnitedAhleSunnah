package com.UnitedAhleSunnah.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.UnitedAhleSunnah.Repository.SubCategoryRepository;
import com.UnitedAhleSunnah.model.SubCategory;

@Controller
public class CategoryController {

	@Autowired
	SubCategoryRepository subCatRepo;
	@RequestMapping("/addSubCategory")
	public void createSubCategory(@RequestBody SubCategory subCategory) {
		subCatRepo.save(subCategory);
	}
	@RequestMapping("/getAllSubCategory")
	public List<SubCategory> getAllSubCategory() {
		return subCatRepo.findAll();
	}
	@RequestMapping("/getSubCategoryById/{id}")
	public Optional<SubCategory> getSubCategoryById(@PathVariable int id) {
		return subCatRepo.findById(id);
	}
	
}
