import React from 'react';

function FlightDetails({ canBook }) {
  const flights = [
    { id: 1, from: 'Bangalore', to: 'Delhi', time: '10:00 AM' },
    { id: 2, from: 'Mumbai', to: 'Chennai', time: '2:00 PM' },
    { id: 3, from: 'Kolkata', to: 'Hyderabad', time: '6:00 PM' },
  ];

  return (
    <div style={{ marginTop: '20px' }}>
      <h3>Available Flights</h3>
      <ul>
        {flights.map(flight => (
          <li key={flight.id}>
            {flight.from} → {flight.to} at {flight.time}
            {canBook && <button style={{ marginLeft: '10px' }}>Book</button>}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default FlightDetails;
