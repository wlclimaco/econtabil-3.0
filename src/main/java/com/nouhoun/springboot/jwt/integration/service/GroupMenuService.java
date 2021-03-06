/** create by system gera-java version 1.0.0 22/11/2018 23:10 : 51*/
 package com.nouhoun.springboot.jwt.integration.service;

import java.util.List;

import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.GroupMenu;



public interface GroupMenuService {


public GroupMenu findGroupMenuById(Integer id);
public GroupMenu saveGroupMenu(GroupMenu groupmenu);
public GroupMenu updateGroupMenu(GroupMenu groupmenu);
public List<GroupMenu> findGroupMenuAll(PaginationFilter filter);
public GroupMenu deleteGroupMenu(GroupMenu groupmenu);

}
