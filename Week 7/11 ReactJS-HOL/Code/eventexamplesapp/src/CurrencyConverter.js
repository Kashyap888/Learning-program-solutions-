import React, { useState } from 'react';

function CurrencyConverter() {
  const [rupees, setRupees] = useState('');
  const [convertedAmount, setConvertedAmount] = useState('');
  const [currency, setCurrency] = useState('EUR');

  const conversionRates = {
    EUR: 0.011
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    const rupeesValue = parseFloat(rupees);
    if (!isNaN(rupeesValue)) {
      const rate = conversionRates[currency];
      const result = (rupeesValue * rate).toFixed(2);
      setConvertedAmount(result);

      if (currency === 'EUR') {
        alert(`Converting to Euro. Amount is ${result}`);
      }
    } else {
      setConvertedAmount('');
    }
  };

  return (
    <div>
      <h1 style={{ color: 'green' }}>Currency Converter !!!</h1>

      <form onSubmit={handleSubmit} className="currency-form">
        <label htmlFor="amount">Amount:</label>
        <input
          id="amount"
          type="number"
          placeholder="Enter amount in INR"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
        <br/>
        <label>Currency Type:</label>
        <select
          id="currency"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        >
          <option value="EUR">Euro (EUR)</option>
        </select>
        <br/>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConverter;
