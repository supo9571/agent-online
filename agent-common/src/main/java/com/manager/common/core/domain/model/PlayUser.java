package com.manager.common.core.domain.model;

import com.manager.common.annotation.Excel;
import com.manager.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author marvin 2021/8/17
 */
@Data
public class PlayUser extends BaseEntity {

    @ApiModelProperty("平台id")
    @Excel(name = "平台id")
    private String tid;

    @ApiModelProperty("玩家id")
    @Excel(name = "玩家id")
    private String uid;

    @ApiModelProperty("玩家姓名")
    @Excel(name = "玩家姓名")
    private String name;

    @ApiModelProperty("注册时间")
    @Excel(name = "注册时间")
    private String time;

    @ApiModelProperty("渠道名称")
    @Excel(name = "渠道名称")
    private String channel;

    @ApiModelProperty("上级id")
    @Excel(name = "上级id")
    private int agentId;

    @ApiModelProperty("设备id")
    @Excel(name = "设备id")
    private String deviceId;

    private String curChannel;

    @ApiModelProperty("注册ip")
    @Excel(name = "注册ip")
    private String registerIp;

    @ApiModelProperty("设备名称")
    @Excel(name = "设备名称")
    private String deviceBrand;

    private String clientVersion;

    @ApiModelProperty("机器码")
    @Excel(name = "机器码")
    private String registerMachine;

    @ApiModelProperty("最后登录ip")
    @Excel(name = "最后登录ip")
    private String loginIp;

    @ApiModelProperty("最后登录机器码")
    @Excel(name = "最后登录机器码")
    private String loginDeviceId;

    @ApiModelProperty("最后登录设备")
    @Excel(name = "最后登录设备")
    private String loginDeviceBrand;

    @ApiModelProperty("最后登录时间")
    @Excel(name = "最后登录时间")
    private String loginTime;

    @ApiModelProperty("vip等级")
    @Excel(name = "vip等级")
    private String vipLevel;

    @ApiModelProperty("电话号码")
    @Excel(name = "电话号码")
    private String phone;

    @ApiModelProperty("保险箱余额")
    @Excel(name = "保险箱余额")
    private String safeBox;

    @ApiModelProperty("登录密码")
    @Excel(name = "登录密码")
    private String password;
}
