package com.arora.example.ralationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RelationshipMain implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository prodRepository;

	public static void main(String[] args) {
		SpringApplication.run(RelationshipMain.class, args);

		System.out.println("************************************************");
		System.out.println("Welcome in Entity Relationship Project");
		System.out.println("************************************************");
	}

	@Override
	public void run(String... args) throws Exception {

		// OneToOne Mapping

//		Student student = new Student();
//		student.setStudentId(13);
//		student.setStudentName("Suhas");
//		student.setAbout("I am software Engineer...");
//
//		Laptop laptop = new Laptop();
//		laptop.setLaptopId(101);
//		laptop.setBrand("Dell");
//		laptop.setModelNumber("DELL103");
//		laptop.setStudent(student);
//
//		student.setLaptop(laptop);
//
////		WE can save laptop using laptopRepository or use cascade in student where we using mapped column
//		Student stud = studentRepository.save(student);
//
//		System.out.println("Student save successfully : " + stud.getStudentName());

		// Fetch Student

//		Student stu = this.studentRepository.findById(13).get();
//		System.out.println("Found student : " + stu.getStudentId() + " " + stu.getStudentName() + " " + stu.getAbout());
//
//		Laptop lap = stu.getLaptop();
//
//		System.out.println("Found Laptop : " + lap.getLaptopId() + " " + lap.getModelNumber() + " " + lap.getBrand()
//				+ " " + (lap.getStudent()).getStudentName());

		// OneToMany Mapping

//		Student student = new Student();
//		student.setStudentId(12);
//		student.setStudentName("Deepak Patil");
//		student.setAbout("I am software Engineer...");
//
//		Address address = new Address();
//		address.setAddressId(131);
//		address.setstreet("33/12");
//		address.setCity("Pune");
//		address.setCountry("INDIA");
//		address.setStudent(student);
//
//		Address address1 = new Address();
//		address1.setAddressId(132);
//		address1.setstreet("12/56");
//		address1.setCity("Pimpri_Chichwad");
//		address1.setCountry("INDIA");
//		address1.setStudent(student);
//
//		List<Address> addList = new ArrayList<>();
//		addList.add(address);
//		addList.add(address1);
//
//		student.setAddresses(addList);
//
//		Student stud = studentRepository.save(student);
//
//		System.out.println("Student created : with address");

		// ManyToMany

//		Product product = new Product();
//		product.setPid(11);
//		product.setProductName("ASUS");
//
//		Product product1 = new Product();
//		product1.setPid(22);
//		product1.setProductName("ONIDA");
//
//		Product product2 = new Product();
//		product2.setPid(33);
//		product2.setProductName("SAMSUNG");
//
//		List<Category> catList = new ArrayList<>();
//
//		Category category = new Category();
//		category.setCid(333);
//		category.setTital("Electronic");
//
//		Category category1 = new Category();
//		category1.setCid(444);
//		category1.setTital("Mobiles");
//
//		List<Product> categoryProduct1 = category1.getProducts();
//		categoryProduct1.add(product2);
//		categoryProduct1.add(product);
//
//		List<Product> categoryProduct = category.getProducts();
//		categoryProduct.add(product2);
//		categoryProduct.add(product1);
//		categoryProduct.add(product);
//
//		this.categoryRepository.save(category);
//		this.categoryRepository.save(category1);
//
//		System.out.println("Prodcut saved succesffilly in category.......");

		// Fetch Data

		Category category = this.categoryRepository.findById(333).get();
		System.out.println("Size of products in category : " + category.getProducts().size());

		Category category1 = this.categoryRepository.findById(444).get();
		System.out.println("Size of products in category : " + category1.getProducts().size());

		Product product = this.prodRepository.findById(11).get();
		System.out.println("Size of categories in product : " + product.getCategories().size());

		Optional<Category> singleCategory = this.categoryRepository.findByCid(33);

		if (singleCategory.isPresent()) {
			System.out.println("Category find by id : " + singleCategory.get().getTital());
		} else {
			System.out.println("Category Not Found On Provided Cid : ");
		}

	}

}
