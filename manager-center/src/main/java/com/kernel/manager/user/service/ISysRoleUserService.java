package com.kernel.manager.user.service;

import com.kernel.manager.user.model.SysRoleUser;
import com.kernel.common.model.SysRole;
import com.kernel.common.service.ISuperService;

import java.util.List;

/**
 * @author knd
 */
public interface ISysRoleUserService extends ISuperService<SysRoleUser> {
	int deleteUserRole(Long userId, Long roleId);

	int saveUserRoles(Long userId, Long roleId);

	/**
	 * 根据用户id获取角色
	 *
	 * @param userId
	 * @return
	 */
	List<SysRole> findRolesByUserId(Long userId);

	/**
	 * 根据用户ids 获取
	 *
	 * @param userIds
	 * @return
	 */
	List<SysRole> findRolesByUserIds(List<Long> userIds);
}
