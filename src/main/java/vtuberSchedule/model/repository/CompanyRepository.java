package vtuberSchedule.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vtuberSchedule.model.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, String> {
	// 추가 쿼리 및 메소드 정의
}
