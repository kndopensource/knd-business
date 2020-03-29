package com.kernel.manager.user.service.impl;

import com.kernel.manager.user.mapper.SysRoleMenuMapper;
import com.kernel.manager.user.model.SysRoleMenu;
import com.kernel.manager.user.service.ISysRoleMenuService;
import com.kernel.common.model.SysMenu;
import com.kernel.common.service.impl.SuperServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @author knd
 */
@Slf4j
@Service
public class SysRoleMenuServiceImpl extends SuperServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements ISysRoleMenuService  {
 	@Resource
	private SysRoleMenuMapper sysRoleMenuMapper;

	@Override
	public int save(Long roleId, Long menuId) {
		return sysRoleMenuMapper.save(roleId, menuId);
	}

	@Override
	public int delete(Long roleId, Long menuId) {
		return sysRoleMenuMapper.delete(roleId, menuId);
	}

	@Override
	public List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type) {
		return sysRoleMenuMapper.findMenusByRoleIds(roleIds, type);
	}

	@Override
	public List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type) {
		return sysRoleMenuMapper.findMenusByRoleCodes(roleCodes, type);
	}
}
