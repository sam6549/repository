package payment.dto;

import java.math.BigDecimal;

public class PayBaseDto {
	private String refNo;
	private String bizStsCd;
	private int cardNo;
	private int istmNo;
	private int cardExpDt;
	private int cardCvc;
	private BigDecimal trnAmt ;
	private BigDecimal vatAmt ;
	
	
	
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getBizStsCd() {
		return bizStsCd;
	}
	public void setBizStsCd(String bizStsCd) {
		this.bizStsCd = bizStsCd;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public int getIstmNo() {
		return istmNo;
	}
	public void setIstmNo(int istmNo) {
		this.istmNo = istmNo;
	}
	public int getCardExpDt() {
		return cardExpDt;
	}
	public void setCardExpDt(int cardExpDt) {
		this.cardExpDt = cardExpDt;
	}
	public int getCardCvc() {
		return cardCvc;
	}
	public void setCardCvc(int cardCvc) {
		this.cardCvc = cardCvc;
	}

	
  
	public BigDecimal getTrnAmt() {
		return trnAmt;
	}
	public void setTrnAmt(BigDecimal trnAmt) {
		this.trnAmt = trnAmt;
	}
	public BigDecimal getVatAmt() {
		return vatAmt;
	}
	public void setVatAmt(BigDecimal vatAmt) {
		this.vatAmt = vatAmt;
	}
	
	@Override
    public String toString() {
        return "PayBaseDto [refNo=" + refNo + ", bizStsCd=" + bizStsCd + ", cardNo=" + cardNo + ", istmNo="
                + istmNo + ", cardExpDt=" + cardExpDt + ", cardCvc=" + cardCvc + ", trnAmt=" + trnAmt
                + ", vatAmt=" + vatAmt+ "]";
    }
	
	
}
