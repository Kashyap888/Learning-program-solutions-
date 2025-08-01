import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 45 },
    { name: "Rahul", score: 75 },
    { name: "Shreyas", score: 35 },
    { name: "Pant", score: 90 },
    { name: "Hardik", score: 60 },
    { name: "Jadeja", score: 100 },
    { name: "Bumrah", score: 50 },
    { name: "Shami", score: 88 },
    { name: "Kuldeep", score: 40 },
    { name: "Ashwin", score: 92 }
  ];
    const players70 = players.filter(item => item.score < 70);

  return (
    <div>
        <h2>List of Players</h2>
        <ul>
            {players.map((item, idx) => (
            <li key={idx}>{item.name} - {item.score}</li>
            ))}
        </ul>

    
    <h2>List of Players having Scores Less than 70</h2>
    <ul>  
      {players70.map((item, idx) => (
        <li key={idx}>{item.name} - {item.score}</li>
      ))}
    </ul>
 </div>
  );
}
export default ListofPlayers;
