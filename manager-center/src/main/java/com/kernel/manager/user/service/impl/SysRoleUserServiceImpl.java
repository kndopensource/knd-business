package com.kernel.manager.user.service.impl;

import com.kernel.manager.user.mapper.SysUserRoleMapper;
import com.kernel.manager.user.model.SysRoleUser;
import com.kernel.manager.user.service.ISysRoleUserService;
import com.kernel.common.model.SysRole;
import com.kernel.common.service.impl.SuperServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author knd
 */
@Slf4j
@Service
public class SysRoleUserServiceImpl extends SuperServiceImpl<SysUserRoleMapper, SysRoleUser> implements ISysRoleUserService {
 	@Resource
	private SysUserRoleMapper sysUserRoleMapper;

	@Override
	public int deleteUserRole(Long userId, Long roleId) {
		return sysUserRoleMapper.deleteUserRole(userId, roleId);
	}

	@Override
	public int saveUserRoles(Long userId, Long roleId) {
		return sysUserRoleMapper.saveUserRoles(userId, roleId);
	}

	@Override
	public List<SysRole> findRolesByUserId(Long userId) {
		return sysUserRoleMapper.findRolesByUserId(userId);
	}

	@Override
	public List<SysRole> findRolesByUserIds(List<Long> userIds) {
		return sysUserRoleMapper.findRolesByUserIds(userIds);
	}
}
