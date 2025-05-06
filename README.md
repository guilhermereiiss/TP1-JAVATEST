
# TP1-JAVA-2TRIMESTRE

Este projeto é uma aplicação de calculadora científica em Java, desenvolvida como parte de um trabalho acadêmico. Inclui operações aritméticas básicas, funções científicas e testes unitários abrangentes para garantir a funcionalidade.

## Índice
- [Visão Geral do Projeto](#visão-geral-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Estrutura de Diretórios](#estrutura-de-diretórios)
- [Instruções de Configuração](#instruções-de-configuração)
- [Executando a Aplicação](#executando-a-aplicação)
- [Testes](#testes)
- [Dependências](#dependências)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Visão Geral do Projeto
O projeto implementa a classe `ScientificCalculator` com métodos para cálculos aritméticos e científicos, como adição, subtração, multiplicação, divisão, potência, raiz quadrada, logaritmo, seno e cosseno. O código inclui testes unitários para validar a funcionalidade desses métodos, com foco em casos extremos, como divisão por zero e entradas inválidas.

## Funcionalidades
- **Operações Aritméticas**: Adição, subtração, multiplicação e divisão.
- **Funções Científicas**: Potência, raiz quadrada, logaritmo natural, seno e cosseno (com entrada em graus).
- **Tratamento de Erros**: Lança `IllegalArgumentException` para entradas inválidas (ex.: divisão por zero, raiz quadrada de número negativo, logaritmo de número não positivo).
- **Testes Unitários**: Conjuntos de testes abrangentes usando JUnit 5, cobrindo operações básicas, casos extremos e funções trigonométricas.

## Estrutura de Diretórios
```
TP1-JAVA-2TRIMESTRE/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── example/
│   │               ├── Main.java
│   │               └── ScientificCalculator.java
│   └── test/
│       └── java/
│           └── org/
│               └── example/
│                   └── service/
│                       ├── ScientificCalculatorTest.java
│                       ├── ScientificCalculatorTESTEZAO.java
│                       └── ScientificCalculatorTESTEZINHO.java
├── .gitignore
└── pom.xml
```

- `Main.java`: Ponto de entrada com uma demonstração simples de saída em Java.
- `ScientificCalculator.java`: Implementação principal da calculadora.
- Arquivos de teste: Várias classes de teste com diferentes níveis de complexidade.
- `pom.xml`: Arquivo de configuração do Maven.
- `.gitignore`: Especifica arquivos e diretórios a serem ignorados no controle de versão.

## Instruções de Configuração
1. **Pré-requisitos**:
   - Java 21 ou superior
   - Maven 3.6 ou superior
   - Git

2. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/TP1-JAVA-2TRIMESTRE.git
   cd TP1-JAVA-2TRIMESTRE
   ```

3. **Instalar Dependências**:
   Execute o comando abaixo para baixar as dependências especificadas no `pom.xml`:
   ```bash
   mvn clean install
   ```

## Executando a Aplicação
Para executar a classe `Main`:
```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```
Isso executará o código de exemplo em `Main.java`, que imprime uma mensagem de boas-vindas e uma saída de loop.

Para usar a classe `ScientificCalculator`, você pode integrá-la ao seu próprio código ou modificar o `Main.java` para chamar seus métodos.

## Testes
O projeto inclui três classes de teste:
- `ScientificCalculatorTest.java`: Testes abrangentes com classes aninhadas para operações básicas e avançadas.
- `ScientificCalculatorTESTEZAO.java`: Testes com foco na reutilização de uma única instância da calculadora via `@BeforeEach`.
- `ScientificCalculatorTESTEZINHO.java`: Testes básicos para adição e subtração.

Execute todos os testes com:
```bash
mvn test
```

Para gerar um relatório de cobertura de testes, use:
```bash
mvn jacoco:report
```
O relatório estará disponível em `target/site/jacoco/index.html`.

## Dependências
- **JUnit Jupiter 5.9.3**: Para testes unitários.
- Gerenciadas via Maven (`pom.xml`).

## Contribuição
Contribuições são bem-vindas! Para contribuir:
1. Faça um fork do repositório.
2. Crie uma nova branch (`git checkout -b feature/sua-funcionalidade`).
3. Faça suas alterações e commit (`git commit -m "Adiciona sua funcionalidade"`).
4. Envie para a branch (`git push origin feature/sua-funcionalidade`).
5. Abra um pull request.

Certifique-se de que seu código segue o estilo existente e inclui testes apropriados.

## Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para detalhes.
