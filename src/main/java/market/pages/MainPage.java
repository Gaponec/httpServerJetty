package market.pages;

import market.Element;
import market.Page;
import webpage.MarketPage;

import java.util.HashMap;
import java.util.Map;

/*
    Generating main page logic with data loading
*/
public class MainPage implements MarketPage {

    private Page page;
    private Element topbar;
    private String container;
    private String footer;

    @Override
    public void generateTopbar(String doc) {
        topbar = new Element(doc,new HashMap<String, Object>());

    }

    @Override
    public void generateContainer() {

    }

    @Override
    public void generateFooter() {

    }

    @Override
    public void makePage(String doc) {
        Map<String,Object> pageElements = new HashMap<>();
        pageElements.put("topbar",this.topbar.toString());

        page = new Page(doc,pageElements);

    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
