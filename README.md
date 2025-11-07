# Projeto_Programa-o_de_Sistemas_2

## Requisitos de desenvolvimento

Este monorepo contém duas partes principais: `portal-estagios-api` (backend Spring Boot) e `portalestagiospa` (frontend Next.js).

- Java: JDK 21 (LTS) é requerido para compilar e executar o módulo `portal-estagios-api`.
- Maven: o projeto usa o `mvnw` (Maven Wrapper) fornecido no diretório `portal-estagios-api`.
- Node.js: necessário para executar o frontend (veja `portalestagiospa/package.json`).

### Como rodar o backend localmente

1. Assegure que você tenha o Java 21 instalado e configurado (ex.: `java -version` deve mostrar `21`).
2. Entre na pasta do backend:

```bash
cd portal-estagios-api
```

3. Para executar a suíte de testes e gerar o JAR:

```bash
./mvnw -DskipTests=false package
```

4. Para rodar a aplicação localmente (após build):

```bash
./mvnw spring-boot:run
```

### Observações

- O projeto foi atualizado para Java 21 no módulo `portal-estagios-api` (propriedade `java.version` no `pom.xml`).
- Se você usa SDKMAN ou outra ferramenta de gerenciamento de JDKs, instale/ative a versão 21 antes de construir.
- Caso encontre problemas com processadores de anotação (Lombok), garanta a versão de dependência definida em `pom.xml`.

Se quiser que eu adicione instruções de Docker ou CI/CD (GitHub Actions) para automatizar builds usando Java 21, posso criar um arquivo de pipeline.