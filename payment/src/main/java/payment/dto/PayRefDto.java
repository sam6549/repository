package payment.dto;

public class PayRefDto {
	private String refDate ;
	private int seq ;
	
	
	public String getRefDate() {
		return refDate;
	}
	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
    @Override
    public String toString() {
        return "PayRefDto [refDate=" + refDate + ", seq=" + seq +  "]";
    }
	
}
