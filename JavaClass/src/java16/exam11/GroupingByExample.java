package java16.exam11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class GroupingByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> totalList=Arrays.asList(
				new Student("염혜윤",10,Student.Gender.FEMALE,Student.City.Jinju),
				new Student("용팔",20,Student.Gender.MALE,Student.City.Jinju),
				new Student("여진",30,Student.Gender.FEMALE,Student.City.Jinju),
				new Student("지연",40,Student.Gender.FEMALE,Student.City.Seoul),
				new Student("재민",50,Student.Gender.MALE,Student.City.Seoul)
				);
		
		Map<Student.Gender,List<Student>> mapByGender=totalList.stream().collect(Collectors.groupingBy(s->s.getGender()));
		
		System.out.println("[남학생]: ");
		
		mapByGender.get(Student.Gender.MALE).stream().forEach(s->System.out.println(s.getName()));
		
		System.out.println("[진주 거주]: ");
		
		Map<Student.City,Set<Student>> mapByCity=totalList.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.toSet()));
		
		mapByCity.get(Student.City.Jinju).stream().forEach(s->System.out.println(s.getName()));
		
	
	}

}
