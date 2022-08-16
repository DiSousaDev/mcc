
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import api from '../../services/api';
import { Retiro } from '../../types/retiro';

import { ReactComponent as RemoveImg } from '../../assets/images/x.svg';
import './styles.css';


type UrlParams = {
    retiroId: string;
}


const RetiroDetail = () => {

    const { retiroId } = useParams<UrlParams>();
    const [retiro, setRetiro] = useState<Retiro>();

    useEffect(() => {

        api
            .get(`/retiros/${retiroId}`)
            .then(response => {
                setRetiro(response.data);
            })
            .catch((err) => {
                console.log("Erro ao buscar retiro", err)
            })
    }, [retiroId])


    return (
        <div className='main-container'>
            <div className='retiro-title-container bg-primary mb-2'>
                <div className='title-container'>
                    <h1>{retiro?.nome}</h1>
                    <p>{retiro?.data}</p>
                    <hr />
                </div>
                <div className='details-container'>
                    <div className='details-item-row item-row'>
                        <h1>Casal Coordenador:</h1>
                        <p>{retiro?.casalCoordenador}</p>
                    </div>
                    <div className='details-item-row item-row'>
                        <h1>Local:</h1>
                        <p>{retiro?.casaRetiro}, {retiro?.casaRetiroEndereco}</p>
                    </div>
                </div>
            </div>
            {retiro?.equipes.map(equipe => (
                <div className='retiro-equipe-container mb-2'>
                    <div className="card">
                        <div className="card-header">
                            <div>
                                <h1>Equipe {equipe.nomeEquipe}</h1>
                            </div>
                            <div className='casal-coordenador-row item-row'>
                                <h1>Casal Coordenador:</h1>
                                <p>{equipe.casalCoordenador.nomeCasal}</p>
                            </div>
                        </div>
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
                                    {equipe.casais.map(casal => (
                                        <tr>
                                            <td>{casal.id}</td>
                                            <td>{casal.nomeCasal}</td>
                                            <td className='img-remover-container'><RemoveImg /></td>
                                        </tr>
                                    ))}
                                </tbody>
                            </table>
                            <div className='button-table'>
                                <button type="button" className="btn btn-success">Adicionar</button>
                            </div>
                        </div>
                    </div>
                </div>
            ))
            }

            <div className='retiro-equipe-container mb-2'>
                <div className="card">
                    <div className="card-header bg-success casais-neo">
                        <h1>Casais Néo-encontrista</h1>
                    </div>
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
                                {retiro?.casaisNeo.map(casal => (
                                    <tr>
                                        <td>{casal.id}</td>
                                        <td>{casal.nomeCasal}</td>
                                        <td className='img-remover-container'><RemoveImg /></td>
                                    </tr>
                                ))}
                            </tbody>
                        </table>
                        <div className='button-table'>
                            <button type="button" className="btn btn-success">Adicionar</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default RetiroDetail;