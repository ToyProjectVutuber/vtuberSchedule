import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";

const daysOfWeek = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

function App() {
  const today = new Date();
  const [currentDate, setCurrentDate] = useState(
    new Date(today.getFullYear(), today.getMonth(), 1)
  );

  const year = currentDate.getFullYear();
  const month = currentDate.getMonth();

  const firstDay = new Date(year, month, 1).getDay();
  const daysInMonth = new Date(year, month + 1, 0).getDate();

  const prevMonth = () => {
    setCurrentDate(new Date(year, month - 1, 1));
  };

  const nextMonth = () => {
    setCurrentDate(new Date(year, month + 1, 1));
  };

  const dates = [];
  for (let i = 0; i < firstDay; i++) {
    dates.push(null);
  }
  for (let i = 1; i <= daysInMonth; i++) {
    dates.push(i);
  }

  return (
    <>
      <div className="calendar-container">
        <div className="calendar-header">
          <button onClick={prevMonth}>◀</button>
          <h2>
            {year}년 {month + 1}월
          </h2>
          <button onClick={nextMonth}>▶</button>
        </div>
        <div className="calendar-grid">
          {daysOfWeek.map((day) => (
            <div key={day} className="calendar-day-name">
              {day}
            </div>
          ))}
          {dates.map((date, index) => (
            <div
              key={index}
              className="calendar-day"
              onClick={() => {
                console.log("date!!!!!");
              }}
            >
              {date ? date : ""}
            </div>
          ))}
        </div>
      </div>
    </>
  );
}

export default App;

type Timetable = {
  [day: number]: string[];
};
