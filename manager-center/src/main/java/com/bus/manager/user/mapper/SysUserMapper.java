package com.bus.manager.user.mapper;

import com.kernel.common.model.SysUser;
import com.kernel.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.List;
import java.util.Map;

/**
 * 用户表 Mapper 接口
 *
 * @author knd
 * @data 2018-10-29
 */
public interface SysUserMapper extends SuperMapper<SysUser> {
    /**
     * 分页查询用户列表
     * @param page
     * @param params
     * @return
     */
    List<SysUser> findList(Page<SysUser> page, @Param("u") Map<String, Object> params);
}
