package kr.or.connect.booked.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.booked.VO.Product;
import kr.or.connect.booked.service.ProductService;

@RestController
@RequestMapping(path="/products")
public class ProductsController {
	@Autowired
	ProductService productService;
	
	@GetMapping
	public Map<String, Object> showProducts(
			@RequestParam(required=false, defaultValue="0") int categoryId,
			@RequestParam(required=false, defaultValue="0") int start 
			){
		/**
		 * "items": [
    {
      "displayInfoId": 0, //display
      "placeName": "string", //display
      "productContent": "string", //display
      "productDescription": "string", //product
      "productId": 0, //product
      "productImageUrl": "string" //save_file_name
    }
  ],
		 */
		int countId = productService.selectCountByCategory(categoryId);
		List<Integer> idList = productService.selectIdByCategory(categoryId,start);
		System.out.println(idList);
		
		List<Product> productList = productService.selectProductById(idList);
		
		for(int i=0;i<idList.size();i++) {
			
		}
		Map<String, Object> map = new HashMap<>();
		map.put("totalCount",countId);
		map.put("items",productList);
		return map;
	}
	
	@GetMapping(path="/{displayInfoId}")
	public void oneProducts(@PathVariable("displayInfoId") int id){
		
	}
}
