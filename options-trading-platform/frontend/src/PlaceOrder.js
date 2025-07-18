import React, { useState } from 'react';

function PlaceOrder() {
  const [broker, setBroker] = useState('zerodha');
  const [symbol, setSymbol] = useState('');
  const [quantity, setQuantity] = useState(1);
  const [orderType, setOrderType] = useState('BUY');

  const handleSubmit = (e) => {
    e.preventDefault();
    // TODO: Call backend /api/broker/order/{broker}
    alert(`Order placed: ${broker}, ${symbol}, ${quantity}, ${orderType}`);
  };

  return (
    <div>
      <h2>Place Order</h2>
      <form onSubmit={handleSubmit}>
        <select value={broker} onChange={e => setBroker(e.target.value)}>
          <option value="zerodha">Zerodha</option>
          <option value="upstox">Upstox</option>
          <option value="angelone">AngelOne</option>
        </select>
        <br />
        <input
          type="text"
          placeholder="Symbol"
          value={symbol}
          onChange={e => setSymbol(e.target.value)}
          required
        />
        <br />
        <input
          type="number"
          placeholder="Quantity"
          value={quantity}
          onChange={e => setQuantity(Number(e.target.value))}
          min={1}
          required
        />
        <br />
        <select value={orderType} onChange={e => setOrderType(e.target.value)}>
          <option value="BUY">BUY</option>
          <option value="SELL">SELL</option>
        </select>
        <br />
        <button type="submit">Place Order</button>
      </form>
    </div>
  );
}

export default PlaceOrder; 