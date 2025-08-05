import React, { useState } from 'react';
import './App.css';
import CurrencyConverter from './CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    alert("Hello! Member!");
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = (event) => {
    alert("I was clicked");
    console.log(event);
  };

  return (
    <div className="App">

      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
      <br/>
      <button onClick={decrement}>Decrement</button>
      <br/>
      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
      <br/>
      <button onClick={handleClick}>Click On Me</button>
      <br/>
      <CurrencyConverter />
    </div>
  );
}

export default App;