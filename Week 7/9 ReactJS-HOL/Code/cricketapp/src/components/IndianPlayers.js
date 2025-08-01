import React from 'react';

const IndianPlayers = () => {
  const T20players = ["Virat", "Rohit", "SKY"];
  const RanjiTrophyPlayers = ["Raina", "Dhoni", "Rahul"];
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];
  const [odd1, even1, odd2, even2, odd3, even3] = allPlayers;

  return (
    <div>
      <h3>Odd Team</h3>
      <ul>
        <li>First: {odd1}</li>
        <li>Third: {odd2}</li>
        <li>Fifth: {odd3}</li>
      </ul>

      <h3>Even Team</h3>
      <ul>
        <li>Second: {even1}</li>
        <li>Fourth: {even2}</li>
        <li>Sixth: {even3}</li>
      </ul>
       <h2>List of Indian Players Merged:</h2>
        <ul>
            {allPlayers.map((player, index) => (
            <li key={index}>{player}</li>
            ))}
        </ul>
    </div>
  );
};

export default IndianPlayers;
