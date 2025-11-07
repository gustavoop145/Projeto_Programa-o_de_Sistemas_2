"use client";
import { useState } from "react";
import { API_URL } from "../../../lib/api";
import { useRouter } from "next/navigation";

export default function CadastroEmpresaPage() {
  const router = useRouter();

  const [form, setForm] = useState({
    nome: "",
    cnpj: "",
    email: "",
    senha: "",
    telefone: "",
    endereco: "",
    areaAtuacao: ""
  });

  function handleChange(e) {
    setForm({ ...form, [e.target.name]: e.target.value });
  }

  async function handleSubmit(e) {
    e.preventDefault();

    const response = await fetch(API_URL + "/api/empresas/cadastrar", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(form),
    });

    if (response.ok) {
      alert("Empresa cadastrada com sucesso!");
      router.push("/login"); // redireciona para login
    } else {
      alert("Erro ao cadastrar empresa!");
    }
  }

  return (
    <div style={{ maxWidth: "450px", margin: "40px auto" }}>
      <h2>Cadastrar Empresa</h2>
      <form onSubmit={handleSubmit}>

        <input name="nome" placeholder="Nome" onChange={handleChange} required /><br/>
        <input name="cnpj" placeholder="CNPJ" onChange={handleChange} required /><br/>
        <input name="email" placeholder="Email" onChange={handleChange} required /><br/>
        <input type="password" name="senha" placeholder="Senha" onChange={handleChange} required /><br/>
        <input name="telefone" placeholder="Telefone" onChange={handleChange} /><br/>
        <input name="endereco" placeholder="Endereço" onChange={handleChange} /><br/>
        <input name="areaAtuacao" placeholder="Área de atuação" onChange={handleChange} /><br/>

        <button type="submit">Cadastrar</button>
      </form>
    </div>
  );
}