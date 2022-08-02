import { Navbar, Container } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import logo from '../../assets/img/logo.png';

function Header() {
    return (
      <Navbar>
      <Container>
        <Navbar.Brand>
          <Link to="/">
            <img width={120} src={logo} className="d-inline-block align-top mcc-logo-container" alt="MCC Curitiba Logo"/>
          </Link>
        </Navbar.Brand>
      </Container>
    </Navbar>
    )
}

export default Header