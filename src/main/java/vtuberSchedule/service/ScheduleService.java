package vtuberSchedule.service;

import vtuberSchedule.model.entity.Schedule;
import vtuberSchedule.model.repository.ScheduleRepository;

import java.util.List;

public class ScheduleService {
	private final ScheduleRepository repository;
	
	public ScheduleService(ScheduleRepository repository) {
		this.repository = repository;
	}
	
	public List<Schedule> getAllSchedules() {
		return repository.findAll();
	}
	
	// 나중에 추가 비즈니스 로직 구현하기!
}
