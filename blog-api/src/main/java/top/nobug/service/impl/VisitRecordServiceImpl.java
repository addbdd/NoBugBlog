package top.nobug.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.nobug.entity.VisitRecord;
import top.nobug.mapper.VisitRecordMapper;
import top.nobug.service.VisitRecordService;

/**
 * @Description: 访问记录业务层实现
 * @Author: wen
 * @Date: 2023-04-02
 */
@Service
public class VisitRecordServiceImpl implements VisitRecordService {
	@Autowired
	VisitRecordMapper visitRecordMapper;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void saveVisitRecord(VisitRecord visitRecord) {
		visitRecordMapper.saveVisitRecord(visitRecord);
	}
}
