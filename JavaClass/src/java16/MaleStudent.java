package java16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaleStudent {

	
	private List<Student> list;
	
	public MaleStudent() {
		
		list=new ArrayList<Student>();  //남학생이 수집될 필드
		System.out.println("["+Thread.currentThread().getName()+"] MaleStudent() 생성자 실행");
	}
	
	public void accumulate(Student student) { //요소 수집 메서드
		list.add(student);
		System.out.println("["+Thread.currentThread().getName()+"] accumulate()");
	}
	
	public void combine(MaleStudent other) { // 두 MaleStudent를 결합
		list.addAll(other.getList());
		System.out.println("["+Thread.currentThread().getName()+"] combine()");
	}

	public List<Student> getList() { //요소가 저장된 컬렉션을 리턴
		return list;
	}
	
	
}
