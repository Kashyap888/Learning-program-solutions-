import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  const [view, setView] = useState("book");
  const [showList, setShowList] = useState(true);

  const courseList = [
    { id: 1, name: "React Basics", duration: "4 weeks" },
    { id: 2, name: "React Hooks", duration: "3 weeks" },
    { id: 3, name: "React Router", duration: "2 weeks" }
  ];

  const renderIfElse = () => {
    if (view === "book") {
      return <BookDetails />;
    } else if (view === "blog") {
      return <BlogDetails />;
    } else {
      return <CourseDetails />;
    }
  };

  const renderSwitch = () => {
    switch (view) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return <p>No view selected</p>;
    }
  };

  return (
    <div className="app-container">
      <h1>Blogger App</h1>

      <div className="button-group">
        <button onClick={() => setView("book")}>Show Book</button>
        <button onClick={() => setView("blog")}>Show Blog</button>
        <button onClick={() => setView("course")}>Show Course</button>
      </div>

      <hr />

      <h3>If-Else Rendering</h3>
      {renderIfElse()}

      <hr />

      <h3>Switch Statement Rendering</h3>
      {renderSwitch()}

      <hr />

      <h3>Ternary Operator Rendering</h3>
      {view === "book" ? <BookDetails /> : <BlogDetails />}

      <hr />
      <h3>Logical && Rendering</h3>
      {view === "course" && <CourseDetails />}

      <hr />
      <h3>Course List</h3>
      <button onClick={() => setShowList(!showList)}>
        {showList ? "Hide List" : "Show List"}
      </button>
      {showList && (
        <ul>
          {courseList.map(course => (
            <li key={course.id}>
              {course.name} - {course.duration}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default App;
