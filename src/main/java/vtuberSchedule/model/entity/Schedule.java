package vtuberSchedule.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Schedule")
@Data
public class Schedule {
	@Id
	private Long id;
	
	@Column(name = "vtuberName")
	private String vtuberName;
	
	@Column(name = "scheduleTime")
	private String scheduleTime;
	
}
