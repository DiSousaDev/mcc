import { Casal } from '../../types/casal';
import CasalTable from '../CasalTable';
import './styles.css'

type Props = {
    casaisNeo: Casal[];
}

const CasalNeoCard = ({ casaisNeo }: Props) => {
    return (
        <div className="card">
            <div className="card-header bg-success casais-neo">
                <h1>Casais Néo-encontrista</h1>
            </div>
            <div className="card-body">
                <CasalTable casais={casaisNeo} />
            </div>
        </div>
    )
}

export default CasalNeoCard;