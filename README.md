[![Java CI with Gradle](https://github.com/algarves/loteria-crawlers/actions/workflows/gradle.yml/badge.svg)](https://github.com/algarves/loteria-crawlers/actions/workflows/gradle.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=algarves_loteria-crawlers&metric=alert_status)](https://sonarcloud.io/dashboard?id=algarves_loteria-crawlers)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/algarves/loteria-crawlers/blob/master/LICENSE)

# loteria-crawlers
Web Crawler para buscar os resultados dos jogos das loterias da caixa

## Requisitos do projeto

- Java 8 ou mais recente

> Código compilado com compatibilidade do Java 8, porém durante a execução da pipeline, onde executa testes unitários e de integração, utiliza versão 11. 

### Executando no console os testes unitários do projeto

```shell
$ ./gradlew test
```
> Caso utilize Windows, você precisa substituir `./gradlew` por `.\gradlew.bat`.

### Executando no console os testes de integração do projeto

```shell
$ ./gradlew integrationTest
```

> Caso utilize Windows, você precisa substituir `./gradlew` por `.\gradlew.bat`.

### Excemplo de utilização da biblioteca

```java
import com.ueby.oss.loteria.crawlers.game.CaixaGameResult;
import com.ueby.oss.loteria.crawlers.service.CaixaWebCrawlerService;

public class Main {

  public static void main(String[] args) {
    CaixaGameType caixaGameType = CaixaGameType.MEGA_SENA;
    CaixaWebCrawlerService crawler = new CaixaWebCrawlerService(caixaGameType);

    // Último concurso
    crawler.byLastContest();
    CaixaGameResult caixaGameResult = crawler.getMatchResult();
    System.out.println("Concurso: " + caixaGameResult.getNumero());
    System.out.println("Dezenas sorteadas: " + caixaGameResult.getListaDezenas().toString());

    // Por número do concurso
    crawler.byContestNumber(2110);
    caixaGameResult = crawler.getMatchResult();
    System.out.println("Concurso: " + caixaGameResult.getNumero());
    System.out.println("Dezenas sorteadas: " + caixaGameResult.getListaDezenas().toString());
  }
}
```
### Exemplo console (resposta)

```text
Request URL 'MEGA_SENA' - https://servicebus2.caixa.gov.br/portaldeloterias/api/megasena/
Response status - 200
Request URL 'MEGA_SENA' - https://servicebus2.caixa.gov.br/portaldeloterias/api/megasena/
Response status - 200
Concurso: 2465
Lista Dezenas: [003, 008, 023, 029, 053, 054]
Request URL 'MEGA_SENA' - https://servicebus2.caixa.gov.br/portaldeloterias/api/megasena/2110
Response status - 200
Concurso: 2110
Lista Dezenas: [005, 010, 012, 018, 025, 033]
```
