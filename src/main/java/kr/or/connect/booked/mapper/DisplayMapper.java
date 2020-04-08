package kr.or.connect.booked.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.or.connect.booked.VO.Display;

@Repository
@Mapper
public interface DisplayMapper {
	List<Display> getDisplayById(List<Integer> productIdList);
	
}
