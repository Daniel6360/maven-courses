package ro.itschool.curs12;

public class Markup {
    private final String markupId;
    private final int position;
    private final String content;

    @Override
    public String toString() {
        return "Markup{" +
                "markupId='" + markupId + '\'' +
                ", position=" + position +
                ", content='" + content + '\'' +
                '}';
    }

    public String getMarkupId() {
        return markupId;
    }

    public int getPosition() {
        return position;
    }

    public String getContent() {
        return content;
    }

    public Markup(String markupId, int position, String content) {
        this.markupId = markupId;
        this.position = position;
        this.content = content;
    }



}
