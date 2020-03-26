package com.bus.manager.user.service;

import java.util.List;
import java.util.Map;

import com.kernel.common.model.PageResult;
import com.kernel.common.model.Result;
import com.kernel.common.model.SysRole;
import com.kernel.common.service.ISuperService;

/**
* @author knd
 */
public interface ISysRoleService extends ISuperService<SysRole> {
	void saveRole(SysRole sysRole);

	void deleteRole(Long id);

	/**
	 * 角色列表
	 * @param params
	 * @return
	 */
	PageResult<SysRole> findRoles(Map<String, Object> params);

	/**
	 * 新增或更新角色
	 * @param sysRole
	 * @return Result
	 */
	Result saveOrUpdateRole(SysRole sysRole);

	/**
	 * 查询所有角色
	 * @return
	 */
	List<SysRole> findAll();
}
