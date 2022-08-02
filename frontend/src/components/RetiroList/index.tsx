import { useEffect, useState } from "react";
import api from "../../services/api";
import { Retiro } from "../../types/retiro";
import RetiroCard from "../RetiroCard";

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
        <div>
            {retiros?.map(item => {
                return <RetiroCard key={item.id} retiro={item} />
            })}
        </div>
    )
}

export default RetiroList;