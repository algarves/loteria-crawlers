package com.ueby.loteria.crawlers;

import lombok.*;

/**
 * @author Algarves, Algarves
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderClassName = "Builder", setterPrefix = "with")
public class CaixaCrawlerStub {

  private String linkHref;

  private String urlBuscarResultado;

  private Integer concurso;

  private String htmlContent;

}
