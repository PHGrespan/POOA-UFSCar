package br.ufscar.pooa.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//dados de cada site
@XmlRootElement(name = "site")
@XmlAccessorType (XmlAccessType.FIELD)
public class Site {

    private String name;
    private String url;
    //[[tipo do titulo, classe usada no site], ...]
    @XmlElement(name = "notices")
    private Notices notices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Notices getNotices() {
        return notices;
    }

    public void setNotices(Notices notices) {
        this.notices = notices;
    }

    public Site() {
    }

    public Site(String name, String url, Notices notices) {
        this.name = name;
        this.url = url;
        this.notices = notices;
    }
    
    
}
