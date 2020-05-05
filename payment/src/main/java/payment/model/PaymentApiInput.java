package payment.model;

import java.math.BigDecimal;

public class PaymentApiInput {
	private int cardNo;
	private int cardExpDt;
	private int cardCvc;
	private int istmNo;
	private BigDecimal trnAmt;
	private BigDecimal vatAmt;
	
	
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
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
	public int getIstmNo() {
		return istmNo;
	}
	public void setIstmNo(int istmNo) {
		this.istmNo = istmNo;
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
	
	
}
