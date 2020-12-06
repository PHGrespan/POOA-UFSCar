package br.ufscar.pooa.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

// classe que armazena o tipo e a classe utilizada de cada notícia
@XmlRootElement(name = "notice")
@XmlAccessorType(XmlAccessType.FIELD)
public class Notice{

    private String type;
    private String classNotice;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassNotice() {
        return classNotice;
    }

    public void setClassNotice(String classNotice) {
        this.classNotice = classNotice;
    }

    public Notice(String type, String classNotice) {
        this.type = type;
        this.classNotice = classNotice;
    }

    public Notice() {
    }

    
}
