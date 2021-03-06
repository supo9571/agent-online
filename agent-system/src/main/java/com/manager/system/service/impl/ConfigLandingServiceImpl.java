package com.manager.system.service.impl;

import com.manager.common.core.domain.entity.ConfigLanding;
import com.manager.system.mapper.ConfigLandingMapper;
import com.manager.system.service.ConfigLandingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author jason
 * @date 2021-09-20
 */
@Service
public class ConfigLandingServiceImpl implements ConfigLandingService {

    @Autowired
    private ConfigLandingMapper configLandingMapper;

    @Override
    public Map getConfigLanding(Integer tid) {
        return configLandingMapper.getConfigLandingInfo(tid);
    }

    @Override
    public ConfigLanding getId(Integer id) {
        return configLandingMapper.getById(id);
    }

    @Override
    public int editConfigLanding(ConfigLanding configLanding) {
        return configLandingMapper.editConfigLanding(configLanding);
    }

    @Override
    public int addConfigLanding(ConfigLanding configLanding) {
        return configLandingMapper.addConfigLanding(configLanding);
    }

}
