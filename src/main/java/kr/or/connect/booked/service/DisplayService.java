package kr.or.connect.booked.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.connect.booked.VO.Display;
import kr.or.connect.booked.mapper.DisplayMapper;

@Service
public class DisplayService {
	@Autowired
	public DisplayMapper displayMapper;
	
	public List<Display> getDisplayById(List<Integer> productIdList){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idList", productIdList);
		return displayMapper.getDisplayById(map);
	}
	
}
