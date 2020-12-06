package br.ufscar.pooa.util;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.ufscar.pooa.entity.Site;
import br.ufscar.pooa.entity.Sites;

public class XMLUtil {

    // le os dados do xml e os retorna em uma lista
    public static List<Site> getData(String archive) throws JAXBException {
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Sites.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        
        Sites sites = (Sites) jaxbUnmarshaller.unmarshal(new File(archive));

        return sites.getSites();
    }
}