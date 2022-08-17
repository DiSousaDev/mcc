
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import api from '../../services/api';
import { Retiro } from '../../types/retiro';

import './styles.css';
import CasalNeoCard from '../../components/CasalNeoCard';
import EquipeCard from '../../components/EquipeCard';


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
                <div>
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
            {retiro &&
                <div>
                    <div className='mb-2'>
                        <EquipeCard equipes={retiro.equipes} />
                    </div>
                    <CasalNeoCard casaisNeo={retiro?.casaisNeo} />
                </div>
            }
        </div>
    )
}

export default RetiroDetail;