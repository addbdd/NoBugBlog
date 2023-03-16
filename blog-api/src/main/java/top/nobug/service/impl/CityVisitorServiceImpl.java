package top.nobug.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.nobug.entity.CityVisitor;
import top.nobug.mapper.CityVisitorMapper;
import top.nobug.service.CityVisitorService;

/**
 * @Description: 城市访客数量统计业务层实现
 * @Author: wen
 * @Date: 2023-03-16
 */
@Service
public class CityVisitorServiceImpl implements CityVisitorService {
	@Autowired
	CityVisitorMapper cityVisitorMapper;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void saveCityVisitor(CityVisitor cityVisitor) {
		cityVisitorMapper.saveCityVisitor(cityVisitor);
	}
}
