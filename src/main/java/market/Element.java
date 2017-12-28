package market;

import templater.PageGenerator;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

//class for building element
public class Element {

    private static final String ELEMENTS_DIR = "elements";

    private String element;

    public Element(String doc, Map<String,Object> data){
        String dir = ELEMENTS_DIR + File.separator + doc;

        this.element = PageGenerator.instance().getPage(dir,data);
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String toString(){
        return element;
    }
}
