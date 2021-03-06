package com.manager.system.service;

import com.manager.common.core.domain.entity.Pay;
import com.manager.common.core.domain.entity.RechargeOrder;
import com.manager.common.core.domain.entity.VipRecharge;

import java.util.List;
import java.util.Map;

/**
 * 充值订单查询
 *
 * @author sieGuang 2021/09/10
 */
public interface RechargeOrderService {

    /**
     * 查询充值数据
     */
    Map getRechargeOrderList(RechargeOrder rechargeOrder);

    /**
     * 增加充值数据
     *
     * @param rechargeOrder 参数
     */
    Integer addRechargeOrder(RechargeOrder rechargeOrder);

    /**
     * 确认充值、取消充值
     *
     * @param rechargeOrder
     */
    Integer editRechargeOrder(RechargeOrder rechargeOrder);

    void statisticsTotalValue(Integer tid, double amount, double give, String uid);

    Integer uidIsPresent(int uid,int tid);

    String getChannel(int uid);

    Integer selectRechargeGive(int i);

    Integer selectJinMonthGive();

    Integer selectYinMonthGive();

    /**
     * 获取月卡金额
     *
     * @param monthlyCardType 1金卡 2银卡
     */
    Map getRechargeAmount(String monthlyCardType);

    /**
     * 导出
     */
    List<RechargeOrder> export(RechargeOrder rechargeOrder);
}
