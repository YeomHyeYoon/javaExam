package java16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ToListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList=Arrays.asList(
				new Student("염혜윤",100,Student.Gender.FEMALE,Student.City.Jinju),
				new Student("강재민",1,Student.Gender.MALE,Student.City.Seoul),
				new Student("권여진",99,Student.Gender.FEMALE,Student.City.Jinju),
				new Student("민지연",98,Student.Gender.FEMALE,Student.City.Jinju)
				);
		
		Set<Student> mailStudent= studentList.stream().filter((s)->s.getGender()==Student.Gender.MALE)
				.collect(Collectors.toSet());
		
		mailStudent.stream().forEach(s->System.out.println(s.getName()));
		
		
		Stream<Student> studentStream=studentList.stream();
		Stream<Student> maliStream=studentStream.filter(s->s.getGender()==Student.Gender.MALE);
		Set<Student> set=maliStream.collect(Collectors.toSet());
		set.stream().forEach(s->System.out.println(s.getName()));
		
		Stream<Student> studentStream2=studentList.stream();
		Stream<Student> femaliStream=studentStream2.filter(s->s.getGender()==Student.Gender.FEMALE);
		Supplier<HashSet<Student>> supplier=HashSet::new;
		Collector<Student,?,HashSet<Student>> collector=Collectors.toCollection(supplier);
		Set<Student> femaleSet=femaliStream.collect(collector);
		femaleSet.forEach(s->System.out.println(s.getName()));
		
		
	}

}
