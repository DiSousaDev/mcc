import { Casal } from "./casal";
import { Equipe } from "./equipe";

export type Retiro = {
    id: number;
    nome: string;
    data: string;
    casalCoordenador: string;
    casaRetiro: string;
    casaRetiroEndereco: string;
    tempoPassado: string;
    equipes: Equipe[];
    casaisNeo: Casal[];
}