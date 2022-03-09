package io.codelex.chain;

public class Link {

    private String value;

    private Link nextLink;

    public Link(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Link getNextLink() {
        return nextLink;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }
}
