import { Col, Row } from 'react-bootstrap';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import { Retiro } from '../../types/retiro';

type Props = {
  retiro: Retiro;
}

function RetiroCard( { retiro } : Props ) {
  return (
    <Card className='mb-3'>
      <Card.Header>{retiro.nome}</Card.Header>
      <Card.Body>
        <Row className='mb-2'>
          <Col>
            <Card.Title>Casal Coordenador</Card.Title>
            <Card.Text>{retiro.casalCoordenador}</Card.Text>
          </Col>
          <Col>
            <Card.Title>{retiro.casaRetiro}</Card.Title>
            <Card.Text>{retiro.casaRetiroEndereco}</Card.Text>
          </Col>
        </Row>
        <Row xs={8} md={6} lg={4} className="justify-content-end">
          <Button variant="primary">Mais info</Button>
        </Row>
      </Card.Body>
      <Card.Footer className="text-muted">{retiro.data} | {retiro.tempoPassado}</Card.Footer>
    </Card>
  );
}

export default RetiroCard;