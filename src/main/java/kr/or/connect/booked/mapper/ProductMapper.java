package kr.or.connect.booked.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import kr.or.connect.booked.VO.Product;

@Repository
@Mapper
public interface ProductMapper {
	int selectCount();
	int selectCountByCategory(int categoryId);
	List<Integer> selectIdByCategory(int categoryId, int start, int limit);
	List<Product> selectProductById(Map<String, Object> idList);
}
