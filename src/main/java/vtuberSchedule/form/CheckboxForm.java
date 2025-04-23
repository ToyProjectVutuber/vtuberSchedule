package vtuberSchedule.form;

import java.util.List;
import javax.swing.JOptionPane;
import javax.validation.constraints.NotEmpty;


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
