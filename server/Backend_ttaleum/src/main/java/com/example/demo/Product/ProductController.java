package com.example.demo.Product;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Product")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	// 삽입 구현
	@PostMapping("/insertProduct")
	public void saveProduct(@RequestBody ProductDTO productDTO) {
		System.out.println("insert 성공");
		productService.save(productDTO);
	}

	// 조회 구현
	@GetMapping("select")
	public void findAll() {
		List<ProductDTO> productDTOList = productService.findAll();
		System.out.println("ProductDTOList=" + productDTOList);
	}
}
