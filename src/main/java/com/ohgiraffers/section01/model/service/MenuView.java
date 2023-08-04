package com.ohgiraffers.section01.model.service;

import com.ohgiraffers.model.dto.CategoryDTO;
import com.ohgiraffers.model.dto.MenuDTO;

import java.util.List;
import java.util.Scanner;

public class MenuView {

    private MenuService menuService = new MenuService();
    public void displayMainMenu() {

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("======= 음식 추가 프로그램 ======");

            CategoryDTO newCategory = new CategoryDTO();
            System.out.print("등록할 카테고리를 입력해주세요 : ");
            Object inputCategory = sc.nextLine();
            newCategory.setName((String) inputCategory);
            newCategory.setRefCategoryCode(null);

            MenuDTO newMenu = new MenuDTO();
            System.out.print("등록할 이름을 입력해주세요 : ");
            String inputName = sc.nextLine();
            newMenu.setName(inputName);

            System.out.print("등록할 가격을 입력해주세요 : ");
            int intputPrice = sc.nextInt();
            newMenu.setPrice(intputPrice);

            newMenu.setCategoryList((List<CategoryDTO>) inputCategory);

            System.out.print("주문 가능 상태를 입력해주세요 : ");
            String inputStatus = sc.nextLine();
            newMenu.setOrderableStatus(inputStatus);

            int result = MenuService.registNewMenu(MenuDTO);
        }

    }
}
