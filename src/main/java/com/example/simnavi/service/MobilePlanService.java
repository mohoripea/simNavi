package com.example.simnavi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simnavi.form.MobilePlanForm;
import com.example.simnavi.model.MobilePlan;
import com.example.simnavi.repository.MobilePlanRepository;

@Service
public class MobilePlanService {
	private final MobilePlanRepository mobilePlanRepository;
	
	@Autowired
	public MobilePlanService(MobilePlanRepository mobilePlanRepository) {
		this.mobilePlanRepository = mobilePlanRepository;
	}
	
	public MobilePlan createPlan(MobilePlanForm mobilePlanForm) {
		MobilePlan mobilePlan = new MobilePlan();
		mobilePlan.setSimName(mobilePlanForm.getSimName());
		mobilePlan.setPlanName(mobilePlanForm.getPlanName());
		mobilePlan.setCarrier(mobilePlanForm.getCarrier());
		mobilePlan.setDataCapacity(mobilePlanForm.getDataCapacity());
		mobilePlan.setMonthlyFee(mobilePlanForm.getMonthlyFee());
		mobilePlan.setDataRollover(mobilePlanForm.isDataRollover());
		mobilePlan.setFamilyDiscount(mobilePlanForm.isFamilyDiscount());
		mobilePlan.setOfficialUrl(mobilePlanForm.getOfficialUrl());
		
		mobilePlan.setInitialCost(null);
	    mobilePlan.setCallCharge("非表示/N/A");
	    mobilePlan.setMinPeriod("なし");
	    
	    mobilePlan.setUpdateDate(new Date());
		
		return mobilePlanRepository.save(mobilePlan);
		
	}
	/**
	 * 指定したidのデータを削除する
	 * @param id
	 */
	public void delete(Long id) {
		mobilePlanRepository.deleteById(id);
	}
	
//	public MobilePlan updatePlan(Long id) {
//	
//	}
}
