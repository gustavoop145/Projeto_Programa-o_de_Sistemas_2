import { api } from "@/lib/api";

export default async function VagasPage() {
  const vagas = await api.getVagas();

  return (
    <main className="p-6">
      <h1 className="text-2xl font-bold mb-4">Vagas disponíveis</h1>
      <ul className="space-y-3">
        {vagas.map((vaga) => (
          <li key={vaga.id} className="p-4 border rounded-md shadow">
            <h2 className="text-xl font-semibold">{vaga.titulo}</h2>
            <p>{vaga.descricao}</p>
            <p className="text-sm text-gray-600">
              {vaga.area} • {vaga.localizacao}
            </p>
          </li>
        ))}
      </ul>
    </main>
  );
}
