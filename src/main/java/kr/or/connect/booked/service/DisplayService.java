package kr.or.connect.booked.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.connect.booked.VO.Display;
import kr.or.connect.booked.mapper.DisplayMapper;

@Service
public class DisplayService {
	@Autowired
	public DisplayMapper displayMapper;
	
	public List<Display> getDisplayById(List<Integer> productIdList){;
		List<Display> list = new ArrayList<>();
		return list;
	}
	
}
