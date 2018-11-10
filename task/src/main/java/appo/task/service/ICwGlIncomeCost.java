package appo.task.service;

import java.util.List;

import appo.task.domain.CwGlIncomeCost;
import appo.task.domain.CwGlIncomeCostExample;

public interface ICwGlIncomeCost {

	List<CwGlIncomeCost> selectByExample(CwGlIncomeCostExample example);
}
