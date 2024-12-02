import React from 'react';
import { Link } from 'react-router-dom';

function Header() {
  return (
    <div>
      <div className="nav">
        <div className="logo">
          <img
            src="https://cdn.pixabay.com/photo/2013/07/12/15/53/shopping-cart-150504_1280.png"
            alt="Logo"
            width="100px"
            style={{ padding: "10px" }}
          />
        </div>
        <div className="menu" id='links'>
          <Link to="/">Home</Link>
          <Link to="/products">Products</Link>
          <Link to="/contact">Contact us</Link>
        </div>
        <div className="btns">
          <button>
            <Link to="/login">Login</Link>
          </button>
        </div>
      </div>
    </div>
  );
}

export default Header;
