package vtuberSchedule.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vtuberSchedule.model.entity.Vtuber;

public interface VtuberRepository extends JpaRepository<Vtuber, String> {
	// 추가 쿼리 및 메소드 정의
}
