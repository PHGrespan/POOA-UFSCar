package br.ufscar.pooa;

import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBException;

import br.ufscar.pooa.entity.Site;
import br.ufscar.pooa.util.FileUtil;
import br.ufscar.pooa.util.SiteUtil;
import br.ufscar.pooa.util.XMLUtil;

public class App {

    public static void main(String[] args) throws IOException, JAXBException {
        
        // le o arquivo sites.xml e retorna seus dados em um list<Site>
        // para adicionar ou remover sites de noticia -> editar "sites.xml"
        List<Site> sites = XMLUtil.getData("sites.xml");

        // armazena uma lista, onde cada posição possui uma noticia
        List<String> contents = SiteUtil.getData(sites);

        // cria um csv com todos os dados
        FileUtil.printCSV(contents);

        // para criar novas funcionalidades será necessário utilizar apenas a lista contents
        // ela possui em cada uma de suas posições um título de notícia
        // as posições estão no seguinte formato (Site;Tipo;Notícia;Link)
    }
}