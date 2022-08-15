/*
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import api from '../../services/api';
import { Retiro } from '../../types/retiro';
*/
import { ReactComponent as RemoveImg } from '../../assets/images/remove.svg';
import './styles.css';

type UrlParams = {
    retiroId: string;
}

const RetiroDetail = () => {
    /*
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
    */

    return (
        <div className='main-container'>
            <div className='retiro-title-container bg-primary mb-2'>
                <div className='title-container'>
                    <h1>110º Retiro de Casais</h1>
                    <p>15, 16, 17 de dezembro de 2019</p>
                    <hr />
                </div>
                <div className='details-container'>
                    <div className='details-item-row item-row'>
                        <h1>Casal Coordenador:</h1>
                        <p>Matheus e Cris</p>
                    </div>
                    <div className='details-item-row item-row'>
                        <h1>Local:</h1>
                        <p>Casa de Retiro Mossunguê, Rua Francisco Juglair, 171</p>
                    </div>
                </div>
            </div>
            <div className='retiro-equipe-container'>
                <div className="card">
                    <div className="card-header">
                        <h1>Equipe Cozinha</h1>
                        <div className='details-item-row item-row'>
                            <h1>Casal Coordenador:</h1>
                            <p>Matheus e Cris</p>
                        </div>
                    </div>
                    <div className="card-body">
                        <table className='table table-casais'>
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Casal</th>
                                    <th scope="col">Remover</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td scope="row">1</td>
                                    <td>Carlos e Sandra</td>
                                    <td>Remover</td>
                                </tr>
                                <tr>
                                    <td scope="row">2</td>
                                    <td>João e Maria</td>
                                    <td className='img-remover-container'><RemoveImg /></td>
                                </tr>
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