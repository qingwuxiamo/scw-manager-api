package com.atguigu.atcrowdfunding.service;

import com.atguigu.atcrowdfunding.bean.TMenu;

import java.util.List;

/**
 * @author zhou minsheng
 * @version 1.0
 * @date 2020/6/17 20:29
 */
public interface MenuService {

   List<TMenu> getPmenus();

    void saveMenu(TMenu menu);

    TMenu getMenu(Integer id);

    void updateMenu(TMenu menu);

    void delMenu(Integer id);
}
