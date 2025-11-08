package com.example.simnavi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simnavi.repository.MobilePlanRepository;

@Service
public class MobilePlanService {
	private final MobilePlanRepository mobilePlanRepository;
	
	@Autowired
	public MobilePlanService(MobilePlanRepository mobilePlanRepository) {
		this.mobilePlanRepository = mobilePlanRepository;
	}
	/**
	 * 指定したidのデータを削除する
	 * @param id
	 */
	public void delete(Long id) {
		mobilePlanRepository.deleteById(id);
	}
}
