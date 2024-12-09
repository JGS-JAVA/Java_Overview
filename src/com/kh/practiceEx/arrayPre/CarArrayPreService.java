package com.kh.practiceEx.arrayPre;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class CarArrayPreService {



        public void carMethod1 () {
            CarArrayPre[] cars = {
                    new CarArrayPre("현대", "소나타", 2020),
                    new CarArrayPre("기아", "쏘렌토", 2019),
                    new CarArrayPre("아우디", "A6", 2022),

            };
            System.out.println(cars);
            System.out.println(Arrays.toString(cars));

            //버블 정렬 알고리즘
            //배열의 인접한 두 값을 비교해 조건에 따라 위치바꿈
            //반복후 최대값이 끝으로 이동
            //반복횟수 줄이면서 정렬완료
            // DB 에서 ORDER BY ASC 로 가나다순 정렬가능
            // SELECT * FROM CAR ORDER BY BRAND = ASC;
            for (int i = 0; i < cars.length-1; i++) { // 마지막은 제일큰거라서 비교 안함
                for (int j = 0; j < cars.length-1; j++) {
                    //브랜드 이름 비교해 가나다순에서 결과가 0보다 크면 값 위치 교체
                    if (cars[i].brand.compareTo(cars[j + 1].brand) > 0) { //  가나다순이면 음수, 역순이면 양수
                        CarArrayPre temp = cars[i]; //찾은값을 temp 에 저장
                        cars[i] = cars[j + 1]; // 비교시 가나다순으로 앞에 있을 단어를 앞으로 변경
                        cars[j + 1] = temp; // 비교시 가나다순으로 뒤에 있을 단어를 뒤로 변경
                        // 바지 가방 -> 가방 바지

                        Arrays.fill(cars, new CarArrayPre("BMW", "X5", 2018));
                        System.out.println(cars);

                        CarArrayPre[] carsEquals = {
                                new CarArrayPre("현대", "소나타", 2020),
                                new CarArrayPre("기아", "쏘렌토", 2019),
                                new CarArrayPre("아우디", "A6", 2022),
                        };
                        boolean carsEqual = Arrays.equals(carsEquals, cars);
                        System.out.println(carsEquals);
                    }

                }
            }
        }

    public static void main(String[] args) {
        CarArrayPreService carArrayPreService = new CarArrayPreService();
        carArrayPreService.carMethod1();

    }
    }
