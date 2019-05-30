package java16.exam11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList=Arrays.asList(
				new Student("염혜윤",100),
				new Student("강재민",1),
				new Student("권여진",99),
				new Student("민지연",98)
				);
		
		
		int sum1=studentList.stream().mapToInt(Student::getScore).sum();
		
		int sum2=studentList.stream().map(Student::getScore).reduce((a,b)->a+b).get();
		
		int sum3= studentList.stream().map(Student::getScore).reduce(0, (a,b)->a+b);

		
		System.out.println(sum1+"  "+sum2+"  "+sum3);
		
	}

}
