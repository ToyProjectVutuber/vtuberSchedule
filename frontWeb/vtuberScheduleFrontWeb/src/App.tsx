import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";

function App() {
  const daysInJanuary = Array.from({ length: 31 }, (_, i) => i + 1); // 각 날짜에 대한 시간표 데이터 (예시)
  const [timetable, setTimetable] = useState<Timetable>({
    1: ["Math", "English", "History"],
    2: ["Science", "Math", "PE"],
    3: ["Geography", "Art", "Music"],
    4: ["Physics", "Math", "Literature"],
    5: ["History", "Chemistry", "PE"],
    6: ["English", "Art", "Biology"], // 필요한 날짜를 추가
    7: ["Physics", "History", "Music"],
    8: ["Math", "Geography", "Art"], // 나머지 날짜들도 추가 가능...
  });
  const [selectedValue, setSelectedValue] = useState<number | undefined>();
  const [isOpen, setIsOpen] = useState<boolean>(false); // 시간표를 추가하는 함수 (임시 데이터 추가용)
  const addTimetable = (day: number, subjects: string[]) => {
    setTimetable((prevState) => ({
      ...prevState,
      [day]: subjects,
    }));
  }; // 날짜 클릭 시 처리할 함수
  const handleDayClick = (day: number) => {
    // 해당 날짜를 사용해 필요한 작업을 처리할 수 있습니다.
    // 예시로 콘솔에 해당 날짜의 시간표를 출력합니다.
    console.log(`Day ${day}clicked`);
    console.log("Schedule:", timetable[day] || "No schedule");
    setSelectedValue(day);
    setIsOpen(true); // 예시로 시간표를 추가하는 로직을 호출
    addTimetable(day, ["New Subject 1", "New Subject 2"]);
  };

  return (
    <>
      <div>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <div className="timetable">
        <h2>January 2025 Timetable</h2>
        <div className="calendar">
          {daysInJanuary.map((day) => (
            <div
              key={day}
              className="day"
              onClick={() => handleDayClick(day)} // 클릭 시 handleDayClick 함수 호출
            >
              <div className="day-header">{day}</div>
              <div className="day-content">
                {timetable[day] ? (
                  <ul>
                    {timetable[day].map((subject, index) => (
                      <li key={index}>{subject}</li>
                    ))}
                  </ul>
                ) : (
                  <p>No schedule</p>
                )}
              </div>
            </div>
          ))}
        </div>
        <div
          className="selectedModal"
          style={{ display: isOpen ? "block" : "none" }}
        >
          {selectedValue}
          <button
            onClick={() => {
              setIsOpen(false);
            }}
          >
            {"close"}
          </button>
        </div>
      </div>
    </>
  );
}

export default App;

type Timetable = {
  [day: number]: string[];
};
