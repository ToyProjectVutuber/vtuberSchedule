package vtuberSchedule.form;

import lombok.Data;

import java.util.List;
import javax.validation.constraints.NotEmpty;

@Data
public class CheckboxForm {
	@NotEmpty(message = "최소 한개 선택")
	private List<String> checkList;
	
	public List<String> getCheckList() {
		return checkList;
	}
	
	public void setCheckList(List<String> checkList) {
		this.checkList = checkList;
	}
	
}
