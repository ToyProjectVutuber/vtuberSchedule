package vtuberSchedule.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vtuberSchedule.form.CheckboxForm;
import vtuberSchedule.model.repository.VtuberRepository;
import vtuberSchedule.service.ScheduleService;

@Controller
@RequestMapping("/checkList")
public class CheckListController {
	
	private final VtuberRepository repository;
	
	public CheckListController(VtuberRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public String showCheckList(Model model) {
		model.addAttribute("vtubers", new CheckboxForm());
		return "checkList";
	}
}
