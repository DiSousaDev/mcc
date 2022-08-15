import { Pessoa } from "./pessoa";

export type Casal = {
  id: number;
  nomeDoCasal: string;
  dataCasamentoCivil: string,
  dataCasamentoReligioso: string
  observacoes: string;
  esposo: Pessoa;
  esposa: Pessoa;
};
