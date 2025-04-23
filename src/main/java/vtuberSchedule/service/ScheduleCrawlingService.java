// package vtuberSchedule.service;
//
// import org.jsoup.Jsoup;
// import org.jsoup.nodes.Document;
// import org.jsoup.nodes.Element;
// import org.jsoup.select.Elements;
// import org.springframework.context.annotation.Bean;
// import org.springframework.scheduling.annotation.Scheduled;
// import org.springframework.stereotype.Service;
// import vtuberSchedule.model.entity.Schedule;
// import vtuberSchedule.model.repository.ScheduleRepository;
// import java.io.IOException;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
//
// @Service
// public class ScheduleCrawlingService {
//
// 	private final ScheduleRepository scheduleRepository;
//
// 	public ScheduleCrawlingService(ScheduleRepository scheduleRepository) {
// 		this.scheduleRepository = scheduleRepository;
// 	}
//
// 	// 예시: 매 시간 정각에 실행 (cron 표현식은 필요에 따라 변경)
// 	@Scheduled(cron = "0 0 * * * ?")
// 	public void crawlAndStore() {
// 		// 실제 크롤링할 URL을 나중에 입력하기
// 		String url = "https://example.com/schedule";
// 		try {
// 			Document doc = Jsoup.connect(url).get();
// 			// 예시로, div.schedule 안에 각 스케줄 정보가 있다고 가정
// 			Elements scheduleElements = doc.select("div.schedule");
//
// 			// DateTimeFormatter: 사이트에서 반환하는 날짜/시간 포맷에 맞게 설정
// 			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//
// 			for (Element element : scheduleElements) {
// 				String title = element.select("h2").text();
// 				String startTimeStr = element.select("시간").text();
// 				// String endTimeStr = element.select("span.end-time").text();
//
// 				// 취득한 문자열을 LocalDateTime으로 변환 (포맷은 실제 데이터에 맞춰 조정)
//
// 				// Schedule 엔티티 생성 (id는 필요에 따라 자동 생성 전략을 설정해야 함)
// 				Schedule schedule = new Schedule();
// 				// 예시로, id를 현재 시간의 Epoch 초 값으로 설정 (실제 프로젝트에서는 ID 생성 전략을 별도로 구성)
// 				schedule.setId(System.currentTimeMillis());
// 				schedule.setVtuberName(title);
// 				schedule.setScheduleTime(startTimeStr);
//
// 				// DB에 저장 (이미 존재하는 데이터 처리 로직은 추가 가능)
// 				scheduleRepository.save(schedule);
//
// 				System.out.println("Saved schedule: " + title);
// 			}
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }