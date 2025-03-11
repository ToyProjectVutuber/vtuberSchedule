package vtuberSchedule.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vtuberSchedule.model.entity.Schedule;
import vtuberSchedule.service.ScheduleService;
import java.util.List;

@Controller
public class ScheduleController {
	private final ScheduleService service;
	
	public ScheduleController(ScheduleService service) {
		this.service = service;
	}
	
	@GetMapping("/schedules")
	public String showSchedules(Model model) {
		List<Schedule> schedules = service.getAllSchedules();
		model.addAttribute("schedules", schedules);
		return "scheduleView";
		
	}
}
