package appo.task.service;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import appo.task.domain.CwGlIncomeCost;
import appo.task.domain.CwGlIncomeCostExample;
import appo.task.service.ICwGlIncomeCost;
import appo.task.mapper.CwGlIncomeCostMapper;

@Service("userService")
public class ICwGlIncomeCostImpl implements ICwGlIncomeCost {

	@Resource
	private CwGlIncomeCostMapper cwDao;
	
	@Override
	public List<CwGlIncomeCost> selectByExample(CwGlIncomeCostExample example) {
		// TODO Auto-generated method stub
		return cwDao.selectByExample(example);
	}

}
