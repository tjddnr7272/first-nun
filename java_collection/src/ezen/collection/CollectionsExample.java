package ezen.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 콜렉션과 관련된 공통 메소드를 제공하는 유틸리티 클래스
 * @author 김성욱
 * @Date 2023 .1 .25
 */
public class CollectionsExample {

	public static void main(String[] args) {
        Integer[] scores = {88, 70, 100, 60, 85};
//        List<Integer> list =  Arrays.asList(scores);
        List<Integer> list =  Arrays.asList(88, 70 , 100, 60, 85);
        for (Integer integer : list) {dasasddasasdasdasdasdasd
        	System.out.println(integer);
			
		}
        
        
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
        
//        Collections.shuffle(list);
//        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);
        
        List<String> list2 = new ArrayList<>();
        list2.add("김성욱");
        list2.add("박성욱");
        list2.add("홍성욱");
        list2.add("Jack");
        list2.add("Adam");
        Collections.sort(list2);
        System.out.println(list2);
        
        List<Student> list3 = new ArrayList<>();
        list3.add(new Student("철수",1,30));
        list3.add(new Student("영희",2,10));
        list3.add(new Student("Jack",3,20));
//        Collections.sort(list3);
        
        // 학생 이름으로 정렬
         Collections.sort(list3, new NameComparator());
        // 성적으로 정렬
         Collections.sort(list3, new ScoreComparator());
         
         System.out.println(list3);    
         
        
        
        
        
        
        
        
        
	}

}
