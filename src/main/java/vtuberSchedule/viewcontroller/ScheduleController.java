package vtuberSchedule.viewcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vtuberSchedule.model.entity.Schedule;
import vtuberSchedule.service.ScheduleService;
import java.util.List;

@Controller
public class ScheduleController {
	private final ScheduleService service;
	
	// 주석 추가하기(?)
	@Autowired
	public ScheduleController(ScheduleService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public String showSchedules(Model model) {
		List<Schedule> schedules = service.getAllSchedules();
		model.addAttribute("schedules", schedules);
		System.out.println("개씨발");
		return "scheduleView";
	}
}
