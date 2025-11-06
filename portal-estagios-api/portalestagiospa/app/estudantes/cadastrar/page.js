"use client";
import { useState } from "react";
import { API_URL } from "../../../lib/api";
import { useRouter } from "next/navigation";

export default function CadastroEstudantePage() {
  const router = useRouter();

  const [form, setForm] = useState({
    nome: "",
    cpf: "",
    curso: "",
    email: "",
    senha: "",
    telefone: "",
    areasInteresse: ""
  });

  function handleChange(e) {
    setForm({ ...form, [e.target.name]: e.target.value });
  }

  async function handleSubmit(e) {
    e.preventDefault();

    const response = await fetch(API_URL + "/api/estudantes/cadastrar", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(form),
    });

    if (response.ok) {
      alert("Estudante cadastrado com sucesso!");
      router.push("/login"); // redireciona para login
    } else {
      alert("Erro ao cadastrar estudante!");
    }
  }

  return (
    <div style={{ maxWidth: "450px", margin: "40px auto" }}>
      <h2>Cadastrar Estudante</h2>
      <form onSubmit={handleSubmit}>

        <input name="nome" placeholder="Nome completo" required onChange={handleChange} /><br/>
        <input name="cpf" placeholder="CPF" required onChange={handleChange} /><br/>
        <input name="curso" placeholder="Curso" required onChange={handleChange} /><br/>
        <input name="email" placeholder="Email" required onChange={handleChange} /><br/>
        <input type="password" name="senha" placeholder="Senha" required onChange={handleChange} /><br/>
        <input name="telefone" placeholder="Telefone" onChange={handleChange} /><br/>

        <label>Áreas de Interesse (separe por vírgulas)</label><br/>
        <input name="areasInteresse" placeholder="ex: TI, Marketing, RH" onChange={handleChange} /><br/>

        <button type="submit" style={{ marginTop: "10px" }}>Cadastrar</button>
      </form>
    </div>
  );
}