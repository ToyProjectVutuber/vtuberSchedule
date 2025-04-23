package vtuberSchedule.model.repository;

import vtuberSchedule.model.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
	// 추가 쿼리 및 메소드 정의
	
}
