package com.atguigu.atcrowdfunding.service;

import com.atguigu.atcrowdfunding.bean.TAdmin;

import java.util.List;

/**
 * @author zhou minsheng
 * @version 1.0
 * @date 2020/6/17 14:18
 */
public interface AdminService {

    TAdmin doLogin(String loginacct, String userpswd);

    List<TAdmin> getAllAdmins(String condition);

    void saveAdmin(TAdmin admin);

    void delAdmin(Integer id);

    void batchDelAdmins(List<Integer> ids);

    TAdmin getAdminById(Integer id);

    void updateAdminById(TAdmin admin);
}
