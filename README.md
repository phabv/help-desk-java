# help-desk-java# 
🛠️ Sistema de Help Desk (Gerenciador de Chamados) em Java

> Um sistema simples de gerenciamento de chamados de suporte técnico desenvolvido em Java puro (Console/CLI), focado na aplicação de conceitos de Programação Orientada a Objetos (POO) e manipulação de coleções (`ArrayList`).

---

## 📋 Sobre o Projeto

O **Help Desk** é uma aplicação de linha de comando criada para simular um fluxo básico de atendimento de suporte técnico. O sistema permite abrir, listar, buscar e remover chamados de suporte, garantindo a validação robusta das entradas do usuário para evitar falhas de execução e erros de digitação.

---

## ✨ Funcionalidades

1. **Abrir Chamado:** Permite registrar um novo problema informando a descrição e escolhendo o nível de prioridade (**Baixa**, **Média** ou **Alta**). O sistema gera um ID único e incremental automaticamente e define o status inicial como "Aberto".
2. **Listar Chamados:** Exibe todos os chamados cadastrados no sistema com suas respectivas informações e status atual.
3. **Buscar Chamado:** Localiza e exibe um chamado específico através do seu ID numérico.
4. **Remover Chamado:** Exclui um chamado do sistema com base no ID informado.
5. **Validação de Entrada:** Proteção contra erros de digitação (letras em campos numéricos, descrições vazias ou opções de menu inválidas).

---

## 🚀 Tecnologias Utilizadas

* **Java** (JDK 11 ou superior recomendado)
* **API do Java:** `ArrayList` para armazenamento dinâmico e `Scanner` para leitura de dados via terminal.

---

## 📂 Estrutura do Projeto

Os arquivos do código fonte estão organizados na pasta `Main/`:
* **`Main/Chamados.java`**: Contém a lógica principal (`main`), o menu interativo com loops de repetição (`do-while`) e as tratativas de validação de dados.
* **`Main/Chamado.java`** *(Classe de Modelo/Entidade)*: Responsável por estruturar os atributos do chamado (ID, descrição, prioridade e status), além dos métodos de acesso (`getters`/`setters`) e exibição (`toString`).

---

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** instalado em sua máquina.
2. Clone este repositório ou baixe os arquivos fonte.
3. Abra o terminal na raiz do projeto e compile os arquivos informando a pasta `Main`:
   ```bash
   javac Main/Chamado.java Main/Chamados.java
