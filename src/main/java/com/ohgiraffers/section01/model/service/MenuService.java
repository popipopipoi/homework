package com.ohgiraffers.section01.model.service;

import com.ohgiraffers.section01.model.dao.MenuDAO;
import com.ohgiraffers.section01.model.dto.CategoryDTO;
import com.ohgiraffers.section01.model.dto.MenuDTO;

import java.sql.Connection;

import static com.ohgiraffers.common.JDBCTemplate.*;
import static com.ohgiraffers.common.JDBCTemplate.close;

public class MenuService {

    public static int registNewMenu(MenuDTO newMenu) {

        Connection con = getConnection();
        MenuDAO menuDAO = new MenuDAO();

        int result1 = menuDAO.insetNewCategory(con, newMenu.getCategoryCode());

        int newCategoryCode = menuDAO.selectLastCategoryCode(con);
        newMenu.getCategoryCode().setCode(newCategoryCode);

        int result2 = menuDAO.insertNewMenu(con, newMenu);

        close(con);

        if(result1 > 0 && result2 > 0) {
            commit(con);
            return 1;
        } else {
            rollback(con);
            return 0;
        }
    }
}
