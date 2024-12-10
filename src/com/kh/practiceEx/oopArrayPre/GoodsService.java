package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class GoodsService {
    //상품 담을 리스트
    private ArrayList<Goods> goodsList = new ArrayList<>();

    //상품 추가
    public void addGoods(Goods goods) {
        goodsList.add(goods);
        System.out.println(goods.getName() + "추가완료");
    }

    public Goods getGoodsById(int id) {   //상품전체를 가져온 뒤
        for (Goods goods : goodsList) { //Goods에 번호 이름 수량 가격 포함
            if (goods.getId() == id) {
                return goods;        //일치하는 상품 가져오기
            }
        }
        System.out.println(id + "번 상품없음");
        return null;
    }

    public Goods getGoodsByName(String name) {  //Goods 전체 가져와서
        for (Goods goods : goodsList) {
            if (goods.getName().equalsIgnoreCase(name)) {
                return goods;                  //일치하는 goods 반환
            }
        }
        System.out.println(name + "상품없음");

        return null;
    }

    public void displayAllGoods() {

        if (goodsList.isEmpty()) {
            System.out.println("상품 없음");

        } else {
            System.out.println("상품 목록");
            for (Goods goods : goodsList) {
                System.out.println(goods);
            }

        }
    }

    public void removeGoodsById(int id) {

        Goods toGoods = null;
        if(toGoods == null) {
            System.out.println(id + "번 상품없음 삭제불가");

        }else {
            System.out.println(id + "번 상품 삭제완료");

        }
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                goodsList.remove(goods);
                break;
            }
        }

    }


}
