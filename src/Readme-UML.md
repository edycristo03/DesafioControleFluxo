# Dispositivo Multifuncional - UML e Implementação em Java

## Visão Geral
Este repositório contém a implementação e o design UML de um dispositivo multifuncional. O dispositivo integra as funcionalidades de um reprodutor de música, um telefone e um navegador de internet. As classes Java e o diagrama UML ilustram a estrutura e o comportamento dos componentes.

## Funcionalidades

### 1. Reprodutor de Música (`ReprodutorMusical`)
A classe `ReprodutorMusical` fornece métodos para gerenciar a reprodução de músicas:
- `tocar()`: Inicia a reprodução da faixa atual.
- `pausar()`: Pausa a faixa atual.
- `selecionarMusica(String musica)`: Seleciona uma faixa específica para reproduzir.

### 2. Telefone (`AparelhoTelefonico`)
A classe `AparelhoTelefonico` simula operações básicas de telefone:
- `ligar(String numero)`: Realiza uma chamada para o número informado.
- `atender()`: Atende uma chamada recebida.
- `iniciarCorreioVoz()`: Inicia o serviço de correio de voz.

### 3. Navegador de Internet (`NavegadorNaInternet`)
A classe `NavegadorNaInternet` fornece capacidades básicas de navegação na web:
- `exibirPagina(String url)`: Exibe uma página da web com base na URL fornecida.
- `adicionarNovaAba()`: Abre uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual.

### 4. Dispositivo Multifuncional (`DispositivoMultifuncional`)
A classe `DispositivoMultifuncional` agrega os três componentes:
- Contém instâncias de `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorNaInternet`.
- Fornece métodos de acesso (getters) para cada componente.

## Diagrama UML
O diagrama UML representa a estrutura do dispositivo multifuncional. A classe `DispositivoMultifuncional` utiliza composição para incluir instâncias das outras três classes. Abaixo está o código PlantUML para o diagrama:
![image](https://github.com/user-attachments/assets/d8c1935b-dd47-43c2-8967-fa5e3df150d0)


2. Navegue até o diretório do projeto e abra os arquivos Java.
3. Compile e execute as classes para simular cada funcionalidade:
   - Instancie `DispositivoMultifuncional`.
   - Acesse seus componentes usando os métodos getters.
   - Chame os métodos desejados para reprodução de músicas, operações telefônicas ou navegação na web.

## Melhorias Futuras
- Adicionar funcionalidades mais avançadas a cada componente (ex.: listas de reprodução para o reprodutor de músicas, histórico de chamadas para o telefone e gerenciamento de favoritos para o navegador).
- Implementar uma interface gráfica (GUI) para melhor interação.

## Licença
Este projeto é open-source e está disponível sob a Licença MIT.

