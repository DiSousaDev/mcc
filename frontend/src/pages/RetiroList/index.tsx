import { useEffect, useState } from "react";
import api from "../../services/api";
import { Retiro } from "../../types/retiro";
import RetiroCard from "../../components/RetiroCard";

import './styles.css';
import SearchCard from "../../components/SearchCard";

const RetiroList = () => {

    const [retiros, setRetiros] = useState<Retiro[]>()

    useEffect(() => {
        api
            .get("/retiros")
            .then(response => {
                setRetiros(response.data);
            })
            .catch((err) => {
                console.log("Erro ao buscar retiros", err)
            })
    }, [])

    return (
        <section id="listar-retiros">
            <div className="container my-4">
                <div className="row">
                    <div className='mb-4'>
                        <SearchCard />
                    </div>
                    {retiros?.map(item => {
                        return (
                            <div className='mb-3 col-xl-6'>
                                <RetiroCard key={item.id} retiro={item} />
                            </div>
                        )
                    })}
                </div>
            </div>
        </section>
    )
}

export default RetiroList;