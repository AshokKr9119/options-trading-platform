import React, { useState } from 'react';

function Orders() {
  const [orders, setOrders] = useState([]);

  // TODO: Fetch orders from backend /api/orders/user/{userId}

  return (
    <div>
      <h2>Your Orders</h2>
      <button onClick={() => alert('Fetch orders from backend')}>Load Orders</button>
      <ul>
        {orders.map((order, idx) => (
          <li key={idx}>{JSON.stringify(order)}</li>
        ))}
      </ul>
    </div>
  );
}

export default Orders; 