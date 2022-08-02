import { Navbar, Container } from 'react-bootstrap';
import logo from '../../assets/img/logo.png';

function Header() {
    return (
      <Navbar>
      <Container>
        <Navbar.Brand href="#home">
          <img width={120} src={logo} className="d-inline-block align-top mcc-logo-container" alt="MCC Curitiba Logo"
          />
        </Navbar.Brand>
      </Container>
    </Navbar>
    )
}

export default Header