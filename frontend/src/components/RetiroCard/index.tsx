import { Link } from 'react-router-dom';
import { Retiro } from '../../types/retiro';

import './styles.css';

type Props = {
  retiro: Retiro;
}

function RetiroCard({ retiro }: Props) {
  return (
    <div className="card base-card">
      <div className="card-header">
        <h1>{retiro.nome}</h1>
        <p>{retiro.data} </p>
      </div>
      <div className="card-body">
        <div className='row mb-2'>
          <div className='col'>
            <div className='card-title'>Casal Coordenador</div>
            <div className='card-text'>{retiro.casalCoordenador}</div>
          </div>
          <div className='col'>
            <div className='card-title'>{retiro.casaRetiro}</div>
            <div className='card-text'>{retiro.casaRetiroEndereco}</div>
          </div>
        </div>
        <div className='btn-container'>
          <Link to={`/retiros/${retiro.id}`}>
            <button className='btn btn-secondary'>Mais info</button>
          </Link>
        </div>
      </div>
      <div className="show576 card-footer text-muted">
        <p>{retiro.tempoPassado}</p>
      </div>
    </div>
  );
}

export default RetiroCard;