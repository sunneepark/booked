package kr.or.connect.booked.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.connect.booked.VO.Product;
import kr.or.connect.booked.mapper.ProductMapper;

@Service
public class ProductService {

	@Autowired
	public ProductMapper mapper;

	public static int LIMIT = 4;

	public int selectCountByCategory(int categoryId) {
		return mapper.selectCountByCategory(categoryId);
	}
	public List<Integer> selectIdByCategory(int categoryId, int start) {
		return mapper.selectIdByCategory(categoryId, start, start + LIMIT);
	}

	public List<Product> selectProductById(List<Integer> idList) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idList", idList);
		return mapper.selectProductById(map);
	}
}
