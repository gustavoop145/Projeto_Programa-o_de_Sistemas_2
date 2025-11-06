"use client";
import { useState } from "react";
import { API_URL } from "../../lib/api";
import { useRouter } from "next/navigation";

export default function LoginPage() {
  const router = useRouter();
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");

  async function login(event) {
    event.preventDefault();

    // faz login usando formulário padrão do Spring Security
    const response = await fetch(API_URL + "/login", {
      method: "POST",
      headers: { "Content-Type": "application/x-www-form-urlencoded" },
      body: `username=${email}&password=${senha}`
    });

    if (response.ok) {
      // busca informações do usuário logado
      const user = await fetch(API_URL + "/api/me", { credentials: "include" })
        .then(res => res.json());

      // redirecionamento baseado no perfil
      if (user.perfil === "ROLE_ESTUDANTE") router.push("/estudantes");
      else if (user.perfil === "ROLE_EMPRESA") router.push("/empresas");
      else router.push("/admin");
    } else {
      alert("Email ou senha incorretos!");
    }
  }

  return (
    <div style={{ maxWidth: "400px", margin: "40px auto" }}>
      <h2>Login</h2>
      <form onSubmit={login}>
        <input type="email" placeholder="Email" value={email} onChange={e=>setEmail(e.target.value)} required /><br/>
        <input type="password" placeholder="Senha" value={senha} onChange={e=>setSenha(e.target.value)} required /><br/>
        <button type="submit" style={{ marginTop: "10px" }}>Entrar</button>
      </form>
    </div>
  );
}