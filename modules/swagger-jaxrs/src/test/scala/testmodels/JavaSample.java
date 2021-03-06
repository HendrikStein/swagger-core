package testmodels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement (name="Howdy")
@ApiModel(description = "a sample model")
@XmlAccessorType(XmlAccessType.NONE)
public class JavaSample {
  private String id, name, value;

  @XmlElement(name="id", required=true)
  @ApiModelProperty(value = "unique identifier", allowableValues = "1,2,3")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @XmlElement(name="theName")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @XmlElement(name="theValue")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}