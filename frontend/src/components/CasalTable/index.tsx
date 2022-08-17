import { Casal } from '../../types/casal';
import ButtonRemover from '../Buttons/ButtonRemover';
import ButtonSuccess from '../Buttons/ButtonSuccess';
import './styles.css'

type Props = {
    casais: Casal[];
}

const CasalTable = ({casais}: Props) => {
    return (
        <div className="card-body">
            <table className='table table-casais'>
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th className='th-casal' scope="col">Casal</th>
                        <th scope="col">Remover</th>
                    </tr>
                </thead>
                <tbody>
                    {casais.map(casal => (
                        <tr>
                            <td>{casal.id}</td>
                            <td>{casal.nomeCasal}</td>
                            <td><ButtonRemover /></td>
                        </tr>
                    ))}
                </tbody>
            </table>
            <ButtonSuccess />
        </div>
    )
}

export default CasalTable;