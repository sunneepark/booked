package kr.or.connect.booked.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.booked.VO.Display;
import kr.or.connect.booked.VO.Product;
import kr.or.connect.booked.service.DisplayService;
import kr.or.connect.booked.service.ProductService;

@RestController
@RequestMapping(path="/products")
public class ProductsController {
	@Autowired
	ProductService productService;
	@Autowired
	DisplayService displayService;
	
	@GetMapping
	/***
	 * 
	 * @param categoryId
	 * @param start
	 * @return
	 */
	public Map<String, Object> showProducts(
			@RequestParam(required=false, defaultValue="0") int categoryId,
			@RequestParam(required=false, defaultValue="0") int start 
			){ //상품목록보여주기

		int totalCount = productService.selectCountByCategory(categoryId);
		
		List<Integer> idList = productService.selectIdByCategory(categoryId,start);
		
		List<Product> productList = productService.selectProductById(idList);
		List<Display> diplayList = displayService.getDisplayById(idList);
		
		List<Map<String, Object>> productsList = new ArrayList<>();
		for(int i=0;i<idList.size();i++) {
			Map<String, Object> map = new HashMap<>();
			Product tempProduct = productList.get(i);
			Display tempDiplay = diplayList.get(i);
			
			map.put("displayInfoId",tempDiplay.getId());
			map.put("placeName",tempDiplay.getPlace_name());
			map.put("productContent",tempProduct.getContent());
			map.put("productDescription",tempProduct.getDescription());
			map.put("productId",tempProduct.getId());
			
			productsList.add(map);
		}
		
		Map<String, Object> map = new HashMap<>();
		map.put("totalCount",totalCount);
		map.put("items",productsList);
		return map;
	}
	
	@GetMapping(path="/{displayInfoId}")
	public void oneProducts(@PathVariable("displayInfoId") int id){
		
	}
}
