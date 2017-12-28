package market;

import templater.PageGenerator;

import java.util.Map;

public class Page {

    private String element;

    public Page(String doc, Map<String, Object> data) {
        element = PageGenerator.instance().getPage(doc,data);
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element;
    }
}
