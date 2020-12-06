package br.ufscar.pooa.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import br.ufscar.pooa.entity.Notice;
import br.ufscar.pooa.entity.Site;

public class SiteUtil {

    //função que coleta os dados do site e os retorna em uma lista
    public static List<String> getData(List<Site> sites) throws IOException {

        List<String> contents = new ArrayList<>();

        for(Site site: sites){
            //salva toda a página
            Document doc = Jsoup.connect(site.getUrl()).get();

            List<Notice> notices = site.getNotices().getNotices();

            //coleta os dados para cada classe de noticia
            for(Notice notice: notices){

                //seleciona todos os titulos daquela clase
                Elements titles = doc.select(notice.getClassNotice());

                //coleta link de cada título
                for(Element title: titles){
                    Element link = title.parent();
                    while(link != null && !link.tagName().equals("a")){
                        link = link.parent();
                    }

                //caso o titulo tenha ";", pegar apenas antes
                String[] t = title.text().split(";");

                //salva os dados de cada notícia na lista contents
                contents.add(String.format("%s;%s;%s;%s", site.getName(),notice.getType(),t[0], link.attr("href")));
                }
            }
        }
        return contents;
    }
}
