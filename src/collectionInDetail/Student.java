package collectionInDetail;

public class Student {

	private int id;
	private String name;
	
	
	Student(int id, String name){
		this.setId(id);
		this.setName(name);
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Student arg0) {
		return this.id==arg0.getId();
	}
	
	
	
	
}
