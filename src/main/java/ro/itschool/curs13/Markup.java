package ro.itschool.curs13;

public class Markup {
private String markupId;
private int position;
private String content;

    public String getMarkupId() {
        return markupId;
    }

    public void setMarkupId(String markupId) {
        this.markupId = markupId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Markup(String markupId, int position, String content) {
        this.markupId = markupId;
        this.position = position;
        this.content = content;
    }
}
