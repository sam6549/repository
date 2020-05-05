package payment.module;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JacksonInject;

import payment.dao.PayRefMapper;
import payment.dao.UserMapper;
import payment.dto.PayRefDto;


public class CmPayModule {
	@Autowired
	private PayRefMapper payRefMapper;
	@Autowired
	private UserMapper user;
	
	@Autowired
	public String inqRefNo() throws Exception{		
		String refNo;
		
		String strSeq;
		PayRefDto payRef = new PayRefDto();
        SimpleDateFormat spDt = new SimpleDateFormat("yyyyMMdd");
        Calendar c1 = Calendar.getInstance();
        String strToday = spDt.format(c1.getTime());
        String refDate = strToday;
        
        
        
        System.out.println(refDate);
        System.out.println(user.selectOneUser("123"));
//        
//        strSeq = Integer.toString(payRefMapper.selectMaxSeq(payRef));
//        
//        System.out.println(strSeq);
        
        refNo = refDate+lpad(6, 12, "0");
        
        return refNo;
		
	}
	
	public String lpad(int value, int length, String prefix) {
		try {
			StringBuilder sb = new StringBuilder();
			String castValue = value + "";
			
			for (int i = castValue.length(); i<length; i++) {
				sb.append(prefix);
			}
			sb.append(castValue);
			return sb.toString();
		}catch(Exception e) {
			return "";
		}
	}
	
	public String rpad(int value, int length, String prefix) {
		try {
			StringBuilder sb = new StringBuilder();
			String castValue = value + "";
			sb.append(castValue);
			
			for (int i = castValue.length(); i<length; i++) {
				sb.append(prefix);
			}
			
			return sb.toString();
		}catch(Exception e) {
			return "";
		}
	}
}
