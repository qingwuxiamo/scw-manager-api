package com.atguigu.atcrowdfunding.service;

import com.atguigu.atcrowdfunding.bean.TPermission;

import java.util.List;

/**
 * @author zhou minsheng
 * @version 1.0
 * @date 2020/6/22 20:34
 */
public interface PermissionService {
    List<TPermission> getPermissions();

    List<Integer> getAssignedPermissionIds(Integer roleId);
}
