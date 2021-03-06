/** create by system gera-java version 1.0.0 17/12/2018 21:23 : 42*/
 package com.nouhoun.springboot.jwt.integration.service.entidade;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigAlertas;



public interface ConfigAlertasService {


public ConfigAlertas findConfigAlertasById(Integer id);
public ConfigAlertas saveConfigAlertas(ConfigAlertas configalertas);
public ConfigAlertas updateConfigAlertas(ConfigAlertas configalertas);
public List<ConfigAlertas> findConfigAlertasAll(PaginationFilter filter);
public ConfigAlertas deleteConfigAlertas(ConfigAlertas configalertas);

}
