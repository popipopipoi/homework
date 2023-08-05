package com.ohgiraffers.section01.model.service;

import com.ohgiraffers.section01.model.dto.CategoryDTO;
import com.ohgiraffers.section01.model.dto.MenuDTO;

import java.util.Scanner;

public class MenuView {

    private MenuService menuService = new MenuService();
    public void displayMainMenu() {

        Scanner sc = new Scanner(System.in);
        CategoryDTO newCategory = new CategoryDTO();
        MenuDTO newMenu = new MenuDTO();


            System.out.println("======= 음식 추가 프로그램 ======");

            System.out.print("등록할 카테고리를 입력해주세요 : ");
            String inputCategory = sc.nextLine();
            System.out.print("등록할 상위 카테고리를 코드를 입력해주세요 : ");
            int inputRdfCategoryCode = sc.nextInt();
            sc.nextLine();
            newCategory.setName(inputCategory);
            newCategory.setRefCategoryCode(inputRdfCategoryCode);


            System.out.print("등록할 메뉴 이름을 입력해주세요 : ");
            String inputName = sc.nextLine();
            newMenu.setName(inputName);

            System.out.print("등록할 가격을 입력해주세요 : ");
            int intputPrice = sc.nextInt();
            newMenu.setPrice(intputPrice);
            sc.nextLine();

            newMenu.setCategoryCode(newCategory);

            System.out.print("주문 가능 상태를 입력해주세요 : ");
            String inputStatus = sc.nextLine();
            newMenu.setOrderableStatus(inputStatus);

            int result = MenuService.registNewMenu(newMenu);

            if(result > 0) {
            System.out.println("신규 카테고리 등록과 신규 메뉴 등록이 완료 되었습니다.");
        } else {
            System.out.println("신규 카테고리 등록과 신규 메뉴 등록에 실패 하였습니다.");
        }

    }
}
