import 'bootstrap/js/src/collapse.js';
import { Link, NavLink } from 'react-router-dom';
import { ReactComponent as MenuItem } from '../../assets/images/menu-item.svg';
import logo from '../../assets/images/logo.png';

import './styles.css';

const Navbar = () => {
  return (
      <nav className='bg-primary navbar navbar-expand-md main-nav'>
          <div className='container-fluid'>
              <Link to={'/'} className='nav-logo-text'>
                <img width={120} src={logo} className="d-inline-block align-top mcc-logo-container" alt="MCC Curitiba Logo"/>
              </Link>
              <button
                  className='navbar-toggler navbar-btn-color'
                  type='button'
                  data-bs-toggle='collapse'
                  data-bs-target='#mcc-navbar'
                  aria-controls='mcc-navbar'
                  aria-expanded='false'
                  aria-label='Toggle navigation'
              >
                  <span className='navbar-toggler-icon'>
                    <MenuItem />
                  </span>
              </button>
              <div className='collapse navbar-collapse' id='mcc-navbar'>
                  <ul className='navbar-nav offset-md-2 main-menu'>
                      <li>
                          <NavLink to={'/'}>Home</NavLink>
                      </li>
                      <li>
                          <NavLink to={'/retiros'}>Retiros</NavLink>
                      </li>
                  </ul>
              </div>
          </div>
      </nav>
  );
}

export default Navbar