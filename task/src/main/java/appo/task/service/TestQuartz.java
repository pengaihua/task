package appo.task.service;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TestQuartz extends QuartzJobBean{
	 /**
     * 执行定时任务
     * @param jobExecutionContext
     * @throws JobExecutionException
     */


	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("quartz task "+new Date());
	}


}
