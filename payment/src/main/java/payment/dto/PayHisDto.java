package payment.dto;

import java.math.BigDecimal;

public class PayHisDto {
	private String refNo;
	private String bizStsCd;
	private int cardNo;
	private int istmNo;
	private int cardExpDt;
	private int cardCvc;
	private BigDecimal trnAmt;
	private BigDecimal vatAmt;
	private String orgRefNo;
	private String encCardInfo;
	private String trnfDat;
	
	
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
	public String getOrgRefNo() {
		return orgRefNo;
	}
	public void setOrgRefNo(String orgRefNo) {
		this.orgRefNo = orgRefNo;
	}
	public String getEncCardInfo() {
		return encCardInfo;
	}
	public void setEncCardInfo(String encCardInfo) {
		this.encCardInfo = encCardInfo;
	}
	public String getTrnfDat() {
		return trnfDat;
	}
	public void setTrnfDat(String trnfDat) {
		this.trnfDat = trnfDat;
	}
	
	
    @Override
    public String toString() {
        return "PayBaseDto [refNo=" + refNo + ", bizStsCd=" + bizStsCd + ", cardNo=" + cardNo + ", istmNo="
                + istmNo + ", cardExpDt=" + cardExpDt + ", cardCvc=" + cardCvc + ", trnAmt=" + trnAmt
                + ", vatAmt=" + vatAmt + ", orgRefNo=" + orgRefNo + ", encCardInfo=" + encCardInfo
                + ", trnfDat=" + trnfDat + "]";
    }
}
