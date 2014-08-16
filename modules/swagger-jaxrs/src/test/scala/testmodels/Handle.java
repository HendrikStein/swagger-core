package testmodels;

import javax.xml.bind.annotation.XmlElement;

public class Handle {
  @XmlElement
  public String name;

  @XmlElement
  public int screwCount;
}
