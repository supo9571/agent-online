package com.manager.system.service;

import com.manager.common.core.domain.entity.Activity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author marvin 2021/9/7
 */
public interface ActivityService {
    Integer saveActivity(Activity activity);

    Integer checkActivityTime(Activity activity);

    List findActivity(Activity activity);

    Integer updateActivity(Activity activity);

    String getActivityConfig();

    int delActivity(int id);

    List getActivityDay(Activity activity);

    BigDecimal getActivityDayCount(Activity activity);
}
