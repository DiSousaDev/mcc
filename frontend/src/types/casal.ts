import { Pessoa } from "./pessoa";

export type Casal = {
  id: number;
  nomeCasal: string;
  dataCasamentoCivil: string,
  dataCasamentoReligioso: string
  observacoes: string;
  esposo: Pessoa;
  esposa: Pessoa;
};
