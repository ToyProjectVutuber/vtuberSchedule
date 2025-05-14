package vtuberSchedule.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.Data;
import lombok.Getter;

@Getter
@Entity
@Table(name = "vtuber")
@Data
public class Vtuber {
	@Id
	@Column(name = "code")
	private String code;
	
	@Column(name = "vtuber")
	private String vtuber;
	
	public Vtuber() {}
	public Vtuber(String code, String vtuber) {
		this.code = code;
		this.vtuber = vtuber;
	}
}