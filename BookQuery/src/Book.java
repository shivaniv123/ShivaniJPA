import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private String title;
	
	private Double price;
}
