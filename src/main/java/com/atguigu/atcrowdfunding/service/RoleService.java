package com.atguigu.atcrowdfunding.service;

import com.atguigu.atcrowdfunding.bean.TRole;

import java.util.List;

/**
 * @author zhou minsheng
 * @version 1.0
 * @date 2020/6/19 17:23
 */
public interface RoleService {

    List<TRole> getRoles(String condition);

    void delRole(Integer id);

    void saveRole(TRole role);

    TRole getRoleById(Integer id);

    void updateRole(TRole role);

    void batchDelRoles(List<Integer> ids);

    void redistribution(Integer roleId, List<Integer> permissionIds);
}
