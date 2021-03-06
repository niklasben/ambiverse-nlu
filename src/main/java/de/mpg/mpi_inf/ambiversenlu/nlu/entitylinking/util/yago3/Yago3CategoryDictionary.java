package de.mpg.mpi_inf.ambiversenlu.nlu.entitylinking.util.yago3;

import de.mpg.mpi_inf.ambiversenlu.nlu.entitylinking.datapreparation.yago.yago3.util.YAGO3Reader;
import de.mpg.mpi_inf.ambiversenlu.nlu.tools.basics3.Fact;
import de.mpg.mpi_inf.ambiversenlu.nlu.tools.basics3.FactComponent;

import java.io.IOException;

public class Yago3CategoryDictionary extends Yago3ResourceDictionary {

  public Yago3CategoryDictionary(YAGO3Reader reader, String language) throws IOException {
    super(reader, language);
  }

  @Override protected String normalize(String resource) {
    return FactComponent.stripCat(resource);
  }

  @Override protected boolean isInterestingFact(Fact fact) {
    return FactComponent.isCategory(fact.getSubject());
  }

}
