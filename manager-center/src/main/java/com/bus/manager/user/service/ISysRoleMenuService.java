package com.bus.manager.user.service;

import com.bus.manager.user.model.SysRoleMenu;
import com.kernel.common.model.SysMenu;
import com.kernel.common.service.ISuperService;

import java.util.List;
import java.util.Set;

/**
 * @author knd
 */
public interface ISysRoleMenuService extends ISuperService<SysRoleMenu> {
	int save(Long roleId, Long menuId);

	int delete(Long roleId, Long menuId);

	List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type);

	List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type);
}
