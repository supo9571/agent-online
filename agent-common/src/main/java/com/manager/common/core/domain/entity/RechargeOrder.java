package com.manager.common.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.manager.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 充值订单查询
 *
 * @author sieGuang 2021/09/10
 */
@Data
public class RechargeOrder extends BaseEntity {

    @ApiModelProperty("主键id")
    private String id;

    @ApiModelProperty("平台id")
    private Integer tid;

    @ApiModelProperty("订单号")
    private String orderNumber;
    @ApiModelProperty("第三方订单号")
    private String thirdPartyOrderNumber;

    @ApiModelProperty("玩家ids 赠送页面玩家id多值")
    private String uids;
    @ApiModelProperty("玩家id")
    private int uid;
    @ApiModelProperty("玩家名称")
    private String uname;

    @ApiModelProperty("操作前余额")
    private BigDecimal beforeOrderMoney;
    @ApiModelProperty("操作后余额")
    private BigDecimal afterOrderMoney;
    @ApiModelProperty("充值金额")
    private BigDecimal rechargeAmount;
    @ApiModelProperty("立得金额")
    private BigDecimal standAmount;

    @ApiModelProperty("支付类型  1VIP充值 2银行卡充值 3月卡充值 " +
            "4线上支付 5系统赠送/人工充值 6彩金充值 (获取对应页签的数据)")
    private String rechargeType;
    @ApiModelProperty("支付渠道")
    private String rechargeChannel;
    @ApiModelProperty("支付状态 1支付成功 2等待支付 3取消支付")
    private String paymentStatus;
    @ApiModelProperty("所属渠道")
    private String channel;

    @ApiModelProperty("操作人/银商ID")
    private String adminUserId;
    @ApiModelProperty("真实姓名")
    private String realityName;

    @ApiModelProperty("发起时间1")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String createTime1;
    @ApiModelProperty("发起时间2")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String createTime2;

    @ApiModelProperty("完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String finishTime;
    @ApiModelProperty("完成时间1")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String finishTime1;
    @ApiModelProperty("完成时间2")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String finishTime2;

    @ApiModelProperty("商品名称")
    private String commodityName;

    @ApiModelProperty("转账方式")
    private String transferWay;

    @ApiModelProperty("操作备注")
    private String remark;

    @ApiModelProperty("月卡类型： 1金卡 2银卡")
    private String monthlyCardType;

    @ApiModelProperty("银行卡充值状态： 1确认充值 2取消充值")
    private String bankCardRechargeType;

    @ApiModelProperty("赠送金额")
    private BigDecimal exCoins;
    @ApiModelProperty("操作账户 0钱包 1保险箱")
    private String operateAccount;
    @ApiModelProperty("操作类型 1人工充值 2充值扣值 3彩金加款 4彩金扣除")
    private String operateType;

    @ApiModelProperty("导出状态  1充值订单查询 2VIP充值 3银行卡充值 4月卡充值 5系统赠送")
    private String excelType;
}
