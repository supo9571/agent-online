package com.manager.system.service.impl;

import com.manager.common.config.ManagerConfig;
import com.manager.common.core.domain.entity.MailRecord;
import com.manager.system.mapper.MailRecordMapper;
import com.manager.system.service.MailRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 邮箱记录
 *
 * @author sieGuang 2021/09/20
 */
@Service
public class MailRecordServiceImpl implements MailRecordService {

    @Autowired
    private MailRecordMapper mailRecordMapper;

    @Override
    public List listMailRecord(MailRecord mailRecord) {
        mailRecord.setTid(ManagerConfig.getTid());
        return mailRecordMapper.listMailRecord(mailRecord);
    }

    @Override
    public void saveMailRecord(MailRecord mailRecord) {
        mailRecordMapper.saveMailRecord(mailRecord);
    }

    /**
     * 发送邮件
     */
    @Override
    public void sendOutMail(MailRecord mail) {
        mailRecordMapper.sendOutMail(mail);
    }

}
