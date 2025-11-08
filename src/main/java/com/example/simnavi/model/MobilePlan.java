package com.example.simnavi.model;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MobilePlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// SIMの名称
	private String simName;
	
	// プラン名
	private String planName;
	
	// 利用回線
	private String carrier;
	
	// データ容量
	private Integer dataCapacity;
	
	// 月額料金（円）
	private Integer monthlyFee;
	
	// 初期費用（円）
	private Integer initialCost;
	
	// データの繰越の可否
	private boolean dataRollover;
	
	// 家族割の有無
	private boolean familyDiscount;
	
	// 通話料金の規定
	private String callCharge;
	
	// 最低利用期間
	private String minPeriod;
	
	// 公式サイトへのリンク
	private String officialUrl;
	
	// データ最終更新日
	private Date updateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSimName() {
		return simName;
	}

	public void setSimName(String simName) {
		this.simName = simName;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public Integer getDataCapacity() {
		return dataCapacity;
	}

	public void setDataCapacity(Integer dataCapacity) {
		this.dataCapacity = dataCapacity;
	}

	public Integer getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(Integer monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public Integer getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(Integer initialCost) {
		this.initialCost = initialCost;
	}

	public boolean isDataRollover() {
		return dataRollover;
	}

	public void setDataRollover(boolean dataRollover) {
		this.dataRollover = dataRollover;
	}

	public boolean isFamilyDiscount() {
		return familyDiscount;
	}

	public void setFamilyDiscount(boolean familyDiscount) {
		this.familyDiscount = familyDiscount;
	}

	public String getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(String callCharge) {
		this.callCharge = callCharge;
	}

	public String getMinPeriod() {
		return minPeriod;
	}

	public void setMinPeriod(String minPeriod) {
		this.minPeriod = minPeriod;
	}

	public String getOfficialUrl() {
		return officialUrl;
	}

	public void setOfficialUrl(String officialUrl) {
		this.officialUrl = officialUrl;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
