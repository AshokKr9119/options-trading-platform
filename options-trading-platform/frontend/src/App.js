import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import Login from './Login';
import Register from './Register';
import Orders from './Orders';
import PlaceOrder from './PlaceOrder';

function App() {
  return (
    <Router>
      <nav style={{ padding: 10 }}>
        <Link to="/" style={{ margin: 10 }}>Home</Link>
        <Link to="/login" style={{ margin: 10 }}>Login</Link>
        <Link to="/register" style={{ margin: 10 }}>Register</Link>
        <Link to="/orders" style={{ margin: 10 }}>Orders</Link>
        <Link to="/place-order" style={{ margin: 10 }}>Place Order</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/orders" element={<Orders />} />
        <Route path="/place-order" element={<PlaceOrder />} />
      </Routes>
    </Router>
  );
}

export default App; 