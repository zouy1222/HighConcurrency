package com.hc.dto;

import com.hc.entity.SuccessKilled;
import com.hc.enums.SeckillStateEnum;

/**
 * @Title: SeckillExecution.java 
 * @Package com.hc.dto 
 * @Description: //秒杀成功执行后的结果
 * @author Shuyu.Wang
 * @date Creation time: 2017年9月6日
 * @version V1.0   
 */
public class SeckillExecution {
	
	private long seckillId;
	//秒杀结果状态
	private int state;
	//状态表示
	private String stateInfo;
	//秒杀成功对象
	private SuccessKilled successKilled;
	
	//成功
	public SeckillExecution(long seckillId, SeckillStateEnum stateEnum, SuccessKilled successKilled) {
		this.seckillId = seckillId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.successKilled = successKilled;
	}
    //失败
	public SeckillExecution(long seckillId, SeckillStateEnum stateEnum) {
		this.seckillId = seckillId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}
	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}
	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}
	
	
	
	
	
	
	
	

}
