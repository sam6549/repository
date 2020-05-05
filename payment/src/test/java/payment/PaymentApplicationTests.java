package payment;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import payment.dao.PayBaseMapper;
import payment.dao.PayRefMapper;
import payment.dao.UserMapper;
import payment.dto.PayBaseDto;
import payment.module.CmPayModule;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PaymentApplicationTests {


	@Autowired
    private UserMapper uMapper;
	@Autowired
	private PayBaseMapper payBaseMapper;


//    @Test
//    public void userTest() {
//        UserDto user = new UserDto();
//        user.setUserId("test22");
//        user.setUserPw("test");
//        user.setUserName("테스트");
//        user.setUserGender("남");
//        user.setUserEmail("test@test.test");
//        uMapper.insertUser(user);
//        
//        System.out.println(uMapper.selectOneUser("test2"));
//    }
//	@Test
//	public void deleteTest() {
//		UserDto user = new UserDto();
//		user.setUserId("test");
//		
//		uMapper.deleteUser(user.getUserId());
//	}
	
//	@Test
//	public void payBaseTest() {
//		
//		PayBaseDto payBase = new PayBaseDto();
//		
//		payBase.setRefNo("ABCaa");
//		payBase.setBizStsCd("PAYMENT");
//		payBase.setCardNo(123123);
//		payBase.setIstmNo(2);
//		payBase.setCardExpDt(0525);
//		payBase.setCardCvc(456);
//		payBase.setTrnAmt(new BigDecimal(11000));
//		payBase.setVatAmt(new BigDecimal(1000));
//		System.out.println(payBase);
//		payBaseMapper.insertPayBase(payBase);
//		
////		System.out.println(payBaseMapper.selectPayBase("ABC"));
//		
//		
//	}
	
//	@Test
//	public void payBaseTest() {
//		
//		PayBaseDto payBase = new PayBaseDto();
//		PayBaseDto payBase2 = new PayBaseDto();
//		 
//		payBase.setRefNo("ABC");
//		System.out.println(payBase);
//		Map<String, Object> result = new HashMap<>();
//		result = payBaseMapper.selectOnePayBase(payBase.getRefNo());
//		System.out.println(result);
//		
//		payBase2.setBizStsCd((String) result.get("BIZ_STS_CD"));
//		payBase2.setCardCvc((int) result.get("CARD_NO"));
//		payBase2.setCardExpDt((int) result.get("CARD_EXP_DT"));
//		payBase2.setCardNo((int) result.get("CARD_CVC"));
//		payBase2.setIstmNo((int) result.get("ISTM_NO"));
//		payBase2.setRefNo((String) result.get("REF_NO"));
//		payBase2.setTrnAmt((BigDecimal) result.get("TRN_AMT"));
//		payBase2.setVatAmt((BigDecimal) result.get("VAT_AMT"));
//		System.out.println(payBase2);
//		
//		System.out.println(payBaseMapper.selectRefNo(payBase));
//		
//		
//	}
	
	@Test
	public void payRefTest() {
		CmPayModule payMd = new CmPayModule();
		String refNo = null;
		try {
			refNo = payMd.inqRefNo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(refNo);
	}
}
