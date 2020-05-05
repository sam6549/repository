package payment.dao;

import java.util.Map;

import payment.dto.PayBaseDto;

public interface PayBaseMapper {
    public void insertPayBase (PayBaseDto payBase);
    public void updatePayBase (PayBaseDto payBase);
    public void cancelPayBase (PayBaseDto payBase);
    public Map<String, Object> selectOnePayBase (String refNo);
    
    
    
    
}
