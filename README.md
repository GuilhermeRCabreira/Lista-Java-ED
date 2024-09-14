# Repositório de Implementações de Estruturas de Dados

Este repositório contém implementações de vários conceitos de estruturas de dados, incluindo listas encadeadas, listas duplamente encadeadas e filas. Cada conceito é demonstrado através de uma aplicação prática que pode ser executada para fins de aprendizado e testes.

## Estruturas de Dados Implementadas

### Lista Simplesmente Encadeada
1. **Gerenciador de Tarefas**: Um gerenciador de tarefas onde cada tarefa é representada por um nó em uma lista simplesmente encadeada. Permite adicionar, remover e marcar tarefas como concluídas.
2. **Histórico de Navegação**: Simula o histórico de navegação de um navegador usando uma lista simplesmente encadeada. Permite adicionar novas URLs e remover URLs antigas quando a lista atinge um certo tamanho.
3. **Sistema de Controle de Reversão (Undo)**: Um sistema de edição de texto com funcionalidades de desfazer (undo) utilizando uma lista simplesmente encadeada para armazenar as ações realizadas.

### Lista Duplamente Encadeada
4. **Editor de Texto com Undo/Redo**: Um editor de texto simples que gerencia as operações de desfazer (undo) e refazer (redo) usando uma lista duplamente encadeada.
5. **Jogo de Cartas**: Um jogo onde a mão do jogador é representada por uma lista duplamente encadeada. Permite adicionar, remover e reorganizar cartas na mão.

### Filas
6. **Simulador de Fila de Atendimento**: Um simulador de fila de atendimento em um banco que gerencia os clientes que aguardam atendimento, chamando o próximo cliente na fila.
7. **Gerenciamento de Impressões**: Um sistema para gerenciamento de trabalhos de impressão, onde os trabalhos são enfileirados e processados na ordem em que chegam.
8. **Fila de Processos**: Simula uma fila de processos prontos para execução em um sistema operacional, permitindo adicionar novos processos e remover o mais antigo para execução.

## Como Baixar e Executar

1. **Clone o Repositório:**
   Abra um terminal e execute o comando abaixo para clonar o repositório para sua máquina local:
   ```bash
   git clone https://github.com/GuilhermeRCabreira/Lista-Java-ED.git

2. **Acesse o Diretório do Projeto:**

   ```bash
   cd Lista-Java-ED

3. **Compile o Código:**
   Certifique-se de que você tem o JDK instalado. Compile o código Java com o seguinte comando:

   ```bash
   javac -d bin src/**/*.java

4. **Execute as Aplicações:**
   Navegue até o diretório src e execute a classe principal. 
   ```bash
   cd bin
   java Main