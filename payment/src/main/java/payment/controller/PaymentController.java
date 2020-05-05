package payment.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import payment.model.PaymentApiInput;
import payment.model.PaymentApiOutput;
import payment.service.PaymentApi;

@SpringBootApplication
@RestController
public class PaymentController {
	String resultmsg="";
    
    @RequestMapping(value="/payment",method=RequestMethod.GET)
    public @ResponseBody Map<String,Object> payment(HttpServletRequest request) throws Exception{
    	Map<String, Object> jsonObject =new HashMap<String, Object>();
    	PaymentApi pApi = new PaymentApi();
    	
    	//set dto
    	PaymentApiInput setPayApiDto = setPayApiDto(request);
    	//start service
    	PaymentApiOutput rtnPayApiDto = pApi.execute(setPayApiDto);
    	
    	
        jsonObject.put("refNo", rtnPayApiDto.getRefNo());
        jsonObject.put("trnDat", rtnPayApiDto.getTrnfDat());
        jsonObject.put("resultMsg", rtnPayApiDto.getResultMsg());
        
        return jsonObject;
    }
    
    /*
     * PaymentApi input dto set
     * */
	private PaymentApiInput setPayApiDto(HttpServletRequest request) {
		PaymentApiInput setPayApiDto = new PaymentApiInput();
		setPayApiDto.setCardNo(Integer.parseInt(request.getParameter("cardNo")));
		setPayApiDto.setCardExpDt(Integer.parseInt(request.getParameter("cardExpDt")));
		setPayApiDto.setCardCvc(Integer.parseInt(request.getParameter("cardCvc")));
		setPayApiDto.setIstmNo(Integer.parseInt(request.getParameter("istmNo")));
		setPayApiDto.setTrnAmt(new BigDecimal(request.getParameter("trnAmt").trim()));
		setPayApiDto.setVatAmt(new BigDecimal(request.getParameter("vatAmt").trim()));
		
		
		return setPayApiDto;
	}
}
