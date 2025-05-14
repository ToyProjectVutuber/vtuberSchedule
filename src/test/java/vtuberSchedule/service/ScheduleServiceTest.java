package vtuberSchedule.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import vtuberSchedule.model.entity.Schedule;
import vtuberSchedule.model.repository.ScheduleRepository;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ScheduleServiceTest {
	
	@Mock
	private ScheduleRepository repository;
	
	@InjectMocks
	private ScheduleService service;
	
	private Schedule s1, s2;
	
	@BeforeEach
	void setUp() {
		s1 = new Schedule();
		s1.setId(1L);
		s1.setVtuberName("AZKi");
		s1.setScheduleTime("2025-05-01 20:00");
		
		s2 = new Schedule();
		s2.setId(2L);
		s2.setVtuberName("Gawr Gura");
		s2.setScheduleTime("2025-05-02 18:00");
	}
	
	@Test
	void getAllSchedules_shouldReturnAll() {
		// given
		when(repository.findAll()).thenReturn(Arrays.asList(s1, s2));
		
		// when
		List<Schedule> result = service.getAllSchedules();
		
		// then
		assertThat(result).hasSize(2).containsExactly(s1, s2);
			verify(repository, times(1)).findAll();
		}

}