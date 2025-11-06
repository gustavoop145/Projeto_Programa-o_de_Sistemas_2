export const api = {
    async getVagas() {
        const res = await fetch("http://localhost:8080/api/vagas");
        if (!res.ok) throw new Error ("Erro ao buscar vagas");
        return res.json();
    }
}