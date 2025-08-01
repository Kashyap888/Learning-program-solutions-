import React from "react";
import "./App.css";

function App() {
  const office1 = {
    name: "Skyline Tower",
    rent: 55000,
    address: "MG Road, Bangalore",
    image: "/office1.jpg"
  };

  const offices = [
    {
      name: "Skyline Tower",
      rent: 55000,
      address: "MG Road, Bangalore",
      image: "/office1.jpg"
    },
    {
      name: "Tech Park One",
      rent: 75000,
      address: "Indiranagar, Bangalore",
      image: "/office2.jpg"
    },
    {
      name: "Ocean View Office",
      rent: 60000,
      address: "Marine Drive, Mumbai",
      image: "/office3.jpg"
    }
  ];

  return (
    <div className="App">
      <h1 className="heading">Office Space , at Affordable Range</h1>

      <h2>Featured Office</h2>
      <img src={office1.image} alt={office1.name} className="office-image" />

      <p><strong>Name:</strong> {office1.name}</p>
      <p
        style={{
          color: office1.rent > 60000 ? "green" : "red"
        }}
      >
        <strong>Rent:</strong> ₹{office1.rent}
      </p>
      <p><strong>Address:</strong> {office1.address}</p>

      <h2>Available Office Spaces</h2>
      {offices.map((office, index) => (
        <div key={index} className="office-card">
          <img
            src={office.image}
            alt={office.name}
            className="office-image"
          />
          <p><strong>Name:</strong> {office.name}</p>
          <p
            style={{
              color: office.rent > 60000 ? "green" : "red"
            }}
          >
            <strong>Rent:</strong> ₹{office.rent}
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
