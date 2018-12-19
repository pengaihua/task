package appo.task.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appo.task.domain.CwGlIncomeCost;
import appo.task.domain.CwGlIncomeCostExample;
import appo.task.domain.CwGlIncomeCostExample.Criteria;
import appo.task.service.ICwGlIncomeCost;
@RestController
public class CwGlIncomeCostController {
	
  @Autowired
  ICwGlIncomeCost incomeCost;
  @RequestMapping("/income") 
  public List<CwGlIncomeCost> getIncome()
  {
	  
	  CwGlIncomeCostExample example = new CwGlIncomeCostExample();
	  Criteria c = example.createCriteria();
	  c.andBillSourceEqualTo("发货");
	  c.andIncomeDateBetween(Date.valueOf("2018-10-01"), Date.valueOf("2018-10-31"));
	  List<CwGlIncomeCost> result = incomeCost.selectByExample(example);
	return result;
	  
  }
}
