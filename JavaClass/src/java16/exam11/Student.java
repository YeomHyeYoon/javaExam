package java16.exam11;

/**
 * @author yuni5
 *
 */
public class Student {
	
	
	public enum Gender{
		MALE,
		FEMALE
	}
	
	public enum City{
		Seoul,
		Jinju
	}
	
	private String name;
	private int score;
	private Gender gender;
	private City city;
	
	public Student(String name,int score,Gender gender,City city) {
		this.name=name;
		this.score=score;
		this.gender=gender;
		this.city=city;
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
}
