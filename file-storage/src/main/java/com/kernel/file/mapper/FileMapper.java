package com.kernel.file.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kernel.db.mapper.SuperMapper;
import com.kernel.file.model.FileInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 上传存储db
 *
 * @author knd
 */
public interface FileMapper extends SuperMapper<FileInfo> {
    List<FileInfo> findList(Page<FileInfo> page, @Param("f") Map<String, Object> params);
}
