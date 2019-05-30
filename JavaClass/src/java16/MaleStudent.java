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
	
	public void accmulate(Student student) {
		list.add(student);
		System.out.println("["+Thread.currentThread().getName()+"] accmulate()");
	}
	
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("["+Thread.currentThread().getName()+"] combine()");
	}

	private List<Student> getList() {
		
		return list;
	}
	
	
}
