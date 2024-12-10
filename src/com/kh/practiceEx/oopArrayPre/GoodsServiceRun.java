package com.kh.practiceEx.oopArrayPre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("상품 설정 시스템");
            System.out.println("1.상품 추가");
            System.out.println("2.모든상품 보기(id 조회)");
            System.out.println("3.특정상품 보기(id 조회)");
            System.out.println("4.특정상품 제거(id 조회)");
            System.out.println("5.종료");
            System.out.print("번호 선택");
            try {

            int choice = scanner.nextInt();
            scanner.nextLine(); //줄바꿈 버퍼 제거
            // ctrl alt T 감싸기 단축키
                switch (choice) {
                    case 1:
                        System.out.println(" 상품을 추가합니다 ");
                        System.out.println(" 상품번호: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(" 상품이름: ");
                        String name = scanner.nextLine();
                        System.out.println(" 상품가격: ");
                        int price = scanner.nextInt();
                        System.out.println(" 상품수량: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
    
                        Goods goods = new Goods(name, price, id, quantity);
                        goodsService.addGoods(goods);
                        System.out.println(" 상품을 추가가 완료되었습니다. ");
                        break;
                    case 2:
                        System.out.println(" 모든상품을 조회합니다 ");
                        goodsService.displayAllGoods();
                        break;
                    case 3:
                        System.out.println(" 상품을 조회합니다 ");
                        System.out.println(" 상품번호: ");
                        int indNum = scanner.nextInt();
                        scanner.nextLine();
                        goodsService.getGoodsById(indNum); //전달인자는 자료형 안붙인다
                        break;
                    case 4:
                        System.out.println(" 상품을 제거합니다 ");
                        System.out.println(" 상품번호: ");
                        int removeNum = scanner.nextInt();
                        goodsService.removeGoodsById(removeNum);
                        System.out.println(" 상품을 제거가 완료되었습니다. ");
                        break;
                    case 5:
                        System.out.print("종료");
                        return;
                    default:
                        System.out.print("입력 오류");
                        break;
                } catch (InputMismatchException e){  //숫자칸에 문자넣음
                    System.out.print("숫자만 가능"+ e.getMessage());
                    scanner.nextLine(); //예외발생시 입력버퍼에 남은 오류값 지우기
                }
                
            } catch (Exception e) {
                System.out.print("숫자만 가능"+ e.getMessage());

            } finally {          //실행 반복문이 우선이라 작동 안함
                System.out.print("종료");

            }
        }
    }
}
