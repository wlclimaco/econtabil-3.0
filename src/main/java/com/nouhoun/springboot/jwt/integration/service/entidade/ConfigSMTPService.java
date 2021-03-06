/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigSMTP;



public interface ConfigSMTPService {


public ConfigSMTP findConfigSMTPById(Integer id);
public ConfigSMTP saveConfigSMTP(ConfigSMTP configsmtp);
public ConfigSMTP updateConfigSMTP(ConfigSMTP configsmtp);
public List<ConfigSMTP> findConfigSMTPAll(PaginationFilter filter);
public ConfigSMTP deleteConfigSMTP(ConfigSMTP configsmtp);

}
