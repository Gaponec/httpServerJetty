package market;

import market.pages.MainPage;

public class MarketPageBuilder {

    private String href;
    private String page;

    public MarketPageBuilder(String href){
        this.href = href;
    }

    public String generate(){
        switch (href){
            case "/":
                this.page = generateMainPage();
                break;
        }

        return page;
    }

    //Loading resoursec and generating page


    private String generateMainPage(){
        MainPage mainPage = new MainPage();

        mainPage.generateTopbar("topbar.html");
        mainPage.generateContainer();
        mainPage.generateFooter();



        mainPage.makePage("index.html");

        page = mainPage.getPage().toString();
        return page;

    }

    public String getPage(){
        return this.page;
    }
}
