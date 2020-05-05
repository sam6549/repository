package payment.dao;

import java.util.Map;

import payment.dto.PayRefDto;

public interface PayRefMapper {
    public void insertPayRef (PayRefDto payRef);
    public String selectMaxSeq (String refDate);
    
    
}
