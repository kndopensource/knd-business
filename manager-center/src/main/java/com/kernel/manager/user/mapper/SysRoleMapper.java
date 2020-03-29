package com.kernel.manager.user.mapper;

import java.util.List;
import java.util.Map;
import com.kernel.common.model.SysRole;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kernel.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author knd
 * 角色
 */
public interface SysRoleMapper extends SuperMapper<SysRole> {
	List<SysRole> findList(Page<SysRole> page, @Param("r") Map<String, Object> params);

	List<SysRole> findAll();
}
