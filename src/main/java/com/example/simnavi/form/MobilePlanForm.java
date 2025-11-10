package com.example.simnavi.form;

public class MobilePlanForm {
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
		
		// データの繰越の可否
		private boolean dataRollover;
		
		// 家族割の有無
		private boolean familyDiscount;
		
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

		public String getOfficialUrl() {
			return officialUrl;
		}

		public void setOfficialUrl(String officialUrl) {
			this.officialUrl = officialUrl;
		}

		// 公式サイトへのリンク
		private String officialUrl;

}
