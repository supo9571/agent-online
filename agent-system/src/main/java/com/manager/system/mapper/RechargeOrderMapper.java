package com.manager.system.mapper;

import com.manager.common.core.domain.entity.Pay;
import com.manager.common.core.domain.entity.RechargeOrder;
import com.manager.common.core.domain.entity.VipRecharge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 充值订单查询
 *
 * @author sieGuang 2021/09/10
 */
@Mapper
public interface RechargeOrderMapper {

    /**
     * 查询
     */
    List<RechargeOrder> getRechargeOrderList(RechargeOrder rechargeOrder);

    Integer addRechargeOrder(RechargeOrder rechargeOrder);

    Integer editRechargeOrder(RechargeOrder rechargeOrder);

    void statisticsTotalValue(@Param("tid") Integer tid,@Param("amount") double amount,
                              @Param("give") double give, @Param("uid") String uid);

    @Select("SELECT COUNT(1) from data_register dr where " +
            "dr.uid = #{uid} and dr.channel IN (SELECT t_id FROM sys_tenant WHERE tenant = #{tid} AND t_type = '2')")
    Integer uidIsPresent(@Param("uid") int uid,@Param("tid") int tid);

    @Select("SELECT dr.channel from data_register dr where dr.uid = #{uid}")
    String getChannel(@Param("uid") int uid);

    @Select("select recharge_give from config_pay where pay_type = #{payType} and status = '1' limit 0,1")
    Integer selectRechargeGive(@Param("payType") int payType);

    @Select("select jin_recharge_give from config_month_recharge where status = '1' limit 0,1")
    Integer selectJinMonthGive();

    @Select("select yin_recharge_give from config_month_recharge where status = '1' limit 0,1")
    Integer selectYinMonthGive();

    /**
     * 获取月卡金额
     *
     * @param monthlyCardType 1金卡 2银卡
     */
    Map getRechargeAmount(@Param("monthlyCardType") String monthlyCardType);
}
