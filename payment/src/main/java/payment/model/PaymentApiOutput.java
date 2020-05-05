package payment.model;

public class PaymentApiOutput {
	private String refNo;
	private String trnfDat;
	private String resultMsg;
	
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getTrnfDat() {
		return trnfDat;
	}
	public void setTrnfDat(String trnfDat) {
		this.trnfDat = trnfDat;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
	
	
	
}
