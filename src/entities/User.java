package entities;

public class User {
  private String name;
  private int age;
  private int userId;
  
  public User(int userId, String name,int age) {
	  setUserId(userId);
	  setName(name);
	  setAge(age);
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}
}
