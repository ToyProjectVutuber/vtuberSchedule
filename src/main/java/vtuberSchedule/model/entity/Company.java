package vtuberSchedule.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.Data;

@Entity
@Table(name = "company")
@Data
public class Company {
	@Id
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
}
