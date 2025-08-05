import React, { useState } from 'react';
import Greeting from './components/Greeting';
import LoginButton from './components/LoginButton';
import LogoutButton from './components/LogoutButton';
import FlightDetails from './components/FlightDetails';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <LogoutButton onClick={handleLogoutClick} />
      ) : (
        <LoginButton onClick={handleLoginClick} />
      )}
      <Greeting isLoggedIn={isLoggedIn} />
      <FlightDetails canBook={isLoggedIn} />
    </div>
  );
}

export default App;
