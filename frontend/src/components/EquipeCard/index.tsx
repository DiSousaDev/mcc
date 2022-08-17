
import { Equipe } from '../../types/equipe';
import CasalTable from '../CasalTable';
import './styles.css'

type Props = {
    equipes: Equipe[];
}

const EquipeCard = ({ equipes }: Props) => {
    return (
        <div className="card">
            {equipes.map(equipe => (
                <div className="card-header">
                    <div>
                        <h1>Equipe {equipe.nomeEquipe}</h1>
                    </div>
                    <div className='casal-coordenador-row item-row'>
                        <h1>Casal Coordenador:</h1>
                        <p>{equipe.casalCoordenador.nomeCasal}</p>
                    </div>
                    <CasalTable casais={equipe.casais} />
                </div>
            ))}
        </div>
    )
}

export default EquipeCard;