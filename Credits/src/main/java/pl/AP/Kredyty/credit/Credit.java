package pl.AP.Kredyty.credit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table
public class Credit {

	@javax.persistence.Id
	@SequenceGenerator(
			name = "credit_sequence",
			sequenceName = "credit_sequence",
			allocationSize = 1
			
			)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="credit_sequence"
			)
	private int Id;
	private String Name;
	public Credit(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public Credit(String name) {
		super();
		Name = name;
	}
	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Credit [Id=" + Id + ", Name=" + Name + "]";
	}
	
	
}
