package com.manager.common.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.manager.common.annotation.Excel;
import com.manager.common.annotation.Excel.ColumnType;
import com.manager.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 充值订单导出
 * @author sieGuang 2021/09/15
 */
@Data
public class RechargeOrderExcel extends BaseEntity {

    @Excel(name = "订单号")
    @ApiModelProperty("订单号")
    private String orderNumber;

    @Excel(name = "第三方订单号")
    @ApiModelProperty("第三方订单号")
    private String thirdPartyOrderNumber;

    @Excel(name = "玩家id", cellType = ColumnType.NUMERIC)
    @ApiModelProperty("玩家id")
    private int uid;

    @Excel(name = "玩家名称")
    @ApiModelProperty("玩家名称")
    private String uname;

    @Excel(name = "操作前余额")
    @ApiModelProperty("操作前余额")
    private BigDecimal beforeOrderMoney;

    @Excel(name = "充值金额", cellType = ColumnType.STRING)
    @ApiModelProperty("充值金额")
    private BigDecimal rechargeAmount;

    @Excel(name = "赠送金额", cellType = ColumnType.STRING)
    @ApiModelProperty("赠送金额")
    private BigDecimal exCoins;

    @Excel(name = "操作后余额", cellType = ColumnType.STRING)
    @ApiModelProperty("操作后余额")
    private BigDecimal afterOrderMoney;

    @Excel(name = "支付类型",
            readConverterExp = "1=VIP充值,2=银行卡充值,3=月卡充值,4=线上支付,5=系统赠送,6=彩金充值")
    @ApiModelProperty("支付类型  1VIP充值 2银行卡充值 3月卡充值 " +
            "4线上支付 5系统赠送/人工充值 6彩金充值 (获取对应页签的数据)")
    private String rechargeType;

    @Excel(name = "支付渠道")
    @ApiModelProperty("支付渠道")
    private String rechargeChannel;

    @Excel(name = "支付状态" ,readConverterExp = "1=支付成功,2=等待支付,3=取消支付")
    @ApiModelProperty("支付状态 1支付成功 2等待支付 3取消支付")
    private String paymentStatus;

    @Excel(name = "发起时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("发起时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Excel(name = "完成时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date finishTime;

    @Excel(name = "所属渠道")
    @ApiModelProperty("所属渠道")
    private String channel;

    @Excel(name = "操作备注")
    @ApiModelProperty("操作备注")
    private String remark;

    @Excel(name = "操作人/银商ID")
    @ApiModelProperty("操作人/银商ID")
    private String adminUserId;

}
