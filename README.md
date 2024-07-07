# Conversor Moeda Java
Criação de um conversor de moedas utilizando Java, Spring, Gson e a ExchangeRate API

## Visão Geral
<p style="text-align: justify;">Este projeto é uma aplicação Java que permite a conversão de valores entre diferentes moedas usando a API do ExchangeRate-API. O usuário pode selecionar uma opção de conversão de moedas disponíveis no menu e inserir o valor a ser convertido. A aplicação então faz uma solicitação à API para obter as taxas de conversão e exibe o valor convertido na tela.</p>

## Funcionalidades
Conversão entre várias moedas, incluindo USD, BRL, EUR, GBP, CNY, entre outras.
Interface de linha de comando interativa para seleção de moedas e entrada de valores.
Consulta de taxas de câmbio atualizadas a partir da API do ExchangeRate-API.

## Requisitos
- Java 8 ou superior.
- Biblioteca Gson para deserialização do JSON.
- Framework Spring.

## Componentes do Projeto

O projeto foi divido em 3 classes com resposabilidades distintas:
   - [A Classe Main](https://github.com/FredericoSander/Conversor_Moeda_Java/blob/main/src/main/java/Conversor/Principal/Main.java)
   - [A Classe ExchangeRateResponse](https://github.com/FredericoSander/Conversor_Moeda_Java/blob/main/src/main/java/Conversor/Modelo/ExchangeRateResponse.jav)
   - [A Classe ConverterMoeda](https://github.com/FredericoSander/Conversor_Moeda_Java/blob/main/src/main/java/Conversor/service/ConverterMoeda.java)

### 1. [A Classe Main](https://github.com/FredericoSander/Conversor_Moeda_Java/blob/main/src/main/java/Conversor/Principal/Main.java)
<p style="text-align: justify;">Este é o ponto de entrada da aplicação. Ele contém o método main e o método exibeMenu. O método exibeMenu apresenta 10 opções de conversão de moedas. Para realizar a conversão o Usuário deve selecionar uma das opções disponiveis e postriormente a seleção o udsuaraio deverá informar o valor que deveja que seja convertido. A conversão é realizada de forma instantanea e o resultado pe apresentado na tela do terminal.</p>


### 2. [A Classe ExchangeRateResponse](https://github.com/FredericoSander/Conversor_Moeda_Java/blob/main/src/main/java/Conversor/Modelo/ExchangeRateResponse.java)
<p style="text-align: justify;">Esta classe representa a estrutura do JSON retornado pela API do ExchangeRate-API. Ela contém campos anotados com @SerializedName para mapear os dados JSON para os campos da classe.</p>

### 3. [A Classe ConverterMoeda](https://github.com/FredericoSander/Conversor_Moeda_Java/blob/main/src/main/java/Conversor/service/ConverterMoeda.java)
<p style="text-align: justify;">Esta classe contém o método converterMoeda que faz a solicitação à API do ExchangeRate-API, deserializa o JSON recebido e calcula o valor convertido com base na taxa de conversão.</p>

## Autores

- [FredericoSander](https://www.github.com/FredericoSander)

## 🚀 Sobre mim
<p style="text-align: justify;">Sou um profissional em transição de carreira que possui mais de 15 anos de experiência profissional, com uma trajetória diversificada que inclui tanto o setor público quanto o privado. Durante esses anos, tive a oportunidade de avançar por diversos cargos técnicos, de supervisão e de gestão. Essa experiência me proporcionou um amplo conjunto de habilidades, incluindo análise de dados e liderança de equipes.</p>

<p style="text-align: justify;">Atualmente, estou em busca de oportunidades de consolidar minha formação acadêmica em Análise e Desenvolvimento de Sistemas e aplicar minha experiência e habilidades técnicas acumuladas em projetos desafiadores na área da tecnologia da informação, com análise e/ou desenvolvimento de sistemas Java.</p>

Conhecimentos em:
- Tecnologias Front e Back-end: HTML, CSS, Java, JavaScript, Python.
- Softwares e Ferramentas de Desenvolvimento: Eclipse IDE, VSCode, MYSQL.
- Banco de Dados: MYSQL.
- Ferramentas de análise de dados: MS Excel, Power Bi,
- Análise de Sistemas: Levantamento de Requisitos, Modelagem de Banco de Dados.
- Sistemas Operacionais: Windows.

## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/frederico-cota-dev)
