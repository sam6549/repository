package payment.service;

import org.springframework.beans.factory.annotation.Autowired;

import payment.dao.PayBaseMapper;
import payment.dao.PayHisMapper;
import payment.dto.PayBaseDto;
import payment.dto.PayHisDto;
import payment.model.PaymentApiInput;
import payment.model.PaymentApiOutput;

public class PaymentApi {
	@Autowired
	private PayBaseMapper payBaseMapper;
	@Autowired
	private PayHisMapper payHisMapper;
	
	public PaymentApiOutput execute(PaymentApiInput request) throws Exception{
		PaymentApiInput input = new PaymentApiInput();
		PaymentApiOutput output = new PaymentApiOutput();
		
		String refNo;
		String encDat;
		
		//request to input copy
		input = reqToInput(request);
		
		//check input
		checkInput(input);
		
		//refNo 채번
		refNo = "";
		
		//카드정보 암호화 (카드번호, 유효기간, cvc번호)
		encDat = "";
		
		//payment_base insert
		PayBaseDto payBase = setPayBaseDto(input,refNo);
		payBaseMapper.insertPayBase(payBase);
		
		//payment_his insert
		PayHisDto payHis = setPayHisDto(input,refNo,encDat);
		payHisMapper.insertPayHis(payHis);
		
		return output;
		
	}

	private PayHisDto setPayHisDto(PaymentApiInput input, String refNo, String encDat) {
		PayHisDto payHis = new PayHisDto();
		payHis.setRefNo(refNo);
		payHis.setBizStsCd("Payment");
		payHis.setCardNo(input.getCardNo());
		payHis.setIstmNo(input.getIstmNo());
		payHis.setCardExpDt(input.getCardExpDt());
		payHis.setCardCvc(input.getCardCvc());
		payHis.setTrnAmt(input.getTrnAmt());
		payHis.setVatAmt(input.getVatAmt());
		payHis.setOrgRefNo("");
		payHis.setEncCardInfo(encDat);
		
		//string 데이터명세 작성
		payHis.setTrnfDat("");
		
		return payHis;
	}

	private PayBaseDto setPayBaseDto(PaymentApiInput input, String refNo) {
		PayBaseDto payBase = new PayBaseDto();
		payBase.setRefNo(refNo);
		payBase.setBizStsCd("Payment");
		payBase.setCardNo(input.getCardNo());
		payBase.setIstmNo(input.getIstmNo());
		payBase.setCardExpDt(input.getCardExpDt());
		payBase.setCardCvc(input.getCardCvc());
		payBase.setTrnAmt(input.getTrnAmt());
		payBase.setVatAmt(input.getVatAmt());		
		return payBase;
	}

	private void checkInput(PaymentApiInput input) {
		// TODO Auto-generated method stub
		
	}

	private PaymentApiInput reqToInput(PaymentApiInput request) {
		PaymentApiInput input = new PaymentApiInput();
		input.setCardCvc(request.getCardCvc());
		input.setCardExpDt(request.getCardExpDt());
		input.setCardNo(request.getCardNo());
		input.setIstmNo(request.getIstmNo());
		input.setTrnAmt(request.getTrnAmt());
		input.setVatAmt(request.getVatAmt());
		return input;
	}
}
