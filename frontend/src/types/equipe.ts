import { Casal } from "./casal";

export type Equipe = {
  id: number;
  nomeEquipe: string;
  casalCoordenador: Casal;
  casais: Casal[];
};
