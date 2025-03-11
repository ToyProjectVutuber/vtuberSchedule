package vtuberSchedule.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Schedule {
	@Id
	private Long id;
	private String vtuberName;
	private String scheduleTime;
	
}
