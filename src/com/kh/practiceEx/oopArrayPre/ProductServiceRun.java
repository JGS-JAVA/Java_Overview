//package com.kh.practiceEx.oopArrayPre;
//
//import java.util.Scanner;
//
//public class ProductServiceRun {
//    public static void main(String[] args) {
//        ProductService productService = new ProductService();
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("이름 입력: ");
//        String inputName = scanner.nextLine();
//        System.out.println("가격 입력: ");
//        int inputPrice = scanner.nextInt();
//
//        String inputDescription;
//        String inputCategory;
//
//        System.out.println("카테고리와 설명 입력? (YES/NO) ");
//        String inputQ = scanner.next();
//        if (inputQ.equals("YES")) {
//            System.out.println("설명 입력: ");
//            String inputDescription = scanner.nextLine();
//            System.out.println("카테고리 입력: ");
//            String inputCategory = scanner.nextLine();
//
//        } else if(inputQ.equals("NO")) {
//            System.out.println("추후 수정가능");
//
//             inputDescription = "설명 없음";
//             inputCategory = "없음";
//        } else {
//            System.out.println("입력 오류");
//
//        }
//        Product product = new Product(inputName,inputPrice);
//        //이름과 가격 셋 필요없음
//        product.setDescription(inputDescription);
//        product.setCategory(inputCategory);
//        productService.addProduct(product);
//
//        productService.viewProducts();
//
//        Product p1 = new Product("스마트폰", 100000);
//        p1.setDescription("최신, 12/24 출고");
//        p1.setCategory("전자기기");
//
//        Product p2 = new Product("노트북", 150000);
//        if (p2.getDescription() == null || p2.getDescription().equals("")) {
//            p2.setDescription("없음");
//        }
//
//        if(p2.getCategory() == null || p2.getCategory().equals("")) {
//            p2.setCategory("없음");
//        }
//
//        productService.addProduct(p1);
//        productService.addProduct(p2);
//
//        productService.viewProducts();
//        Product sp = productService.searchProduct("노트북");
//       if ( productService.searchProduct("노트북") != null){
//           System.out.println(sp);
//       } else {
//           System.out.println("해당제품 없음");
//       }
//    }
//}
