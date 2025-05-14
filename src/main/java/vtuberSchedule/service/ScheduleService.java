package vtuberSchedule.service;

import org.springframework.stereotype.Service;
import vtuberSchedule.form.CheckboxForm;
import vtuberSchedule.model.entity.Schedule;
import vtuberSchedule.model.repository.ScheduleRepository;
import java.util.List;

@Service
public class ScheduleService {
	private final ScheduleRepository repository;

	public ScheduleService(ScheduleRepository repository) {
		this.repository = repository;
	}

	// 전체 데이터 찾기
	public List<Schedule> getAllSchedules() {
		return repository.findAll();
	}
	
	public Schedule saveSchedule(CheckboxForm form) {
		Schedule schedule = new Schedule();
		schedule.setVtuberName(form.getCheckList().get(0));
		schedule.setScheduleTime(form.getCheckList().get(1));
		return repository.save(schedule);
	}

	// 특정 데이터 찾기

	// 나중에 추가 비즈니스 로직 구현하기
}
