package payment.dao;

import payment.dto.PayHisDto;

public interface PayHisMapper {
    public void insertPayHis (PayHisDto payHis);
    public void updatePayHis (PayHisDto payHis);
    public void cancelPayHis (PayHisDto payHis);
    public PayHisDto selectPayHis (String refNo);
}
